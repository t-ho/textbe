// File name: TranslateParsingMethods.cpp
// Author/s : Nisansala Yatapanage
// Date built: 7/7/2006
// Last updated: 19/6/2007
// Purpose: This class handles some common operations required
//			by the rule classes.
// Algorithms used:
// Description of Algorithm#:
//
//

#include "StdAfx.h"
#include "TranslateParsingMethods.h"
#include "TranslateRuleSequential.h"
#include "TranslateRuleConBranching.h"
#include "TranslateRuleAltBranching.h"
#include "TranslateRuleReversion.h"
#include "TranslateRuleMacro.h"
#include "TranslateRuleInternal.h"
#include "TranslateRuleSelConjunct.h"
#include "TranslateRuleSelDisjunct.h"
#include "TranslateRuleThreadKill.h"
#include "TranslateSetAdd.h"
#include "TranslateSetCardinality.h"
#include "TranslateSetDifference.h"
#include "TranslateSetEmpty.h"
#include "TranslateSetIntersection.h"
#include "TranslateSetMember.h"
#include "TranslateSetUnion.h"
#include "TranslateSetSubtract.h"
#include "TranslateSetSubset.h"
//#include "TranslateUTrans.h"
#include "GSEMethod.h"


CTranslateParsingMethods::CTranslateParsingMethods(void)
{
}

CTranslateParsingMethods::~CTranslateParsingMethods(void)
{
}

void CTranslateParsingMethods::CheckForAtomic(CTranslateSALMain& cMain, int iCurrentNode)
{
	CTranslateNode* pcNode = cMain.GetNode(iCurrentNode);
	int iNumberOfChildren = pcNode->GetNumberOfChildren();
	bool bNodeIsAtomic = pcNode->IsNodeAtomic();
	if (iNumberOfChildren > 0){
		// Check if the children are atomic.
		int iChildID;
		CTranslateNode* pcChild;
		bool bAChildIsAtomic = false;
		bool bAChildIsNonatomic = false;
		for (int i = 0; i < iNumberOfChildren; i++){
			iChildID = pcNode->GetChildID(i);
			pcChild = cMain.GetNode(iChildID);
			if (pcChild->IsNodeAtomic()){  // The child is atomic.
				bAChildIsAtomic = true;
				if (bAChildIsNonatomic == true){ // One of the other children was non-atomic.
					// Throw an exception as mixed atomic & non-atomic is not allowed.

				}
				// Add this node to the same atomic blocks as the child.	
				NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcChildBlocks;
				pcChildBlocks = cMain.GetAtomicBlocks(iChildID);
				NPosition cBlockPos = pcChildBlocks->GetHeadPosition();
				CTranslateAtomicBlock* pcCurrentBlock;
				while (cBlockPos.IsNotNull()){
					pcCurrentBlock = pcChildBlocks->GetNext(cBlockPos);
					pcCurrentBlock->AddNodeAbove(iCurrentNode);
					// Increase the count of atomic blocks for this node.
					int iAtomicCount = cMain.GetAtomicBlockCount(iCurrentNode);
					iAtomicCount++;
					cMain.SetAtomicBlockCount(iCurrentNode, iAtomicCount);
					// Set this node to have the same atomic block.
					cMain.SetAtomicBlock(iCurrentNode, pcCurrentBlock);
/////////// Remember when deleting atomic blocks that several nodes will contain the same
					//// atomic block in their lists.
				}
				

			}else{ // The child is not atomic.
				bAChildIsNonatomic = true;
				if (bAChildIsAtomic == true){ // One of the other children was atomic.
					// Throw an exception as mixed atomic & non-atomic is not allowed.

				}
			}
		}
		if (!bAChildIsAtomic && bNodeIsAtomic){
			/* The child connection is not atomic but the parent connection is,
			 * so start a new atomic block.
			 */
			CTranslateAtomicBlock* pcNewBlock = new CTranslateAtomicBlock();
			pcNewBlock->AddNodeAbove(iCurrentNode);
			// Increase the count of atomic blocks for this node.
			int iAtomicCount = cMain.GetAtomicBlockCount(iCurrentNode);
			iAtomicCount++;
			cMain.SetAtomicBlockCount(iCurrentNode, iAtomicCount);
			cMain.SetAtomicBlock(iCurrentNode, pcNewBlock);
		}
	}else if (bNodeIsAtomic == true){				
		/* There is no child but the parent connection is atomic, 
		 * so start a new atomic block.
		 */
		CTranslateAtomicBlock* pcNewBlock = new CTranslateAtomicBlock();
		pcNewBlock->AddNodeAbove(iCurrentNode);
		// Increase the count of atomic blocks for this node.
		int iAtomicCount = cMain.GetAtomicBlockCount(iCurrentNode);
		iAtomicCount++;
		cMain.SetAtomicBlockCount(iCurrentNode, iAtomicCount);
		cMain.SetAtomicBlock(iCurrentNode, pcNewBlock);
	}
}

void CTranslateParsingMethods::StoreNodeTransition(CTranslateSALMain& cTranslateMain, int iNode, NString strGuard, NList<NString, NString>* plActions, int iParent, bool bIsExternal, bool bIsInternalInput)
{
	int iProgramCounterValue = 0;
	int iNewValue = 0;
	CTranslateNode* pcNode = cTranslateMain.GetNode(iNode);
	NString strProgramCounterName = cTranslateMain.GetPCForNode(iNode);
	iProgramCounterValue = cTranslateMain.GetPCValueForNode(iNode);
	iNewValue = iProgramCounterValue + 1;

	if (iParent == NULL){
		iParent = pcNode->GetParent();
	}
	if (cTranslateMain.IsAtomic(iNode)){
		
		if (cTranslateMain.GetTranslationType() == 4){
			if (bIsExternal == true){
				// Inform the blocks associated with this node
				// that there is an external input node.
				NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcBlocks;
				pcBlocks = cTranslateMain.GetAtomicBlocks(iNode);
				NPosition cBlockPos = pcBlocks->GetHeadPosition();
				CTranslateAtomicBlock* pcCurrentBlock;
				while (cBlockPos.IsNotNull()){
					pcCurrentBlock = pcBlocks->GetNext(cBlockPos);
					pcCurrentBlock->SetExternal();
				}
			}else if (bIsInternalInput == true){
				// Inform the blocks associated with this node
				// that there is an internal input node.
				NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcBlocks;
				pcBlocks = cTranslateMain.GetAtomicBlocks(iNode);
				NPosition cBlockPos = pcBlocks->GetHeadPosition();
				CTranslateAtomicBlock* pcCurrentBlock;
				while (cBlockPos.IsNotNull()){
					pcCurrentBlock = pcBlocks->GetNext(cBlockPos);
					pcCurrentBlock->SetInternalInput();
				}
			}
		}
		// Check if this is the bottom node of an atomic branch.
		int iFirstChild = pcNode->GetChildID(0);
		bool bIsBottom;
		if (iFirstChild != 0){ // There is a child node.
			CTranslateNode* pcFirstChild = cTranslateMain.GetNode(iFirstChild);
			if (pcFirstChild->IsNodeAtomic()){
				// The child is atomic so this isn't the bottom node.
				// Note: remember that it has to be pcFirstChild->IsNodeAtomic(), not 
				// cTranslateMain.isAtomic(iFirstChild), because cTranslateMain.isAtomic()
				// will return true even if the child is the top node of a different atomic
				// block. In that case, pcNode will think it is not the bottom node of its
				// atomic block, even though it is the bottom node and the child is actually 
				// in a different block, i.e. there is a non-atomic link between the child and
				// pcNode, even though they are both in atomic blocks.
				bIsBottom = false;
			}else{
				// The child isn't atomic so this is the bottom node.
				bIsBottom = true;
			}
		}else{  // There are no child nodes so this is the bottom node.
			bIsBottom = true;
		}

		if (bIsBottom){  
			// This is the bottom node of the block.
			// Check if this node already had a guard related to atomic alternate branching.
			NString strPreviousGuard = cTranslateMain.GetAtomicGuard(iNode);
			if (strPreviousGuard != _T("")){
				if (strGuard != _T("")){
					strGuard = strPreviousGuard + _T(" AND ") + strGuard;
				}else{
					strGuard = strPreviousGuard;
				}
			}
			cTranslateMain.AddAtomicGuard(iNode, strGuard);
			cTranslateMain.AddAtomicActions(iNode, plActions);

			// Store the final transition for the entire atomic path.
			
			// Get the atomic blocks.
			NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcAtomicBlocks;
			pcAtomicBlocks = cTranslateMain.GetAtomicBlocks(iNode);
			// Since this is the bottom node it can only be part of one block.
			CTranslateAtomicBlock* pcBlock = pcAtomicBlocks->GetHead();

			NString strFullGuard = _T("");
			NString strFullOppositeGuard = _T("");  // The NOT case for selection nodes.
			NList<NString, NString>* plFullActions = new NList<NString, NString>;

			if (cTranslateMain.UsingViews()){
				
			}else{  // Not using failure views.
				NString strTempGuard;
				NList<NString, NString> lTempActions;
					
				NList<int, int>* plAtomicNodes = pcBlock->GetNodes();
				NPosition cAtomicPosition = plAtomicNodes->GetHeadPosition();
				while (cAtomicPosition.IsNotNull()){
					int iCurrentNode = plAtomicNodes->GetNext(cAtomicPosition);
					CTranslateNode* pcCurrentNode = cTranslateMain.GetNode(iCurrentNode);
					NString strTempGuard = cTranslateMain.GetAtomicGuard(iCurrentNode);
					NList<NString,NString>* plTempActions;
					plTempActions = cTranslateMain.GetAtomicActions(iCurrentNode);
					
					if (strTempGuard != _T("")){
						if (pcCurrentNode->GetType() == GSE_T_CONDITION){
							// This is a selection node, so create a NOT guard.
							if (strFullOppositeGuard == _T("")){
								strFullOppositeGuard = _T("NOT(") + strTempGuard + _T(")");
								// Add the rest of the normal guard created so far.
								if (strFullGuard != _T("")){
									strFullOppositeGuard.Append(_T(" AND "));
									strFullOppositeGuard.Append(strFullGuard);
								}
							}else{
								strFullOppositeGuard.Append(_T(" AND NOT("));
								strFullOppositeGuard.Append(strTempGuard);
								strFullOppositeGuard.Append(_T(")"));
							}
							if (strFullGuard != _T("")){
								strFullGuard = strTempGuard + _T(" AND ") + strFullGuard;
							}else{
								strFullGuard = strTempGuard;
							}
						}else{  // This is not a selection node.
							if (strFullGuard != _T("")){
								strFullGuard = strTempGuard + _T(" AND ") + strFullGuard;
							}else{
								strFullGuard = strTempGuard;
							}
							if (strFullOppositeGuard != _T("")){
								strFullOppositeGuard.Append(_T(" AND "));
								strFullOppositeGuard.Append(strTempGuard);
							}
						}
					}		
					// Add all the current node's actions to the full list.
					NPosition cTempPosition = plTempActions->GetHeadPosition();
					while (cTempPosition.IsNotNull()){
						NString strCurrentTempAction = plTempActions->GetNext(cTempPosition);
						plFullActions->AddTail(strCurrentTempAction);
					}

					// If the node had a sets guard, store it in the new final node.
					// Assumed that there can't be more than one sets guard in an atomic
					// block, because there can't be more than one forall and forone nodes
					// joined atomically.
					CTranslateNode* pcAtomicNode = cTranslateMain.GetNode(iCurrentNode);
					NString strSetsGuard = pcAtomicNode->RetrieveSetsGuard();
					if (strSetsGuard != _T("")){
						CTranslateNode* pcFinalNode = cTranslateMain.GetNode(iNode);
						pcFinalNode->StoreSetsGuard(strSetsGuard);
					}
				}

				// If this is a branch of an alternate selections set, then set the extra transition
				// for the NOT case. (See TranslateRuleAltBranching for more details).
				int iGuardPosition = pcNode->GetGuardPosition();
				if (iGuardPosition != -1){  // This is a branch in an alternate selections set.
					cTranslateMain.UpdateExtraTransition(iGuardPosition, strFullGuard);
				}

				// Add pc information.
				// Only add the pc to the guard if this block didn't contain alternate
				// branching nodes, because in that case the pc has already been added.
				int iProgramCounter = cTranslateMain.GetPC(iNode);
				int iTopNode = pcBlock->GetTopNode();
				int iTopPC = cTranslateMain.GetPC(iTopNode);
				if (iProgramCounter == iTopPC){ // Since both have the same pc, this block
					// didn't contain branching nodes.
					if (strFullGuard != _T("")){
						strFullGuard =  _T(" AND ") + strFullGuard;
						strFullGuard.Format(_T("%d") + strFullGuard, iProgramCounterValue);
						strFullGuard = strProgramCounterName + _T("=") + strFullGuard;
					}else{
						strFullGuard = strProgramCounterName + _T("=");
						strFullGuard.Format(strFullGuard + _T("%d"), iProgramCounterValue);
					}

					if (strFullOppositeGuard != _T("")){
						strFullOppositeGuard =  _T(" AND ") + strFullOppositeGuard;
						strFullOppositeGuard.Format(_T("%d") + strFullOppositeGuard, iProgramCounterValue);
						strFullOppositeGuard = strProgramCounterName + _T("=") + strFullOppositeGuard;
					}
				}
				NString strAction = strProgramCounterName + _T("'=");
				strAction.Format(strAction + _T("%d"), iNewValue);
				plFullActions->AddTail(strAction);
	
				if (cTranslateMain.GetTranslationType() == 4){
					if (pcBlock->ContainsExternal() == true){
						strFullGuard = strFullGuard + _T(" AND NOT(internalActions)"); 
					}else if (pcBlock->ContainsInternalInput() != true){
						strFullGuard = strFullGuard + _T(" AND NOT(messageReady)"); 
					}
				}
				cTranslateMain.AddNodeGuard(iNode,strFullGuard);
				cTranslateMain.AddNodeAction(iNode,plFullActions);

				// Add the extra NOT transition if one exists and if this is not a branch of 
				// and alternate selections set.
				if (iGuardPosition == -1){
					if (strFullOppositeGuard != _T("")){
						// Create the list of actions to set all the program counters of this
						// atomic block to 0.
						NList<NString, NString>* plOppositeActions = new NList<NString, NString>;
						NList<int, int>* plProgramCounters = pcBlock->GetProgramCounters();
						NPosition cPCPos = plProgramCounters->GetHeadPosition();
						NString strResetAction;
						int iCurrentPC;
						while (cPCPos.IsNotNull()){
							iCurrentPC = plProgramCounters->GetNext(cPCPos);
							strResetAction = _T("pc");
							strResetAction.Format(strResetAction + _T("%d"), iCurrentPC);
							strResetAction.Append(_T("'=0"));
							plOppositeActions->AddTail(strResetAction);
						}
						if (plProgramCounters->GetSize() == 0){
							// No program counters were reset so just reset the final pc of this block.
							strResetAction = strProgramCounterName;
							strResetAction.Append(_T("'=0"));
							plOppositeActions->AddHead(strResetAction);
						}
						cTranslateMain.AddExtraTransition(strFullOppositeGuard, plOppositeActions);				
					}
				}
			}	
		}else{   // This is not the bottom node of an atomic block.
			// Check if this node already had a guard related to atomic alternate branching.
			//// THIS SECTION HAS BEEN REMOVED BECAUSE ATOMIC ALTERNATE BRANCHING IS NOT ALLOWED.
			//// Note that if it is to be allowed, first change this section because it causes a problem
			//// where if there is a non-atomic alternate branching where one (or more) branch(es) are
			//// atomic within themselves but not to the parent of the alternate branching, then the 
			//// guard of that branch is printed twice, e.g. pc4=1 AND pc4=1 --> ...
	//		NString strPreviousGuard = cTranslateMain.GetAtomicGuard(iNode);
	//		if (strPreviousGuard != _T("")){
	//			if (strGuard != _T("")){
	//				strGuard = strPreviousGuard + _T(" AND ") + strGuard;
	//			}else{
	//				strGuard = strPreviousGuard;
	//			}
	//		}
			cTranslateMain.AddAtomicGuard(iNode, strGuard);
			cTranslateMain.AddAtomicActions(iNode, plActions);
		}
					
	}else{
		// Not atomic.
		if(strGuard == _T("")){
			strGuard = strProgramCounterName + _T("=");
			strGuard.Format(strGuard + _T("%d"), iProgramCounterValue);
		}else{
			strGuard =  _T(" AND ") + strGuard;
			strGuard.Format(_T("%d") + strGuard, iProgramCounterValue);
			strGuard = strProgramCounterName + _T("=") + strGuard;
		}
		NString strAction = strProgramCounterName + _T("'=");
		strAction.Format(strAction + _T("%d"), iNewValue);
		plActions->AddTail(strAction);

		if (cTranslateMain.GetTranslationType() == 4){
			if (bIsExternal == true){
				strGuard = strGuard + _T(" AND NOT(internalActions)"); 
			}else if (!bIsInternalInput){
				strGuard = strGuard + _T(" AND NOT(messageReady)"); 
			}
		}
		cTranslateMain.AddNodeGuard(iNode, strGuard);
		cTranslateMain.AddNodeAction(iNode, plActions);
	}
}

CTranslateParsingRule* CTranslateParsingMethods::GetRule(int iRuleID)
{
	if (iRuleID == 1){
		CTranslateParsingRule* pcRule = new CTranslateRuleSequential();
		return pcRule;
	}else if (iRuleID == 2){
		CTranslateParsingRule* pcRule = new CTranslateRuleInternal();
		return pcRule;
	}else if (iRuleID == 3){
		CTranslateParsingRule* pcRule = new CTranslateRuleConBranching();
		return pcRule;
	}else if (iRuleID == 4){
		CTranslateParsingRule* pcRule = new CTranslateRuleAltBranching();
		return pcRule;
	}else if (iRuleID == 5){
		CTranslateParsingRule* pcRule = new CTranslateRuleMacro();
		return pcRule;
	}else if (iRuleID == 6){
		// change this to return the synchronisation rule.
		return NULL;
	}else if (iRuleID == 7){
		CTranslateParsingRule* pcRule = new CTranslateRuleThreadKill();
		return pcRule;
	}else if (iRuleID == 8){
		CTranslateParsingRule* pcRule = new CTranslateRuleReversion();
		return pcRule;
	}else if (iRuleID == 9){
		CTranslateParsingRule* pcRule = new CTranslateRuleSelConjunct();
		return pcRule;
	}else if (iRuleID == 10){
		CTranslateParsingRule* pcRule = new CTranslateRuleSelDisjunct();
		return pcRule;
	}else if (iRuleID == 11){
		CTranslateParsingRule* pcRule = new CTranslateSetAdd();
		return pcRule;
	}else if (iRuleID == 12){
		CTranslateParsingRule* pcRule = new CTranslateSetUnion();
		return pcRule;
	}else if (iRuleID == 13){
		CTranslateParsingRule* pcRule = new CTranslateSetSubtract();
		return pcRule;
	}else if (iRuleID == 14){
		CTranslateParsingRule* pcRule = new CTranslateSetDifference();
		return pcRule;
	}else if (iRuleID == 15){
		CTranslateParsingRule* pcRule = new CTranslateSetCardinality();
		return pcRule;
	}else if (iRuleID == 16){
		CTranslateParsingRule* pcRule = new CTranslateSetEmpty();
		return pcRule;
	}else if (iRuleID == 17){
		CTranslateParsingRule* pcRule = new CTranslateSetIntersection();
		return pcRule;
	}else if (iRuleID == 18){
		CTranslateParsingRule* pcRule = new CTranslateSetMember();
		return pcRule;
	}else if (iRuleID == 19){
		CTranslateParsingRule* pcRule = new CTranslateSetSubset();
		return pcRule;
	}else{
		return NULL;
	}
}

// Store an UPPAAL transition for normal (sequential or atomic) nodes which
// require only one transition with one label plus additional clock labels.
/*void CTranslateParsingMethods::StoreUPPAALTransition(CTranslateUPPAAL& cTranslateMain, int iNode, NString strLabel, int iLabelType)
{
	int iProgramCounterValue = 0;
	int iNewValue = 0;
	CTranslateNode* pcNode = cTranslateMain.GetNode(iNode);
	int iProgramCounter = cTranslateMain.GetPC(iNode);
	iProgramCounterValue = cTranslateMain.GetPCValueForNode(iNode);
	iNewValue = iProgramCounterValue + 1;

	int iParent = pcNode->GetParent();

	if (cTranslateMain.IsAtomic(iNode)){
		// Check if this is the bottom node of an atomic branch.
		int iFirstChild = pcNode->GetChildID(0);
		bool bIsBottom;
		if (iFirstChild != 0){ // There is a child node.
			if (cTranslateMain.IsAtomic(iFirstChild)){
				// The child is atomic so this isn't the bottom node.
				bIsBottom = false;
			}else{
				// The child isn't atomic so this is the bottom node.
				bIsBottom = true;
			}
		}else{  // There are no child nodes so this is the bottom node.
			bIsBottom = true;
		}

		if (bIsBottom){  
			// This is the bottom node of the block.
			
			// Store the final transition for the entire atomic path.
			if (cTranslateMain.UsingViews()){
				
			}else{  // Not using failure views.
				// Get the atomic blocks.
				NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcAtomicBlocks;
				pcAtomicBlocks = cTranslateMain.GetAtomicBlocks(iNode);
				// Since this is the bottom node it can only be part of one block.
				CTranslateAtomicBlock* pcBlock = pcAtomicBlocks->GetHead();

				CTranslateUTrans* pcCurrentTransition = new CTranslateUTrans;
				pcCurrentTransition->SetSource(iProgramCounter, iProgramCounterValue, 0);
				// Don't set the target until the atomic block is completed.
				pcCurrentTransition->AddLabel(strLabel, iLabelType);
				cTranslateMain.SetNodeTransition(iNode, pcCurrentTransition);

				//Get all the atomic labels and join them together.
				CTranslateUTrans* pcTransition = new CTranslateUTrans;
				CTranslateUTrans* pcAtomicTransition;
				NList<int, int>* plAtomicNodes = pcBlock->GetNodes();
				NPosition cAtomicPosition = plAtomicNodes->GetHeadPosition();
				int iCount = 0;
				while (cAtomicPosition.IsNotNull()){
					int iCurrentNode = plAtomicNodes->GetNext(cAtomicPosition);
					pcAtomicTransition = cTranslateMain.GetNodeTransition(iCurrentNode);
					NString strAtomicGuard = pcAtomicTransition->GetGuard();
					NString strAtomicAssignment = pcAtomicTransition->GetAssignment();
					NString strAtomicSynch = pcAtomicTransition->GetSynchronisation();
					if (strAtomicGuard != _T("")){
						pcTransition->AddLabel(strAtomicGuard, 2);
					}
					if (strAtomicAssignment != _T("")){
						pcTransition->AddLabel(strAtomicAssignment, 1);
					}
					if (strAtomicSynch != _T("")){
						pcTransition->AddLabel(strAtomicSynch, 3);
					}
					if (iCount == 0){
						int iSourcePC = pcAtomicTransition->GetSourcePC();
						int iSourceValue = pcAtomicTransition->GetSourcePCValue();
						int iSourceIndex = cTranslateMain.GetSourceIndexForNode(iCurrentNode);
						pcTransition->SetSource(iSourcePC, iSourceValue, iSourceIndex);
					}
					// Delete the transition if it isn't needed anymore by another
					// atomic block.
					int iAtomicBlockCount = cTranslateMain.GetAtomicBlockCount(iCurrentNode);
					if (iAtomicBlockCount == 1){ // No other blocks are using this node.
						delete pcAtomicTransition;
						pcAtomicTransition = NULL;
						cTranslateMain.SetAtomicBlockCount(iCurrentNode, 0);
					}
					iCount++;
				}

				// Create clock labels if necessary.
				NList<NString, NString>* plTags = pcNode->GetExtraInfoTags();
				NList<NString, NString>* plNames = pcNode->GetExtraInfoNames();
				if (plTags->GetSize() > 0){
					NPosition cTagPos = plTags->GetHeadPosition();
					NPosition cNamePos = plNames->GetHeadPosition();
					int iClockLabelType;
					while (cTagPos.IsNotNull()){
						NString strTag = plTags->GetNext(cTagPos);
						NString strName = plNames->GetNext(cNamePos);
						cTranslateMain.AddClockDetails(strName);
						strName.Replace(_T("<"), _T("&lt;"));
						strName.Replace(_T(">"), _T("&gt;"));
						if (strTag == _T("I")){
							pcTransition->SetInvariant(strName);
						}else if (strTag == _T("G")){
							iClockLabelType = UPPAAL_GUARD;
							pcTransition->AddLabel(strName, iClockLabelType);
						}else if (strTag == _T("R")){
							iClockLabelType = UPPAAL_ASSIGN;
							pcTransition->AddLabel(strName, iClockLabelType);
						}
					}
				}

				// Set the target node.
				pcTransition->SetTarget(iProgramCounter, iNewValue, 0);
				NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
				// Get the process that this pc belongs to.
				int iProcess = cTranslateMain.GetProcess(iProgramCounter);
				plProcessTransitions = cTranslateMain.GetTransitions(iProcess);
				// Add this transition to the list.
				plProcessTransitions->AddTail(pcTransition);
				cTranslateMain.SetNodeTransition(iNode, pcTransition);

				// If this is the last node of the branch then create a transition to the disabled state.
				if (pcNode->GetNumberOfChildren() == 0){
					if (pcNode->GetJumpType() == GSE_J_NO){  // This isn't a reversion or macro node.
						CTranslateUTrans* pcResetTransition = new CTranslateUTrans();
						pcResetTransition->SetSource(iProgramCounter, iNewValue, 0);
						pcResetTransition->SetTarget(iProcess, 0, 0); // The disabled state.
						pcResetTransition->SetIsJumpNode(true);
						plProcessTransitions->AddTail(pcResetTransition);
					}
				}
			}	
		}else{   // This is a middle or top node of the block.
			CTranslateUTrans* pcTransition = new CTranslateUTrans;
			pcTransition->AddLabel(strLabel, iLabelType);
			cTranslateMain.SetNodeTransition(iNode, pcTransition);
		}
					
	}else{
		// Not atomic.
		CTranslateUTrans* pcTransition = new CTranslateUTrans;
		int iSourceIndex = cTranslateMain.GetSourceIndexForNode(iNode);
		pcTransition->SetSource(iProgramCounter, iProgramCounterValue, iSourceIndex);
		pcTransition->SetTarget(iProgramCounter, iNewValue, 0);
		if (pcNode->GetJumpType() == GSE_J_NO){  // It isn't a reversion or goto.
			// Don't add the label if it's a reversion or goto.
			pcTransition->AddLabel(strLabel, iLabelType);
		}	
		
		// Create clock labels if necessary.
		NList<NString, NString>* plTags = pcNode->GetExtraInfoTags();
		NList<NString, NString>* plNames = pcNode->GetExtraInfoNames();
		if (plTags->GetSize() > 0){
			NPosition cTagPos = plTags->GetHeadPosition();
			NPosition cNamePos = plNames->GetHeadPosition();
			int iClockLabelType;
			while (cTagPos.IsNotNull()){
				NString strTag = plTags->GetNext(cTagPos);
				NString strName = plNames->GetNext(cNamePos);
				cTranslateMain.AddClockDetails(strName);
				strName.Replace(_T("<"), _T("&lt;"));
				strName.Replace(_T(">"), _T("&gt;"));
				if (strTag == _T("I")){
					pcTransition->SetInvariant(strName);
				}else if (strTag == _T("G")){
					iClockLabelType = UPPAAL_GUARD;
					pcTransition->AddLabel(strName, iClockLabelType);
				}else if (strTag == _T("R")){
					iClockLabelType = UPPAAL_ASSIGN;
					pcTransition->AddLabel(strName, iClockLabelType);
				}
			}
		}
		
		// Get the process that this pc belongs to.
		NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
		int iProcess = cTranslateMain.GetProcess(iProgramCounter);
		plProcessTransitions = cTranslateMain.GetTransitions(iProcess);
		
		// Add this transition to the list.
		plProcessTransitions->AddTail(pcTransition);
		// Associate the node with the transition.
		cTranslateMain.SetNodeTransition(iNode, pcTransition);

		// If this is the last node of the branch then create a transition to the disabled state.
		if (pcNode->GetNumberOfChildren() == 0){
			if (pcNode->GetJumpType() == GSE_J_NO){  // This isn't a reversion or macro node.
				CTranslateUTrans* pcResetTransition = new CTranslateUTrans();
				pcResetTransition->SetSource(iProgramCounter, iNewValue, 0);
				pcResetTransition->SetTarget(iProcess, 0, 0); // The disabled state.
				pcResetTransition->SetIsJumpNode(true);
				plProcessTransitions->AddTail(pcResetTransition);
			}
		}
	}
}*/

// Store an UPPAAL transition for nodes which require a set of committed states.
/*void CTranslateParsingMethods::StoreMultipleUPPAALTransition(CTranslateUPPAAL &cTranslateMain, int iNode, NList<CTranslateUTrans*,CTranslateUTrans*> *plTransitions, bool bDoClocks){
	NPosition cPos;
	NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
	int iProgramCounter = cTranslateMain.GetPC(iNode);
	int iProgramCounterValue = cTranslateMain.GetPCValueForNode(iNode);
	int iNewPCValue = iProgramCounterValue + 1;
	int iSourceIndex = cTranslateMain.GetSourceIndexForNode(iNode);

	// Get the process that this pc belongs to.
	int iProcess = cTranslateMain.GetProcess(iProgramCounter);
	plProcessTransitions = cTranslateMain.GetTransitions(iProcess);
	CTranslateNode* pcNode = cTranslateMain.GetNode(iNode);

	// Create clock labels if necessary.
	// Add the clock labels to the first transition in the block.  /////UUUUUUUUU Check if this is correct.
	if (bDoClocks){
		CTranslateUTrans* pcFirstTransition = plTransitions->GetHead();
		NList<NString, NString>* plTags = pcNode->GetExtraInfoTags();
		NList<NString, NString>* plNames = pcNode->GetExtraInfoNames();
		if (plTags->GetSize() > 0){
			NPosition cTagPos = plTags->GetHeadPosition();
			NPosition cNamePos = plNames->GetHeadPosition();
			int iClockLabelType;
			while (cTagPos.IsNotNull()){
				NString strTag = plTags->GetNext(cTagPos);
				NString strName = plNames->GetNext(cNamePos);
				cTranslateMain.AddClockDetails(strName);
				strName.Replace(_T("<"), _T("&lt;"));
				strName.Replace(_T(">"), _T("&gt;"));
				if (strTag == _T("I")){
					pcFirstTransition->SetInvariant(strName);
				}else if (strTag == _T("G")){
					iClockLabelType = UPPAAL_GUARD;
					pcFirstTransition->AddLabel(strName, iClockLabelType);
				}else if (strTag == _T("R")){
					iClockLabelType = UPPAAL_ASSIGN;
					pcFirstTransition->AddLabel(strName, iClockLabelType);
				}
			}
		}
	}

	cPos = plTransitions->GetHeadPosition();
	CTranslateUTrans* pcCurrentTransition;
	int iCount = 0;
	int iNumberOfTransitions = plTransitions->GetSize();
	while (cPos.IsNotNull()){
		pcCurrentTransition = plTransitions->GetNext(cPos);
		if (iCount == 0){
			// This is the first transition.
			pcCurrentTransition->SetSource(iProgramCounter, iProgramCounterValue, iSourceIndex);
			pcCurrentTransition->SetTarget(iProgramCounter, iNewPCValue, iCount+1);
		}else{
			pcCurrentTransition->SetSource(iProgramCounter, iNewPCValue, iCount);
			pcCurrentTransition->SetTarget(iProgramCounter, iNewPCValue, iCount+1);
		}
		
		if (iCount == (iNumberOfTransitions - 1)){
			// This is the last transition so set it to be not committed.
			pcCurrentTransition->SetIsCommitted(false);
		}else{
			pcCurrentTransition->SetIsCommitted(true);
		}	
		// Add this transition to the process' list of transitions
		// if it's not already in the list.
		if (plProcessTransitions->Find(pcCurrentTransition).IsNull()){
			plProcessTransitions->AddTail(pcCurrentTransition);
		}
		iCount++;
	}
	// Associate the node with the multiple transitions.
	cTranslateMain.SetMultipleTransitions(iNode, plTransitions);

	// If this is the last node of the branch then create a transition to the disabled state.
	if (pcNode->GetNumberOfChildren() == 0){
		if (pcNode->GetJumpType() == GSE_J_NO){  // This isn't a reversion or macro node.
			CTranslateUTrans* pcResetTransition = new CTranslateUTrans();
			pcResetTransition->SetSource(iProgramCounter, iNewPCValue, iNumberOfTransitions);
			pcResetTransition->SetTarget(iProcess, 0, 0); // The disabled state.
			pcResetTransition->SetIsJumpNode(true);
			plProcessTransitions->AddTail(pcResetTransition);
		}
	}
}*/
/*
// Store an UPPAAL transition for nodes which require many labels but just one transition.
void CTranslateParsingMethods::StoreUPPAALManyLabels(CTranslateUPPAAL& cTranslateMain, int iNode, NList<NString, NString>* plLabels, NList<int, int>* plLabelTypes){
	int iProgramCounterValue = 0;
	int iNewValue = 0;
	CTranslateNode* pcNode = cTranslateMain.GetNode(iNode);
	int iProgramCounter = cTranslateMain.GetPC(iNode);
	iProgramCounterValue = cTranslateMain.GetPCValueForNode(iNode);
	iNewValue = iProgramCounterValue + 1;

	int iParent = pcNode->GetParent();

	if (cTranslateMain.IsAtomic(iNode)){
		CTranslateAtomicBlock* pcBlock = cTranslateMain.GetAtomicBlock(iNode);
		if (pcBlock->GetTopNode() == iNode){   
			// This is the top node of the block.
			CTranslateUTrans* pcTransition = new CTranslateUTrans;
			pcTransition->SetSource(iProgramCounter, iProgramCounterValue, 0);
			// Don't set the target until the atomic block is completed.
			pcTransition->SetLabelList(plLabels);
			pcTransition->SetLabelTypes(plLabelTypes);
			cTranslateMain.SetNodeTransition(iNode, pcTransition);

		}else if (pcBlock->GetBottomNode() == iNode){  
			// This is the bottom node of the block.
			
			// Store the final transition for the entire atomic path.
			if (cTranslateMain.UsingViews()){
				
			}else{  // Not using failure views.
				// Get the process that this pc belongs to.
				NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
				int iProcess = cTranslateMain.GetProcess(iProgramCounter);
				plProcessTransitions = cTranslateMain.GetTransitions(iProcess);
				
				// Remove this node's transition if one already exists.
				CTranslateUTrans* pcEarlierTransition = cTranslateMain.GetNodeTransition(iNode);
				if (pcEarlierTransition.IsNotNull()){ // An earlier one exists.
					NPosition cEarlierPos = plProcessTransitions->Find(pcEarlierTransition);
					plProcessTransitions->RemoveAt(cEarlierPos);
					delete pcEarlierTransition;
				}

				CTranslateUTrans* pcCurrentTransition = new CTranslateUTrans;
				pcCurrentTransition->SetSource(iProgramCounter, iProgramCounterValue, 0);
				// Don't set the target until the atomic block is completed.
				pcCurrentTransition->SetLabelList(plLabels);
				pcCurrentTransition->SetLabelTypes(plLabelTypes);
				cTranslateMain.SetNodeTransition(iNode, pcCurrentTransition);

				//Get all the atomic labels and join them together.
				CTranslateUTrans* pcTransition = new CTranslateUTrans;
				CTranslateUTrans* pcAtomicTransition;
				NList<NString, NString>* plAtomicLabels;
				NList<int, int>* plAtomicLabelTypes;
				NList<int, int>* plAtomicNodes = pcBlock->GetNodes();
				pcTransition->SetLabelList(plLabels);
				pcTransition->SetLabelTypes(plLabelTypes);

				NPosition cAtomicPosition = plAtomicNodes->GetHeadPosition();
				int iCount = 0;
				while (cAtomicPosition.IsNotNull()){
					int iCurrentNode = plAtomicNodes->GetNext(cAtomicPosition);
					pcAtomicTransition = cTranslateMain.GetNodeTransition(iCurrentNode);
					plAtomicLabels = pcAtomicTransition->GetLabels();
					plAtomicLabelTypes = pcAtomicTransition->GetLabelTypes();
					if (plAtomicLabels->GetCount() > 0){
						NString strLabel = plAtomicLabels->GetHead();
						int iLabelType = plAtomicLabelTypes->GetHead();
						pcTransition->AddLabel(strLabel, iLabelType);
					}
					if (iCount == 0){
						int iSourcePC = pcAtomicTransition->GetSourcePC();
						int iSourceValue = pcAtomicTransition->GetSourcePCValue();
						int iSourceIndex = cTranslateMain.GetSourceIndexForNode(iCurrentNode);
						pcTransition->SetSource(iSourcePC, iSourceValue, iSourceIndex);
					}
					delete pcAtomicTransition;
					pcAtomicTransition = NULL;
					iCount++;
				}
				
				// Create clock labels if necessary.
				NList<NString, NString>* plTags = pcNode->GetExtraInfoTags();
				NList<NString, NString>* plNames = pcNode->GetExtraInfoNames();
				if (plTags->GetSize() > 0){
					NPosition cTagPos = plTags->GetHeadPosition();
					NPosition cNamePos = plNames->GetHeadPosition();
					int iClockLabelType;
					while (cTagPos.IsNotNull()){
						NString strTag = plTags->GetNext(cTagPos);
						NString strName = plNames->GetNext(cNamePos);
						cTranslateMain.AddClockDetails(strName);
						strName.Replace(_T("<"), _T("&lt;"));
						strName.Replace(_T(">"), _T("&gt;"));
						if (strTag == _T("I")){
							pcTransition->SetInvariant(strName);
						}else if (strTag == _T("G")){
							iClockLabelType = UPPAAL_GUARD;
							pcTransition->AddLabel(strName, iClockLabelType);
						}else if (strTag == _T("R")){
							iClockLabelType = UPPAAL_ASSIGN;
							pcTransition->AddLabel(strName, iClockLabelType);
						}
					}
				}

				// Set the target node.
				pcTransition->SetTarget(iProgramCounter, iNewValue, 0);
				// Add this transition to the list.
				plProcessTransitions->AddTail(pcTransition);

				// If this is the last node of the branch then create a transition to the disabled state.
				if (pcNode->GetNumberOfChildren() == 0){
					if (pcNode->GetJumpType() == GSE_J_NO){  // This isn't a reversion or macro node.
						CTranslateUTrans* pcResetTransition = new CTranslateUTrans();
						pcResetTransition->SetSource(iProgramCounter, iNewValue, 0);
						pcResetTransition->SetTarget(iProcess, 0, 0); // The disabled state.
						pcResetTransition->SetIsJumpNode(true);
						plProcessTransitions->AddTail(pcResetTransition);
					}
				}
			}	
		}else{   // This is a middle node.
			CTranslateUTrans* pcTransition = new CTranslateUTrans;
			// Don't set the target until the atomic block is completed.
			// Don't set the source as it has already been set by the top node of the block.
			pcTransition->SetLabelList(plLabels);
			pcTransition->SetLabelTypes(plLabelTypes);
			cTranslateMain.SetNodeTransition(iNode, pcTransition);
		}
					
	}else{
		// Not atomic.
		CTranslateUTrans* pcTransition = new CTranslateUTrans;
		int iSourceIndex = cTranslateMain.GetSourceIndexForNode(iNode);
		pcTransition->SetSource(iProgramCounter, iProgramCounterValue, iSourceIndex);
		pcTransition->SetTarget(iProgramCounter, iNewValue, 0);
		pcTransition->SetLabelList(plLabels);
		pcTransition->SetLabelTypes(plLabelTypes);
		NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;

		// Create clock labels if necessary.
		NList<NString, NString>* plTags = pcNode->GetExtraInfoTags();
		NList<NString, NString>* plNames = pcNode->GetExtraInfoNames();
		if (plTags->GetSize() > 0){
			NPosition cTagPos = plTags->GetHeadPosition();
			NPosition cNamePos = plNames->GetHeadPosition();
			int iClockLabelType;
			while (cTagPos.IsNotNull()){
				NString strTag = plTags->GetNext(cTagPos);
				NString strName = plNames->GetNext(cNamePos);
				cTranslateMain.AddClockDetails(strName);
				strName.Replace(_T("<"), _T("&lt;"));
				strName.Replace(_T(">"), _T("&gt;"));
				if (strTag == _T("I")){
					pcTransition->SetInvariant(strName);
				}else if (strTag == _T("G")){
					iClockLabelType = UPPAAL_GUARD;
					pcTransition->AddLabel(strName, iClockLabelType);
				}else if (strTag == _T("R")){
					iClockLabelType = UPPAAL_ASSIGN;
					pcTransition->AddLabel(strName, iClockLabelType);
				}
			}
		}

		// Get the process that this pc belongs to.
		int iProcess = cTranslateMain.GetProcess(iProgramCounter);
		plProcessTransitions = cTranslateMain.GetTransitions(iProcess);
		// Remove this node's transition if one already exists.
		CTranslateUTrans* pcEarlierTransition = cTranslateMain.GetNodeTransition(iNode);
		if (pcEarlierTransition.IsNotNull()){ // An earlier one exists.
			NPosition cEarlierPos = plProcessTransitions->Find(pcEarlierTransition);
			plProcessTransitions->RemoveAt(cEarlierPos);
			delete pcEarlierTransition;
		}
		// Add this transition to the list.
		plProcessTransitions->AddTail(pcTransition);
		// Associate the node with the transition.
		cTranslateMain.SetNodeTransition(iNode, pcTransition);

		// If this is the last node of the branch then create a transition to the disabled state.
		if (pcNode->GetNumberOfChildren() == 0){
			if (pcNode->GetJumpType() == GSE_J_NO){  // This isn't a reversion or macro node.
				CTranslateUTrans* pcResetTransition = new CTranslateUTrans();
				pcResetTransition->SetSource(iProgramCounter, iNewValue, 0);
				pcResetTransition->SetTarget(iProcess, 0, 0); // The disabled state.
				pcResetTransition->SetIsJumpNode(true);
				plProcessTransitions->AddTail(pcResetTransition);
			}
		}
	}
}
*/