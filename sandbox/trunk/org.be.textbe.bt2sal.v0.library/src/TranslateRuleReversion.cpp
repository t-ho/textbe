// File name: TranslateRuleReversion.cpp
// Author/s : Nisansala Yatapanage
// Date built: 24/7/2006
// Last updated: 19/6/2007
// Purpose: Implementation of the reversion rule (Rule 8).
//
// Algorithms used:
// Description of Algorithm#:
//


#include "TranslateRuleReversion.h"
#include "TranslateStep.h"
#include "GSEMethod.h"
#include "TranslateException.h"

CTranslateRuleReversion::CTranslateRuleReversion(void)
{
	m_iRuleID = 8;
}

CTranslateRuleReversion::~CTranslateRuleReversion(void)
{
}

bool CTranslateRuleReversion::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
	bool bRuleMatched = false;
	NPosition cCurrentNodePosition;
	cCurrentNodePosition = cAllNodes.GetHeadPosition();
	while(cCurrentNodePosition.IsNotNull()){
		int iCurrentNode;
		iCurrentNode = cAllNodes.GetNext(cCurrentNodePosition);
		CTranslateNode* pcNode = cMain.GetNode(iCurrentNode);
		NString strComponent = pcNode->GetComponentName();
		NString strState = pcNode->GetStateName();
		int iType = pcNode->GetType();
		int iJumpType = pcNode->GetJumpType();
		if (iJumpType == 1){ // This is a reversion node.
			// Check that it is a leaf node.
			int iChildNum = pcNode->GetNumberOfChildren();
			if (iChildNum == 0){
				// Find the top reversion point.
				bool bFoundTop = false;
				int iNextParent = pcNode->GetParent();
				int iTopNode;
				CTranslateNode* pcNextParent;
				// If there's already a jumpingToLabel use that node as the top reversion point.
				NString strJumpingToLabel = pcNode->GetJumpingToLabel();
			
				while ((bFoundTop != true) && (iNextParent != iFinalNode)){
					// Search upwards.
					pcNextParent = cMain.GetNode(iNextParent);
					NString strNodeComp = pcNextParent->GetComponentName();
					NString strNodeState = pcNextParent->GetStateName();
					int iNodeType = pcNextParent->GetType();
					// Check if the nodes match.
					if ((iNodeType == iType) && (strNodeComp == strComponent) && (strNodeState == strState)){
						if (strJumpingToLabel == ""){	
							bFoundTop = true;
							iTopNode = iNextParent;
						}else{
							// A label was used so revert to that node.
							if (pcNextParent->GetLabel() == strJumpingToLabel){
								bFoundTop = true;
								iTopNode = iNextParent;
							}
						}
					}
					iNextParent = pcNextParent->GetParent();
				}
				if (bFoundTop == false){
					// The top point was not found.
					NString strMessage = "Top reversion point not found for: ";
					strMessage = strMessage + strComponent + " " + strState;
					CTranslateException cException(strMessage);
					throw cException;
				}else{
					NList<int, int>* plEmptyList = new NList<int, int>;
					cMain.StoreTranslationStep(iCurrentNode, 8, iTopNode, plEmptyList);
					bRuleMatched = true;
				}
			}
		}
	}
	// Note that matched nodes are not removed from the list.
	return bRuleMatched;
}

void CTranslateRuleReversion::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	NList<NString, NString>* plActions;
	if (!(cMain.UsingViews())){
		if (cMain.IsAtomic(iOtherNode)){  // The top node is atomic.		
			// Get the bottom node of the atomic block.
			NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcBlockList = cMain.GetAtomicBlocks(iOtherNode);
			///////////////////// Assuming there's only one atomic block.
			CTranslateAtomicBlock* pcBlock = pcBlockList->GetHead();
			int iAtomicEnd = pcBlock->GetBottomNode();
			NList<NString, NString>* plTopActions = cMain.GetActions(iAtomicEnd);
			NList<NString, NString>* plNodeActions = cMain.GetActions(iNode);
			
			// Create actions for killing all threads below the top reversion point.
			NList<NString, NString>* plActions = cMain.FindThreadsToKill(iOtherNode, true);
			
			// Copy all the top node's actions to the new list.
			NPosition cTopPosition;
			cTopPosition = plTopActions->GetHeadPosition();
			while (cTopPosition.IsNotNull()){
				NString strAction = plTopActions->GetNext(cTopPosition);
				plActions->AddTail(strAction);
			}

			// Copy all the reversion node's actions to the new list,
			// except for program counter updates.
			NPosition cPosition;
			cPosition = plNodeActions->GetHeadPosition();
			while (cPosition.IsNotNull()){
				NString strAction = plNodeActions->GetNext(cPosition);
				// Don't add it if it's a program counter update.
				if (strAction.Left(2) != "pc"){
					plActions->AddHead(strAction);
				}
			}
			cMain.RemoveAssignmentRepeats(*plActions);
	//		NPosition cThreadPosition;
	//		cThreadPosition = plThreadsToKill->GetHeadPosition();
	//		while (cThreadPosition.IsNotNull()){
	//			NString strThreadPC = plThreadsToKill->GetNext(cThreadPosition);
	//			if (!ContainsPCUpdate(plTopActions, strThreadPC)){
	//				if (!ContainsPCUpdate(plActions, strThreadPC)){
	//					plActions->AddTail(strThreadPC + "'=0");	
	//				}
	//			}
	//		}
	//		delete plThreadsToKill;
			cMain.AddNodeAction(iNode,plActions);


		}else{  // The top node is not atomic.
			NList<NString, NString>* plTopActions = cMain.GetActions(iOtherNode);
			NList<NString, NString>* plNodeActions = cMain.GetActions(iNode);

			// Remove any program counter updates from the reversion node's list.
		//	NPosition cPosition;
		//	cPosition = plActions->GetHeadPosition();
		//	while (cPosition.IsNotNull()){
		//		NString strAction = plActions->GetNext(cPosition);
		//		if (strAction.Left(2) == "pc"){
		//			plActions->RemoveAt(cPosition);
		//		}
		//	}
//			// Copy all the reversion node's actions to the top node list.
//			NPosition cTopPosition;
//			cTopPosition = plNodeActions->GetHeadPosition();
//			while (cTopPosition.IsNotNull()){
//				NString strAction = plNodeActions->GetNext(cTopPosition);
//				// Don't add it if it's a program counter update.
//				if (strAction.Left(2) != "pc"){
//					plTopActions->AddHead(strAction);
//				}
//			}
//			cMain.RemoveAssignmentRepeats(*plTopActions);

			// Create actions for killing all threads below the top reversion point.
			NList<NString, NString>* plActions  = cMain.FindThreadsToKill(iOtherNode, true);
	//		NPosition cThreadPosition;
	//		cThreadPosition = plThreadsToKill->GetHeadPosition();
	//		while (cThreadPosition.IsNotNull()){
	//			NString strThreadPC = plThreadsToKill->GetNext(cThreadPosition);
	//			if (!ContainsPCUpdate(plTopActions, strThreadPC)){
	//				if (!ContainsPCUpdate(plActions, strThreadPC)){
	//					plActions->AddTail(strThreadPC + "'=0");	
	//				}
	//			}
	//		}
	//		delete plThreadsToKill;

			// Copy all the top node's actions to the new list.
			NPosition cActionPosition;
			cActionPosition = plTopActions->GetHeadPosition();
			while (cActionPosition.IsNotNull()){
				NString strAction = plTopActions->GetNext(cActionPosition);
				plActions->AddTail(strAction);
			}
			
			// Copy all the reversion node's actions to the new list,
			// except for program counter updates.
			NPosition cPosition;
			cPosition = plNodeActions->GetHeadPosition();
			while (cPosition.IsNotNull()){
				NString strAction = plNodeActions->GetNext(cPosition);
				// Don't add it if it's a program counter update.
				if (strAction.Left(2) != "pc"){
					plActions->AddHead(strAction);
				}
			}
			cMain.RemoveAssignmentRepeats(*plActions);
	
			cMain.AddNodeAction(iNode,plActions);
		}
			
	}else{  // Using failure views.
		// To be completed.
	}	
}

bool CTranslateRuleReversion::ContainsPCUpdate(NList<NString, NString>* plList, NString strPCName){
	NPosition cPosition;
	cPosition = plList->GetHeadPosition();
	while (cPosition.IsNotNull()){
		NString strAction = plList->GetNext(cPosition);
		int iIndex = strAction.Find(strPCName);
		if (iIndex != -1){
			return true;
		}
	}
	return false;
}
	
/*void CTranslateRuleReversion::translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{
	if (!(cMain.UsingViews())){
		if (cMain.IsAtomic(iOtherNode)){
			// This is not allowed at present.
			// Throw an exception.
			CTranslateNode* pcNode = cMain.GetNode(iNode);
			NString strComponent = pcNode->GetComponentName();
			NString strState = pcNode->GetStateName();
			NString strMessage = "Jumping to an atomic node is not allowed: ";
			strMessage = strMessage + strComponent + " " + strState;
			CTranslateException cException(strMessage);
			throw cException;

		//	// Create transitions to kill all the threads below the top reversion point.
		//	NList<int, int>* plProcessesToKill;
		//	plProcessesToKill = cMain.FindProcessesToKill(iOtherNode);
		//	NList<CTranslateUTrans*, CTranslateUTrans*>* plTransitions = new NList<CTranslateUTrans*, CTranslateUTrans*>;
		//	bool bThreadsWereKilled = false;

		//	// Get the top node's process to make sure it won't be killed.
		//	int iTopPC = cMain.GetPC(iOtherNode);
		//	int iTopProcess = cMain.GetProcess(iTopPC);

		//	// Create transitions to kill each process.
		//	CTranslateUTrans* pcTransition;
		//	NString strLabel;
		//	int iLabelType = UPPAAL_SYNCH;
		//	NPosition cPos = plProcessesToKill->GetHeadPosition();
		//	while (cPos.IsNotNull()){
		//		int iProcess = plProcessesToKill->GetNext(cPos);
		//		if (iProcess != iTopPC){
		//			strLabel = "killpro";
		//			strLabel.Format(strLabel + "%d"), iProcess;
		//			cMain.AddSynchronisation(strLabel);
		//			strLabel.Append("!");
		//			pcTransition = new CTranslateUTrans();
		//			pcTransition->AddLabel(strLabel, iLabelType);
		//			plTransitions->AddTail(pcTransition);
		//			cMain.AddKilledProcess(iProcess);
		//			bThreadsWereKilled = true;
		//		}
		//	}
		//	delete plProcessesToKill;

		//	// Get the process that this node belongs to.
		//	int iPC = cMain.GetPC(iNode);
		//	int iProcess = cMain.GetProcess(iPC);
		//	// Get the process that the other node belongs to.
		//	int iOtherPC = cMain.GetPC(iOtherNode);
		//	int iOtherProcess = cMain.GetProcess(iOtherPC);
		//	int iOtherPCValue = cMain.GetPCValueForNode(iOtherNode);
		//	int iNewValue = iOtherPCValue + 1;
		//	pcTransition = cMain.GetNodeTransition(iNode);

		//	// Copy all the labels of the other node.
		//	CTranslateAtomicBlock* pcBlock = cMain.GetAtomicBlock(iOtherNode);
		//	int iAtomicEnd = pcBlock->GetBottomNode();
		//	CTranslateUTrans* pcOtherTransition = cMain.GetNodeTransition(iAtomicEnd);
		//	NString strOtherGuard = pcOtherTransition->GetGuard();
		//	NString strOtherAssignment = pcOtherTransition->GetAssignment();
		//	NString strOtherSynch = pcOtherTransition->GetSynchronisation();
		//	if (strOtherGuard != ""){
		//		pcTransition->AddLabel(strOtherGuard, 2);
		//	}
		//	if (strOtherAssignment != ""){
		//		pcTransition->AddLabel(strOtherAssignment, 1);
		//	}
		//	if (strOtherSynch != ""){
		//		pcTransition->AddLabel(strOtherSynch, 3);
		//	}

		//	// Change the target location.
		//	if (iProcess == iOtherProcess){  // The node is jumping to a location in the same process.
		//		pcTransition->SetTarget(iOtherPC, iNewValue, 0);
		//		pcTransition->SetIsJumpNode(true);
		//		if (bThreadsWereKilled){ // There are lots of transitions.
		//			plTransitions->AddTail(pcTransition);
		//			m_cParsingMethods.StoreMultipleUPPAALTransition(cMain, iNode, plTransitions);
		//			// Set the target node again as it was erased by parsing methods.
		//			pcTransition->SetTarget(iOtherPC, iNewValue, 0);

		//			// Rearrange the process' transition list so that the jump transition is last.
		//			NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
		//			plProcessTransitions = cMain.GetTransitions(iProcess);
		//			NPosition cJumpPos = plProcessTransitions->Find(pcTransition);
		//			plProcessTransitions->RemoveAt(cJumpPos);
		//			plProcessTransitions->AddTail(pcTransition);
		//		}else{
		//			delete plTransitions;
		//		}
		//	
		//	}else{  // The node is jumping to another process.
		//		// Add a label to send out a jump message.
		//		NString strJumpMessage = "jumpToPro";
		//		strJumpMessage.Format(strJumpMessage + "%d"), iOtherPC;
		//		strJumpMessage.Append("state");
		//		strJumpMessage.Format(strJumpMessage + "%d"), iOtherPCValue;
		//		bool bSynchAdded = cMain.AddSynchronisation(strJumpMessage);
		//		NString strLabel = strJumpMessage + "!";
		//		pcTransition->AddLabel(strLabel,3);
		//		pcTransition->SetIsJumpNode(true);
		//		
		//		// Add a transition to the other process to jump from disabled to the other node.
		//		if (bSynchAdded){   // The disabled transition was not already added. 
		//			CTranslateUTrans* pcDisabledTransition;
		//			pcDisabledTransition->SetSource(iOtherProcess, 0, 0); // The disabled state of the other process.
		//			pcDisabledTransition->SetTarget(iOtherPC, iNewValue, 0);
		//			pcDisabledTransition->SetIsJumpNode(true);
		//			NString strLabel2 = strJumpMessage + "?";
		//			pcDisabledTransition->AddLabel(strLabel2, 3);
		//			pcDisabledTransition->SetIsJumpNode(true);
		//			NList<CTranslateUTrans*, CTranslateUTrans*>* plOtherProcessTrans;
		//			plOtherProcessTrans = cMain.GetTransitions(iOtherProcess);
		//			plOtherProcessTrans->AddTail(pcDisabledTransition);
		//		}
		//
		//		// Set the target node.
		//		// Revert back to the disabled state for this process.
		//		pcTransition->SetTarget(iPC, 0, 0);  // 0 for the value indicates the disabled state.
		//		
		//		if (bThreadsWereKilled){ // There are lots of transitions.
		//			plTransitions->AddTail(pcTransition);
		//			m_cParsingMethods.StoreMultipleUPPAALTransition(cMain, iNode, plTransitions);
		//			// Set the target node again as it was erased by parsing methods.
		//			// Revert back to the disabled state for this process.
		//			pcTransition->SetTarget(iPC, 0, 0);  // 0 for the value indicates the disabled state.
		//		
		//			// Rearrange the process' transition list so that the jump transition is last.
		//			NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
		//			plProcessTransitions = cMain.GetTransitions(iProcess);
		//			NPosition cJumpPos = plProcessTransitions->Find(pcTransition);
		//			plProcessTransitions->RemoveAt(cJumpPos);
		//			plProcessTransitions->AddTail(pcTransition);
		//		}else{
		//			delete plTransitions;
		//		}
		//	}

		}else{
			// Create transitions to kill all the threads below the top reversion point.
			NList<int, int>* plProcessesToKill;
			plProcessesToKill = cMain.FindProcessesToKill(iOtherNode);
			NList<CTranslateUTrans*, CTranslateUTrans*>* plTransitions = new NList<CTranslateUTrans*, CTranslateUTrans*>;
			bool bThreadsWereKilled = false;

			// Get the top node's process to make sure it won't be killed.
			int iTopPC = cMain.GetPC(iOtherNode);
			int iTopProcess = cMain.GetProcess(iTopPC);

			// Create transitions to kill each process.
			CTranslateUTrans* pcTransition;
			NString strLabel;
			int iLabelType = UPPAAL_SYNCH;
			NPosition cPos = plProcessesToKill->GetHeadPosition();
			while (cPos.IsNotNull()){
				int iProcess = plProcessesToKill->GetNext(cPos);
				if (iProcess != iTopProcess){
					strLabel = "killpro";
					strLabel.Format(strLabel + "%d"), iProcess;
					cMain.AddSynchronisation(strLabel);
					strLabel.Append("!");
					pcTransition = new CTranslateUTrans();
					pcTransition->AddLabel(strLabel, iLabelType);
					plTransitions->AddTail(pcTransition);
					bThreadsWereKilled = true;
					cMain.AddKilledProcess(iProcess);
				}
			}
			delete plProcessesToKill;

			//////////UUUUUUU  Need to copy the clocks of the other transition.

			// Change the target location.
			// Get the process that this node belongs to.
			int iPC = cMain.GetPC(iNode);
			int iProcess = cMain.GetProcess(iPC);
			// Get the process that the other node belongs to.
			int iOtherPC = cMain.GetPC(iOtherNode);
			int iOtherProcess = cMain.GetProcess(iOtherPC);
			int iOtherPCValue = cMain.GetPCValueForNode(iOtherNode);
			int iNewValue = iOtherPCValue + 1;
			pcTransition = cMain.GetNodeTransition(iNode);

			if (iProcess == iOtherProcess){  // The node is jumping to a location in the same process.
				pcTransition->SetIsJumpNode(true);
				pcTransition->SetTarget(iOtherPC, iOtherPCValue, 0);

				if (bThreadsWereKilled){ // There are lots of transitions.
					plTransitions->AddTail(pcTransition);
					m_cParsingMethods.StoreMultipleUPPAALTransition(cMain, iNode, plTransitions, true);
					// Set the target node again as it was erased by parsing methods.
					pcTransition->SetTarget(iOtherPC, iOtherPCValue, 0);

					// Rearrange the process' transition list so that the jump transition is last.
					NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
					plProcessTransitions = cMain.GetTransitions(iProcess);
					NPosition cJumpPos = plProcessTransitions->Find(pcTransition);
					plProcessTransitions->RemoveAt(cJumpPos);
					plProcessTransitions->AddTail(pcTransition);
				}else{
					delete plTransitions;
				}
			}else{  // The node is jumping to another process.
				
				// Add a label to send out a jump message.
				NString strJumpMessage = "jumpToPro";
				strJumpMessage.Format(strJumpMessage + "%d"), iOtherPC;
				strJumpMessage.Append("state");
				strJumpMessage.Format(strJumpMessage + "%d"), iOtherPCValue;
				bool bSynchAdded = cMain.AddSynchronisation(strJumpMessage);
				NString strLabel = strJumpMessage + "!";
				pcTransition->AddLabel(strLabel,3);
				pcTransition->SetIsJumpNode(true);
				
				// Add a transition to the other process to jump from disabled to the other node.
				if (bSynchAdded){  // The disabled transition was not already added.
					CTranslateUTrans* pcDisabledTransition = new CTranslateUTrans;
					pcDisabledTransition->SetSource(iOtherProcess, 0, 0); // The disabled state of the other process.
					pcDisabledTransition->SetTarget(iOtherPC, iOtherPCValue, 0);
					NString strLabel2 = strJumpMessage + "?";
					pcDisabledTransition->AddLabel(strLabel2, 3);
					pcDisabledTransition->SetIsJumpNode(true);
					NList<CTranslateUTrans*, CTranslateUTrans*>* plOtherProcessTrans;
					plOtherProcessTrans = cMain.GetTransitions(iOtherProcess);
					plOtherProcessTrans->AddTail(pcDisabledTransition);
				}
				
				// Set the target node.
				// Revert back to the disabled state for this process.
				pcTransition->SetTarget(iProcess, 0, 0);  // 0 for the value indicates the disabled state.
				if (bThreadsWereKilled){ // There are lots of transitions.
					plTransitions->AddTail(pcTransition);
					m_cParsingMethods.StoreMultipleUPPAALTransition(cMain, iNode, plTransitions, true);
					// Set the target node again as it was erased by parsing methods.
					// Revert back to the disabled state for this process.
					pcTransition->SetTarget(iProcess, 0, 0);  // 0 for the value indicates the disabled state.
				
					// Rearrange the process' transition list so that the jump transition is last.
					NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
					plProcessTransitions = cMain.GetTransitions(iProcess);
					NPosition cJumpPos = plProcessTransitions->Find(pcTransition);
					plProcessTransitions->RemoveAt(cJumpPos);
					plProcessTransitions->AddTail(pcTransition);
				}else{
					delete plTransitions;
				}
			
			}
			
			
		}
			
	}else{  // Using failure views.
		// To be completed.
	}		
}*/