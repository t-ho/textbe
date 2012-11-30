// File name: TranslateRuleInternal.cpp
// Author/s : Nisansala Yatapanage
// Date built: 12/10/2006
// Last updated: 19/6/2007
// Purpose: Implementation of the Internal output translation rule (Rule 2).
//
// Algorithms used:
// Description of Algorithm#:
//


#include "TranslateRuleInternal.h"
#include "TranslateStep.h"
#include "GSEMethod.h"
#include "TranslateException.h"

CTranslateRuleInternal::CTranslateRuleInternal(void)
{
	m_iRuleID = 2;
}

CTranslateRuleInternal::~CTranslateRuleInternal(void)
{
}

bool CTranslateRuleInternal::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
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
		NString strOutputComp = pcNode->GetComponentName();
		NString strOutputState;

		if (iStateType == GSE_T_OUTPUT1){
			if ((iCurrentNode != iFinalNode) && ((iSiblingNumber == 0) || (bConsiderIfBranching == true))){   
				// The node is a sequential node.
				NString strFlag = pcNode->GetFlag();
				if (strFlag == ""){ // Check that there is no flag, e.g. thread kill flag.

					// Get the message name.
					NString strNodeState = pcNode->GetStateName();
					int iTokenPos1 = 0;
					NString strToken1 = strNodeState.Tokenize("(", iTokenPos1); 
					strOutputState = strToken1;
					strToken1 = strNodeState.Tokenize("(", iTokenPos1);  // Get the part after the '('.
					if (strToken1 != ""){
						// The message contains data, e.g. < m(d) >
						if (strToken1.Right(1) != ")"){
							NString strMessage = "Missing closing bracket in the node: ";
							strMessage = strMessage + strOutputComp + " " + strNodeState;
							CTranslateException cException(strMessage);
							throw cException;
						}
						strOutputState = cMain.TrimChangeCase(strOutputState, false);

					}else{  // The message does not contain data so the entire state name is its message name.
						strOutputState = cMain.TrimChangeCase(strNodeState,false);
					}
				
					// Check if there is at least one other matching internal input node.
					bool bFoundInputNode = false;
					NList<int, int>* plMatchingInputNodes; // Stores the ID's of the matching internal input nodes.
					plMatchingInputNodes = new NList<int, int>;

					NPosition cAllPosition;
					cAllPosition = cAllNodes.GetHeadPosition();
					while(cAllPosition.IsNotNull()){
						int iAllNode;
						iAllNode = cAllNodes.GetNext(cAllPosition);
						CTranslateNode* pcAllNode = cMain.GetNode(iAllNode);
				    	
			  			// Check if the other node is an internal input.
						int iAllNodeType = pcAllNode->GetType();
						if (iAllNodeType == GSE_T_INPUT1){ // The node is an internal input node.
							// Check if the behavior names match and that there are no flags.
							NString strInputState;
							NString strAllNodeState = pcAllNode->GetStateName();
							int iTokenPos2 = 0;
							NString strToken2 = strAllNodeState.Tokenize("(", iTokenPos2); 
							strInputState = strToken2;
							strToken2 = strAllNodeState.Tokenize("(", iTokenPos2);  // Get the part after the '('.
							if (strToken2 != ""){
								// The message contains data, e.g. < m(d) >
								if (strToken2.Right(1) != ")"){
									NString strMessage = "Missing closing bracket in the node: ";
									strMessage = strMessage + pcAllNode->GetComponentName() + " " + strAllNodeState;
									CTranslateException cException(strMessage);
									delete plMatchingInputNodes;
									throw cException;
								}
								strInputState = cMain.TrimChangeCase(strInputState, false);

							}else{  // The message does not contain data so the entire state name is its message name.
								strInputState = cMain.TrimChangeCase(strAllNodeState,false);
							}
							NString strInputFlag = pcAllNode->GetFlag();

				    		if(strInputFlag == ""){ // Make sure it isn't a thread kill, etc.				    		
			    				if(strOutputState == strInputState){	    			
					    			bFoundInputNode = true;
					    			plMatchingInputNodes->AddTail(iAllNode);
								}
							}
			    		}
					}
				    
					if(!bFoundInputNode){
						NString strMessage = "No matching internal input node found for: ";
						strMessage = strMessage + strOutputComp + " <" + strOutputState + ">";
						CTranslateException cException(strMessage);
						delete plMatchingInputNodes;
						throw cException;

					}else{ // Store the information about this node.
						cMatchedNodes.AddTail(iCurrentNode);
						m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
						if (bConsiderIfBranching == false){
							NList<int, int>* plEmptyList = new NList<int, int>;
							cMain.StoreTranslationStep(iCurrentNode, 2, NULL, plEmptyList);
						}
						cMain.AddInternalMsgAssociation(iCurrentNode, plMatchingInputNodes);
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

void CTranslateRuleInternal::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	NString strGuard = "";
	NString strAction = "";
	NList<NString, NString>* plActions = new NList<NString, NString>;

	CTranslateNode* pcNode = cMain.GetNode(iNode);
	NString strComponentName = pcNode->GetComponentName();
	NString strStateName = pcNode->GetStateName();
	strComponentName = cMain.TrimChangeCase(strComponentName, false);
	strStateName = cMain.TrimChangeCase(strStateName, false);

	// Get the list of matching internal input nodes.
	NList<int, int>* plMatchingInputNodes;
	plMatchingInputNodes = cMain.GetInternalMsgAssociation(iNode);
	
	// Create variables for each input node and set it to true in the actions
	// for this output node.
	NPosition cInputPos;
	cInputPos = plMatchingInputNodes->GetHeadPosition();
	while(cInputPos.IsNotNull()){
		int iTokenPos1 = 0;
		NString strToken1 = strStateName.Tokenize("(", iTokenPos1); 
		NString strMessageName = strToken1;
		strToken1 = strStateName.Tokenize("(", iTokenPos1);  // Get the part after the '('.
		if (strToken1 != ""){
			// The message contains data, e.g. < m(d) >
			strMessageName = cMain.TrimChangeCase(strMessageName, false);
			NString strData = cMain.TrimChangeCase(strToken1, false);
			strData = strToken1.Left(strToken1.GetLength() - 1); // Remove the closing bracket.
			strData = cMain.TrimChangeCase(strData, false);
			
			// Assume that the "d" in m(d) is an attribute of this component.
			int iInputNode = plMatchingInputNodes->GetNext(cInputPos);
			CTranslateNode* pcInputNode = cMain.GetNode(iInputNode);
			NString strInputComponent = pcInputNode->GetComponentName();
			strInputComponent = cMain.TrimChangeCase(strInputComponent, false);
			NString strIntInputVariable = "intInMsg_" + strInputComponent + "_" + strMessageName;
			strAction = strIntInputVariable + "'=true";
			NPosition cFindPosition = plActions->Find(strAction);
			if (cFindPosition.IsNull()){
				plActions->AddTail(strAction);
				cMain.AddLocalBoolean(strIntInputVariable);
			}

			// Get the name that is used in the input node for the data variable.
			int iTokenPos5 = 0;
			NString strInputStateName = pcInputNode->GetStateName();
			NString strDataInInput = strInputStateName.Tokenize("(", iTokenPos5);
			strDataInInput = strInputStateName.Tokenize("(", iTokenPos5);  // Get the part after the '('.
			if (strDataInInput == ""){
				// Throw an error as the input node is not accepting data with the message.
				NString strMessage = "The input message node: ";
				strMessage = strMessage + strInputComponent + " <" + strInputStateName + ">\r\n";
				strMessage = strMessage + "is not accepting data even though the output node: ";
				strMessage = strMessage + strComponentName + " <" + strStateName + ">\r\n";
				strMessage = strMessage + "is sending data.";
				CTranslateException cException(strMessage);
				throw cException;
			}
			strDataInInput = cMain.TrimChangeCase(strDataInInput, false);
			strDataInInput = strDataInInput.Left(strDataInInput.GetLength() - 1); // Remove the closing bracket.
			int iTokenPos4 = 0;
			NString strFirstDataInInput = strDataInInput.Tokenize(",", iTokenPos4);
			NString strSecondDataInInput = strDataInInput.Tokenize(",", iTokenPos4);
			
			// Add the action to set the data variable to equal the attribute of this component.
			// Separate the data into each of the parts based on any commas.
			int iTokenPos2 = 0;
			NString strFirstData = strData.Tokenize(",", iTokenPos2);
			NString strSecondData = strData.Tokenize(",", iTokenPos2);

			// Figure out whether output node's data is referring to an attribute of the output node
			// or to another variable that was already defined.
			NString strRightSide;
			NString strLeftSide = strMessageName + "_" + strFirstDataInInput;

			if (pcNode->IsUserDefinedAttribute()){  // Remember that at the moment, it has to be that either both
													// data items are user-defined or neither are.
				// Associate the attributes with the correct type.
				int iAttributeType = pcNode->GetAttributeType();
				// Add the attributes if they haven't already been added.
				if (cMain.m_lUserDefinedAttributes.Find(strFirstData).IsNull()){					
					cMain.m_lUserDefinedAttributes.AddTail(strFirstData);
				}
				if (cMain.m_lUserDefinedAttributes.Find(strLeftSide).IsNull()){					
					cMain.m_lUserDefinedAttributes.AddTail(strLeftSide);
				}
				int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strFirstData);
				int iAttributeLocation2 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strLeftSide);
				cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iAttributeType);
				cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation2, iAttributeType);
				
				strRightSide = strFirstData;
			}else{
				strRightSide = strComponentName + "_" + strFirstData;

				int iUserType = cMain.GetUserDefinedType(strComponentName, strFirstData, pcNode);
				if(iUserType == -1){
					// Throw an error since the data variable's type was not defined.
					NString strMessage = "Type not defined for the variable: ";
					strMessage = strMessage + strComponentName + "_" + strFirstData + "\r\n";
					strMessage = strMessage + "in the node: ";
					strMessage = strMessage + strComponentName + " <" + strStateName + ">\r\n";
					CTranslateException cException(strMessage);
					throw cException;
				}
				// Check if it was already added.
				NPosition cPosition = cMain.m_lUserDefinedAttributes.Find(strLeftSide);
				if (cPosition.IsNotNull() == false){ // The attribute is not in the list so add it.
					cMain.m_lUserDefinedAttributes.AddTail(strLeftSide);
					// Associate the attribute with its type.
					int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strLeftSide);
					cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iUserType);
				}
			}
			
			strAction = strLeftSide + "'=" + strRightSide;
			plActions->AddTail(strAction);
			if (strSecondData != ""){
				if (strSecondDataInInput == ""){
					// Throw an error as the input node is not accepting two items of data with the message.
					NString strMessage = "The input message node: ";
					strMessage = strMessage + strInputComponent + " <" + strInputStateName + ">\r\n";
					strMessage = strMessage + "is accepting only one data item even though the output node: ";
					strMessage = strMessage + strComponentName + " <" + strStateName + ">\r\n";
					strMessage = strMessage + "is sending two data items.";
					CTranslateException cException(strMessage);
					throw cException;
				}
				NString strSecondRightSide;
				NString strSecondLeftSide = strMessageName + "_" + strSecondDataInInput;

				if (pcNode->IsUserDefinedAttribute()){
					// Associate the attributes with the correct type.
					int iAttributeType = pcNode->GetAttributeType();
					// Add the attributes if they haven't already been added.
					if (cMain.m_lUserDefinedAttributes.Find(strSecondData).IsNull()){					
						cMain.m_lUserDefinedAttributes.AddTail(strSecondData);
					}
					if (cMain.m_lUserDefinedAttributes.Find(strSecondLeftSide).IsNull()){					
						cMain.m_lUserDefinedAttributes.AddTail(strSecondLeftSide);
					}
					int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strSecondData);
					int iAttributeLocation2 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strSecondLeftSide);
					cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iAttributeType);
					cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation2, iAttributeType);

					strSecondRightSide = strSecondData;
				}else{
					strSecondRightSide = strComponentName + "_" + strSecondData;

					int iUserType = cMain.GetUserDefinedType(strComponentName, strSecondData, pcNode);
					if(iUserType == -1){
						// Throw an error since the data variable's type was not defined.
						NString strMessage = "Type not defined for the variable: ";
						strMessage = strMessage + strComponentName + "_" + strSecondData + "\r\n";
						strMessage = strMessage + "in the node: ";
						strMessage = strMessage + strComponentName + " <" + strStateName + ">\r\n";
						CTranslateException cException(strMessage);
						throw cException;
					}
					// Check if it was already added.
					NPosition cPosition = cMain.m_lUserDefinedAttributes.Find(strSecondLeftSide);
					if (cPosition.IsNotNull() == false){ // The attribute is not in the list so add it.
						cMain.m_lUserDefinedAttributes.AddTail(strSecondLeftSide);
						// Associate the attribute with its type.
						int iAttributeLocation1 = cMain.FindListPosition(cMain.m_lUserDefinedAttributes, strSecondLeftSide);
						cMain.m_mUserAttributeTypes.SetAt(iAttributeLocation1, iUserType);
					}
				}
				
				strAction = strSecondLeftSide + "'=" + strSecondRightSide;
				plActions->AddTail(strAction);
			}else{
				// The output node is sending only one data item, so check that the input node is not trying
				// to receive two items of data.
				if (strSecondDataInInput != ""){
					// Throw an error as the output node is not sending two items of data with the message.
					NString strMessage = "The input message node: ";
					strMessage = strMessage + strInputComponent + " <" + strInputStateName + ">\r\n";
					strMessage = strMessage + "is accepting two data items even though the output node: ";
					strMessage = strMessage + strComponentName + " <" + strStateName + ">\r\n";
					strMessage = strMessage + "is sending only one data item.";
					CTranslateException cException(strMessage);
					throw cException;
				}
			}
			
			if (cMain.GetTranslationType() == 4){
				NString strMessage = "(intInMsg_" + strInputComponent + "_" + strMessageName;
				NString strInputPC = cMain.GetPCForNode(iInputNode);
				int iInputPCValue = cMain.GetPCValueForNode(iInputNode);
				strMessage.Append(" AND " + strInputPC + "=");
				strMessage.Format(strMessage + "%d", iInputPCValue);
				strMessage.Append(")");
				cMain.AddMessageString(strMessage);
			}	
		}else{  // The message did not contain data.
			int iInputNode = plMatchingInputNodes->GetNext(cInputPos);
			CTranslateNode* pcInputNode = cMain.GetNode(iInputNode);
			NString strInputComponent = pcInputNode->GetComponentName();
			strInputComponent = cMain.TrimChangeCase(strInputComponent, false);
			NString strIntInputVariable = "intInMsg_" + strInputComponent + "_" + strStateName;
			strAction = strIntInputVariable + "'=true";
			NPosition cFindPosition = plActions->Find(strAction);
			if (cFindPosition.IsNull()){
				plActions->AddTail(strAction);
				cMain.AddLocalBoolean(strIntInputVariable);
			}

			if (cMain.GetTranslationType() == 4){
				NString strMessage = "(intInMsg_" + strInputComponent + "_" + strStateName;
				NString strInputPC = cMain.GetPCForNode(iInputNode);
				int iInputPCValue = cMain.GetPCValueForNode(iInputNode);
				strMessage.Append(" AND " + strInputPC + "=");
				strMessage.Format(strMessage + "%d", iInputPCValue);
				strMessage.Append(")");
				cMain.AddMessageString(strMessage);
			}	

		}
	}
	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
}

/*void CTranslateRuleInternal::translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{
	NString strLabel = "";
	int iLabelType;
	NString strAction = "";

	CTranslateNode* pcNode = cMain.GetNode(iNode);
	NString strComponentName = pcNode->GetComponentName();
	NString strStateName = pcNode->GetStateName();
	strComponentName = cMain.TrimChangeCase(strComponentName, false);
	strStateName = cMain.TrimChangeCase(strStateName, false);

	// Get the list of matching internal input nodes.
	NList<int, int>* plMatchingInputNodes;
	plMatchingInputNodes = cMain.GetInternalMsgAssociation(iNode);
	NList<NString, NString>* plInputComponents; // A list of the input component names.
	plInputComponents = new NList<NString, NString>;

	// Create variables for each input node.
	NList<CTranslateUTrans*, CTranslateUTrans*>* plTransitions = new NList<CTranslateUTrans*, CTranslateUTrans*>;
	CTranslateUTrans* pcCurrentTransition;
	NPosition cInputPos;
	cInputPos = plMatchingInputNodes->GetHeadPosition();
	while(cInputPos.IsNotNull()){
		int iInputNode = plMatchingInputNodes->GetNext(cInputPos);
		CTranslateNode* pcInputNode = cMain.GetNode(iInputNode);
		NString strInputComponent = pcInputNode->GetComponentName();
		strInputComponent = cMain.TrimChangeCase(strInputComponent, false);
		NString strIntInputVariable = "intInMsg_") + strInputComponent + _T("_" + strStateName;
		if (plInputComponents->Find(strIntInputVariable).IsNull()){ // The component wasn't already added.
			plInputComponents->AddTail(strIntInputVariable);
			cMain.AddLocalBoolean(strIntInputVariable);
			strLabel = strIntInputVariable;
			strLabel.Append("!");
			iLabelType = UPPAAL_SYNCH;
			pcCurrentTransition = new CTranslateUTrans();
			pcCurrentTransition->AddLabel(strLabel, iLabelType);
			plTransitions->AddTail(pcCurrentTransition);
		}
	}
	
	// Assumed that more than 1 internal output message can't be in a single atomic block.
	// Also that a single output message that has many recipients can't be in a single atomic block.
	if (plInputComponents->GetSize() > 1){
		m_cParsingMethods.StoreMultipleUPPAALTransition(cMain,iNode,plTransitions, true);
	}else{
		m_cParsingMethods.StoreUPPAALTransition(cMain,iNode,strLabel,iLabelType);
		NPosition cRemovePos = plTransitions->GetHeadPosition();
		while (cRemovePos.IsNotNull()){
			CTranslateUTrans* pcRemoveTransition = plTransitions->GetNext(cRemovePos);
			delete pcRemoveTransition;
		}
		plTransitions->RemoveAll();
		delete plTransitions;
	}
	plInputComponents->RemoveAll();
	delete plInputComponents; 
}*/
