// File name: TranslateSetUnion.cpp
// Author/s : Nisansala Yatapanage
// Date built: 2/11/2006
// Last updated: 2/11/2006
// Purpose: Implementation of the set union rule.
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateSetUnion.h"
#include "TranslateStep.h"
#include "GSEMethod.h"

CTranslateSetUnion::CTranslateSetUnion(void)
{
	m_iRuleID = 12;
}

CTranslateSetUnion::~CTranslateSetUnion(void)
{
}

bool CTranslateSetUnion::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
	//// SET // Check whether set a and set b both have matching types.
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
				//	if ((iNumberOfSetRules == 1) || (iNumberOfSetRules == 2)){
						CString strSetRule1 = pcNode->GetSetRule(0);
					//	if (iNumberOfSetRules == 2){
						//	CString strSetRule2 = pcNode->GetSetRule(1);
						//	if (strSetRule1 == _T("union")){
							//	if (strSetRule2 == _T("attribute")){
									// This is a set add rule in the form s := s + t
							//		cMatchedNodes.AddTail(iCurrentNode);
						//			m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
						//			if (bConsiderIfBranching == false){
							//			NList<int, int>* plEmptyList = new NList<int, int>;
							//			cMain.StoreTranslationStep(iCurrentNode, 12, NULL, plEmptyList);
							//		}
							//		bRuleMatched = true;
						//		}
						//	}
					//	}else{
							if (strSetRule1 == _T("union")){
								// This is a set add rule in the form s := s + t
								cMatchedNodes.AddTail(iCurrentNode);
								m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
								if (bConsiderIfBranching == false){
									NList<int, int>* plEmptyList = new NList<int, int>;
									cMain.StoreTranslationStep(iCurrentNode, 12, NULL, plEmptyList);
								}
								bRuleMatched = true;
							}
					//	}
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

void CTranslateSetUnion::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	CString strGuard = _T("");
	CString strAction = _T("");
	NList<CString, CString>* plActions = new NList<CString, CString>;
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	
	CString strSetName;
	CString strSecondSet;

//	if (pcNode->GetNumberOfRules() == 1){ // It is in the form s + t
		strSetName = pcNode->GetSetVariable(0);
		strSecondSet = pcNode->GetSetVariable(1);
		strSecondSet = cMain.TrimChangeCase(strSecondSet,true);

//	}else if (pcNode->GetNumberOfRules() == 2){  // It is in the form s := s + t
	//	strSetName = pcNode->GetSetVariable(0);
	//	strSecondSet = pcNode->GetSetVariable(2);
	//	strSecondSet = cMain.TrimChangeCase(strSecondSet,false);
		CString strComponent = pcNode->GetComponentName();

		// Assumed that the variable at index 1 is just the same as 
		// the one at index 0, since it is just the set name.

		// Only add the component name if it is different to the set name,
		// otherwise this is a top-level set, not belonging to another component.
		if (strSetName != strComponent){
			strSetName = cMain.TrimChangeCase(strComponent,false) + _T("_") + cMain.TrimChangeCase(strSetName,true);
		}else{
			strSetName = cMain.TrimChangeCase(strSetName,true);
		}
//	}
	CString strSetType = cMain.GetSetType(strSetName, pcNode);
	strAction = strSetName + _T("'=set{") + strSetType + _T("}!union(") + strSetName + _T(",") + strSecondSet + _T(")");
	plActions->AddTail(strAction);

	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
}
