// File name: TranslateRuleThreadKill.cpp
// Author/s : Nisansala Yatapanage
// Date built: 13/10/2006
// Last updated: 19/6/2007
// Purpose: Implementation of the branch kill rule (Rule 7).
//
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateRuleThreadKill.h"
#include "TranslateStep.h"
#include "GSEMethod.h"
#include "TranslateException.h"

CTranslateRuleThreadKill::CTranslateRuleThreadKill(void)
{
	m_iRuleID = 7;
}

CTranslateRuleThreadKill::~CTranslateRuleThreadKill(void)
{
}

bool CTranslateRuleThreadKill::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
	bool bRuleMatched = false;
	NList<int, int> cMatchedNodes;
	NPosition cCurrentNodePosition;
	cCurrentNodePosition = cLeafNodes.GetHeadPosition();
	while(cCurrentNodePosition.IsNotNull()){
		int iCurrentNode;
		iCurrentNode = cLeafNodes.GetNext(cCurrentNodePosition);
		CTranslateNode* pcNode = cMain.GetNode(iCurrentNode);
		int iSiblingNumber = pcNode->GetSiblingNumber();
		NString strFlag = pcNode->GetFlag();
		if (strFlag == _T("--")){   // The node is a branch kill node.
			if ((iCurrentNode != iFinalNode) && ((iSiblingNumber == 0) || (bConsiderIfBranching == true))){   
				NString strComponent = pcNode->GetComponentName();
				NString strState = pcNode->GetStateName();
				int iType = pcNode->GetType();

				// Check if it is referring to a valid thread.
				int iThreadToKill = 0;
				bool bFoundThreadToKill = false;
				NPosition cAllPos;
				cAllPos = cAllNodes.GetHeadPosition();
				while(cAllPos.IsNotNull()){
					int iAllNode;
					iAllNode = cAllNodes.GetNext(cAllPos);
					CTranslateNode* pcAllNode = cMain.GetNode(iAllNode);

					if (iAllNode != iCurrentNode){  // This is not the same node.
					// Check if the node's details match.
						NString strOtherComp = pcAllNode->GetComponentName();
						NString strOtherState = pcAllNode->GetStateName();
						int iOtherType = pcAllNode->GetType();
						if (strComponent == strOtherComp){
							if (strState == strOtherState){
								if (iType == iOtherType){
									// The nodes match.
						    		bFoundThreadToKill = true;
				    				iThreadToKill = iAllNode;
								}
							}
				    	}
					}
				}
			    
			    if(!bFoundThreadToKill){  // A valid thread was not found.
					NString strMessage = _T("Branch kill not referring to a valid branch: ");
					strMessage = strMessage + strComponent + _T(" ") + strState;
					CTranslateException cException(strMessage);
					throw cException;
			    }else{	
					// Store the information, including the ID of the node to be terminated.
					m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
					NList<int, int>* plEmptyList = new NList<int, int>;
					cMain.StoreTranslationStep(iCurrentNode, 7, iThreadToKill, plEmptyList);
					bRuleMatched = true;
					cMatchedNodes.AddTail(iCurrentNode);
				}
			}
		}
	}
	// Remove the matched nodes from the leaf nodes list and add their parents.
	NPosition cMatchedPosition;
	cMatchedPosition = cMatchedNodes.GetHeadPosition();
	while(cMatchedPosition.IsNotNull()){
		int iMatchedNode;
		iMatchedNode = cMatchedNodes.GetNext(cMatchedPosition);	
		CTranslateNode* pcMatchedNode = cMain.GetNode(iMatchedNode);
		NPosition cNodePosition = cLeafNodes.Find(iMatchedNode);
		cLeafNodes.RemoveAt(cNodePosition);
		if (bConsiderIfBranching == false){ // Don't add the parent otherwise.
			int iParentNode = pcMatchedNode->GetParent();
			if (iParentNode != iFinalNode){  // This isn't the final node.
				cLeafNodes.AddTail(iParentNode);
			}
		}
	}
	return bRuleMatched;
}

void CTranslateRuleThreadKill::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	NString strGuard = _T("");
	NString strAction = _T("");
	NList<NString, NString>* plActions = new NList<NString, NString>;

	// Get the program counter of the thread to kill.
	NString strThreadPC = cMain.GetPCForNode(iOtherNode);

	// Get the list of program counters for all threads created by the killed thread.
	NList<NString, NString>* plThreadsToKill;
	plThreadsToKill = cMain.FindThreadsToKill(iOtherNode, false);
	
	// Create action updates to kill the threads.
	strAction = strThreadPC + _T("'=0");
	plActions->AddTail(strAction);
	NPosition cPos;
	cPos = plThreadsToKill->GetHeadPosition();
	while (cPos.IsNotNull()){
		strThreadPC = plThreadsToKill->GetNext(cPos);
		strAction = strThreadPC + _T("'=0");
		plActions->AddTail(strAction);
	}
	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
	delete plThreadsToKill;
}

/* void CTranslateRuleThreadKill::translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{
 Get the program counter of the thread to kill.
	int iThreadPC = cMain.GetPC(iOtherNode);
	// Get the process of the thread to kill.
	int iKillProcess = cMain.GetProcess(iThreadPC);

	// Get the other processes that are to be killed (they were created by the thread to kill).
	NList<int, int>* plProcessesToKill;
	plProcessesToKill = cMain.FindProcessesToKill(iOtherNode);

	// Add the first thread's process.
	if (plProcessesToKill->Find(iKillProcess).IsNull()){
		plProcessesToKill->AddHead(iKillProcess);
	}

	NList<CTranslateUTrans*, CTranslateUTrans*>* plTransitions = new NList<CTranslateUTrans*, CTranslateUTrans*>;
	
	// Create transitions to kill each process.
	CTranslateUTrans* pcTransition;
	NString strLabel;
	int iLabelType = UPPAAL_SYNCH;
	if (plProcessesToKill->GetCount() > 1){ // There's many threads to be killed.
		NPosition cPos = plProcessesToKill->GetHeadPosition();
		while (cPos.IsNotNull()){
			int iProcess = plProcessesToKill->GetNext(cPos);
			strLabel = _T("killpro");
			strLabel.Format(strLabel + _T("%d"), iProcess);
			cMain.AddSynchronisation(strLabel);
			strLabel.Append(_T("!"));
			pcTransition = new CTranslateUTrans();
			pcTransition->AddLabel(strLabel, iLabelType);
			plTransitions->AddTail(pcTransition);
			cMain.AddKilledProcess(iProcess);
		}
		m_cParsingMethods.StoreMultipleUPPAALTransition(cMain, iNode, plTransitions, true);

	}else{ // There's only 1 thread to be killed.
		int iProcess = plProcessesToKill->GetHead();
		cMain.AddKilledProcess(iProcess);
		strLabel = _T("killpro");
		strLabel.Format(strLabel + _T("%d"), iProcess);
		cMain.AddSynchronisation(strLabel);
		strLabel.Append(_T("!"));
		m_cParsingMethods.StoreUPPAALTransition(cMain, iNode, strLabel, iLabelType);
		delete plTransitions;
	}
	delete plProcessesToKill; 
}
*/
