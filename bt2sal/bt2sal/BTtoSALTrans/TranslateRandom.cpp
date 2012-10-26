#include "StdAfx.h"
#include "TranslateRandom.h"
#include "GSEMethod.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif

CTranslateRandom::CTranslateRandom(void)
{
}

CTranslateRandom::~CTranslateRandom(void)
{
}

CTranslateNode* CTranslateRandom::CreateRandomBT(CString strIterations)
{
	CList<CTranslateNode*, CTranslateNode*> lLeafNodes;
	CList<CTranslateNode*, CTranslateNode*> lAllNodes;
	CList<CTranslateNode*, CTranslateNode*> lPermanentLeafNodes;
	int iLeafNumber = 0;
	int iAllNumber = 0;
	CString strCompName;
	CString strStateName;
	int iNodeID = 1;
	m_iNumberOfComponents = 100;
	m_iNumberOfStates = 100;

	// Create a root node.
	CTranslateNode* pcRandomRoot = CreateNewNode();
	lLeafNodes.AddTail(pcRandomRoot);
	lAllNodes.AddTail(pcRandomRoot);
	pcRandomRoot->SetNodeID(iNodeID);
	m_mIDsToNodes.SetAt(iNodeID, pcRandomRoot);
	iNodeID++;
	iLeafNumber = 1;
	iAllNumber = 1;
	
	// Read from a file how many iterations to do.
//	FILE *pcFile;
//	CString strLine;
//	char cLine[4096];
//	CString strPathName = _T("C:/tests/Iterations.txt");
//	_tfopen_s(&pcFile,(LPCTSTR)strPathName ,_T("rt"));

//	fgets(cLine,4096,pcFile); 
//	strLine = cLine;
//	fclose(pcFile);

	int iHowManyIterations = _ttoi(strIterations);
	int iIterationsCompleted = 0;
	int iBranchType = 0;
	int iNumberOfBranches = 1;
	m_iNumberOfBranches = 0;
	m_iNumberOfReversions = 0;
	m_iNumberOfMacros = 0; 
	m_iNumberOfThreadKills = 0;

	while (iIterationsCompleted < iHowManyIterations){
		// Decide whether to create a single node or a set of branches.
		// Get a random number between 1 and 5.
		int iRandomBranch = (((double) rand() / (RAND_MAX + 1)) * 5) + 1;
		if (iRandomBranch < 4){  // If it is 1, 2 or 3 to give more chance for no branching.
			iBranchType = 0;  // No branching.
			iNumberOfBranches = 1;
		}else if (iRandomBranch == 4){  
			iBranchType = 1;  // Alternate branching.
			// Randomly select how many branches from 2 to 3.
			// Note: To change the number of branches, put the starting 
			// number as the "+ 2" part at the end and multiply by the 
			// number of numbers in the gap, i.e. The line below creates
			// random numbers starting at 2 and going upto 2 spaces more,
			// which produces 2, 3.
			iNumberOfBranches = (((double) rand() / (RAND_MAX + 1)) * 2) + 2;
			m_iNumberOfBranches++; // Increase the total count of branches.
		}else if (iRandomBranch == 5){ 
			iBranchType = 2;  // Concurrent branching.
			// Randomly select how many branches from 2 to 3.
			iNumberOfBranches = (((double) rand() / (RAND_MAX + 1)) * 2) + 2;
			m_iNumberOfBranches++; // Increase the total count of branches.
		}
		if (iLeafNumber > 0){
			// Choose a parent node randomly from the list of leaf nodes.
			int iLeafPosition = (((double) rand() / (RAND_MAX + 1)) * iLeafNumber) + 1;
			CTranslateNode* pcLeafNode = GetListElement(lLeafNodes, iLeafPosition);

			for (int i = 0; i < iNumberOfBranches; i++){ // For each branch.
				CTranslateNode* pcNode = CreateNewNode();
				// If it's a branching node, set its details appropriately.
				if (iNumberOfBranches > 1){
					pcNode->SetSiblingNumber(iNumberOfBranches - 1);
					if (iBranchType == 1){ // Alternate branching.
						pcNode->SetIsNodeNonDeterministic(true);
					}else if (iBranchType == 2){ // Concurrent branching.
						pcNode->SetIsNodeNonDeterministic(false);
					}
				}

				// Get a rule for this node.
				// Get a random number between 1 and 9.
				int iRule = (((double) rand() / (RAND_MAX + 1)) * 9) + 1;

				switch(iRule){
					case 1:  // State-realisation node.
						{
						pcNode->SetNodeID(iNodeID);
						m_mIDsToNodes.SetAt(iNodeID, pcNode);
						pcLeafNode->AddChild(iNodeID);
						pcNode->SetParent(pcLeafNode->GetNodeID());
						iNodeID++;
						lLeafNodes.AddTail(pcNode);
						iLeafNumber = iLeafNumber + 1;
						lAllNodes.AddTail(pcNode);
						iAllNumber++;
						}	
						break;

					case 2: // Selection node.
						{
						// Change the node to an selection type.
						pcNode->SetType(GSE_T_CONDITION);
						pcNode->SetNodeID(iNodeID);
						m_mIDsToNodes.SetAt(iNodeID, pcNode);
						pcLeafNode->AddChild(iNodeID);
						pcNode->SetParent(pcLeafNode->GetNodeID());
						iNodeID++;
						lLeafNodes.AddTail(pcNode);
						iLeafNumber = iLeafNumber + 1;
						lAllNodes.AddTail(pcNode);
						iAllNumber++;
						}
						break;

					case 3: // Guard.
						{
						// Change the node to an guard type.
						pcNode->SetType(GSE_T_GUARD);
						pcNode->SetNodeID(iNodeID);
						m_mIDsToNodes.SetAt(iNodeID, pcNode);
						pcLeafNode->AddChild(iNodeID);
						pcNode->SetParent(pcLeafNode->GetNodeID());
						iNodeID++;
						lLeafNodes.AddTail(pcNode);
						iLeafNumber = iLeafNumber + 1;
						lAllNodes.AddTail(pcNode);
						iAllNumber++;
						}
						break;

					case 4: // Internal message nodes.
						{
						// Create the internal output node.
						// Change the node to an internal output type.
						pcNode->SetType(GSE_T_OUTPUT1);
						pcNode->SetNodeID(iNodeID);
						m_mIDsToNodes.SetAt(iNodeID, pcNode);
						pcLeafNode->AddChild(iNodeID);
						pcNode->SetParent(pcLeafNode->GetNodeID());
						iNodeID++;
						lLeafNodes.AddTail(pcNode);
						iLeafNumber = iLeafNumber + 1;
						lAllNodes.AddTail(pcNode);
						iAllNumber++;

						// Create the matching internal input node.
						// Choose another parent node randomly from the list of leaf nodes.
						int iLeafPosition2 = (((double) rand() / (RAND_MAX + 1)) * iLeafNumber) + 1;
						// Make sure it's not the same parent node.
						while (iLeafPosition == iLeafPosition2){
							iLeafPosition2 = (((double) rand() / (RAND_MAX + 1)) * iLeafNumber) + 1;
						}
						CTranslateNode* pcLeafNode2 = GetListElement(lLeafNodes, iLeafPosition2);
						CTranslateNode* pcNode2 = CreateNewNode();
						// Change the node to an internal input type.
						pcNode2->SetType(GSE_T_INPUT1);
						pcNode2->SetNodeID(iNodeID);
						// Change the node's details to match the output one.
						pcNode2->SetComponentName(pcNode->GetComponentName());
						pcNode2->SetStateName(pcNode->GetStateName());
						m_mIDsToNodes.SetAt(iNodeID, pcNode2);
						pcLeafNode2->AddChild(iNodeID);
						pcNode2->SetParent(pcLeafNode2->GetNodeID());
						iNodeID++;
						// Remove the chosen parent from the leaf nodes list.
						RemoveFromList(lLeafNodes,iLeafPosition2);
						// Make sure that iLeafPosition is still the correct location
						// for pcLeafNode since something was removed from lLeafNodes.
						if (iLeafPosition2 < iLeafPosition){
							// The 2nd node was removed from a spot earlier in the
							// list than pcLeafNode, so everything would have moved
							// up by one.
							iLeafPosition = iLeafPosition - 1;
						}
						lLeafNodes.AddTail(pcNode2);
						lAllNodes.AddTail(pcNode2);
						iAllNumber++;
						}
						break;

					case 5: // External Input node.
						{
						// Change the node to an external input type.
						pcNode->SetType(GSE_T_INPUT);
						pcNode->SetNodeID(iNodeID);
						m_mIDsToNodes.SetAt(iNodeID, pcNode);
						pcLeafNode->AddChild(iNodeID);
						pcNode->SetParent(pcLeafNode->GetNodeID());
						iNodeID++;
						lLeafNodes.AddTail(pcNode);
						iLeafNumber = iLeafNumber + 1;
						lAllNodes.AddTail(pcNode);
						iAllNumber++;
						}
						break;

					case 6: // External Output node.
						{
						// Change the node to an external output type.
						pcNode->SetType(GSE_T_OUTPUT);
						pcNode->SetNodeID(iNodeID);
						m_mIDsToNodes.SetAt(iNodeID, pcNode);
						pcLeafNode->AddChild(iNodeID);
						pcNode->SetParent(pcLeafNode->GetNodeID());
						iNodeID++;
						lLeafNodes.AddTail(pcNode);
						iLeafNumber = iLeafNumber + 1;
						lAllNodes.AddTail(pcNode);
						iAllNumber++;
						}
						break;

					case 7: // Macro.
						{
						// Check if there are leaf nodes in the list.
						// Don't do a macro if the only leaf node is the root node,
						// because it won't work as it has to revert to the initialisation.
						if (pcRandomRoot != pcLeafNode){
							// Randomly choose one of the existing nodes.
							int iAllPosition = (((double) rand() / (RAND_MAX + 1)) * (iAllNumber-1)) + 2;
							CTranslateNode* pcChosenNode = GetListElement(lAllNodes, iAllPosition);
						
							// Change the new node's details to match the chosen node.
							pcNode->SetComponentName(pcChosenNode->GetComponentName());
							pcNode->SetStateName(pcChosenNode->GetStateName());
							pcNode->SetType(pcChosenNode->GetType());
							pcNode->SetNodeID(iNodeID);
							pcNode->SetJumpType(GSE_J_GOTO);
							m_mIDsToNodes.SetAt(iNodeID, pcNode);
							pcLeafNode->AddChild(iNodeID);
							pcNode->SetParent(pcLeafNode->GetNodeID());
							iNodeID++;
							lAllNodes.AddTail(pcNode);
							iAllNumber++;
							lPermanentLeafNodes.AddTail(pcNode);
							m_iNumberOfMacros++; // Increase the total count of macros.
						}else{
							// Since a macro didn't work just put a normal state-change node.
							pcNode->SetNodeID(iNodeID);
							m_mIDsToNodes.SetAt(iNodeID, pcNode);
							pcLeafNode->AddChild(iNodeID);
							pcNode->SetParent(pcLeafNode->GetNodeID());
							iNodeID++;
							lLeafNodes.AddTail(pcNode);
							iLeafNumber = iLeafNumber + 1;
							lAllNodes.AddTail(pcNode);
							iAllNumber++;
						}
						}
						break;

					case 8: // Reversion.
						{
						// Check if there are leaf nodes in the list.
						// Don't do a reversion if the only leaf node is the root node,
						// because it won't work as it has to revert to the initialisation.
							if (pcRandomRoot != pcLeafNode){
								// Find all the node's ancestors.
								CList<CTranslateNode*, CTranslateNode*> lAncestors;
								CTranslateNode* pcParent;
								int iParent = pcLeafNode->GetParent();
								while (iParent != 1){ // Until the root node is reached.
									int iSuccess2 = m_mIDsToNodes.Lookup(iParent, pcParent);
									lAncestors.AddTail(pcParent);
									iParent = pcParent->GetParent();
								}
								int iAncestorSize = lAncestors.GetSize();
								if (iAncestorSize > 0){ // If it is empty, it means that the only
									// parent is the root node, which can't be reverted to.
									// Randomly select one of the ancestors to revert to.
									int iAncestorPos = (((double) rand() / (RAND_MAX + 1)) * iAncestorSize) + 1;
									CTranslateNode* pcAncestor = GetListElement(lAncestors,iAncestorPos);
							
									// Change the new node's details to match the chosen node.
									pcNode->SetComponentName(pcAncestor->GetComponentName());
									pcNode->SetStateName(pcAncestor->GetStateName());
									pcNode->SetType(pcAncestor->GetType());
									pcNode->SetNodeID(iNodeID);
									pcNode->SetJumpType(GSE_J_REVERSION);
									m_mIDsToNodes.SetAt(iNodeID, pcNode);
									pcLeafNode->AddChild(iNodeID);
									pcNode->SetParent(pcLeafNode->GetNodeID());
									iNodeID++;
									lAllNodes.AddTail(pcNode);
									iAllNumber++;
									lPermanentLeafNodes.AddTail(pcNode);
									m_iNumberOfReversions++; // Increase the total count of reversions.
								}else{
									// Since a reversion didn't work just put a normal state-change node.
									pcNode->SetNodeID(iNodeID);
									m_mIDsToNodes.SetAt(iNodeID, pcNode);
									pcLeafNode->AddChild(iNodeID);
									pcNode->SetParent(pcLeafNode->GetNodeID());
									iNodeID++;
									lLeafNodes.AddTail(pcNode);
									iLeafNumber = iLeafNumber + 1;
									lAllNodes.AddTail(pcNode);
									iAllNumber++;
								}
							}else{
								// Since a reversion didn't work just put a normal state-change node.
								pcNode->SetNodeID(iNodeID);
								m_mIDsToNodes.SetAt(iNodeID, pcNode);							
								pcLeafNode->AddChild(iNodeID);
								pcNode->SetParent(pcLeafNode->GetNodeID());
								iNodeID++;
								lLeafNodes.AddTail(pcNode);
								iLeafNumber = iLeafNumber + 1;
								lAllNodes.AddTail(pcNode);
								iAllNumber++;
							}
						}
						break;

					case 9: // Thread Kill.
						{
						// Check if there are leaf nodes in the list.
						// Don't do a thread kill if the only leaf node is the root node,
						// because it won't work as it has to revert to the initialisation.
						if (pcRandomRoot != pcLeafNode){
							// Randomly choose one of the existing nodes.
							int iAllPosition = (((double) rand() / (RAND_MAX + 1)) * (iAllNumber-1)) + 2;
							CTranslateNode* pcChosenNode = GetListElement(lAllNodes, iAllPosition);
						
							// Change the new node's details to match the chosen node.
							pcNode->SetComponentName(pcChosenNode->GetComponentName());
							pcNode->SetStateName(pcChosenNode->GetStateName());
							pcNode->SetType(pcChosenNode->GetType());
							pcNode->SetNodeID(iNodeID);
							pcNode->SetFlag(_T("--"));
							m_mIDsToNodes.SetAt(iNodeID, pcNode);
							pcLeafNode->AddChild(iNodeID);
							pcNode->SetParent(pcLeafNode->GetNodeID());
							iNodeID++;
							lAllNodes.AddTail(pcNode);
							iAllNumber++;
							lLeafNodes.AddTail(pcNode);
							iLeafNumber = iLeafNumber + 1;
							m_iNumberOfThreadKills++; // Increase the total count of thread kills.
						}else{
							// Since a macro didn't work just put a normal state-change node.
							pcNode->SetNodeID(iNodeID);
							m_mIDsToNodes.SetAt(iNodeID, pcNode);
							pcLeafNode->AddChild(iNodeID);
							pcNode->SetParent(pcLeafNode->GetNodeID());
							iNodeID++;
							lLeafNodes.AddTail(pcNode);
							iLeafNumber = iLeafNumber + 1;
							lAllNodes.AddTail(pcNode);
							iAllNumber++;
						}
						}
						break;
				}
			}
			// Remove the chosen parent from the leaf nodes list.
			RemoveFromList(lLeafNodes,iLeafPosition);
			iLeafNumber = iLeafNumber - 1;
		}	
		iIterationsCompleted++;
	}
	m_iNumberOfNodes = lAllNodes.GetSize();
	return pcRandomRoot;
}

CTranslateNode* CTranslateRandom::GetListElement(CList<CTranslateNode*, CTranslateNode*>& cList, int iPosition)
{
	int iCounter = 1;
	CTranslateNode* pcElement;
	POSITION cPosition = cList.GetHeadPosition();
	while(cPosition != NULL){
		CTranslateNode* pcCurrentNode = cList.GetNext(cPosition);
		if (iCounter == iPosition){
			pcElement = pcCurrentNode;
		}
		iCounter++;
	}
	return pcElement;
}

CTranslateNode* CTranslateRandom::CreateNewNode(){
	CTranslateNode* pcNode = new CTranslateNode();
	// Get a component name and state name.
	int iComponent = (((double) rand() / (RAND_MAX + 1)) * m_iNumberOfComponents) + 1;
	int iState = (((double) rand() / (RAND_MAX + 1)) * m_iNumberOfStates) + 1;
	CString strCompName = _T("");
	strCompName.Format(_T("c%d"),iComponent);
	CString strStateName = _T("");
	strStateName.Format(_T("s%d"),iState);
	pcNode->SetComponentName(strCompName);
	pcNode->SetStateName(strStateName);
	pcNode->SetType(GSE_T_STATE);
	pcNode->SetBranchingType(GSE_L_NORMAL_LINK);
	pcNode->SetJumpType(GSE_J_NO);
	pcNode->SetIsBlankNode(false);
	pcNode->SetIsNodeAtomic(false);
	pcNode->SetIsNodeNonDeterministic(false);
	pcNode->SetIsNodeSetOperation(false);
	pcNode->SetIsUserDefinedAttribute(false);
	pcNode->SetSiblingNumber(0);

	return pcNode;
}


void CTranslateRandom::RemoveFromList(CList<CTranslateNode*, CTranslateNode*>& cList, int iIndex)
{
	POSITION cPosition = cList.GetHeadPosition();
	int iCounter = 1;
	while(cPosition != NULL){
		if (iCounter == iIndex){
			// This is the element to remove.
			cList.RemoveAt(cPosition);
			cPosition = NULL; // To get out of the loop.
		}else{
			CTranslateNode* pcCurrentNode = cList.GetNext(cPosition);
			iCounter++;
		}
	}
}

CTranslateNode* CTranslateRandom::GetNode(int iNodeID){
	CTranslateNode* pcNode;
	int iSuccess = m_mIDsToNodes.Lookup(iNodeID, pcNode);
	return pcNode;
}

void CTranslateRandom::DeleteNodes(){
	// Free all the memory allocated.
	POSITION cNodePosition = m_mIDsToNodes.GetStartPosition();
	while(cNodePosition != NULL){
		CTranslateNode* pcTheNode;
		int iID;
		m_mIDsToNodes.GetNextAssoc(cNodePosition,iID,pcTheNode);
		delete pcTheNode;
		pcTheNode = NULL;
	}
	m_mIDsToNodes.RemoveAll();
}

int CTranslateRandom::GetNumberOfNodes(){
	return m_iNumberOfNodes;
}

int CTranslateRandom::GetNumberOfBranches(){
	return m_iNumberOfBranches;
}

int CTranslateRandom::GetNumberOfReversions(){
	return m_iNumberOfReversions;
}

int CTranslateRandom::GetNumberOfMacros(){
	return m_iNumberOfMacros;
}

int CTranslateRandom::GetNumberOfThreadKills(){
	return m_iNumberOfThreadKills;
}