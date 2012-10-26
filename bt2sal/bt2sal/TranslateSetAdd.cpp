// File name: TranslateSetAdd.cpp
// Author/s : Nisansala Yatapanage
// Date built: 2/11/2006
// Last updated: 2/11/2006
// Purpose: Implementation of the set rule for adding
//		an element to a set.
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateSetAdd.h"
#include "TranslateStep.h"
#include "GSEMethod.h"

CTranslateSetAdd::CTranslateSetAdd(void)
{
	m_iRuleID = 11;
}

CTranslateSetAdd::~CTranslateSetAdd(void)
{
}

bool CTranslateSetAdd::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
	bool bRuleMatched = false;
	NList<int, int> cMatchedNodes;
	NPosition cCurrentNodePosition;
	cCurrentNodePosition = cLeafNodes.GetHeadPosition();
	while(cCurrentNodePosition.IsNotNull()){
		int iCurrentNode;
		iCurrentNode = cLeafNodes.GetNext(cCurrentNodePosition);
		CTranslateNode* pcNode = cMain.GetNode(iCurrentNode);
		if (pcNode->IsNodeSetOperation()){
			int iSiblingNumber = pcNode->GetSiblingNumber();
			if ((iCurrentNode != iFinalNode) && ((iSiblingNumber == 0) || (bConsiderIfBranching == true))){   
				CString strFlag = pcNode->GetFlag();
				if (strFlag == _T("")){ // Check that there is no flag, e.g. thread kill flag.
					int iNumberOfSetRules = pcNode->GetNumberOfRules();
				//	if ((iNumberOfSetRules == 2) || (iNumberOfSetRules == 3)){
						CString strSetRule1 = pcNode->GetSetRule(0);
					//	CString strSetRule2 = pcNode->GetSetRule(1);
					//	if (iNumberOfSetRules == 3){
					/*		CString strSetRule3 = pcNode->GetSetRule(2);
							if (strSetRule1 == _T("membership")){
								if (strSetRule2 == _T("union")){
									if (strSetRule3 == _T("attribute")){
										// This is a set add rule in the form s := s + {a}
										cMatchedNodes.AddTail(iCurrentNode);
										m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
										if (bConsiderIfBranching == false){
											NList<int, int>* plEmptyList = new NList<int, int>;
											cMain.StoreTranslationStep(iCurrentNode, 11, NULL, plEmptyList);
										}
										bRuleMatched = true;
									}
								}
							} */
				//		}else{
							if (strSetRule1 == _T("add")){
							//	if (strSetRule2 == _T("union")){
									// This is a set add rule in the form s := s + {b}
									cMatchedNodes.AddTail(iCurrentNode);
									m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
									if (bConsiderIfBranching == false){
										NList<int, int>* plEmptyList = new NList<int, int>;
										cMain.StoreTranslationStep(iCurrentNode, 11, NULL, plEmptyList);
									}
									bRuleMatched = true;
							//	}
							}
				//		}
				//	}
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

void CTranslateSetAdd::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	CString strGuard = _T("");
	CString strAction = _T("");
	NList<CString, CString>* plActions = new NList<CString, CString>;
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	CString strSetName;
	CString strElement;
	CString strSetType; 

//	if (pcNode->GetNumberOfRules() == 2){ // It is in the form s + {b}
		strSetName = pcNode->GetSetVariable(0);
		strElement = pcNode->GetSetVariable(1);
		strSetType = cMain.GetSetType(strSetName, pcNode);
//	}else if (pcNode->GetNumberOfRules() == 3){  // It is in the form s := s + {b}
	//	strSetName = pcNode->GetSetVariable(0);
	//	strElement = pcNode->GetSetVariable(2);
	//	strSetType = cMain.GetSetType(strSetName, pcNode);
		// Assumed that the variable at index 1 is just the same as 
		// the one at index 0, since it is just the set name.

		CString strComponent = pcNode->GetComponentName();
		// Only add the component name if it is different to the set name,
		// otherwise this is a top-level set, not belonging to another component.
		if (strSetName != strComponent){
			strSetName = cMain.TrimChangeCase(strComponent,false) + _T("_") + cMain.TrimChangeCase(strSetName,true);
		}else{
			strSetName = cMain.TrimChangeCase(strSetName,true);
		}
//	}
	strAction = strSetName + _T("'=set{") + strSetType + _T("}!insert(") + strSetName + _T(",") + strElement + _T(")");
	plActions->AddTail(strAction);
	
	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
}
