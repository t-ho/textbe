// File name: TranslateSetMember.cpp
// Author/s : Nisansala Yatapanage
// Date built: 2/11/2006
// Last updated: 2/11/2006
// Purpose: Implementation of the set rule for testing whether
//			an element is a member of a set.
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateSetMember.h"
#include "TranslateStep.h"
#include "GSEMethod.h"

CTranslateSetMember::CTranslateSetMember(void)
{
	m_iRuleID = 18;
}

CTranslateSetMember::~CTranslateSetMember(void)
{
}

bool CTranslateSetMember::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
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
				NString strFlag = pcNode->GetFlag();
				if (strFlag == _T("")){ // Check that there is no flag, e.g. thread kill flag.
					int iNumberOfSetRules = pcNode->GetNumberOfRules();
					if (iNumberOfSetRules == 1){
						NString strSetRule1 = pcNode->GetSetRule(0);
						if (strSetRule1 == _T("membership")){
							// This is a set membership rule in the form a : t
							cMatchedNodes.AddTail(iCurrentNode);
							m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
							if (bConsiderIfBranching == false){
								NList<int, int>* plEmptyList = new NList<int, int>;
								cMain.StoreTranslationStep(iCurrentNode, 18, NULL, plEmptyList);
							}
							bRuleMatched = true;
						}
					}else if (iNumberOfSetRules == 2){
						NString strSetRule1 = pcNode->GetSetRule(0);
						NString strSetRule2 = pcNode->GetSetRule(1);
						if (strSetRule2 == _T("NOT")){
							if (strSetRule1 == _T("membership")){
								// This is a set membership rule in the form NOT(a : t)
								cMatchedNodes.AddTail(iCurrentNode);
								m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
								if (bConsiderIfBranching == false){
									NList<int, int>* plEmptyList = new NList<int, int>;
									cMain.StoreTranslationStep(iCurrentNode, 18, NULL, plEmptyList);
								}
								bRuleMatched = true;
							}
						}
					}
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

void CTranslateSetMember::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	NString strGuard = _T("");
	NString strAction = _T("");
	NList<NString, NString>* plActions = new NList<NString, NString>;
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	
	int iNumberOfSetRules = pcNode->GetNumberOfRules();

	NString strElement = pcNode->GetSetVariable(0);
	NString strSetName = pcNode->GetSetVariable(1);
	NString strComponent = pcNode->GetComponentName();
	NString strSetType = cMain.GetSetType(strSetName, pcNode);
	
	if (strComponent != strSetName){
		// This is an attribute.
		strSetName = cMain.TrimChangeCase(strComponent,false) + _T("_") + cMain.TrimChangeCase(strSetName,true);
	}else{
		strSetName = cMain.TrimChangeCase(strSetName, true);
	}
	
	if (iNumberOfSetRules == 1) {  // This is in the form a : t
		
		strGuard = _T("set{") + strSetType + _T("}!contains?(") + strSetName + _T(",") + strElement + _T(")");

	}else if (iNumberOfSetRules == 2){ // This is in the form NOT(a : t)
		strGuard = _T("NOT(set{") + strSetType + _T("}!contains?(") + strSetName + _T(",") + strElement + _T("))");
	}
	
	if (pcNode->GetType() == GSE_T_CONDITION){
		// Create an extra transition for the opposite branch.
		NString strProgramCounterName = cMain.GetPCForNode(iNode);
		int iProgramCounterValue = cMain.GetPCValueForNode(iNode);
		NString strOppositeGuard = strProgramCounterName + _T("=");
		strOppositeGuard.Format(strOppositeGuard + _T("%d"), iProgramCounterValue);
		strOppositeGuard = strOppositeGuard + _T(" AND NOT (");
		strOppositeGuard = strOppositeGuard + strGuard + _T(")");
		NList<NString, NString>* plOppositeActions = new NList<NString, NString>;
		plOppositeActions->AddTail(strProgramCounterName + _T("'=0"));
		if (cMain.GetTranslationType() == 4){
			strOppositeGuard = strOppositeGuard + _T(" AND NOT(messageReady)");
		}
		cMain.AddExtraTransition(strOppositeGuard, plOppositeActions);	
	}

	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
}
