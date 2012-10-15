// File name: TranslateRuleSequential.cpp
// Author/s : Nisansala Yatapanage
// Date built: 2/6/2006
// Last updated: 28/6/2007
// Purpose: Implementation of the sequential composition rule (Rule 1).
//
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateRuleSequential.h"
#include "TranslateStep.h"
#include "GSEMethod.h"
//#include "TranslateUTrans.h"
#include "TranslateException.h"

CTranslateRuleSequential::CTranslateRuleSequential(void)
{
	m_iRuleID = 1;
}

CTranslateRuleSequential::~CTranslateRuleSequential(void)
{
}

bool CTranslateRuleSequential::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
	bool bRuleMatched = false;
	NList<int, int> cMatchedNodes;
	NPosition cCurrentNodePosition;
	cCurrentNodePosition = cLeafNodes.GetHeadPosition();
	while(cCurrentNodePosition.IsNotNull()){
		int iCurrentNode;
		iCurrentNode = cLeafNodes.GetNext(cCurrentNodePosition);
		CTranslateNode* pcNode = cMain.GetNode(iCurrentNode);
		int iStateType = pcNode->GetType();
		int iSiblingNumber = pcNode->GetSiblingNumber();
		if ((pcNode->IsNodeSetOperation() == false) || (cMain.IsUppaal())){
			if (pcNode->IsBlankNode()){  // The node is a blank place-holder node.
				if ((iCurrentNode != iFinalNode) && ((iSiblingNumber == 0) || (bConsiderIfBranching == true))){   
					// Blank nodes are translated using this rule.
					cMatchedNodes.AddTail(iCurrentNode);
					m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
					if (bConsiderIfBranching == false){
						NList<int, int>* plEmptyList = new NList<int, int>;
						cMain.StoreTranslationStep(iCurrentNode, 1, NULL, plEmptyList);
					}
					bRuleMatched = true;
				}
			}else if ((iStateType == GSE_T_STATE) || (iStateType == GSE_T_CONDITION) || (iStateType == GSE_T_EVENT) || (iStateType == GSE_T_GUARD) || (iStateType == GSE_T_INPUT) || (iStateType == GSE_T_OUTPUT) || (iStateType == GSE_T_INPUT1)){
				if ((iCurrentNode != iFinalNode) && ((iSiblingNumber == 0) || (bConsiderIfBranching == true))){   
					// The node is a sequential node.
					NString strFlag = pcNode->GetFlag();
					if (strFlag == _T("")){ // Check that there is no flag, e.g. thread kill flag.
						cMatchedNodes.AddTail(iCurrentNode);
						m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
						if (bConsiderIfBranching == false){
							NList<int, int>* plEmptyList = new NList<int, int>;
							cMain.StoreTranslationStep(iCurrentNode, 1, NULL, plEmptyList);
						}
						bRuleMatched = true;
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

void CTranslateRuleSequential::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	NString strGuard = _T("");
	NString strAction = _T("");
	NList<NString, NString>* plActions = new NList<NString, NString>;

	CTranslateNode* pcNode = cMain.GetNode(iNode);
	bool bIsExternal = false;
	bool bIsInternalInput = false;

	if (pcNode->IsBlankNode()){  // The node is a blank node.
		// Don't do anything in this case. - a blank transition will be created.
	}else{
		NString strComponentName = pcNode->GetComponentName();
		NString strStateName = pcNode->GetStateName();
		// Create variables for storing the actual component name & state.
		// (Since strStateName may contain attributes).
		NString strComponent = cMain.TrimChangeCase(strComponentName, false);
		strComponentName = strComponent;
		strStateName = cMain.TrimChangeCase(strStateName, false);
		NString strState = strComponentName + _T("_") + strStateName;

		// Check the type of the node and translate accordingly.
		int iStateType = pcNode->GetType();
		if (iStateType == GSE_T_STATE){ // State-realisation ([s])
			int iTokenPos = 0;
			NString strToken = strStateName.Tokenize(_T(":="), iTokenPos);
			NString strToken2 = strStateName.Tokenize(_T(":="), iTokenPos);
			if (strToken2 != _T("")){ // The state contains attributes.
				strToken = cMain.TrimChangeCase(strToken, false);
				strToken2 = cMain.TrimChangeCase(strToken2, false);
				int iUserType = cMain.GetUserDefinedType(strComponent, strToken, pcNode);

				if (cMain.IsInteger(strComponent + _T("_") + strToken)){
					// This must be in the form s := x, where s is an integer.

					// Check if the second value is an integer.
					if (cMain.IsStringANumber(strToken2)){ 
						strComponent = strComponent + _T("_") + strToken;
						strState = strToken2;
						strAction = strComponent + _T("'=") + strState;
						plActions->AddTail(strAction);
							
					}else{ // The second value must be another attribute.
						// For now, this is assumed to be another attribute of the
						// same component. In the future, this should be extended to
						// handle cases where the second attribute is an attribute of
						// a different component, if this is possible in BT semantics.
						strComponent = strComponent + _T("_") + strToken;
						strState = strComponentName + _T("_") + strToken2;
						strAction = strComponent + _T("'=") + strState;
						plActions->AddTail(strAction);
					}
				
				// Check if this node contains user-defined attributes.
				// This is for the case where the second attribute has an alternative name.
				// e.g. selection:=course_ID.
				}else if (pcNode->IsUserDefinedAttribute()){
					strComponent = strComponentName + _T("_") + strToken;
					strState = strToken2;
					// Associate the attributes with the correct type.
					// Assumed that both attributes have the same type.
////// Future work: Send an error message if the attributes don't have the same type,
					// as defined in the user text information file.
					
					int iAttributeType = pcNode->GetAttributeType();
					// Add the attributes if they haven't already been added.
					if (cMain.m_lUserDefinedAttributes.Find(strComponent).IsNull()){					
						cMain.m_lUserDefinedAttributes.AddTail(strComponent);
						int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strComponent);
						cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iAttributeType);
					}
					if (cMain.m_lUserDefinedAttributes.Find(strState).IsNull()){					
						cMain.m_lUserDefinedAttributes.AddTail(strState);
						int iAttributeLocation2 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strState);
						cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation2, iAttributeType);
					}
					
					///////// CHECK THIS - SHOULD IT BE THERE?
					strAction = strComponent + _T("'=") + strState;
					plActions->AddTail(strAction);

				// Check for any user-defined attributes that are not the case above,
				// e.g. person:=Student, where person is user-defined to have the same
				// type as Student.
				}else if(iUserType != -1){
					// Only associate the first attribute with the type because the second
					// one is a variable that was defined earlier.
					NString strAttributeName = strComponent + _T("_") + strToken;
					// Check if it was already added.
					NPosition cPosition = cMain.m_lUserDefinedAttributes.Find(strAttributeName);
					if (cPosition.IsNull()){ // The attribute is not in the list so add it.
						cMain.m_lUserDefinedAttributes.AddTail(strAttributeName);
						// Associate the attribute with its type.
						int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strAttributeName);
						cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iUserType);  
					}
					strComponent = strComponentName + _T("_") + strToken;
					strState = strToken2;
					strAction = strComponent + _T("'=") + strState;
					plActions->AddTail(strAction);
	
				}else{
					// Change the component name & state to attribute style.
					strComponent = cMain.TrimChangeCase(strComponent, false);
					strComponent = strComponent + _T("_") + strToken;
					strState = strComponent + _T("_") + strToken2;
					cMain.AddLocalVariable(strComponent, strState);
					strComponent = cMain.TrimChangeCase(strComponent, false);
					strState = cMain.TrimChangeCase(strState, false);
					strAction = strComponent + _T("'=") + strState;
					plActions->AddTail(strAction);
				}
			}else{ // The state doesn't contain attributes.
				int iPlusPos = strStateName.Find(_T("++"));
				int iMinusPos = strStateName.Find(_T("--"));
				if (iPlusPos != -1){ // ++ was found.
					strComponent = strComponent + _T("_") 
						+ cMain.TrimChangeCase(strStateName.Left(iPlusPos), false);
					strComponent = cMain.TrimChangeCase(strComponent, false);
					strAction = strComponent + _T("'=") + strComponent + _T("+1");
					plActions->AddTail(strAction);
					// Don't add this variable to the localVariables list
					// because it should be declared as an int.
				
				}else if (iMinusPos != -1){  // -- was found.
					strComponent = strComponent + _T("_") 
						+ cMain.TrimChangeCase(strStateName.Left(iMinusPos), false);
					strComponent = cMain.TrimChangeCase(strComponent, false);
					strAction = strComponent + _T("'=") + strComponent + _T("-1");
					plActions->AddTail(strAction);	
					// Don't add this variable to the localVariables list
					// because it should be declared as an int.

				}else{  // no ++ or -- found.
					strComponent = cMain.TrimChangeCase(strComponent, false);
					strState = cMain.TrimChangeCase(strState, false);
					cMain.AddLocalVariable(strComponent, strState);	
					strComponent = cMain.TrimChangeCase(strComponent, false);
					strState = cMain.TrimChangeCase(strState, false);
					strAction = strComponent + _T("'=") + strState;
					plActions->AddTail(strAction);
				}
			}
			
			
		}else if (iStateType == GSE_T_CONDITION){ // Selection (?s?)
			int iTokenPos = 0;
			bool bIsANot = false;
			NString strConnector = _T("=");
			if (strStateName.Left(4) == _T("NOT(")){
				bIsANot = true;
				int iStateLength = strStateName.GetLength();
				strStateName = strStateName.Right(iStateLength - 4);
				int iNewLength = strStateName.GetLength();
				strStateName.Truncate(iNewLength - 1);
				strState = strComponentName + _T("_") + strStateName;
			}
			NString strToken = strStateName.Tokenize(_T("="), iTokenPos);
			NString strToken2 = strStateName.Tokenize(_T("="), iTokenPos);
			if (strToken2 != _T("")){ // The state contains attributes.
				strToken = cMain.TrimChangeCase(strToken, false);
				strToken2 = cMain.TrimChangeCase(strToken2, false);
				int iUserType = cMain.GetUserDefinedType(strComponent, strToken, pcNode);
				if (cMain.IsInteger(strComponent + _T("_") + strToken)){
					// This must be in the form s = x, where s is an integer.

					// Check if the second value is an integer.
					if (cMain.IsStringANumber(strToken2)){ 
						strComponent = strComponentName + _T("_") + strToken;
						strState = strToken2;
							
					}else{ // The second value must be another attribute.
						// For now, this is assumed to be another attribute of the
						// same component. In the future, this should be extended to
						// handle cases where the second attribute is an attribute of
						// a different component, if this is possible in BT semantics.
						strComponent = strComponentName + _T("_") + strToken;
						strState = strComponentName + _T("_") + strToken2;
					}
				

				// Check if this node contains user-defined attributes.
				// This is for the case where the second attribute has an alternative name.
				// e.g. selection=course_ID.
				}else if (pcNode->IsUserDefinedAttribute()){
					strComponent = strComponentName + _T("_") + strToken;
					strState = strToken2;
			
					// Associate the attributes with the correct type.
					// Assumed that both attributes have the same type.
					
					int iAttributeType = pcNode->GetAttributeType();
					// Add the attributes if they haven't already been added.
					if (cMain.m_lUserDefinedAttributes.Find(strComponent).IsNull()){					
						cMain.m_lUserDefinedAttributes.AddTail(strComponent);
						int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strComponent);
						cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iAttributeType);
					}
					if (cMain.m_lUserDefinedAttributes.Find(strState).IsNull()){					
						cMain.m_lUserDefinedAttributes.AddTail(strState);
						int iAttributeLocation2 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strState);
						cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation2, iAttributeType);
					}
					
					// Check for any user-defined attributes that are not the case above,
				// e.g. person:=Student, where person is user-defined to have the same
				// type as Student.
				}else if(iUserType != -1){
					// Only associate the first attribute with the type because the second
					// one is a variable that was defined earlier.
					NString strAttributeName = strComponent + _T("_") + strToken;
					// Check if it was already added.
					NPosition cPosition = cMain.m_lUserDefinedAttributes.Find(strAttributeName);
					if (cPosition.IsNull()){ // The attribute is not in the list so add it.
						cMain.m_lUserDefinedAttributes.AddTail(strAttributeName);
						int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strAttributeName);
						cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iUserType);
					}
					strComponent = strComponent + _T("_") + strToken;
					strState = strToken2;


				}else{
					// Change the component name & state to attribute style.
					strComponent = cMain.TrimChangeCase(strComponent, false);
					strComponent = strComponent + _T("_") + strToken;
					strState = strComponent + _T("_") + strToken2;
					cMain.AddLocalVariable(strComponent, strState);
				}
			}else{ // The state doesn't contain the equals (=) sign.
				iTokenPos = 0;
				strToken = strStateName.Tokenize(_T("<"), iTokenPos);
				strToken2 = strStateName.Tokenize(_T("<"), iTokenPos);
				if (strToken2 != _T("")){ // The state contains an expression with <.
					strToken = cMain.TrimChangeCase(strToken, false);
					strToken2 = cMain.TrimChangeCase(strToken2, false);
					if (cMain.IsInteger(strComponent + _T("_") + strToken)){
						// This must be in the form s < x, where s is an integer.
						strConnector = _T("<");

						// Check if the second value is an integer.
						if (cMain.IsStringANumber(strToken2)){ 
							strComponent = strComponentName + _T("_") + strToken;
							strState = strToken2;
								
						}else{ // The second value must be another attribute.
							// For now, this is assumed to be another attribute of the
							// same component. In the future, this should be extended to
							// handle cases where the second attribute is an attribute of
							// a different component, if this is possible in BT semantics.
							strComponent = strComponentName + _T("_") + strToken;
							strState = strComponentName + _T("_") + strToken2;
						}
					}
				}else{  // The state doesn't contain an expression with <.
					iTokenPos = 0;
					strToken = strStateName.Tokenize(_T(">"), iTokenPos);
					strToken2 = strStateName.Tokenize(_T(">"), iTokenPos);
					if (strToken2 != _T("")){ // The state contains an expression with >.
						strToken = cMain.TrimChangeCase(strToken, false);
						strToken2 = cMain.TrimChangeCase(strToken2, false);
						if (cMain.IsInteger(strComponent + _T("_") + strToken)){
							// This must be in the form s > x, where s is an integer.
							strConnector = _T(">");

							// Check if the second value is an integer.
							if (cMain.IsStringANumber(strToken2)){ 
								strComponent = strComponentName + _T("_") + strToken;
								strState = strToken2;
									
							}else{ // The second value must be another attribute.
								// For now, this is assumed to be another attribute of the
								// same component. In the future, this should be extended to
								// handle cases where the second attribute is an attribute of
								// a different component, if this is possible in BT semantics.
								strComponent = strComponentName + _T("_") + strToken;
								strState = strComponentName + _T("_") + strToken2;
							}
						}
					}else{ // The state doesn't contain an expression with >.
						// It is a normal state with no attributes.
						strComponent = cMain.TrimChangeCase(strComponent, false);
						strState = cMain.TrimChangeCase(strState, false);
						cMain.AddLocalVariable(strComponent, strState);	
					}
				}
			}
			strComponent = cMain.TrimChangeCase(strComponent, false);
			strState = cMain.TrimChangeCase(strState, false);
			if (bIsANot == false){ // This is not a NOT case.
				strGuard = strComponent + strConnector + strState;
			}else{ // This is a NOT case.
				strGuard = _T("NOT(") + strComponent + strConnector + strState + _T(")");
			}
			// Create an extra transition for the opposite branch.
			// Only create it if this isn't part of an atomic block.
			// For atomic blocks, TranslateParsingMethods will handle it.
			// Also, if it part of an alternative choice branching, then
			// there needs to only be one opposite guard for all the alternate branches,
			// that kills off all of the branches if they're all not true. (This is done
			// in TranslateRuleAltBranching).

			bool bIsNodeAtomic = cMain.IsAtomic(iNode);
			if (!bIsNodeAtomic){
				NString strProgramCounterName = cMain.GetPCForNode(iNode);
				int iProgramCounterValue = cMain.GetPCValueForNode(iNode);
				NString strOppositeGuard = strProgramCounterName + _T("=");
				strOppositeGuard.Format(strOppositeGuard + _T("%d"), iProgramCounterValue);
				if (bIsANot == false){  // The original selection is not a NOT case.
					strOppositeGuard = strOppositeGuard + _T(" AND NOT (");
					strOppositeGuard = strOppositeGuard + strGuard + _T(")");
				}else{ // The original selection is a NOT case.
					strOppositeGuard = strOppositeGuard + _T(" AND ") + 
						strComponent + _T("=") + strState;
				}
				
				// CHECK THAT THE MESSAGEREADY PART HERE WON'T COME FOR EXTERNAL INPUT OR INTERNAL INPUT NODES.
				if (!(pcNode->IsNodeNonDeterministic())){  // This is not an alternative selection.
					NList<NString, NString>* plOppositeActions = new NList<NString, NString>;
					plOppositeActions->AddTail(strProgramCounterName + _T("'=0"));
					if (cMain.GetTranslationType() == 4){
						strOppositeGuard = strOppositeGuard + _T(" AND NOT(messageReady)");
					}
					cMain.AddExtraTransition(strOppositeGuard, plOppositeActions);	
				}else{  // This is an alternative selection.
					// Store the guard, ready for TranslateRuleAltBranching to use it.
					cMain.StoreOppositeBranch(iNode, strGuard);
				}
			}

		}else if ((iStateType == GSE_T_EVENT) || (iStateType == GSE_T_INPUT)){ //Event (??s?? or >>s<<)
			NString strExtInputVariable = _T("extInMsg_") + strStateName;
			strGuard = strExtInputVariable + _T("=true");
			cMain.AddInputVariable(strExtInputVariable);
			bIsExternal = true;
			///// Note: The component name is not included in the variable name because the external sender would
			///// not have known the receiving component's name, as it is in an external BT (external SAL module).
			
		}else if (iStateType == GSE_T_GUARD){  // Guard (???s???)
			int iTokenPos = 0;
			bool bIsANot = false;
			NString strConnector = _T("=");
			if (strStateName.Left(4) == _T("NOT(")){
				bIsANot = true;
				int iStateLength = strStateName.GetLength();
				strStateName = strStateName.Right(iStateLength - 4);
				int iNewLength = strStateName.GetLength();
				strStateName.Truncate(iNewLength - 1);
				strState = strComponentName + _T("_") + strStateName;
			}
			NString strToken = strStateName.Tokenize(_T("="), iTokenPos);
			NString strToken2 = strStateName.Tokenize(_T("="), iTokenPos);
			if (strToken2 != _T("")){ // The state contains attributes.
				strToken = cMain.TrimChangeCase(strToken, false);
				strToken2 = cMain.TrimChangeCase(strToken2, false);
				if (cMain.IsInteger(strComponent + _T("_") + strToken)){
					// This must be in the form s = x, where s is an integer.

					// Check if the second value is an integer.
					if (cMain.IsStringANumber(strToken2)){ 
						strComponent = strComponentName + _T("_") + strToken;
						strState = strToken2;
							
					}else{ // The second value must be another attribute.
						// For now, this is assumed to be another attribute of the
						// same component. In the future, this should be extended to
						// handle cases where the second attribute is an attribute of
						// a different component, if this is possible in BT semantics.
						strComponent = strComponentName + _T("_") + strToken;
						strState = strComponentName + _T("_") + strToken2;
					}
				// Change the component name & state to attribute style.
				}else{ // This is not an integer expression.
					strComponentName = cMain.TrimChangeCase(strComponentName,false);
					strComponent = strComponentName + _T("_") + strToken;
					strState = strComponentName + _T("_") + strToken + _T("_") + strToken2;
					cMain.AddLocalVariable(strComponent, strState);	
				}
			}else{ // The state doesn't contain the equals (=) sign.
				iTokenPos = 0;
				strToken = strStateName.Tokenize(_T("<"), iTokenPos);
				strToken2 = strStateName.Tokenize(_T("<"), iTokenPos);
				if (strToken2 != _T("")){ // The state contains an expression with <.
					strToken = cMain.TrimChangeCase(strToken, false);
					strToken2 = cMain.TrimChangeCase(strToken2, false);
					if (cMain.IsInteger(strComponent + _T("_") + strToken)){
						// This must be in the form s < x, where s is an integer.
						strConnector = _T("<");
	
						// Check if the second value is an integer.
						if (cMain.IsStringANumber(strToken2)){ 
							strComponent = strComponentName + _T("_") + strToken;
							strState = strToken2;
									
						}else{ // The second value must be another attribute.
							// For now, this is assumed to be another attribute of the
							// same component. In the future, this should be extended to
							// handle cases where the second attribute is an attribute of
							// a different component, if this is possible in BT semantics.
							strComponent = strComponentName + _T("_") + strToken;
							strState = strComponentName + _T("_") + strToken2;
						}
					}
				}else{  // The state doesn't contain an expression with <.
					iTokenPos = 0;
					strToken = strStateName.Tokenize(_T(">"), iTokenPos);
					strToken2 = strStateName.Tokenize(_T(">"), iTokenPos);
					if (strToken2 != _T("")){ // The state contains an expression with >.
						strToken = cMain.TrimChangeCase(strToken, false);
						strToken2 = cMain.TrimChangeCase(strToken2, false);
						if (cMain.IsInteger(strComponent + _T("_") + strToken)){
							// This must be in the form s > x, where s is an integer.
							strConnector = _T(">");

							// Check if the second value is an integer.
							if (cMain.IsStringANumber(strToken2)){ 
								strComponent = strComponentName + _T("_") + strToken;
								strState = strToken2;
									
							}else{ // The second value must be another attribute.
								// For now, this is assumed to be another attribute of the
								// same component. In the future, this should be extended to
								// handle cases where the second attribute is an attribute of
								// a different component, if this is possible in BT semantics.
								strComponent = strComponentName + _T("_") + strToken;
								strState = strComponentName + _T("_") + strToken2;
							}
						}
					}else{ // The state doesn't contain an expression with >.
						// It is a normal state with no attributes.
						strComponent = cMain.TrimChangeCase(strComponent, false);
						strState = cMain.TrimChangeCase(strState, false);
						cMain.AddLocalVariable(strComponent, strState);	
					}
				}
			}
			strComponent = cMain.TrimChangeCase(strComponent, false);
			strState = cMain.TrimChangeCase(strState, false);
			if (bIsANot == false){ // This is not a NOT case.
				strGuard = strComponent + strConnector + strState;
			}else{ // This is a NOT case.
				strGuard = _T("NOT(") + strComponent + strConnector + strState + _T(")");
			}
		
		}else if (iStateType == GSE_T_OUTPUT){ // External output (<<s>>)
			NString strExtOutVariable = _T("extOutMsg_") + strStateName;
			cMain.AddOutputVariable(strExtOutVariable);
			strExtOutVariable = strExtOutVariable + _T("'=true");
			plActions->AddTail(strExtOutVariable);

			///// Note: The component name is not included in the variable name because this component does
			///// not know the receiving component's name, as it is in an external BT (external SAL module).
		
		}else if (iStateType == GSE_T_INPUT1){ // Internal input (>s<)
			strComponentName = cMain.TrimChangeCase(strComponentName, false);
			
			// Check if the message contains data.
			int iTokenPos1 = 0;
			NString strToken1 = strStateName.Tokenize(_T("("), iTokenPos1); 
			NString strMessageName = strToken1;
			strToken1 = strStateName.Tokenize(_T("("), iTokenPos1);  // Get the part after the '('.
			if (strToken1 != _T("")){
				// The message contains data, e.g. > m(d) <
				strMessageName = cMain.TrimChangeCase(strMessageName, false);
				NString strData = cMain.TrimChangeCase(strToken1, false);
				strData = strToken1.Left(strToken1.GetLength() - 1); // Remove the closing bracket.
				strData = cMain.TrimChangeCase(strData, false);
				// Separate the data into each of the parts based on any commas.
				int iTokenPos2 = 0;
				NString strFirstData = strData.Tokenize(_T(","), iTokenPos2);
				NString strSecondData = strData.Tokenize(_T(","), iTokenPos2);
	//			int iUserType = cMain.GetUserDefinedType(strComponentName, strFirstData, pcNode);
	//			if (iUserType == -1){  // Throw an error as the data type was not defined in the text information file.
	//				NString strMessage = _T("Type not defined for the message: ");
	//				strMessage = strMessage + strComponentName + _T(" ") + strStateName;
	//				CTranslateException cException(strMessage);
	//				throw cException;
	//			}
				NString strFirstAttribute = strComponentName + _T("_") + strFirstData;
				int iUserType = cMain.GetUserDefinedType(strComponentName, strFirstData, pcNode);
				strFirstData = strMessageName + _T("_") + strFirstData;
				strAction = strFirstAttribute + _T("'=") + strFirstData;
				plActions->AddTail(strAction);

				// Check if it was already added.
				NPosition cPosition = cMain.m_lUserDefinedAttributes.Find(strFirstAttribute);
				if (cPosition.IsNull()){ // The attribute is not in the list so add it.
					cMain.m_lUserDefinedAttributes.AddTail(strFirstAttribute);
					int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strFirstAttribute);
					if (iUserType != -1){   // Set the type, according to the one defined in the set information file.
						cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iUserType);
					}else{
						NString strMessage = _T("Type not defined for the attribute: ");
						strMessage = strMessage + strFirstAttribute;
						CTranslateException cException(strMessage);
						throw cException;
					}
				}


				if (strSecondData != _T("")){
					NString strSecondAttribute = strComponentName + _T("_") + strSecondData;
					int iUserType = cMain.GetUserDefinedType(strComponentName, strSecondData, pcNode);
					strSecondData = strMessageName + _T("_") + strSecondData;
					strAction = strSecondAttribute + _T("'=") + strSecondData;
					plActions->AddTail(strAction);
				
					// Check if it was already added.
					NPosition cPosition = cMain.m_lUserDefinedAttributes.Find(strSecondAttribute);
					if (cPosition.IsNull()){ // The attribute is not in the list so add it.
						cMain.m_lUserDefinedAttributes.AddTail(strSecondAttribute);
						int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strSecondAttribute);
						if (iUserType != -1){  // Set the type, according to the one defined in the set information file.
							cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iUserType);
						}else{
							NString strMessage = _T("Type not defined for the attribute: ");
							strMessage = strMessage + strFirstAttribute;
							CTranslateException cException(strMessage);
							throw cException;
						}
					}
				}
				NString strIntInputVariable = _T("intInMsg_") + strComponentName + _T("_") + strMessageName;
				strGuard = strIntInputVariable + _T("=true");
				cMain.AddLocalBoolean(strIntInputVariable);
				strAction = strIntInputVariable + _T("'=false");
				plActions->AddTail(strAction);
				
			}else{
				strStateName = cMain.TrimChangeCase(strStateName, false);
				NString strIntInputVariable = _T("intInMsg_") + strComponentName + _T("_") + strStateName;
				strGuard = strIntInputVariable + _T("=true");
				cMain.AddLocalBoolean(strIntInputVariable);
				strAction = strIntInputVariable + _T("'=false");
				plActions->AddTail(strAction);
			}
			bIsInternalInput = true;
		}
	}
	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, bIsExternal, bIsInternalInput);
}

void CTranslateRuleSequential::translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{
/*	NString strLabel;
	int iLabelType;
	CTranslateNode* pcNode = cMain.GetNode(iNode);

	if (pcNode->IsBlankNode()){  // The node is a blank node.
		// Don't do anything in this case.
	}else{
		NString strComponentName = pcNode->GetComponentName();
		NString strStateName = pcNode->GetStateName();
		// Create variables for storing the actual component name & state.
		// (Since strStateName may contain attributes).
		NString strComponent = strComponentName;
		NString strState = strComponentName + _T("_") + cMain.TrimChangeCase(strStateName,false);

		// Check the type of the node and translate accordingly.
		int iStateType = pcNode->GetType();
		if (iStateType == GSE_T_STATE){ // State-realisation ([s])
			if (pcNode->IsNodeSetOperation()){
				strLabel = strStateName; // Leave it as it is since this is a formula.
			}else{
				int iTokenPos = 0;
				NString strToken = strStateName.Tokenize(_T(":="), iTokenPos);
				NString strToken2 = strStateName.Tokenize(_T(":="), iTokenPos);
				if (strToken2 != _T("")){ // The state contains attributes.
					strToken = cMain.TrimChangeCase(strToken, false);
					strToken2 = cMain.TrimChangeCase(strToken2, false);
					
					// Change the component name & state to attribute style.
					strComponent = strComponentName + _T("_") + strToken;
					strState = strComponentName + _T("_") + strToken + _T("_") + strToken2;
					
				}
				strComponent = cMain.TrimChangeCase(strComponent, false);
				strState = cMain.TrimChangeCase(strState, false);
				strLabel = strComponent + _T("=") + strState;
				cMain.AddLocalVariable(strComponent, strState);
			}
			iLabelType = UPPAAL_ASSIGN;
			m_cParsingMethods.StoreUPPAALTransition(cMain,iNode,strLabel,iLabelType);
			
		}else if (iStateType == GSE_T_CONDITION){ // Selection (?s?)
			bool bIsANot = false;
			if (pcNode->IsNodeSetOperation()){
				strLabel = strStateName; // Leave it as it is since this is a formula.
			}else{
				int iTokenPos = 0;		
				if (strStateName.Left(4) == _T("NOT(")){
					bIsANot = true;
					int iStateLength = strStateName.GetLength();
					strStateName = strStateName.Right(iStateLength - 4);
					int iNewLength = strStateName.GetLength();
					strStateName.Truncate(iNewLength - 1);
					strState = strComponentName + _T("_") + strStateName;
				}
				NString strToken = strStateName.Tokenize(_T("="), iTokenPos);
				NString strToken2 = strStateName.Tokenize(_T("="), iTokenPos);
				if (strToken2 != _T("")){ // The state contains attributes.
					strToken = cMain.TrimChangeCase(strToken, false);
					strToken2 = cMain.TrimChangeCase(strToken2, false);
					int iUserType = cMain.GetUserDefinedType(strComponent, strToken, pcNode);

					// Change the component name & state to attribute style.
					strComponent = strComponentName + _T("_") + strToken;
					strState = strComponentName + _T("_") + strToken + _T("_") + strToken2;
					cMain.AddLocalVariable(strComponent, strState);
				}
				strComponent = cMain.TrimChangeCase(strComponent, false);
				strState = cMain.TrimChangeCase(strState, false);
				if (bIsANot == false){  
					strLabel = strComponent + _T("==") + strState;
				}else{
					strLabel = _T("not(") + strComponent + _T("==") + strState + _T(")");
				}	
				cMain.AddLocalVariable(strComponent, strState);
			}
			iLabelType = UPPAAL_GUARD;
			m_cParsingMethods.StoreUPPAALTransition(cMain,iNode,strLabel,iLabelType);

			// Create an extra transition for the NOT case going to the disabled state.
			int iProgramCounter = cMain.GetPC(iNode);
			int iProgramCounterValue = cMain.GetPCValueForNode(iNode);
			int iSourceIndex = cMain.GetSourceIndexForNode(iNode);
			CTranslateUTrans* pcNotTransition = new CTranslateUTrans();
			NString strNotLabel;
			if (bIsANot == false){ 
				strNotLabel = _T("not(") + strLabel + _T(")");
			}else{
				strNotLabel = strComponent + _T("==") + strState;
			}
			int iNotLabelType = UPPAAL_GUARD;
			pcNotTransition->AddLabel(strNotLabel, iNotLabelType);
			pcNotTransition->SetSource(iProgramCounter, iProgramCounterValue, iSourceIndex);
			int iProcess = cMain.GetProcess(iProgramCounter);
			pcNotTransition->SetTarget(iProcess, 0, 0);  // The disabled state.
			pcNotTransition->SetIsJumpNode(true);
			NList<CTranslateUTrans*, CTranslateUTrans*>* plProcessTransitions;
			plProcessTransitions = cMain.GetTransitions(iProcess);
			plProcessTransitions->AddTail(pcNotTransition);

		}else if ((iStateType == GSE_T_EVENT) || (iStateType == GSE_T_INPUT)){ //Event (??s?? or >>s<<)
			strLabel = _T("extInMsg_") + strComponentName + _T("_") + strStateName;
			strLabel.Append(_T("?"));
			cMain.AddInputVariable(strLabel);
			iLabelType = UPPAAL_SYNCH;  
			m_cParsingMethods.StoreUPPAALTransition(cMain,iNode,strLabel,iLabelType);		
			
		}else if (iStateType == GSE_T_GUARD){  // Guard (???s???)
			if (pcNode->IsNodeSetOperation()){
				strLabel = strStateName; // Leave it as it is since this is a formula.
			}else{
				int iTokenPos = 0;
				NString strToken = strStateName.Tokenize(_T("="), iTokenPos);
				NString strToken2 = strStateName.Tokenize(_T("="), iTokenPos);
				if (strToken2 != _T("")){ // The state contains attributes.
					strToken = cMain.TrimChangeCase(strToken, false);
					strToken2 = cMain.TrimChangeCase(strToken2, false);
					// Change the component name & state to attribute style.
					strComponent = strComponentName + _T("_") + strToken;
					strState = strComponentName + _T("_") + strToken + _T("_") + strToken2;
				}
				strComponent = cMain.TrimChangeCase(strComponent, false);
				strState = cMain.TrimChangeCase(strState, false);
				strLabel = strComponent + _T("==") + strState;
				cMain.AddLocalVariable(strComponent, strState);
			}
			iLabelType = UPPAAL_GUARD;
			m_cParsingMethods.StoreUPPAALTransition(cMain,iNode,strLabel,iLabelType);
		
		}else if (iStateType == GSE_T_OUTPUT){ // External output (<<s>>)
			strLabel = _T("extOutMsg_") + strComponentName + _T("_") + strStateName;
			iLabelType = UPPAAL_SYNCH;  
			NString strEnvironmentLabel = strLabel + _T("?");
			cMain.AddInputVariable(strEnvironmentLabel);
			strLabel.Append(_T("!"));
			m_cParsingMethods.StoreUPPAALTransition(cMain,iNode,strLabel,iLabelType);
		
		}else if (iStateType == GSE_T_INPUT1){ // Internal input (>s<)
			strComponentName = cMain.TrimChangeCase(strComponentName,false);
			strStateName = cMain.TrimChangeCase(strStateName, false);
			strLabel = _T("intInMsg_") + strComponentName + _T("_") + strStateName;
			cMain.AddLocalBoolean(strLabel);
			strLabel.Append(_T("?"));
			iLabelType = UPPAAL_SYNCH;
			m_cParsingMethods.StoreUPPAALTransition(cMain,iNode,strLabel,iLabelType);
		}
	}
	*/
}