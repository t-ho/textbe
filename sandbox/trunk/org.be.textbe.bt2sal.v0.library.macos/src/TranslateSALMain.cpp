// File name: TranslateSALMain.cpp
// Author/s : Nisansala Yatapanage
// Date built: 2nd June, 2006
// Last updated: 3rd July, 2006
// Purpose: Main class for performing translations between Behavior
//  Trees and other languages (at present only the SAL language). For
//  further information please see TranslateSALMain.h.
//
// Algorithms used:
// Description of Algorithm#:
//


#include "TranslateSALMain.h"
#include "TranslateRuleSequential.h"
#include "TranslateRuleConBranching.h"
#include "TranslateRuleAltBranching.h"
#include "TranslateRuleReversion.h"
#include "TranslateRuleMacro.h"
#include "TranslateRuleThreadKill.h"
#include "TranslateRuleSelConjunct.h"
#include "TranslateRuleSelDisjunct.h"
#include "TranslateRuleInternal.h"

#include "GSEMethod.h"
#include "TranslateException.h"
#include "TranslateStep.h"
#include "TranslateSetAdd.h"
#include "TranslateSetCardinality.h"
#include "TranslateSetDifference.h"
#include "TranslateSetEmpty.h"
#include "TranslateSetIntersection.h"
#include "TranslateSetMember.h"
#include "TranslateSetUnion.h"
#include "TranslateSetSubtract.h"
#include "TranslateSetSubset.h"
#include "TranslateNode.h"
#include "NList.h"
#include "NPosition.h"
#include <list>
#include <sstream> 
//#import "msxml4.dll"
// using namespace MSXML2;
//#using <mscorlib.dll>
//using namespace System;
//using namespace System::IO;
//using namespace System::Xml;




CTranslateSALMain::CTranslateSALMain(void)
{
	m_bTranslateWithViews = false;
	m_iOptionSelected = 1;
	m_iBufOptionSelected = 2;
	m_bTranslateWithRandomBT = false;
	m_bDisplayTimes = true;
//	m_strIterationsNumber = "100";
	m_strSets = "";
	m_strInit = "";
	m_bUsingBESE = false;
}

CTranslateSALMain::~CTranslateSALMain(void)
{

}

// Select the options for performing the SAL translation.
void CTranslateSALMain::SelectOptions(const char* strTree, int iPriority, int iBuff, int iWithSets, const char* strSets, const char* strInit)
{
	// Get the new selections.
	if (iPriority == 2){
		m_iOptionSelected = 4;
	}else{
		m_iOptionSelected = 1;
	}
	if (iBuff == 2){
		m_iBufOptionSelected = 1;
	}else{
		m_iBufOptionSelected = 2;
	}
	m_bTranslateWithViews = false;
	if (iWithSets == 2){
		m_bTranslateWithRandomBT = true;
	}else{
		m_bTranslateWithRandomBT = false;
	}
	m_bDisplayTimes = false;
	m_strSets = strSets;
	m_strInit = strInit;
	m_strTree = strTree;
}

// Parse the current Behavior Tree to identify which translation
// rules to apply and to check that the tree contains valid syntax.
// Then translate the BT to SAL.
NString CTranslateSALMain::ParseBT(int iTreeID, bool bUsingSets, bool bUsingBESE)
{
//	CTranslateRandom* pcRandom; // This will only be used if a random BT is being used.
	
	bool bError = false;
	m_bUsingBESE = bUsingBESE;
	NString strText = ""; // This is to hold the final string.

	m_bIsUPPAAL = false;
//	m_iTreeID = iTreeID;
	
	NList <CTranslateParsingRule*, CTranslateParsingRule*>* pcRules 
		= new NList<CTranslateParsingRule*, CTranslateParsingRule*>;
	NList <CTranslateParsingRule*, CTranslateParsingRule*> cApplyOnceRules;
	
	CTranslateParsingRule* pcCurrentRule;

	// Fill the list of rules to be applied only once.
	CTranslateRuleReversion cSingleRule1;
	pcCurrentRule = &cSingleRule1;
	cApplyOnceRules.AddTail(pcCurrentRule);
	CTranslateRuleMacro cSingleRule2;
	pcCurrentRule = &cSingleRule2;
	cApplyOnceRules.AddTail(pcCurrentRule);

	// Fill the list of rules to be applied many times.
	CTranslateRuleSequential cRule1;
	pcCurrentRule = &cRule1;
	pcRules->AddTail(pcCurrentRule);
	CTranslateRuleInternal cRule2;
	pcCurrentRule = &cRule2;
	pcRules->AddTail(pcCurrentRule);
	CTranslateRuleConBranching cRule3;
	pcCurrentRule = &cRule3;
	pcRules->AddTail(pcCurrentRule);
	CTranslateRuleAltBranching cRule4;
	pcCurrentRule = &cRule4;
	pcRules->AddTail(pcCurrentRule);
	CTranslateRuleThreadKill cRule5;
	pcCurrentRule = &cRule5;
	pcRules->AddTail(pcCurrentRule);
//	CTranslateRuleSelConjunct cRule6;
//	pcCurrentRule = &cRule6;
//	pcRules->AddTail(pcCurrentRule);
//	CTranslateRuleSelDisjunct cRule7;
//	pcCurrentRule = &cRule7;
//	pcRules->AddTail(pcCurrentRule);
	
	// Add the rules for sets.
//	if (bUsingSets){
		CTranslateSetAdd cRule8;
		pcCurrentRule = &cRule8;
		pcRules->AddTail(pcCurrentRule);
		CTranslateSetCardinality cRule9;
		pcCurrentRule = &cRule9;
		pcRules->AddTail(pcCurrentRule);
		CTranslateSetDifference cRule10;
		pcCurrentRule = &cRule10;
		pcRules->AddTail(pcCurrentRule);
		CTranslateSetEmpty cRule11;
		pcCurrentRule = &cRule11;
		pcRules->AddTail(pcCurrentRule);
		CTranslateSetIntersection cRule12;
		pcCurrentRule = &cRule12;
		pcRules->AddTail(pcCurrentRule);
		CTranslateSetMember cRule13;
		pcCurrentRule = &cRule13;
		pcRules->AddTail(pcCurrentRule);
		CTranslateSetSubtract cRule14;
		pcCurrentRule = &cRule14;
		pcRules->AddTail(pcCurrentRule);
		CTranslateSetUnion cRule15;
		pcCurrentRule = &cRule15;
		pcRules->AddTail(pcCurrentRule);
		CTranslateSetSubset cRule16;
		pcCurrentRule = &cRule16;
		pcRules->AddTail(pcCurrentRule);
//	}

	CTranslateSALMain cTranslateMain;
	cTranslateMain.m_bIsUPPAAL = false;
	//int iNormalRoot;
	int iRootNode;
//	CTranslateNode* pcRandomRoot;
	CTranslateNode* pcTranslateRoot;
	cTranslateMain.m_bDisplayTimes = m_bDisplayTimes;
	cTranslateMain.m_bTranslateWithRandomBT = m_bTranslateWithRandomBT;
	cTranslateMain.m_bTranslateWithViews = m_bTranslateWithViews;
	
//	cTranslateMain.m_strIterationsNumber = m_strIterationsNumber;
	cTranslateMain.m_iOptionSelected = m_iOptionSelected;
	cTranslateMain.m_strTree = m_strTree;

	bUsingSets = m_bTranslateWithRandomBT;
	bool bReadFile = false;
	try{

//	if (!m_bTranslateWithRandomBT){  // This is a normal BT created by the user.
	// Open the Behavior Tree from a file according to the slicing syntax.
//		if (m_bUsingBESE){  // The user wants to translate a BESE file.
			// Show a file dialog box.
	/*	CFileDialog cFileDlg (TRUE, NULL, "*.*",
				OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
		if(cFileDlg.DoModal ()==IDOK ){
			NString strPathName = cFileDlg.GetPathName();
			String^ path = gcnew String(strPathName);
			path += " (System::String)";

			FileStream^ fs = File::OpenRead(path);
		//	XmlReader reader = XmlReader.Create(fs);

			delete path;
			if (fs){
				delete (IDisposable^)fs;
			}

			_bstr_t bstrFileName = strPathName.AllocSysString();

			MSXML::IXMLDOMDocumentPtr pXMLDoc = NULL;
			HRESULT hr = pXMLDoc.CreateInstance(__uuidof(MSXML::DOMDocument));
			pXMLDoc->async =  VARIANT_FALSE; // default - true,

			hr = pXMLDoc->load(bstrFileName);
		
			if (hr != VARIANT_TRUE){ // The xml file did not load.
				MSXML::IXMLDOMParseErrorPtr  pError;
				pError = pXMLDoc->parseError;
				_bstr_t parseError =_bstr_t(pError->Getreason());
				AfxMessageBox("Parse Error: ") + parseError;
				delete pcRules;
				return;
			}else { // It was successful.
				// Read the XML file and define iRootNode.

				// The root node is the one that is called "BEHAVIOR_TREE".
				MSXML::IXMLDOMElementPtr pXMLRoot;
				pXMLRoot = pXMLDoc->documentElement;
				MSXML::IXMLDOMNodePtr pXMLNode = pXMLRoot;
				
				// The first child is the root node of the BT.
				MSXML::IXMLDOMNodePtr pXMLChildNode;
				pXMLChildNode = pXMLNode->GetfirstChild();
				
				// Convert the nodes in the BT into TranslateNodes.
				cTranslateMain.m_iHighestTranslateID = 1;
				pcTranslateRoot = cTranslateMain.CreateTranslateNodes(pXMLChildNode);
				if (pcTranslateRoot == NULL){  // There was an error.
					return;
				}
				iRootNode = pcTranslateRoot->GetNodeID();
			}
		}else{  // The file dialog was cancelled by the user.
			delete pcRules;
			return;
		} */
//		}else{ // The user wants to translate a TextBE file.
			// Show a file dialog box.
//			CFileDialog cFileDlg (TRUE, NULL, "*.*",
	//			OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
	//		if(cFileDlg.DoModal ()==IDOK ){
	//			NString strPathName = cFileDlg.GetPathName();
	//			NString strFileName = cFileDlg.GetFileName();
				cTranslateMain.m_iHighestTranslateID = 1;
				pcTranslateRoot = cTranslateMain.ReadSlice();
				if (pcTranslateRoot == NULL){
					NString strMessage = "Error: The .bt file has incorrect syntax.";
					CTranslateException cException(strMessage);
					throw cException;
				}
				iRootNode = pcTranslateRoot->GetNodeID();
				bReadFile = true;
//			}else{
//				bReadFile = false;
//			}
//		}
	
//}else{ // This is a randomly generated BT.
	//	cTranslateMain.m_iHighestTranslateID = 1;
		// Create a random BT.
	//	pcRandom = new CTranslateRandom();
	//	pcRandomRoot = pcRandom->CreateRandomBT(m_strIterationsNumber);
		// Convert the random BT's nodes to another set of TranslateNodes.
		// This is to allow TranslateSALMain to assign the ID's it wants
		// to the nodes, instead of the ID's assigned by the random class.
	//	pcTranslateRoot = cTranslateMain.CreateTranslateNodesFromRandom(pcRandom, pcRandomRoot); 
	//	iRootNode = pcTranslateRoot->GetNodeID();
	//	bUsingSets = false;  // Don't translate anything as sets.
	//	bReadFile = true;
//	}

	if (bReadFile){
		// Store the set information.
	//	if (bUsingSets){
			// Show a file dialog box.
		//	CFileDialog cFileDlg (TRUE, NULL, "*.*",
		//			OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
		//	if(cFileDlg.DoModal ()==IDOK ){
		//		NString strPathName = cFileDlg.GetPathName();
			//	NString strFileName = cFileDlg.GetFileName();
		//	
			
				if (bUsingSets){ // This means that it has set nodes.
					if (m_strSets == ""){
						NString strMessage = "You have not provided any information about the sets. ";
						CTranslateException cException(strMessage);
						throw cException;
					}
					cTranslateMain.ReadSetInformation();
					cTranslateMain.ReplaceAttributes(pcTranslateRoot);
		//			cTranslateMain.ReadSetElements();
					cTranslateMain.ExpandBranches(pcTranslateRoot);
					// Find all the set nodes and parse their expressions.
					for (int s = 1; s < cTranslateMain.m_iHighestTranslateID; s++){
						CTranslateNode* pcCurrentSetNode;
						int iSetSuccess = cTranslateMain.m_mTranslateNodes.Lookup(s, pcCurrentSetNode);
						if (iSetSuccess != 0){
						//	if (pcCurrentSetNode->IsNodeSetOperation() == true){
								// The node is a set operation.
				//				lSetNodes.AddTail(pcCurrentSetNode);
								// Store its state name to a file for the parser to read.
							//	NString strStateName = pcCurrentSetNode->GetStateName();
							//	strStateName = strStateName + "\r\n";
							//	FILE *pcParserFile;
							//	NString strPathName = "C:/sets/BTSetExp.txt";
							//	_tfopen_s(&pcParserFile,(LPCTSTR)strPathName,"wt");
							//	_fputts((LPCTSTR)strStateName,pcParserFile);
							//	fclose(pcParserFile);

								// Run the parser.
							//	NString strCmd ="C:/sets/parser";
							//	_tsystem((LPCTSTR)strCmd);

								// Parse the node's set expression.
								cTranslateMain.MatchSetExpression(pcCurrentSetNode);
						//	}
						}
					}
				
				}
	//		}
	//	}////////////////////// SLICING SECTION STARTS HERE //////////////////////////////////////////////////
	/*	if (m_bTranslateWithViews){  //////// Change this to a slicing checkbox option.
			// Find the slice of the tree based on the user's given criterion.
			pcTranslateRoot->SetParent(0);
			CTranslateSlicer cSlicer;
			iRootNode = pcTranslateRoot->GetNodeID();
			cTranslateMain.MakeLongIDs(iRootNode);	
		//	NString strCriterion = cTranslateMain.m_strCriterion;
			CMap<int, int, CTranslateNode*, CTranslateNode*>* pcMapPointer;
			pcMapPointer = &cTranslateMain.m_mTranslateNodes;
			// Note that cSlicer will modify the node map.
			CTranslateNode* pcSliceRoot = cSlicer.Slice(pcMapPointer,pcTranslateRoot,false,cTranslateMain.m_iHighestTranslateID,m_strCriterion);

			pcTranslateRoot = pcSliceRoot; // Use the slice's root instead of the original tree.
			cTranslateMain.m_bTranslateWithViews = false;  // This is because of using the views boolean instead of a dedicated slicing boolean.
			m_bTranslateWithViews = false;
		}
		iRootNode = pcTranslateRoot->GetNodeID();*/
//////////////////////////////////////////// SLICING ENDS HERE //////////////////////////////////////////////////////

		
		// Find the initialisation nodes.
		NList<int,int> lInitNodes;   
		cTranslateMain.TranslateInitNodes(iRootNode, lInitNodes);
	
		// Create the ID values and program counters.
		cTranslateMain.m_iHighestProgramCounter = 0;
		cTranslateMain.CreateIDValues(cTranslateMain.m_iStartNode);
		cTranslateMain.m_strMessageReady = "";

		// Create an empty actions list for the root node.
		// This is to handle branching directly after the root node.
		NList<NString, NString>* plRootActions = new NList<NString, NString>;
		cTranslateMain.AddNodeAction(iRootNode, plRootActions);

		bool bParsingSuccessful = true;

		NList<int, int> cAllNodes;
		cTranslateMain.GetDescendents(cAllNodes, iRootNode);
		NList<int,int> cLeafNodes;
		cTranslateMain.GetLeafNodes(iRootNode, cLeafNodes);

		// Apply all of the rules to be applied only once.
		NPosition cRulePosition1;
		cRulePosition1 = cApplyOnceRules.GetHeadPosition();
		while (cRulePosition1.IsNotNull()){
			CTranslateParsingRule* pcCurrentRule;
			pcCurrentRule = cApplyOnceRules.GetNext(cRulePosition1);
			bool bSuccess = pcCurrentRule->applyBackwards(cTranslateMain,
				cLeafNodes,cAllNodes,cTranslateMain.m_iStartNode, lInitNodes,false,pcRules);
		}

		// Apply the rules to be applied many times.
		bool bRuleMatched = true;
		bool bSuccess;
		while(bRuleMatched){ // This ensures that the loop will end if none of the rules hold for a set of nodes.
			// Note that if the leaf nodes is upto the root node (finalNode) then the rules will not match & the loop will end.	
			bRuleMatched = false;
			NPosition cRulePosition;
			cRulePosition = pcRules->GetHeadPosition();
			while(cRulePosition.IsNotNull()){
				CTranslateParsingRule* pcCurrentRule;
				pcCurrentRule = pcRules->GetNext(cRulePosition);
				bSuccess = pcCurrentRule->applyBackwards(cTranslateMain,
					cLeafNodes,cAllNodes,cTranslateMain.m_iStartNode,lInitNodes,false,pcRules);
				if (bSuccess == true){
					bRuleMatched = true;
				}
			}
		}
		
		// Check if the BT was correctly parsed.
		// There should be one leaf node left (The top node: m_iStartNode).
		if ((cLeafNodes.GetSize() > 1) || ((cLeafNodes.GetSize() == 1) && (cLeafNodes.GetHead() != cTranslateMain.m_iStartNode))){
		   NString strMessage;
		   strMessage = "Behavior Tree Parsing error: The Behavior Tree is not valid according to the rules. \n";
		   strMessage.Append("Problem may be due to nodes: \n");
					
		   NPosition cLeafPos = cLeafNodes.GetHeadPosition();
		   while (cLeafPos.IsNotNull()){
				int iCurrentLeafNode = cLeafNodes.GetNext(cLeafPos);
				CTranslateNode* pcLeaf = cTranslateMain.GetNode(iCurrentLeafNode);
				NString strLeafComponent = pcLeaf->GetComponentName();
				NString strLeafState = pcLeaf->GetStateName();
				NString strLeafName = strLeafComponent + "-" + strLeafState;
				strMessage.Append(strLeafName);
				if (cLeafPos.IsNotNull()){ // This isn't the last node.
					strMessage.Append(",\n");
				}
		   }
		   CTranslateException cException(strMessage);
		   throw cException;
		}
		
		//////////////////////////////// SAL Translation ///////////////////////////////////////////
		NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules;
		NPosition cStepPosition;
		cStepPosition = cTranslateMain.m_lSteps.GetHeadPosition();
		CTranslateParsingMethods cParsingMethods;
		while(cStepPosition.IsNotNull()){
			CTranslateStep* pcCurrentStep;
			pcCurrentStep = cTranslateMain.m_lSteps.GetNext(cStepPosition);
			int iCurrentRuleID = pcCurrentStep->GetRule();
			CTranslateParsingRule* pcCurrentTranslateRule = cParsingMethods.GetRule(iCurrentRuleID);
			int iCurrentTranslateNode = pcCurrentStep->GetNode();
			CTranslateNode* pcCurrentTranslateNode = cTranslateMain.GetNode(iCurrentTranslateNode);
			int iOtherNode = pcCurrentStep->GetOtherNode();
			int iSiblingCount = pcCurrentTranslateNode->GetSiblingNumber();
			plSecondaryRules = new NList<CTranslateParsingRule*, CTranslateParsingRule*>;
			int iParent = pcCurrentTranslateNode->GetParent();
			CTranslateNode* pcParent = cTranslateMain.GetNode(iParent);

			if (iSiblingCount > 0){
				// Get the secondary rule for each node.
				for (int i = 0; i < (iSiblingCount + 1); i++){
					int iSibling = pcParent->GetChildID(i);
					int iSecondaryRuleID = pcCurrentStep->GetSecondaryRule(i);
					CTranslateParsingRule* pcSecondaryRule = cParsingMethods.GetRule(iSecondaryRuleID);
					plSecondaryRules->AddTail(pcSecondaryRule);
				}
			}
			// Translate the step.
			try{
				pcCurrentTranslateRule->translateToSAL(cTranslateMain, iCurrentTranslateNode, iOtherNode, plSecondaryRules); 
		
			}catch(CTranslateException salEx){  // Another catch is needed here in order to free the memory.
				// Free the memory.
				delete pcCurrentTranslateRule;
				NPosition cSecPos = plSecondaryRules->GetHeadPosition();
				while(cSecPos.IsNotNull()){
					CTranslateParsingRule* pcSecRule;
					pcSecRule = plSecondaryRules->GetNext(cSecPos);
					delete pcSecRule;
					pcSecRule = NULL;
				}
				plSecondaryRules->RemoveAll();
				delete plSecondaryRules;
				plSecondaryRules = NULL;
				throw salEx;
			}

			// Free the memory.
			delete pcCurrentTranslateRule;
			NPosition cSecPos = plSecondaryRules->GetHeadPosition();
			while(cSecPos.IsNotNull()){
				CTranslateParsingRule* pcSecRule;
				pcSecRule = plSecondaryRules->GetNext(cSecPos);
				delete pcSecRule;
				pcSecRule = NULL;
			}
			plSecondaryRules->RemoveAll();
			delete plSecondaryRules;
			plSecondaryRules = NULL;
		}

		// Write the context name at the top, using the name of the file.
		NString strFileName = "";  
		strText = strFileName + ":CONTEXT=\r\n";	

		// Write the BEGIN line.
		strText.Append("BEGIN\r\n");

		// This section writes the state type declarations.
		NString strComponentName, strStateName;  
	
		// Write the local variable state type declarations.	
		int iLocalCounter = 0;
		NPosition cLocalPosition = cTranslateMain.m_cLocalComponents.GetHeadPosition();
		while(cLocalPosition.IsNotNull()){
			NString strComponentName = cTranslateMain.m_cLocalComponents.GetNext(cLocalPosition);
			strText.Append(TrimChangeCase(strComponentName, true) 
				+ ": TYPE={");
			// Get the states for this component.
			NList<NString,NString>* plStates;
			int iSuccess = cTranslateMain.m_cLocalStates.Lookup(iLocalCounter,plStates);
			int iStateCounter = 0;
			NPosition cStatePosition = plStates->GetHeadPosition();
			while(cStatePosition.IsNotNull()){
				NString strStateName = plStates->GetNext(cStatePosition);
				if (iStateCounter == 0){ // This is the first state element.
					strText.Append(TrimChangeCase(strStateName, false));
				}else{ // This is not the first state element.
					strText.Append(",");
					strText.Append(TrimChangeCase(strStateName, false));
				}
				iStateCounter++;
			}
			strText.Append("};\r\n");
			iLocalCounter++;
		}

		if (bUsingSets){
			// Write the set type declarations.
			int iSetCounter = 0;
			NPosition cSetTypePosition = cTranslateMain.m_cSetTypes.GetHeadPosition();
			while(cSetTypePosition.IsNotNull()){
				NString strSetType = cTranslateMain.m_cSetTypes.GetNext(cSetTypePosition);
				strText.Append(TrimChangeCase(strSetType, true) + ": TYPE={");
				// Get the possible elements for this set type.
				NList<NString,NString>* plElements;
				int iSuccess = cTranslateMain.m_cSetElements.Lookup(iSetCounter,plElements);
				int iElementCounter = 0;
				NPosition cElementPosition = plElements->GetHeadPosition();
				while(cElementPosition.IsNotNull()){
					NString strElementName = plElements->GetNext(cElementPosition);
					if (iElementCounter == 0){ // This is the first element.
						strText.Append(TrimChangeCase(strElementName, false));
					}else{ // This is not the first element.
						strText.Append(",");
						strText.Append(TrimChangeCase(strElementName, false));
					}
					iElementCounter++;
				}
				strText.Append("};\r\n");
				iSetCounter++;
			}
		}

		// Write the start of the module.
		strText.Append("\r\nbehavior:MODULE=\r\nBEGIN\r\n");
	       		
		// Write the Input variable declarations.
		NString strInputSection = "INPUT ";
		NPosition cInputPosition;
		cInputPosition = cTranslateMain.m_cInputVariables.GetHeadPosition();
		int iInputCounter = 0;
		while(cInputPosition.IsNotNull()){
			NString strCurrentInput = cTranslateMain.m_cInputVariables.GetNext(cInputPosition);  
			strCurrentInput = TrimChangeCase(strCurrentInput, false);
			if (iInputCounter == 0){  // This is the first element.
				strInputSection.Append(strCurrentInput);
			}else{
				strInputSection.Append("," + strCurrentInput);
			}
			iInputCounter++;
		}
		strInputSection.Append(":BOOLEAN\r\n");
		if (iInputCounter > 0){ 
			// Only write the INPUT words if input variables exist.
			strText.Append(strInputSection);
		}

		// Write the Output variable declarations.
		NString strOutputSection = "OUTPUT ";	
		NPosition cOutputPosition;
		cOutputPosition = cTranslateMain.m_cOutputVariables.GetHeadPosition();
		int iOutputCounter = 0;
		while(cOutputPosition.IsNotNull()){
			NString strCurrentOutput = cTranslateMain.m_cOutputVariables.GetNext(cOutputPosition); 
			strCurrentOutput = TrimChangeCase(strCurrentOutput, false);	
			if (iOutputCounter == 0){  // This is the first element.
				strOutputSection.Append(strCurrentOutput);
			}else{
				strOutputSection.Append("," + strCurrentOutput);
			}
			iOutputCounter++;
		}
		strOutputSection.Append(":BOOLEAN\r\n");
		if (iOutputCounter > 0){ 
			// Only write the OUTPUT words if input variables exist.
			strText.Append(strOutputSection);
		}
	    
		// Write the Local variable declarations.  		
		strText.Append("LOCAL\r\n");   
		NPosition cComponentPosition = cTranslateMain.m_cLocalComponents.GetHeadPosition();
		while(cComponentPosition.IsNotNull()){
			NString strComponentName = cTranslateMain.m_cLocalComponents.GetNext(cComponentPosition);
			strText.Append(TrimChangeCase(strComponentName, false) 
			  + ": " + TrimChangeCase(strComponentName, true) + ",\r\n");
		}

		// Write the Integer variable declarations.
		NPosition cIntegerPosition2 = cTranslateMain.m_lIntegers.GetHeadPosition();
		int iIntListPosition = 0;
		while (cIntegerPosition2.IsNotNull()){
			NString strIntegerName = cTranslateMain.m_lIntegers.GetNext(cIntegerPosition2);
			strText.Append(strIntegerName + ":[" 
				+ GetListElement(cTranslateMain.m_lStartValues,iIntListPosition)
				+ ".." + GetListElement(cTranslateMain.m_lEndValues,iIntListPosition) + "],\r\n");
			iIntListPosition++;
		}

		// Write the user-defined attribute declarations.
		NPosition cUserAttributePos = cTranslateMain.m_lUserDefinedAttributes.GetHeadPosition();
		int iAttributeLocation = 0;
		while(cUserAttributePos.IsNotNull()){
			NString strAttributeName = cTranslateMain.m_lUserDefinedAttributes.GetNext(cUserAttributePos);
			int iTypeLocation;
			int iAttributeSuccess = cTranslateMain.m_mUserAttributeTypes.Lookup(iAttributeLocation, iTypeLocation);
			if (iAttributeSuccess == 0){   // The type could not be found in the map.
				NString strMessage = "Type not defined for the attribute: ";
				strMessage = strMessage + strAttributeName;
				CTranslateException cException(strMessage);
				throw cException;
			}
 			NString strAttributeType = GetListElement(cTranslateMain.m_cSetTypes, iTypeLocation);
			strText.Append(TrimChangeCase(strAttributeName, false) 
			  + ": " + TrimChangeCase(strAttributeType, true) + ",\r\n");
			iAttributeLocation++;
		}

		if (cTranslateMain.m_iOptionSelected == 2){
			strText.Append("internalMessages:BOOLEAN,\r\n");

		}else if (cTranslateMain.m_iOptionSelected == 4){
       		strText.Append("internalActions: BOOLEAN,\r\n");
			strText.Append("messageReady: BOOLEAN,\r\n");
 		}
	       		
		// Write the local boolean declarations (under the Local section).
		NPosition cLocalBooleanPosition;
		cLocalBooleanPosition = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
		while(cLocalBooleanPosition.IsNotNull()){
			NString strCurrentBoolean = cTranslateMain.m_cLocalBooleans.GetNext(cLocalBooleanPosition);
			strCurrentBoolean = TrimChangeCase(strCurrentBoolean, false);
			strText.Append(strCurrentBoolean + ":BOOLEAN,\r\n");
		}
	  
		// Write the local integer attribute declarations
		// (under the Local section).
		NPosition cIntegerPosition;
		cIntegerPosition = cTranslateMain.m_cIntegerAttributes.GetHeadPosition();
		while(cIntegerPosition.IsNotNull()){
			NString strCurrentInteger = cTranslateMain.m_cIntegerAttributes.GetNext(cIntegerPosition);
			strCurrentInteger = TrimChangeCase(strCurrentInteger, false);
			strText.Append(strCurrentInteger + ":[-100..100],\r\n");
		}
	  
		if (bUsingSets){
			// Write the local set declarations.
			int iLocalSetCounter = 0;
			NPosition cSetPosition = cTranslateMain.m_cSetNames.GetHeadPosition();
			while (cSetPosition.IsNotNull()){
				NString strSetName = cTranslateMain.m_cSetNames.GetNext(cSetPosition);
				int iSetTypePosition;
				int iSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(iLocalSetCounter, 
					iSetTypePosition);
				NString strSetType = GetListElement(cTranslateMain.m_cSetTypes,iSetTypePosition);
				// Check if this set is an attribute of another set.
				NPosition cIsInAttributeList = cTranslateMain.m_cAttributeSets.Find(strSetName);
				if (cIsInAttributeList.IsNotNull()){
					// The set is an attribute of either an element of another set or a normal component.
					int iParentPosition;
					int iAttributePosition = FindListPosition(cTranslateMain.m_cAttributeSets,strSetName);
					int iParentSuccess = cTranslateMain.m_cSetsToParentSets.Lookup(iAttributePosition, iParentPosition);
					if (iParentSuccess > 0){  
/////////// Do something if it is 0 as an error occurred.
						NString strParentSet = GetListElement(cTranslateMain.m_cParentSets,iParentPosition);
						// Find the location of the parent set in the normal set list.
						int iParentNameLocation = FindListPosition(cTranslateMain.m_cSetNames,strParentSet);
						// Find the type of the parent set.
						int iParentTypeLocation;
						int iParentTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(iParentNameLocation, 
							iParentTypeLocation);
						if (iParentTypeSuccess > 0){  // The set is an attribute of an element of another set, 
											  // e.g. if set s is an attribute of each element c of set t, so
											  // there would be a ||c:t or []c:t and under it, c_s refers to c's attribute s.
							NString strParentType = GetListElement(cTranslateMain.m_cSetTypes,
								iParentTypeLocation);
							// Get the elements of the parent set.
							NList<NString, NString>* plParentElements;
							int iElementSuccess = cTranslateMain.m_cSetElements.Lookup(iParentTypeLocation, plParentElements);
							if (iElementSuccess > 0){ 
	/////////// Do something if it is 0 as an error occurred.
								NPosition cParentElementPos;
								cParentElementPos = plParentElements->GetHeadPosition();
								while (cParentElementPos.IsNotNull()){
									NString strCurrentElement = plParentElements->GetNext(cParentElementPos);
									NString strFullName = strCurrentElement + "_" + strSetName;
									strText.Append(TrimChangeCase(strFullName, false));
									strText.Append(": set{");
									strText.Append(TrimChangeCase(strSetType, true));
									strText.Append("}!Set,\r\n");
								}
							}
						}else{  // The set is an attribute of a component that is not part of another set,
								// e.g. if the set was s and it was an attribute of the component c, i.e. c_s.
							NString strFullName = strParentSet + "_" + strSetName;
							strText.Append(TrimChangeCase(strFullName, false));
							strText.Append(": set{");
							strText.Append(TrimChangeCase(strSetType, true));
							strText.Append("}!Set,\r\n");
						}
					}
				}else{
					// The set is not an attribute of another set.
					strText.Append(TrimChangeCase(strSetName, false));
					strText.Append(": set{");				
					strText.Append(TrimChangeCase(strSetType, true));
					strText.Append("}!Set,\r\n");
				}
				iLocalSetCounter++;
			}
		} 

		if (UsingViews()){
			// Get the largest view number.
			int iMaxView = 1;
			NPosition cAllPosition;
			cAllPosition = cAllNodes.GetHeadPosition();
			while(cAllPosition.IsNotNull()){
				int iNode = cAllNodes.GetNext(cAllPosition);
				//FV get the failure views for this node.
				//FV loop through the views list to see if
				// any are larger than iMaxView.
			}
			NString strViewLine = "view:[1..";
			strViewLine.Format(strViewLine + "%d", iMaxView);
			strText.Append(strViewLine);
			strText.Append("],\r\n");
		}

		// Write the program counter declarations (under the Local section).
		for (int i = 1; i <= cTranslateMain.m_iHighestProgramCounter; i++){
			NString strPCText = "pc";
			strPCText.Format(strPCText + "%d",i);
			strPCText.Append(": [0..");
			int iHighestValue;
			int iSuccess = cTranslateMain.m_cPCRanges.Lookup(i,iHighestValue);
			strPCText.Format(strPCText + "%d", iHighestValue);
			strText.Append(strPCText);
			strText.Append("]");
       		if (i < cTranslateMain.m_iHighestProgramCounter){   
				// This isn't the last element.
				strText.Append(",");
			}
			strText.Append("\r\n");		
		}

		if (cTranslateMain.m_iOptionSelected == 2){
       		if (cTranslateMain.m_cLocalBooleans.GetSize() > 0){
				strText.Append("DEFINITION\r\n");
				strText.Append("internalMessages = ");		
			
				NPosition cLocalPosition;
				cLocalPosition = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
				int iBooleanCounter = 0;

				while(cLocalPosition.IsNotNull()){
					NString strCurrentBoolean = cTranslateMain.m_cLocalBooleans.GetNext(cLocalBooleanPosition);  
					if (iBooleanCounter == 0){  // This is the first element.
						strText.Append("(");
						strText.Append(TrimChangeCase(strCurrentBoolean, false));  
					}else{
						strText.Append(" OR (");
						strText.Append(TrimChangeCase(strCurrentBoolean, false)); 
					}
					iBooleanCounter++;
					strText.Append("\r\n");
				}
				
			}else{
				// There are no internal messages in the module 
				// so set internalMessages to false.
				strText.Append("DEFINITION\r\n");
				strText.Append("internalMessages = false\r\n\r\n");
			}
		
		}else if (cTranslateMain.m_iOptionSelected == 4){
			if (cTranslateMain.m_cLocalBooleans.GetSize() > 0){
				strText.Append("DEFINITION\r\n");
				strText.Append("messageReady = " 
					+ cTranslateMain.m_strMessageReady + "\r\n\r\n");
			
			}else{
				// There are no internal messages in the 
				// module so set messageReady to false.
				strText.Append("DEFINITION\r\n");
				strText.Append("messageReady = false\r\n\r\n");
			}
			strText.Append("DEFINITION\r\n");
			NString strTempText;
			strTempText.Append("internalActions = ");
			
			// Get all the guards for internal actions.
			int iInternalActionCount = 0;
			NPosition cAllPosition;
			cAllPosition = cAllNodes.GetHeadPosition();
			while(cAllPosition.IsNotNull()){
				int iNode = cAllNodes.GetNext(cAllPosition);
				CTranslateNode* pcNode = cTranslateMain.GetNode(iNode);
				if (cTranslateMain.IsAtomic(iNode) == true){
					// Get all the atomic blocks associated with this node.
					NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcAtomicBlocks;
					pcAtomicBlocks = cTranslateMain.GetAtomicBlocks(iNode);
					NPosition cBlockPos = pcAtomicBlocks->GetHeadPosition();
					while (cBlockPos.IsNotNull()){ // For each block.
						CTranslateAtomicBlock* plBlock;
						plBlock = pcAtomicBlocks->GetNext(cBlockPos);
						if (plBlock->ContainsExternal() != true){
							if (UsingViews() != true){
								NString strGuard;
								int iSuccess = cTranslateMain.m_cNodesToGuards.Lookup(iNode,strGuard);
								if (iSuccess > 0){
									if (iInternalActionCount != 0){
									// This isn't the first action.
										strTempText.Append("OR ");
									}else{
										strTempText.Append("\r\n");
									}
									strTempText.Append("(" +
										strGuard + ")\r\n");
									iInternalActionCount++;

								}else{
									///////////// Throw error here because it shouldn't happen.
								}
							}else{
								//////////////// FAILURE VIEW SECTION TO DO ONE DAY.
							}
						}
					}
				}else if ((pcNode->GetType() != GSE_T_INPUT) && (pcNode->GetType() != GSE_T_EVENT)){  // If this is not an external input node.
					NString strGuard;
					int iSuccess = cTranslateMain.m_cNodesToGuards.Lookup(iNode,strGuard);
					if (iSuccess != 0){
						if (iInternalActionCount != 0){ // This is not the first action.
							strTempText.Append("OR ");
						}else{
							strTempText.Append("\r\n");
						}
						strTempText.Append("(" + strGuard + ")\r\n");
						iInternalActionCount++;
						////////// Add failure view section here.
					}
				}	
			}
			if (iInternalActionCount == 0){
				// There were no internal actions.		
				strTempText.Append("false\r\n");
			}
			strTempText.Append("\r\n");
			strText.Append(strTempText);
		}


		// Add updates to set messages back to false if no buffering has been selected.
		if (m_iBufOptionSelected == 1){
		
			NPosition cAllPosition;
			cAllPosition = cAllNodes.GetHeadPosition();
			while(cAllPosition.IsNotNull()){
				int iNode = cAllNodes.GetNext(cAllPosition);
				CTranslateNode* pcNode = cTranslateMain.GetNode(iNode);
				if (cTranslateMain.IsAtomic(iNode) == true){
					// Get all the atomic blocks associated with this node.
					NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcAtomicBlocks;
					pcAtomicBlocks = cTranslateMain.GetAtomicBlocks(iNode);
					NPosition cBlockPos = pcAtomicBlocks->GetHeadPosition();
					while (cBlockPos.IsNotNull()){ // For each block.
						CTranslateAtomicBlock* plBlock;
						plBlock = pcAtomicBlocks->GetNext(cBlockPos);
					//	if (plBlock->ContainsExternal() != true){
							if (UsingViews() != true){
								NString strGuard;
								int iSuccess = cTranslateMain.m_cNodesToGuards.Lookup(iNode,strGuard);
								if (iSuccess > 0){
									// Add the updates to set all messages back to false.
									if (!plBlock->ContainsInternalInput()){
										NList<NString,NString>* plActionList;
										int iSuccess2 = cTranslateMain.m_cNodesToActions.Lookup(iNode,plActionList);
										if (iSuccess2 != 0){
											NPosition cBooleanPos = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
											while (cBooleanPos.IsNotNull()){
												NString strLocalBoolean = cTranslateMain.m_cLocalBooleans.GetNext(cBooleanPos);
												plActionList->AddTail(strLocalBoolean + "'=false");
											}
										}
										cTranslateMain.RemoveMessageConflicts(*plActionList,cTranslateMain.m_cLocalBooleans);
										cTranslateMain.m_cNodesToActions.SetAt(iNode,plActionList);
									}	
								}else{
									///////////// Throw error here because it shouldn't happen.
								}
							}else{
								//////////////// FAILURE VIEW SECTION TO DO ONE DAY.
							}
					}
				}else if (pcNode->GetType() != GSE_T_INPUT1){
					NList<NString,NString>* plActionList;
					int iSuccess2 = cTranslateMain.m_cNodesToActions.Lookup(iNode,plActionList);
					if (iSuccess2 != 0){
						NPosition cLocalBooleanPosition;
						cLocalBooleanPosition = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
						while(cLocalBooleanPosition.IsNotNull()){
							NString strCurrentBoolean = cTranslateMain.m_cLocalBooleans.GetNext(cLocalBooleanPosition);
							strCurrentBoolean = TrimChangeCase(strCurrentBoolean, false);
							plActionList->AddTail(strCurrentBoolean + "'=false");
						}		
						cTranslateMain.RemoveMessageConflicts(*plActionList,cTranslateMain.m_cLocalBooleans);
						cTranslateMain.m_cNodesToActions.SetAt(iNode,plActionList);
					}
				}	
			}
		}	
				
		// Initialisation section.
		strText.Append("");
		strText.Append("INITIALIZATION\r\n");
		 
		if (bUsingSets){ // Get information about any initialisation of variables.
	//		if (m_bDisplayTimes){
	//			cPauseTime1 = CFileTime::GetCurrentTime(); // Stop timing as it is opening files.
	//		}
			// Read the initialisation file, if one was specified by the user.  
	//		if (m_strPathName2 != ""){
	//			FILE *pcFile;
				NString strLine;
	//			char cLine[4096];

	//			if (m_bDisplayTimes){
	//				cReadingTime = CFileTime::GetCurrentTime(); 
	//			}
				
					// Read the selected file.
	//				_tfopen_s(&pcFile,(LPCTSTR)m_strPathName2,"rt");
				int iFilePos = 0;
				while (iFilePos != -1){ // Read each line.
				//		fgets(cLine,4096,pcFile); 
				//		strLine = cLine;
						strLine = m_strInit.Tokenize("\n", iFilePos);
						if (strLine.Trim() != ""){ // To make it ignore the last blank line.
							// Initialise the variables described by this line.
							// Remove the last character as it is a line break character.
							int iLength = strLine.GetLength();
							strLine.Truncate(iLength - 1);	
							int iTokenPos = 0;
							NString strOwnerVariable = strLine.Tokenize(";", iTokenPos);
							NString strVariable = strLine.Tokenize(";", iTokenPos);
							NString strInitialState = strLine.Tokenize(";", iTokenPos);
						
							// Initialise the variables.
							int iOwnerNameLocation = FindListPosition(cTranslateMain.m_cSetNames,strOwnerVariable);
							// Find the type of the parent set.
							int iOwnerTypeLocation;
							int iOwnerTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(iOwnerNameLocation, 
								iOwnerTypeLocation);
							if (iOwnerTypeSuccess > 0){
	/////////// Do something if it is 0 as an error occurred.
								NString strOwnerType = GetListElement(cTranslateMain.m_cSetTypes,
									iOwnerTypeLocation);
								// Get the elements of the parent set.
								NList<NString, NString>* plOwnerElements;
								int iElementSuccess = cTranslateMain.m_cSetElements.Lookup(iOwnerTypeLocation, plOwnerElements);
								if (iElementSuccess > 0){ 
		/////////// Do something if it is 0 as an error occurred.
									NPosition cOwnerElementPos;
									cOwnerElementPos = plOwnerElements->GetHeadPosition();
									while (cOwnerElementPos.IsNotNull()){
										NString strCurrentElement = plOwnerElements->GetNext(cOwnerElementPos);
										strCurrentElement = TrimChangeCase(strCurrentElement, false);
										NString strFullName;
										if (strVariable != "/"){  // This is an initialisation of an attribute of a set element.
											strFullName = strCurrentElement + "Component_" + strVariable;
										}else{  // This is an initialisation of a state of a set element.
											strVariable = TrimChangeCase(strVariable, false);
											strFullName = strCurrentElement  + "Component";
										}
										NString strFullState = strFullName + "_" + strInitialState;
										strText.Append(TrimChangeCase(strFullName, false));
										strText.Append("=");
										strText.Append(TrimChangeCase(strFullState, false) + ";\r\n");
									}
								}
							}
						}
					}
				//	fclose(pcFile);
				}

		//	}
			
		
		//	if (m_bDisplayTimes){
		//		cRestartTime1 = CFileTime::GetCurrentTime(); 
		//	}
	//	}

		NPosition cInitPosition;
		cInitPosition = lInitNodes.GetHeadPosition();
		while (cInitPosition.IsNotNull()){
			int iCurrentNode = lInitNodes.GetNext(cInitPosition);
			CTranslateNode* pcNode = cTranslateMain.GetNode(iCurrentNode);
			NString strComponent;
			strComponentName = pcNode->GetComponentName();
			NString strState;
			strStateName = pcNode->GetStateName();
			NString strAction;
			strComponentName = TrimChangeCase(strComponentName, false);
			strStateName = TrimChangeCase(strStateName, false);
			NString strFinalComp = strComponentName;
			NString strFinalState = strComponentName + "_" + strStateName;
		
			// Check for attributes.
			int iTokenPos = 0;
			NString strToken = strStateName.Tokenize(":=", iTokenPos);
			NString strToken2 = strStateName.Tokenize(":=", iTokenPos);
			if (strToken2 != ""){ // The state contains attributes.
				strToken = TrimChangeCase(strToken, false);
				strToken2 = TrimChangeCase(strToken2, false);
				// Check if the first component is an integer type variable.
				if (cTranslateMain.IsInteger(strComponentName + "_" + strToken)){
					// Check if the second value is an integer.
					if (IsStringANumber(strToken2)){
						strFinalComp = strComponentName + "_" + strToken;
						strFinalState = strToken2;
					}else{ // The second value must be another attribute.
						strFinalComp = strComponentName + "_" + strToken;
						strFinalState = strComponentName + "_" + strToken2;
					}
				}else{ // It is a normal attribute.
					// Change the component name & state to attribute style.
					strFinalComp = strComponentName + "_" + strToken;
					strFinalState = strComponentName + "_" + strToken + "_" + strToken2;
				}
			}
			strAction = strFinalComp + "=" + strFinalState + ";";
			strText.Append(strAction + "\r\n");
		}
		
		// Initialise the sets variables.
		if (bUsingSets){
			int iNumberOfSets = (int) cTranslateMain.m_cSetNames.GetSize();
			for (int setNo = 0; setNo < iNumberOfSets; setNo++){
				NString strFullSetName;
				NString strSetName = GetListElement(cTranslateMain.m_cSetNames,setNo);
				// The set may be an attribute of another set. If so, include the component
				// name in the set name, for each element of the other set.
				int iSetLocation = FindListPosition(cTranslateMain.m_cAttributeSets,strSetName);
				int iParentSetLocation;
				int iSetSuccess = cTranslateMain.m_cSetsToParentSets.Lookup(iSetLocation, iParentSetLocation);
				if (iSetSuccess != 0){
					// This set is an attribute.
					NString strParentSet = GetListElement(cTranslateMain.m_cParentSets, iParentSetLocation);
					// Find the location of the parent set in the normal set list.
					int iParentNameLocation = FindListPosition(cTranslateMain.m_cSetNames,strParentSet);
					// Find the type of the parent set.
					int iParentTypeLocation;
					int iParentTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(iParentNameLocation, iParentTypeLocation);
					if (iParentTypeSuccess > 0){  // The set is an attribute of an element of another set, 
											      // e.g. if set s is an attribute of each element c of set t, so
											      // there would be a ||c:t or []c:t and under it, c_s refers to c's attribute s.
						NString strParentType = GetListElement(cTranslateMain.m_cSetTypes, iParentTypeLocation);
						// Get the elements of the parent set.
						NList<NString, NString>* plParentElements;
						int iElementSuccess = cTranslateMain.m_cSetElements.Lookup(iParentTypeLocation, plParentElements);
						if (iElementSuccess > 0){ 
	/////////// Do something if it is 0 as an error occurred.
							NPosition cParentElementPos;
							cParentElementPos = plParentElements->GetHeadPosition();
							while (cParentElementPos.IsNotNull()){
								NString strCurrentElement = plParentElements->GetNext(cParentElementPos);
								strFullSetName = strCurrentElement + "_" + strSetName;
								strFullSetName = TrimChangeCase(strFullSetName, false);

								NList<NString, NString>* plInitial;
								int iInitialSuccess = cTranslateMain.m_cInitSetElements.Lookup(setNo,plInitial);
								if (iInitialSuccess > 0){
									strText.Append(strFullSetName);
									strText.Append("={");
									NPosition cInitialPos;
									cInitialPos = plInitial->GetHeadPosition();
									int iInitialCounter = 0;
									while (cInitialPos.IsNotNull()){
										NString strInitialValue = plInitial->GetNext(cInitialPos);
										if (iInitialCounter != 0){
											// This is not the first element.
											strText.Append(",");
										}
										strText.Append(strInitialValue);
										iInitialCounter++;
									}
									strText.Append("};\r\n");
								}else{ // No initial values were stored.
									strText.Append(strFullSetName);
									int iSetTypeLocation;
									int iTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(setNo,iSetTypeLocation);
									NString strSetType = GetListElement(cTranslateMain.m_cSetTypes, iSetTypeLocation);
									strSetType = TrimChangeCase(strSetType, true);
									strText.Append("=set{" + strSetType + "}!empty_set;\r\n");
								}

							}
						}
					}else{  // The set is an attribute of a component that is not part of another set,
						    // e.g. if the set was s and it was an attribute of the component c, i.e. c_s.
						strFullSetName = strParentSet + "_" + strSetName;
						strFullSetName = TrimChangeCase(strFullSetName, false);

						NList<NString, NString>* plInitial;
						int iInitialSuccess = cTranslateMain.m_cInitSetElements.Lookup(setNo,plInitial);
						if (iInitialSuccess > 0){
							strText.Append(strFullSetName);
							strText.Append("={");
							NPosition cInitialPos;
							cInitialPos = plInitial->GetHeadPosition();
							int iInitialCounter = 0;
							while (cInitialPos.IsNotNull()){
								NString strInitialValue = plInitial->GetNext(cInitialPos);
								if (iInitialCounter != 0){
									// This is not the first element.
									strText.Append(",");
								}
								strText.Append(strInitialValue);
								iInitialCounter++;
							}
							strText.Append("};\r\n");
						}else{ // No initial values were stored.
							strText.Append(strFullSetName);
							int iSetTypeLocation;
							int iTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(setNo,iSetTypeLocation);
							NString strSetType = GetListElement(cTranslateMain.m_cSetTypes, iSetTypeLocation);
							strSetType = TrimChangeCase(strSetType, true);
							strText.Append("=set{" + strSetType + "}!empty_set;\r\n");
						}
					}
				}else{ // The set is not an attribute.
					strFullSetName = strSetName;
					strFullSetName = TrimChangeCase(strFullSetName, false);

					NList<NString, NString>* plInitial;
					int iInitialSuccess = cTranslateMain.m_cInitSetElements.Lookup(setNo,plInitial);
					if (iInitialSuccess > 0){
						strText.Append(strFullSetName);
						strText.Append("={");
						NPosition cInitialPos;
						cInitialPos = plInitial->GetHeadPosition();
						int iInitialCounter = 0;
						while (cInitialPos.IsNotNull()){
							NString strInitialValue = plInitial->GetNext(cInitialPos);
							if (iInitialCounter != 0){
								// This is not the first element.
								strText.Append(",");
							}
							strText.Append(strInitialValue);
							iInitialCounter++;
						}
						strText.Append("};\r\n");
					}else{ // No initial values were stored.
						strText = strText + strFullSetName;
						int iSetTypeLocation;
						int iTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(setNo,iSetTypeLocation);
						NString strSetType = GetListElement(cTranslateMain.m_cSetTypes, iSetTypeLocation);
						strSetType = TrimChangeCase(strSetType, true);
						strText.Append("=set{" + strSetType + "}!empty_set;\r\n");
					}
				}
			}
		}

		// Initialise the local messages to false.
		NPosition cLocalBooleanPosition2;
		cLocalBooleanPosition2 = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
		while(cLocalBooleanPosition2.IsNotNull()){
			NString strCurrentBool = cTranslateMain.m_cLocalBooleans.GetNext(cLocalBooleanPosition2);
			strCurrentBool = TrimChangeCase(strCurrentBool, false);
			strText.Append(strCurrentBool + "=false;\r\n");
		}

		// Initialise the external output messages to false.
		NPosition cLocalBooleanPosition3;
		cLocalBooleanPosition3 = cTranslateMain.m_cOutputVariables.GetHeadPosition();
		while(cLocalBooleanPosition3.IsNotNull()){
			NString strCurrentBool = cTranslateMain.m_cOutputVariables.GetNext(cLocalBooleanPosition3);
			strCurrentBool = TrimChangeCase(strCurrentBool, false);
			strText.Append(strCurrentBool + "=false;\r\n");
		}
	
		// Initialise the program counters.
		// Initialise the program counters of the top node or nodes and set them to 1.
		CTranslateNode* pcStartNode = cTranslateMain.GetNode(cTranslateMain.m_iStartNode);
		int iRootChildren = pcStartNode->GetNumberOfChildren();
		NList<NString, NString> lRootChildrenPCs;
		for (int i = 0; i < iRootChildren; i++){
			int iRootChild = pcStartNode->GetChildID(i);
			NString strRootChildPC = cTranslateMain.GetPCForNode(iRootChild);
			strText.Append(strRootChildPC);
			strText.Append("=1;\r\n");
			lRootChildrenPCs.AddTail(strRootChildPC);
		}	
		// Initialise any program counters that were included from alternative atomic branching to 1.
		NPosition cInitialPCPos = cTranslateMain.m_lInitialisationPCs.GetHeadPosition();
		while (cInitialPCPos.IsNotNull()){
			NString strInitialisePC = cTranslateMain.m_lInitialisationPCs.GetNext(cInitialPCPos);
			// Check if it was already initialised.
			NPosition cAlreadyInitialisedPos = lRootChildrenPCs.Find(strInitialisePC);
			if (cAlreadyInitialisedPos.IsNull()){
				// It wasn't already initialised.
				strText.Append(strInitialisePC);
				strText.Append("=1;\r\n");
			}
		}
		// Initialise all other program counters to 0.
		for (int i = 1; i < cTranslateMain.m_iHighestProgramCounter + 1; i++){
			NString strPC = "pc";
			strPC.Format(strPC + "%d", i);
			NPosition cPos = lRootChildrenPCs.Find(strPC);
			NPosition cPos2 = cTranslateMain.m_lInitialisationPCs.Find(strPC); 
			if ((cPos.IsNull()) && (cPos2.IsNull())){ // This wasn't already initialised.
				strText.Append(strPC);
				strText.Append("=0;\r\n");
			}
		}
	       		
		if (m_iOptionSelected == 3){
       		for (int i = 1; i < cTranslateMain.m_iHighestProgramCounter + 1; i++){
				NString strPC = "pc";
				strPC.Format(strPC + "%d", i);
				strText.Append(strPC);
				strText.Append("Allowed=false;\r\n");
 			}
 			strText.Append("allThreadsBlocked=false;\r\n");
  		}
	       		
		/* This section writes the transitions section.
		 */
		strText.Append("TRANSITION\r\n[\r\n");
		
		// Get the guard & action for each node.
		int iTransitionNumber = 1;
		NPosition cNodePosition;
		cNodePosition = cAllNodes.GetHeadPosition();

		NString strTransition;
		while(cNodePosition.IsNotNull()){
			int iCurrentNode = cAllNodes.GetNext(cNodePosition);
			NString strGuard;
			int iSuccess = cTranslateMain.m_cNodesToGuards.Lookup(iCurrentNode,strGuard);
			
			if (iSuccess != 0){
				// Write the guard.
				strTransition = "A";
				strTransition.Format(strTransition + "%d", iTransitionNumber);
				strText.Append(strTransition);
			
				// Include the sets guard if it exists.
				CTranslateNode* pcCurrentNode = cTranslateMain.GetNode(iCurrentNode);
				if (pcCurrentNode->RetrieveSetsGuard() != ""){
					strGuard = pcCurrentNode->RetrieveSetsGuard() + " AND " + strGuard;
				}
				strText.Append(":" + strGuard);
				
				// Write the action.
				strText.Append("-->\r\n");
				NList<NString,NString>* plActions;
				int iActionSuccess = cTranslateMain.m_cNodesToActions.Lookup(iCurrentNode, plActions);
				if (iActionSuccess != 0){
					NPosition cActionPosition;
					cActionPosition = plActions->GetHeadPosition();
					while(cActionPosition.IsNotNull()){
						NString strCurrentAction = plActions->GetNext(cActionPosition);
						strText.Append("\t" + strCurrentAction + ";\r\n");
					}
				}
				strText.Append("[]\r\n\r\n");
				iTransitionNumber++;		
			}
		}
		// Failure view information section to be completed.
		
		// Write the transitions that are not associated with any node 
		// (e.g. extra 'NOT' transition for selections).
		NPosition cExtraPosition;
		int iExtraCount = 0;
		cExtraPosition = cTranslateMain.m_lExtraGuards.GetHeadPosition();
		while(cExtraPosition.IsNotNull()){
			// Write the guard.
			NString strExtraGuard = cTranslateMain.m_lExtraGuards.GetNext(cExtraPosition);
			strTransition = "A";
			strTransition.Format(strTransition + "%d", iTransitionNumber);
			strText.Append(strTransition);
			strText.Append(":" + strExtraGuard);
			strText.Append("-->\r\n");

			// Write the action.
			NList<NString,NString>* plExtraActions;
			int iExtraSuccess = cTranslateMain.m_cExtraActions.Lookup(iExtraCount,plExtraActions);
			if (iExtraSuccess != 0){
				NPosition cExtraActionPosition;
				cExtraActionPosition = plExtraActions->GetHeadPosition();
				while(cExtraActionPosition.IsNotNull()){
					NString strExtraAction = plExtraActions->GetNext(cExtraActionPosition);
					strText.Append("\t" + strExtraAction + ";\r\n");
				}
			}
			strText.Append("[]\r\n\r\n");
			iTransitionNumber++;
			iExtraCount++;
		}

		// Write the Else empty transition.
		strTransition = "A";
		strTransition.Format(strTransition + "%d", iTransitionNumber);
		strText.Append(strTransition);
		strText.Append(": ELSE --> \r\n]\r\n\r\n");
		strText.Append("END; % of MODULE\r\n\r\nEND\r\n");

	//	CResultsWindow cResultsDialog;

/*		// Calculate the times taken.
		if (m_bDisplayTimes){
			CFileTime cFinishTime = CFileTime::GetCurrentTime();
			ULONGLONG cStartNumber = cStartTime.GetTime();
			ULONGLONG cTranslateStart = cTranslateStartTime.GetTime();
			ULONGLONG cFinishNumber = cFinishTime.GetTime();
			ULONGLONG cSetStartNumber = cSetParsingStartTime.GetTime();
			ULONGLONG cSetFinishNumber = cSetParsingFinishTime.GetTime();
			ULONGLONG cReadingNumber = cReadingTime.GetTime();
			ULONGLONG cParsingTime;
			ULONGLONG cTranslationTime;
			ULONGLONG cReadingInitialTime;
			ULONGLONG cRunningParserTime;

			// All times are calculated in milliseconds.
			if (bUsingSets){
				ULONGLONG cPauseNumber1 = cPauseTime1.GetTime();
				ULONGLONG cRestartNumber1 = cRestartTime1.GetTime();
				cParsingTime = (cTranslateStart - cStartNumber) / 10000;
				cTranslationTime = (cFinishNumber - cRestartNumber1);
				cTranslationTime = cTranslationTime + (cPauseNumber1 - cTranslateStart);
				cTranslationTime = cTranslationTime / 10000;
				cReadingInitialTime = (cRestartNumber1 - cReadingNumber) / 10000;
				cRunningParserTime = (cSetFinishNumber - cSetStartNumber) / 10000;

			}else{ // Not using sets.
				cParsingTime = (cTranslateStart - cStartNumber) / 10000;
				cTranslationTime = (cFinishNumber - cTranslateStart) / 10000;
			}

			// Put the times into strings.
			NString strParsingTime = "";
			strParsingTime.Format(strParsingTime + "%d"), cParsingTime;
			NString strTranslationTime = "";
			strTranslationTime.Format(strTranslationTime + "%d"), cTranslationTime;
			
			if (bUsingSets){
				strTranslationTime.Append("; Time for reading initialisation file: ");
				strTranslationTime.Format(strTranslationTime + "%d"), cReadingInitialTime;
				strParsingTime.Append("; Time for parsing set info: ");
				strParsingTime.Format(strParsingTime + "%d"), cRunningParserTime;
			}

			cResultsDialog.SetTimes(strParsingTime, strTranslationTime);
		}
*/

		// Get the details about the BT if it is a randomly created BT.
	//	if (m_bTranslateWithRandomBT){
	//		NString strNodesNumber = "";
	//		strNodesNumber.Format(strNodesNumber + "%d"), pcRandom->GetNumberOfNodes();
	//		NString strBranchesNumber = "";
	//		strBranchesNumber.Format(strBranchesNumber + "%d"), pcRandom->GetNumberOfBranches();
		//	NString strReversionsNumber = "";
	//		strReversionsNumber.Format(strReversionsNumber + "%d"), pcRandom->GetNumberOfReversions();
	//		NString strMacrosNumber = "";
		//	strMacrosNumber.Format(strMacrosNumber + "%d"), pcRandom->GetNumberOfMacros();
	//		NString strThreadKillNumber = "";
	//		strThreadKillNumber.Format(strThreadKillNumber + "%d"), pcRandom->GetNumberOfThreadKills();
			
	//		cResultsDialog.SetRandomInformation(strNodesNumber, strBranchesNumber, 
	//			strReversionsNumber, strMacrosNumber, strThreadKillNumber);
	//	}

		// Show the translation.
	//	cResultsDialog.SetResultsText(strText);
	//	cResultsDialog.DoModal();	
		
		}
	}catch (CTranslateException salEx){
//		if (salEx.GetMessage() != ""){
//			AfxMessageBox(salEx.GetMessage()); 

//		}
		strText = salEx.GetMessage();
		bError = true;
	}

	// Free all the memory allocated.
	NPosition cBlockMapPosition = cTranslateMain.m_mNodesToAtomicBlocks.GetStartPosition();
	NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*> lBlocksToDelete;
	while(cBlockMapPosition.IsNotNull()){
		NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>* pcBlocks;
		int iID;
		cTranslateMain.m_mNodesToAtomicBlocks.GetNextAssoc(cBlockMapPosition,iID,pcBlocks);
		NPosition cBlockPos = pcBlocks->GetHeadPosition();
		while (cBlockPos.IsNotNull()){
			CTranslateAtomicBlock* pcCurrentBlock = pcBlocks->GetNext(cBlockPos);
			if (lBlocksToDelete.Find(pcCurrentBlock).IsNull()){
				lBlocksToDelete.AddTail(pcCurrentBlock);
			}
		}
		delete pcBlocks;
		pcBlocks = NULL;
	}
	cTranslateMain.m_mNodesToAtomicBlocks.RemoveAll();
	// Delete all the atomic blocks.
	// It was necessary to first put them in a list because several nodes may contain the 
	// same block in their list, so if the blocks were deleted in the earlier while loop,
	// there would be problems when it attempts to delete a block that was already deleted.
	NPosition cBlockPos = lBlocksToDelete.GetHeadPosition();
	while (cBlockPos.IsNotNull()){
		CTranslateAtomicBlock* pcCurrentBlock = lBlocksToDelete.GetNext(cBlockPos);
		delete pcCurrentBlock;
		pcCurrentBlock = NULL;
	}
	lBlocksToDelete.RemoveAll();

	NPosition cNodePosition = cTranslateMain.m_mTranslateNodes.GetStartPosition();
	while(cNodePosition.IsNotNull()){
		CTranslateNode* pcTheNode;
		int iID;
		cTranslateMain.m_mTranslateNodes.GetNextAssoc(cNodePosition,iID,pcTheNode);
		delete pcTheNode;
		pcTheNode = NULL;
	}
	cTranslateMain.m_mTranslateNodes.RemoveAll();

	NPosition cSetPosition = cTranslateMain.m_cSetElements.GetStartPosition();
	while(cSetPosition.IsNotNull()){
		NList<NString, NString>* plList;
		int iSetNumber;
		cTranslateMain.m_cSetElements.GetNextAssoc(cSetPosition,iSetNumber,plList);
		delete plList;
		plList = NULL;
	}
	cTranslateMain.m_cSetElements.RemoveAll();

	NPosition cSetInitPosition = cTranslateMain.m_cInitSetElements.GetStartPosition();
	while(cSetInitPosition.IsNotNull()){
		NList<NString, NString>* plList;
		int iSetNumber;
		cTranslateMain.m_cInitSetElements.GetNextAssoc(cSetInitPosition,iSetNumber,plList);
		delete plList;
		plList = NULL;
	}
	cTranslateMain.m_cInitSetElements.RemoveAll();

	NPosition cStatePosition = cTranslateMain.m_cLocalStates.GetStartPosition();
	while(cStatePosition.IsNotNull()){
		NList<NString,NString>* plStates;
		int iLocation;
		cTranslateMain.m_cLocalStates.GetNextAssoc(cStatePosition,iLocation,plStates);
		delete plStates;
		plStates = NULL;
	}
	cTranslateMain.m_cLocalStates.RemoveAll();
	cTranslateMain.m_lAtomicNodes.RemoveAll();
	NPosition cActionPosition = cTranslateMain.m_cNodesToActions.GetStartPosition();
	while(cActionPosition.IsNotNull()){
		NList<NString,NString>* plStates;
		int iLocation;
		cTranslateMain.m_cNodesToActions.GetNextAssoc(cActionPosition,iLocation,plStates);
		delete plStates;
		plStates = NULL;
	}
	cTranslateMain.m_cNodesToActions.RemoveAll();
	NPosition cExtraPosition = cTranslateMain.m_cExtraActions.GetStartPosition();
	while(cExtraPosition.IsNotNull()){
		NList<NString,NString>* plStates;
		int iLocation;
		cTranslateMain.m_cExtraActions.GetNextAssoc(cExtraPosition,iLocation,plStates);
		delete plStates;
		plStates = NULL;
	}
	cTranslateMain.m_cExtraActions.RemoveAll();
	NPosition cAtomicActionPos = cTranslateMain.m_cAtomicNodesToActions.GetStartPosition();
	while(cAtomicActionPos.IsNotNull()){
		NList<NString,NString>* plStates;
		int iLocation;
		cTranslateMain.m_cAtomicNodesToActions.GetNextAssoc(cAtomicActionPos,iLocation,plStates);
		delete plStates;
		plStates = NULL;
	}
	cTranslateMain.m_cAtomicNodesToActions.RemoveAll();
	NPosition cInternalPos = cTranslateMain.m_cMatchingInternal.GetStartPosition();
	while(cInternalPos.IsNotNull()){
		NList<int,int>* plInputs;
		int iOutput;
		cTranslateMain.m_cMatchingInternal.GetNextAssoc(cInternalPos,iOutput,plInputs);
		delete plInputs;
		plInputs = NULL;
	}
	cTranslateMain.m_cMatchingInternal.RemoveAll();

	// Free the memory used for the Translation Steps.
	NPosition cStepPosition = cTranslateMain.m_lSteps.GetHeadPosition();
	while(cStepPosition.IsNotNull()){
		CTranslateStep* pcCurrentStep;
		pcCurrentStep = cTranslateMain.m_lSteps.GetNext(cStepPosition);
		delete pcCurrentStep;
		pcCurrentStep = NULL;
	}
	cTranslateMain.m_lSteps.RemoveAll();
	
	delete pcRules;
		
//	if (!bError){ // Delete only if it wasn't already deleted before due to a parsing or other error.
	//	if (m_bTranslateWithRandomBT){
		//	pcRandom->DeleteNodes();
		//	delete pcRandom;
		//	pcRandom = NULL;
//		}
//	}
	return strText; // This is the final SAL translation or an error message.
	
}

void CTranslateSALMain::MakeLongIDs(int iRootNode){
	CTranslateNode* pcRootNode = GetNode(iRootNode);
	NString strID;

	if (iRootNode == 1){
		strID = "0";
		pcRootNode->SetStringID(strID);
	}else{
		strID = pcRootNode->GetStringID();
	}
	for (int i = 0; i < pcRootNode->GetNumberOfChildren(); i++){
		int iChild = pcRootNode->GetChildID(i);
		CTranslateNode* pcChild = GetNode(iChild);
		NString strChildID = "";
		strChildID.Format(strID + "%d", i);
		pcChild->SetStringID(strChildID);
		MakeLongIDs(iChild);
	}
}

/** Add a boolean input variable. This variable will be later written to
 *  the INPUT section of the SAL module.
 *  @param name  The name of the variable.
 */
void CTranslateSALMain::AddInputVariable(NString strName)
{
	NPosition cPosition = m_cInputVariables.Find(strName);
	if (cPosition.IsNull()){
		m_cInputVariables.AddTail(strName);
	}
}	

	/** Add a boolean output variable. This variable will be later written to
	 *  the OUTPUT section of the SAL module.
	 *  @param name  The name of the variable.
	 */
void CTranslateSALMain::AddOutputVariable(NString strName){
	NPosition cPosition = m_cOutputVariables.Find(strName);
	if (cPosition.IsNull()){
		m_cOutputVariables.AddTail(strName);
	}
}
	
	/** Add a local boolean variable. This variable will be later written to
	 *  the LOCAL section of the SAL module.
	 *  @param name  The name of the variable.
	 */
void CTranslateSALMain::AddLocalBoolean(NString strName){
	NPosition cPosition = m_cLocalBooleans.Find(strName);
	if (cPosition.IsNull()){
		m_cLocalBooleans.AddTail(strName);
	}
}	

	/** Add an Integer attribute. This variable will be later 
	 *  declared as an Integer type in the SAL code.
	 */ 
//////////// This function appears to be deprecated. Check this.
void CTranslateSALMain::AddIntegerAttribute(NString strName){
	NPosition cPosition = m_cIntegerAttributes.Find(strName);
	if (cPosition.IsNull()){
		m_cIntegerAttributes.AddTail(strName);
	}
}

	/** Add a local variable (not a boolean) and its state. 
	 *  If a variable with that name already exists, the state will be added to
	 *  its list of states. This variable will be later written to the LOCAL 
	 *  section of the SAL module, with a defined TYPE. 
	 *
	 *  @param name  The name of the variable,
	 *  @param state  The name of the state of the variable.
	 */
void CTranslateSALMain::AddLocalVariable(NString strName, NString strState){	
	int iLocation = FindListPosition(m_cLocalComponents,strName);
	if (iLocation == -1){
		NList<NString,NString> *plStates = new NList<NString,NString>;
		plStates->AddTail(strState);
		m_cLocalComponents.AddTail(strName);
		iLocation = FindListPosition(m_cLocalComponents,strName);
		m_cLocalStates.SetAt(iLocation,plStates);
	}else{
		NList<NString,NString> *plStates;
		int iSuccess = m_cLocalStates.Lookup(iLocation,plStates);
		if (plStates->Find(strState).IsNull()){
			plStates->AddTail(strState);
			m_cLocalStates.SetAt(iLocation,plStates);
		}
	}
}	

/** Creates a link between an internal output node and the list of
 *  matching internal input nodes. The information is stored in a 
 *  map variable.
 *  @param iOutputNode   The ID of the output node,
 *  @param lInputNodes   The list of input nodes.
 */
void CTranslateSALMain::AddInternalMsgAssociation(int iOutputNode, NList<int, int>* plInputNodes){
	m_cMatchingInternal.SetAt(iOutputNode, plInputNodes);
}

/** Returns a list of the matching internal input nodes for a given
 *  internal output node.
 *  @param iOutputNode   The ID of the output node,
 *  @return   The list of ID's of input nodes.
 */
NList<int, int>* CTranslateSALMain::GetInternalMsgAssociation(int iOutputNode){
	NList<int, int>* plInputNodes;
	int iSuccess = m_cMatchingInternal.Lookup(iOutputNode, plInputNodes);
	return plInputNodes;
}

int CTranslateSALMain::FindListPosition(NList<NString, NString>& cList, NString strValue)
{
	NPosition cPosition = cList.GetHeadPosition();
	int iCounter = -1;
	int iIndex = -1;
	while(cPosition.IsNotNull()){
		NString strCurrentString = cList.GetNext(cPosition);
		iCounter++;
		if (strCurrentString == strValue){
			iIndex = iCounter;
		}
	}
	return iIndex;
}


NString CTranslateSALMain::GetListElement(NList<NString, NString>& cList, int iPosition)
{
	int iCounter = 0;
	NString strElement;
	NPosition cPosition = cList.GetHeadPosition();
	while(cPosition.IsNotNull()){
		NString strCurrentString = cList.GetNext(cPosition);
		if (iCounter == iPosition){
			strElement = strCurrentString;
		}
		iCounter++;
	}
	return strElement;
}

void CTranslateSALMain::RemoveFromList(NList<NString, NString>& cList, int iIndex)
{
	NPosition cPosition = cList.GetHeadPosition();
	int iCounter = 0;
	while(cPosition.IsNotNull()){
		if (iCounter == iIndex){
			// This is the element to remove.
			cList.RemoveAt(cPosition);
			cPosition.SetIsNull(); // To get out of the loop.
		}else{
			NString strCurrentString = cList.GetNext(cPosition);
			iCounter++;
		}
	}
}

	/** Add a guard for a transition, associating it with a node.
	 *  @param  n   The node the guard applies to,
	 *  @param  guard  The transition guard as a string.
	 */
void CTranslateSALMain::AddNodeGuard(int iNode, NString strGuard){
	m_cNodesToGuards.SetAt(iNode,strGuard);
}
	
	/** Add a list of actions for a transition, associating it with a node.
	 *  @param  n   The node the actions apply to,
	 *  @param  actions The action string list.
	 */
void CTranslateSALMain::AddNodeAction(int iNode, NList<NString, NString>* plActions){
	RemoveAssignmentRepeats(*plActions);
	// Check if there is already a list stored for this node.
	NList<NString, NString>* plCurrentActions;
	int iSuccess = m_cNodesToActions.Lookup(iNode, plCurrentActions);
	if (iSuccess != 0){
		if (plActions != plCurrentActions){ // If this is a new list being added.
			delete plCurrentActions; // Free memory.
			plCurrentActions = NULL;
		}
	}
	m_cNodesToActions.SetAt(iNode, plActions);
}

void CTranslateSALMain::RemoveNodeTransition(int iNode){
	m_cNodesToGuards.RemoveKey(iNode);
	m_cNodesToActions.RemoveKey(iNode);
}

	/** Add an extra action for the transition already associated with a node.
	 *  @param  n   The node the transition is associated with,
	 *  @param  action  The transition action as a string.
	 */
void CTranslateSALMain::AddExtraNodeAction(int iNode, NString strAction){
	NList<NString,NString>* plCurrentActions;
	if (UsingViews()){
		// This section to be completed.
	}else{
		if (IsAtomic(iNode)){
			// It must be part of an atomic block.	
			NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcBlocks;
			pcBlocks = GetAtomicBlocks(iNode);
			NPosition cBlockPos = pcBlocks->GetHeadPosition();
			CTranslateAtomicBlock* pcCurrentBlock;
			while (cBlockPos.IsNotNull()){
				pcCurrentBlock = pcBlocks->GetNext(cBlockPos);
				int iAtomicEnd = pcCurrentBlock->GetBottomNode();
				int iSuccess = m_cNodesToActions.Lookup(iAtomicEnd, plCurrentActions);
				if (iSuccess == 0){ // The block hasn't been fully translated yet.
					int iSuccess2 = m_cAtomicNodesToActions.Lookup(iNode, plCurrentActions);
					if (iSuccess2 == 0){ // The node hasn't been translated yet.
						plCurrentActions = new NList<NString, NString>;
					}
					plCurrentActions->AddTail(strAction);
					m_cAtomicNodesToActions.SetAt(iNode, plCurrentActions);	
				}else{ // The block has been translated.
					plCurrentActions->AddTail(strAction);
					m_cNodesToActions.SetAt(iAtomicEnd, plCurrentActions);	
				}
			}
			

		}else{   // It is not part of an atomic block.
			int iSuccess = m_cNodesToActions.Lookup(iNode, plCurrentActions);
			if (iSuccess > 0){  // Ignore the node if this is one of the top nodes of the tree.
				plCurrentActions->AddTail(strAction);
				m_cNodesToActions.SetAt(iNode, plCurrentActions);
			}
		}
	}	
}

	/** Add a guard and a list of actions for a transition that does not apply 
	 *  to any node, e.g. negative selection transitions.
	 *
	 *  @param  guard  The transition guard as a string.
	 *  @param  actions  The transitions actions as a list of strings.
	 */
int CTranslateSALMain::AddExtraTransition(NString strGuard, NList<NString,NString>* plActions){
	int iPosition = -1;
	RemoveAssignmentRepeats(*plActions);
	iPosition = FindListPosition(m_lExtraGuards, strGuard);
	if (iPosition == -1){ // The guard was not already there so add it.
		m_lExtraGuards.AddTail(strGuard);
		iPosition = FindListPosition(m_lExtraGuards, strGuard);
	}else{ // The guard was there so delete the old action list.
		NList<NString, NString>* plOldActions;
		int iSuccess = m_cExtraActions.Lookup(iPosition, plOldActions);
		if (iSuccess != 0){ // An old list was there.
			delete plOldActions;
			plOldActions = NULL;
		}
	}
	m_cExtraActions.SetAt(iPosition, plActions);
	return iPosition;
}

// View related extra transition methods to be completed.

	/** Increase the range of a program counter to the given value.
	 *  @param  pc  The program counter name as a string,
	 *  @param  value  The integer value.
	 */
void CTranslateSALMain::AddPCRange(int iProgramCounter, int iValue){
	int iHighestValue;
	int iSuccess = m_cPCRanges.Lookup(iProgramCounter, iHighestValue);
	if (iValue > iHighestValue){
		m_cPCRanges.SetAt(iProgramCounter, iValue);
	}
}
	
	/** Returns a string representing the name of a new unused program counter.
	 *  @return  The pc name.
	 */
NString CTranslateSALMain::GetNewProgramCounter(){
	m_iHighestProgramCounter++;
	NString strNewProgramCounter = "pc";
	strNewProgramCounter.Format(strNewProgramCounter + "%d", m_iHighestProgramCounter);
	m_cPCRanges.SetAt(m_iHighestProgramCounter, 2);
	return strNewProgramCounter;
}
	
	/** Returns the name of the given node's program counter.
	 *  (This is the pc which allows the node to execute).
	 *  @param  n  The node,
	 *  @return The name of the program counter.
	 */
NString CTranslateSALMain::GetPCForNode(int iNode){
	NString strProgramCounter = "";
	int iProgramCounter;
	int iSuccess = m_cNodesToPCs.Lookup(iNode, iProgramCounter);
	if (iSuccess != -1){
		strProgramCounter = "pc";
		strProgramCounter.Format(strProgramCounter+"%d", iProgramCounter);
	}
	return strProgramCounter;
}

// Get the pc for the given node.
// Note that this differs from GetPCForNode(iNode) since that function
// returns a string name.
int CTranslateSALMain::GetPC(int iNode){
	int iProgramCounter;
	int iSuccess = m_cNodesToPCs.Lookup(iNode, iProgramCounter);
	return iProgramCounter;
}
	
/** Returns the value of the given node's program counter in the node's guard.
	 *  (This is the value of the pc which allows the node to execute).
	 *  @param  n  The node,
	 *  @return The integer value of the program counter.
	 */
int CTranslateSALMain::GetPCValueForNode(int iNode){
	int iProgramCounterValue;
	int iSuccess = m_cNodesToPCValues.Lookup(iNode, iProgramCounterValue);
	return iProgramCounterValue;
}

void CTranslateSALMain::SetPCValueForNode(int iNode, int iPCValue){
	m_cNodesToPCValues.SetAt(iNode, iPCValue);
}
	
	/** Returns the guard for the given node.
	 *  @return The guard.
	 */
NString CTranslateSALMain::GetGuard(int iNode){
	NString strGuard = "";
	int iSuccess = m_cNodesToGuards.Lookup(iNode,strGuard);
	return strGuard;
}
	
	/** Returns the actions for the given node.
	 *  @return  A list of strings representing each action.
	 */
NList<NString, NString>* CTranslateSALMain::GetActions(int iNode){
	NList<NString, NString>* plActions;
	int iSuccess = m_cNodesToActions.Lookup(iNode,plActions);
	return plActions;
}
	
// RemovePCUpdates method to be completed (only needed for synchronisation).

	/** Returns a list of the program counters of threads created at or below
	 *  the given node.
	 *  @param n  The node,
	 *  @return  A list of the names of the program counters.
	 */
NList<NString, NString>* CTranslateSALMain::FindThreadsToKill(int iNode, bool bCallingForReversion){
	NList<NString, NString>* plThreadsToKill = new NList<NString, NString>;
	int iPC;
	int iSuccess = m_cNodesToPCs.Lookup(iNode, iPC);
	if (iSuccess != 0){
		int iNextHighestPC = FindNextHighestPC(iNode);
		// Check if this node should be starting some threads (its immediate children's threads).
		// This is only if this method was called in order to do a reversion. If it was called
		// in order to do a thread kill then all sub-threads should be killed, even the immediate
		// children's ones.
		CTranslateNode* pcNode = GetNode(iNode);
		NList<int, int> lDoNotKillThreads;
		if (bCallingForReversion){
			int iChildrenNumber = pcNode->GetNumberOfChildren();
			int iChild;
			int iSuccess2;
			int iChildPC;
			for (int j = 0; j < iChildrenNumber; j++){
				iChild = pcNode->GetChildID(j);
				iSuccess2 = m_cNodesToPCs.Lookup(iChild, iChildPC);
				lDoNotKillThreads.AddTail(iChildPC);
			}
		}

		// Create the list of threads to kill which does not include the ones identified above.
		for (int i = iPC; i < iNextHighestPC; i++){
			NPosition cPos = lDoNotKillThreads.Find(i);
			if (cPos.IsNull()){ // Kill this thread.
				NString strCurrentPC = "pc";
				strCurrentPC.Format(strCurrentPC + "%d", i);
				if (bCallingForReversion){
					strCurrentPC.Append("'=0");
				}
				plThreadsToKill->AddTail(strCurrentPC);
			}
		}
	}
	return plThreadsToKill;
}

int CTranslateSALMain::FindNextHighestPC(int iNode){
	int iPC;
	int iSuccess = m_cNodesToPCs.Lookup(iNode, iPC);
	if (iSuccess != 0){
		// Find the first ancestor of this node that has a different pc.
		CTranslateNode* pcNode = GetNode(iNode);
		CTranslateNode* pcParent;
		int iParent = pcNode->GetParent();
		pcParent = GetNode(iParent);
		int iParentPC;
		int iSuccess2 = m_cNodesToPCs.Lookup(iParent, iParentPC);
		while((iSuccess2 != 0) && (iParentPC == iPC)){
			// Loop until the ancestor has a different PC or the root node is reached (iSuccess=0).
			iParent = pcParent->GetParent();
			pcParent = GetNode(iParent);
			iSuccess2 = m_cNodesToPCs.Lookup(iParent, iParentPC);
		}
		
		// Try to find the next branch on the right side of the current branch.
		int iChildrenSize = pcParent->GetNumberOfChildren();
		int iNextBranch = 0;
		int iChildPC;
		for (int i = 0; i < iChildrenSize; i++){
			int iChild = pcParent->GetChildID(i);
			int iSuccess3 = m_cNodesToPCs.Lookup(iChild, iChildPC);
			// Each child should have a PC so there's no need to check iSuccess3.
			if (iChildPC == iPC){  // This is the current branch.
				iNextBranch = i + 1;
			}
		}
		if (iNextBranch < iChildrenSize){
			// The next branch is a normal branch, so get its PC value.
			int iNextHighestPC;
			int iNextChild = pcParent->GetChildID(iNextBranch);
			int iSuccess4 = m_cNodesToPCs.Lookup(iNextChild, iNextHighestPC);
			return iNextHighestPC;

		}else{
			// The "next" branch doesn't exist, so keep searching the tree.
			// (Repeat everything for the ancestor node).
			int iNextHighestPC = FindNextHighestPC(iParent);
			return iNextHighestPC;
		}

	}else{
		// This is the root node.
		return m_iHighestProgramCounter + 1;
	}
}


	/** Returns true is a node is atomic, false otherwise.
	 *  This is different to using GSEDataManager or TranslateNode.IsNodeAtomic()
	 *  to check if a node is atomic, since this counts a node as atomic
	 *  even if it is the parent node of an atomic transition.
	 *  @param iNode  the node to test.
	 */
bool CTranslateSALMain::IsAtomic(int iNode){
	NPosition cAtomicPosition;
	cAtomicPosition = m_lAtomicNodes.Find(iNode);
	if (cAtomicPosition.IsNotNull()){
		return true;
	}else{
		return false;
	}
}

	/** Returns the atomic block that the given node belongs to.
	 *  @param iNode  the node ID,
	 *  @return the set of AtomicBlock objects the node belongs to.
	 */
NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* CTranslateSALMain::GetAtomicBlocks(int iNode){	
	NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcBlocks;
	int iSuccess = m_mNodesToAtomicBlocks.Lookup(iNode, pcBlocks);
	if (iSuccess == 0){
		pcBlocks = NULL;
	}
	return pcBlocks;
}

/** Add an atomic block to the set of atomic blocks that are associated
 *  with the given node.
 *  @param  iNode  the node ID,
 *			pcAtomicBlock  a pointer to the atomic block to be added.
 */
void CTranslateSALMain::SetAtomicBlock(int iNode, CTranslateAtomicBlock* pcAtomicBlock){
	NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcBlocks;
	int iSuccess = m_mNodesToAtomicBlocks.Lookup(iNode, pcBlocks);
	if (iSuccess == 0){
		pcBlocks = new NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>;
		m_mNodesToAtomicBlocks.SetAt(iNode, pcBlocks);
		m_lAtomicNodes.AddTail(iNode);
	}
	pcBlocks->AddTail(pcAtomicBlock);
}

	/** Add an atomic guard. 
	 *  @param  n   The node the guard applies to,
	 *  @param  guard  The transition guard as a string.
	 */
void CTranslateSALMain::AddAtomicGuard(int iNode, NString strGuard){
	// Store the new guard with the given node.
	m_cAtomicNodesToGuards.SetAt(iNode, strGuard);
}

	/** Add an atomic action list. 
	 *  @param  n   The node the guard applies to,
	 *  @param  actions  The transition actions as a list.
	 */
void CTranslateSALMain::AddAtomicActions(int iNode, NList<NString, NString>* plActions){
	NList<NString, NString>* plCurrentActions;
	int iSuccess = m_cAtomicNodesToActions.Lookup(iNode, plCurrentActions);
	if (iSuccess != 0){ // There are already some actions associated with this node.
		// Copy all the current actions to the new list.
		NPosition cListPos;
		cListPos = plCurrentActions->GetHeadPosition();
		while (cListPos.IsNotNull()){
			NString strAction = plCurrentActions->GetNext(cListPos);
			plActions->AddTail(strAction);
		}
		delete plCurrentActions;
		plCurrentActions = NULL;
	}
	// Store the new actions with the given node.
	m_cAtomicNodesToActions.SetAt(iNode, plActions);
}
	
	/** Returns the atomic guard for the given node.
	 *  @return The guard.
	 */
NString CTranslateSALMain::GetAtomicGuard(int iNode){		
	NString strGuard = "";
	int iSuccess = m_cAtomicNodesToGuards.Lookup(iNode, strGuard);
	return strGuard;
}
	
	/** Returns the atomic actions for the given node.
	 *  @return  A list of strings representing each action.
	 */
NList<NString, NString>* CTranslateSALMain::GetAtomicActions(int iNode){
	NList<NString, NString>* plActions;
	int iSuccess = m_cAtomicNodesToActions.Lookup(iNode, plActions);
	return plActions;
}

// Assigns program counter names and values and ID's to each node that
// is a descendent of the given node (excludes the given node).
// Parameter:  iRootNode = the ID of the root node of the sub-tree.
void CTranslateSALMain::CreateIDValues(int iRootNode){
	int iParentNode;
	int iParentPCValue, iCurrentPCValue;
	int iParentPC, iNewProgramCounter;
	NString strCurrentID;
	NList<int, int> cAllNodes;
	bool bUsedPC1 = false; // Records whether pc1 was used yet.
	
	CTranslateNode* pcRootNode = GetNode(iRootNode);
	GetDescendents(cAllNodes, iRootNode);
	NPosition cNodePosition;
	cNodePosition = cAllNodes.GetHeadPosition();
	while(cNodePosition.IsNotNull()){  // For each node.
		int iCurrentNode = cAllNodes.GetNext(cNodePosition);
		CTranslateNode* pcCurrentNode = GetNode(iCurrentNode);
		// Get the information about the parent node.
		iParentNode = pcCurrentNode->GetParent();
		CTranslateNode* pcParentNode = GetNode(iParentNode);
		int iSuccess = m_cNodesToPCs.Lookup(iParentNode, iParentPC);
		if (iSuccess == 0){
			iParentPC = 1;
		}
		iSuccess = m_cNodesToPCValues.Lookup(iParentNode, iParentPCValue);
		if (iSuccess == 0){
			iParentPCValue = 0;
		}
		iSuccess = m_cNodesToIDs.Lookup(iParentNode,strCurrentID);	
		if (iSuccess == 0){
			strCurrentID = "0";
		}
		int iSiblingNumber = pcCurrentNode->GetSiblingNumber();
		// Calculate the information for the node.
		// Atomic branching nodes are handled as normal branching nodes for pc's.
		if ((pcCurrentNode->IsNodeAtomic() == true) && (iSiblingNumber == 0)){  
			// The parent node and this node are part of an atomic block.
			
			// Set the program counter and value to be the same as the parent.	
			m_cNodesToPCs.SetAt(iCurrentNode, iParentPC);
			m_cNodesToPCValues.SetAt(iCurrentNode, iParentPCValue);
			// Set the ID to be an extension of the parent node's ID.
			strCurrentID.Format(strCurrentID + "%d", 0);	
			m_cNodesToIDs.SetAt(iCurrentNode, strCurrentID);

			// Increase the highest pc count if this is the first time pc1 was used.
			if (bUsedPC1 == false){
				bUsedPC1 = true;
				m_iHighestProgramCounter++; // Increase it to 2.
			}

		}else{  // The node is either not part of an atomic block or it is the top node of an atomic block.
			if (iSiblingNumber == 0){  // This is a single node.
				// Set the ID to be an extension of the parent node's ID.
				strCurrentID.Format(strCurrentID + "%d", 0);	
				m_cNodesToIDs.SetAt(iCurrentNode, strCurrentID);

				// Set the program counter to be the same as the parent node, with a value increased by 1.
				m_cNodesToPCs.SetAt(iCurrentNode, iParentPC);
				iCurrentPCValue = iParentPCValue + 1;
				m_cNodesToPCValues.SetAt(iCurrentNode, iCurrentPCValue);
				m_cPCRanges.SetAt(iParentPC, (iCurrentPCValue + 1));

				// Increase the highest pc count if this is the first time pc1 was used.
				if (bUsedPC1 == false){
					bUsedPC1 = true;
					m_iHighestProgramCounter++; // Increase it to 2.
				}
			}else{  // It is a branching node.
				m_iHighestProgramCounter++;
				bUsedPC1 = true;
				iNewProgramCounter = m_iHighestProgramCounter;
				m_cPCRanges.SetAt(iNewProgramCounter, 2);
				m_cNodesToPCs.SetAt(iCurrentNode, iNewProgramCounter);
				m_cNodesToPCValues.SetAt(iCurrentNode, 1);

				// Iterate through this node and its siblings.
				for (int i = 0; i <= iSiblingNumber; i++){
					int iSiblingNode = pcParentNode->GetChildID(i);
					NString strSiblingID;
					int iSuccess = m_cNodesToIDs.Lookup(iSiblingNode,strSiblingID);
					if (iSuccess == 0){  // If this node hasn't already been assigned an ID by a sibling.
						int iSuccess2 = m_cNodesToIDs.Lookup(iParentNode,strCurrentID);
						if (iSuccess2 == 0){
							strCurrentID = "0";
						}
						strCurrentID.Format(strCurrentID + "%d", i);	
						m_cNodesToIDs.SetAt(iSiblingNode, strCurrentID);
					}
				}

				// Map this new PC to the ID of this node.
				m_lBranchingIDs.AddTail(strCurrentID);
				int iIDPosition = FindListPosition(m_lBranchingIDs,strCurrentID);
				m_cBranchingPCs.SetAt(iIDPosition,iNewProgramCounter);
			}
		}
	}
}

	/** Adjust the given string so that it contains no spaces and starts with
	 *  either a capital or simple letter as requested.
	 *  @param  s   The string,
	 *  @param  upperCase  true if the first letter should be upper-case, false if lower-case.
	 */
NString CTranslateSALMain::TrimChangeCase(NString strName, bool bToUpperCase){
	// Replace white spaces between words with underscores.
	strName.Trim();
//	strName.Trim("");
	strName.Replace(" ","_");
	strName.Replace("-","_");
	if (strName.Left(4) != "NOT("){
	//	strName.Replace("("),_T("_");
//		strName.Replace(")"),_T(""));  ///// This doesn't work because then NOT(something's won't be done right.
	
		// Change the first letter into upper or lower case as specified.
		NString strFirstLetter = strName.Left(1);
		if (bToUpperCase == true){
			strFirstLetter = strFirstLetter.MakeUpper();
		}else{
			strFirstLetter = strFirstLetter.MakeLower();
		}
		int iLength = strName.GetLength();
		NString strTemp = strName.Mid(1,iLength);
		strName = strFirstLetter + strTemp;
	}
	return strName;
}
	
bool CTranslateSALMain::UsingViews(){
	return m_bTranslateWithViews;
}
bool CTranslateSALMain::UsingRandomBT(){
	return m_bTranslateWithRandomBT;
}
bool CTranslateSALMain::ShowTimes(){
	return m_bDisplayTimes;
}

	/** Removes repeated assignment statements from a set of action updates.
	 *  If a variable is updated to two or more different states, the last state is used
	 *  and the rest of the updates are removed.
	 *  @param list  a list of Strings of transition update statements.
	 */
void CTranslateSALMain::RemoveAssignmentRepeats(NList<NString, NString>& lAssignments){
		/* If the actions include "allThreadsBlocked", then set it to true.
		 * This is because if there was a < > node and a > < node in the same atomic block, 
		 * the allThreadsBlocked should be set to true for the output message.
		 */
		int iNoOfBlockedTrue = 0;
		int iNoOfBlockedFalse = 0;
		NPosition cListPosition = lAssignments.GetHeadPosition();
		while (cListPosition.IsNotNull()){ 
			NString strCurrent = lAssignments.GetNext(cListPosition);
			if (strCurrent == "allThreadsBlocked'=true"){
				iNoOfBlockedTrue++;
			}else if (strCurrent == "allThreadsBlocked'=false"){
				iNoOfBlockedFalse++;
			}
		}
		if ((iNoOfBlockedTrue > 0) && (iNoOfBlockedFalse > 0)){
			NPosition cLocation;
			cLocation = lAssignments.Find("allThreadsBlocked'=false");
			if (cLocation.IsNotNull()){
				lAssignments.RemoveAt(cLocation);
			}
		}
		
		// Remove the rest of the repeated statements.
		NList<NString, NString> lFirstParts;
		cListPosition = lAssignments.GetHeadPosition();
		while (cListPosition.IsNotNull()){
			NString strCurrent = lAssignments.GetNext(cListPosition);
			int iPos = 0;
			NString strToken = strCurrent.Tokenize("'=",iPos);

			int iFirstListPosition = FindListPosition(lFirstParts, strToken);
			if (iFirstListPosition != -1){  
				// Another assignment with the same component exists.
				RemoveFromList(lAssignments, iFirstListPosition);
				RemoveFromList(lFirstParts, iFirstListPosition);
			}
			lFirstParts.AddTail(strToken);
		}
}

/** Returns the type of translation currently selected by the user.
	 */
int CTranslateSALMain::GetTranslationType()
{
	return m_iOptionSelected;
}

	/** Removes repeated updates of internal message variables, 
	 *  where the variable is updated to both true and false. In this
	 *  case, the update to true is kept, and the updates to false are 
	 *  removed.
	 *  @param updates The list of Strings of update statements to check,
	 *  @param messageNames The list of the names of the messages involved in the updates.
	 */
void CTranslateSALMain::RemoveMessageConflicts(NList<NString, NString>& lUpdates, NList<NString, NString>& lMessageNames){
	NString strMessage;
	bool bContainsFalseMsg;
	NPosition cMessagePosition;
	cMessagePosition = lMessageNames.GetHeadPosition();
	while (cMessagePosition.IsNotNull()){
		strMessage = lMessageNames.GetNext(cMessagePosition);
		if (lUpdates.Find(strMessage + "'=true").IsNotNull()){
			NPosition cMsgPosition;
			cMsgPosition = lUpdates.Find(strMessage + "'=false");
			if (cMsgPosition.IsNull()){
				bContainsFalseMsg = false;
			}else{
				bContainsFalseMsg = true;
			}
			while(bContainsFalseMsg == true){
				NPosition cFalsePosition;
				cFalsePosition = lUpdates.Find(strMessage + "'=false");
				if (cFalsePosition.IsNotNull()){
					lUpdates.RemoveAt(cFalsePosition);
				}
				cFalsePosition = lUpdates.Find(strMessage + "'=false");
				if (cFalsePosition.IsNull()){
					bContainsFalseMsg = false;
				}else{
					bContainsFalseMsg = true;
				}
			}
		}
	}
}

	/** Adds a string to the string which is used for the messageReady declaration 
	 *  for translation type 4.
	 *  @param m  the string to add.
	 */
void CTranslateSALMain::AddMessageString(NString strMessage){
	if (m_strMessageReady != ""){//If there's already an entry stored.
		m_strMessageReady = m_strMessageReady + "OR ";
		m_strMessageReady = m_strMessageReady + strMessage;
		m_strMessageReady = m_strMessageReady + "\r\n";
	}else{
		m_strMessageReady = m_strMessageReady + strMessage;
		m_strMessageReady = m_strMessageReady + "\r\n";
	}
}

// Identifies the initialisation nodes - these are the root node and its descendents which
// are all part of an atomic block and are all state-realisations. If the root node is not
// followed by an atomic connection, then the root node is identified as the only initialisation
// node. If any of the init nodes (incl. the root) are not state-changes, an exception is thrown.
// Parameters:  iRootNode = the ID of the root node,
//				lInitNodes = a list (passed by reference) which will be populated with the ID's
//					of all identified initialisation nodes. This list can later be used for 
//					translating the init information.
void CTranslateSALMain::TranslateInitNodes(int iRootNode, NList<int, int>& lInitNodes){
	bool bAtomicFinished = false;
	bool bIsInitBlock = true;

	// Add the root node to the list of initialisation nodes.
	CTranslateNode* pcRootNode = GetNode(iRootNode);
	int iStateType = pcRootNode->GetType();
	if (iStateType == 1){  // state-realisation
		lInitNodes.AddTail(iRootNode);
	}else{
		CTranslateException cException("Root node must be a state-realisation.");
		throw cException;
	}
	int iChildNum = pcRootNode->GetNumberOfChildren();
	if (iChildNum > 0){
		// There is more than one node in the BT.
		int iFirstChild = pcRootNode->GetChildID(0);
		CTranslateNode* pcFirstChild; 
		while (!bAtomicFinished && bIsInitBlock){
			pcFirstChild = GetNode(iFirstChild);
			if (pcFirstChild->IsNodeAtomic() == true){
				iStateType = pcFirstChild->GetType();
				if (iStateType == 1){  // state-realisation 
					lInitNodes.AddTail(iFirstChild);
				}else{
					lInitNodes.RemoveAll();
					bIsInitBlock = false;
				}
				int iSiblings = pcFirstChild->GetSiblingNumber();
				if (iSiblings > 1){
					// There is a branching atomic transition.
					lInitNodes.RemoveAll();
					bIsInitBlock = false;
				}else{
					iChildNum = pcFirstChild->GetNumberOfChildren();
					if (iChildNum > 0){
						iFirstChild = pcFirstChild->GetChildID(0);
					}else{
						bAtomicFinished = true;
 					}
				}
			}else{
				bAtomicFinished = true;
			}
		}
			
		if (bIsInitBlock != true){
			CTranslateException cException("Initialisation block must all be state-realisations with no branching.");
			throw cException;
		}else{
			int iLastNode = lInitNodes.GetTail();
			m_iStartNode = iLastNode;
			NPosition cInitPosition;
			cInitPosition = lInitNodes.GetHeadPosition();
			while (cInitPosition.IsNotNull()){
				int iCurrentNode = lInitNodes.GetNext(cInitPosition);
				CTranslateNode* pcCurrentNode = GetNode(iCurrentNode);
				NString strComponentName;
				strComponentName = pcCurrentNode->GetComponentName();
				NString strStateName;
				strStateName = pcCurrentNode->GetStateName();
				//NString strAction;
				strComponentName = TrimChangeCase(strComponentName, false);
				strStateName = TrimChangeCase(strStateName, false);
				NString strFinalComp = strComponentName;
				NString strFinalState = strComponentName + "_" + strStateName;
				// Check for attributes.
				int iTokenPos = 0;
				NString strToken = strStateName.Tokenize(":=", iTokenPos);
				NString strToken2 = strStateName.Tokenize(":=", iTokenPos);
				if (strToken2 != ""){ // The state contains attributes.
					strToken = TrimChangeCase(strToken, false);
					strToken2 = TrimChangeCase(strToken2, false);

					// Check if the first component is an integer type variable.
					if (IsInteger(strComponentName + "_" + strToken)){
						// Check if the second value is an integer.
						if (IsStringANumber(strToken2)){
							strFinalComp = strComponentName + "_" + strToken;
							strFinalState = strToken2;
						}else{ // The second value must be another attribute.
							strFinalComp = strComponentName + "_" + strToken;
							strFinalState = strComponentName + "_" + strToken2;
						}
					}else{ // It is a normal attribute.
						// Change the component name & state to attribute style.
						strFinalComp = strComponentName + "_" + strToken;
						strFinalState = strComponentName + "_" + strToken + "_" + strToken2;
						AddLocalVariable(strFinalComp, strFinalState);
					}
				}else{ // The state doesn't contain attributes.
				//strAction = strFinalComp + "=" + strFinalState;
					AddLocalVariable(strFinalComp, strFinalState);
				}
			}
		}
	}
}

void CTranslateSALMain::StoreTranslationStep(int iNode, int iRuleID, int iOtherNode, NList<int, int>* plSecondaryRules)
{
	CTranslateStep* pcCurrentStep = new CTranslateStep(iNode,iRuleID,iOtherNode,plSecondaryRules);
	m_lSteps.AddHead(pcCurrentStep);	
}

CTranslateNode* CTranslateSALMain::GetNode(int iNodeID)
{
	CTranslateNode* pcNode;
	int iSuccess = m_mTranslateNodes.Lookup(iNodeID, pcNode);
	return pcNode;
}

/*CTranslateNode* CTranslateSALMain::CreateTranslateNodes(MSXML::IXMLDOMNodePtr pXMLNode)
{
	CTranslateNode* pcNode = ConvertToTranslateNode(pXMLNode);
	if (pcNode == NULL){  // There was an error.
		return NULL;
	}
	int iNodeID = m_iHighestTranslateID;
	pcNode->SetNodeID(iNodeID);
	m_mTranslateNodes.SetAt(m_iHighestTranslateID, pcNode);
	m_iHighestTranslateID++;

	// Get the child nodes.
	_bstr_t bstrChildName;
	int iChildID;
	MSXML::IXMLDOMNodeListPtr pRealChildren;
	MSXML::IXMLDOMNodePtr pXMLChild;
	MSXML::IXMLDOMNodeListPtr pChildren = pXMLNode->GetchildNodes();
	MSXML::IXMLDOMNodePtr pRealChild;
	for (int i = 0; i < pChildren->Getlength(); i++){
		pXMLChild = pChildren->Getitem(i);
		bstrChildName = pXMLChild->GetnodeName();
		NString strChildName = bstrChildName;
		if (strChildName == "CHILDREN"){  // Ignore the other XML child nodes like "REQUIREMENTS" etc.
			// The children of this node are the real BT nodes.
			pRealChildren = pXMLChild->GetchildNodes();
			// Get each of these children and convert them to translate nodes.
			for (int j = 0; j < pRealChildren->Getlength(); j++){
				pRealChild = pRealChildren->Getitem(j);
				CTranslateNode* pcChild = CreateTranslateNodes(pRealChild);
				if (pcChild == NULL){ // There was an error.
					return NULL;
				}
				iChildID = pcChild->GetNodeID();
				pcNode->AddChild(iChildID);
				pcChild->SetParent(iNodeID);
				pcChild->SetSiblingNumber(pRealChildren->Getlength() - 1);
			}
		}
	}
	return pcNode;
}	

CTranslateNode* CTranslateSALMain::ConvertToTranslateNode(MSXML::IXMLDOMNodePtr pXMLNode)
{
	MSXML::IXMLDOMNamedNodeMapPtr pmAttributes = pXMLNode->Getattributes();

	_bstr_t bstrSearchItem = "COMP_NAME";	
	MSXML::IXMLDOMNodePtr pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	if (pComponent == NULL){  // Something is wrong since there should be a component name.
		NString strError = "Could not find component name for node: ";
		strError.Format(strError + "%d"), m_iHighestTranslateID;
		strError.Append("\r\nPossible cause may be incorrect format in XML file.");
		AfxMessageBox(strError);
		return NULL;
	}
	_variant_t vItemValue = pComponent->GetnodeValue();
	NString strComponent = vItemValue.bstrVal;

	bstrSearchItem = "NAME";
	pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	if (pComponent == NULL){  // Something is wrong since there should be a behavior name.
		NString strError = "Could not find behavior name for node:";
		strError.Format(strError + "%d"), m_iHighestTranslateID;
		strError.Append("\r\nPossible cause may be incorrect format in XML file.");
		AfxMessageBox(strError);
		return NULL;
	}
	vItemValue = pComponent->GetnodeValue();
	NString strState = vItemValue.bstrVal;

	bstrSearchItem = "OPERATOR";
	pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	NString strFlags;
	int iJumpType = GSE_J_NO;
	if (pComponent.IsNotNull()){  
		vItemValue = pComponent->GetnodeValue();
		strFlags = vItemValue.bstrVal;
		strFlags.Trim(" ");
		if (strFlags == "=>")){  // a reference (go-to node.
			iJumpType = GSE_J_GOTO;
			strFlags = "";
		}else if (strFlags == "^"){
			iJumpType = GSE_J_REVERSION;
			strFlags = "";
		}else{
			iJumpType = GSE_J_NO;
		}
	}
	
	bool bIsSet = false;  // Set nodes are not yet possible in BESE.

	bstrSearchItem = "PARENT_REL_TYPE";
	pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	bool bIsAtomic = false;
	if (pComponent.IsNotNull()){
		vItemValue = pComponent->GetnodeValue();
		NString strLinkType = vItemValue.bstrVal;
		if (strLinkType == "atomic"){
			bIsAtomic = true;
		}
	}

	bool bIsNonDeter = false;
	bstrSearchItem = "ND_CHOICE";
	pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	if (pComponent.IsNotNull()){
		vItemValue = pComponent->GetnodeValue();
		NString strBranchingType = vItemValue.bstrVal;
		if (strBranchingType == "true"){
			bIsNonDeter = true;
		}
	}

	_bstr_t bstrNodeType = pXMLNode->GetnodeName();
	NString strNodeType = bstrNodeType;
	int iType = GSE_T_STATE;  // Default to state realisation.
	if (strNodeType == "STATE"){
		iType = GSE_T_STATE;
	}else if (strNodeType == "GUARDED_EVENT"){
		iType = GSE_T_GUARD;
	}else if (strNodeType == "EVENT"){
		iType = GSE_T_EVENT;  // Note this is treated the same as external input.
	}else if (strNodeType == "SELECTION"){
		iType = GSE_T_CONDITION;
	}else if (strNodeType == "EXTERNAL_OUTPUT"){
		iType = GSE_T_OUTPUT;
	}else if (strNodeType == "EXTERNAL_INPUT"){
		iType = GSE_T_INPUT;
	}else if (strNodeType == "INTENAL_OUTPUT"){
		iType = GSE_T_OUTPUT1;
	}else if (strNodeType == "INTERNAL_INPUT"){
		iType = GSE_T_INPUT1;
	}else{  // This is an error.
		NString strError = "Could not find type (e.g. event/state/guard) for node:";
		strError.Format(strError + "%d"), m_iHighestTranslateID;
		strError.Append("\r\nPossible cause may be incorrect format in XML file.");
		AfxMessageBox(strError);
		return NULL;
	}

	// Create a TranslateNode with this information.
	CTranslateNode* pcNode = new CTranslateNode;
	pcNode->SetComponentName(strComponent);
	pcNode->SetStateName(strState);
	pcNode->SetFlag(strFlags);
	pcNode->SetType(iType);
	pcNode->SetJumpType(iJumpType);
	pcNode->SetIsNodeAtomic(bIsAtomic);
	pcNode->SetIsNodeNonDeterministic(bIsNonDeter);
	pcNode->SetIsNodeSetOperation(bIsSet);
	pcNode->SetIsBlankNode(false);
	pcNode->SetIsUserDefinedAttribute(false);
			
	return pcNode;
}
*/
void CTranslateSALMain::GetDescendents(NList<int, int>& cDescendents, int iNode)
{
	int iChildNode, iChildNum;
	CTranslateNode* pcNode = GetNode(iNode);
	iChildNum = pcNode->GetNumberOfChildren();
	for(int i = 0;i < iChildNum;i++) {
		iChildNode = pcNode->GetChildID(i);
		cDescendents.AddTail(iChildNode);
		GetDescendents(cDescendents, iChildNode);
	}
}
void CTranslateSALMain::GetLeafNodes(int iRootNode, NList<int, int>& cLeafNodes)
{
	int iCurrentNode, iChildNum;
	NList<int, int> cAllNodes;
	GetDescendents(cAllNodes, iRootNode);
	if (cAllNodes.GetSize() == 0){  // The root is the only node in the BT.
		cLeafNodes.AddHead(iRootNode);
	}
	NPosition cCurrentPosition;
	cCurrentPosition = cAllNodes.GetHeadPosition();
	while(cCurrentPosition.IsNotNull()){
		iCurrentNode = cAllNodes.GetNext(cCurrentPosition);
		CTranslateNode* pcCurrentNode = GetNode(iCurrentNode);
		iChildNum = pcCurrentNode->GetNumberOfChildren();
		if (iChildNum == 0){   // This node has no children.
			cLeafNodes.AddTail(iCurrentNode);
		}
	}
}

void CTranslateSALMain::ReadSetInformation(){
//	FILE *pcFile;
	NString strLine;
//	char cLine[4096];
	
	// Read the selected file.    
//	_tfopen_s(&pcFile,(LPCTSTR)strPathName,"rt");
	int iTokenPos1 = 0;
	while(iTokenPos1 != -1){
		strLine = m_strSets.Tokenize("\n", iTokenPos1);
//	while(!feof(pcFile)) {
//		fgets(cLine,4096,pcFile); 
//		strLine = cLine;
	//	if (!feof(pcFile)){ // To make it ignore the last blank line.
			if (strLine.Trim() != ""){
				StoreSetInformation(strLine);
			}
	//	}
	}
//	fclose(pcFile);

}

void CTranslateSALMain::StoreSetInformation(NString strSet){
	// Remove the last character as it is a line break character.
	int iLength = strSet.GetLength();
	strSet.Truncate(iLength - 1);
	
	// Store the set name, set type and the set it belongs to, if applicable.
	int iTokenPos = 0;
	NString strSetBelongsTo = strSet.Tokenize(";", iTokenPos);
	
	if (strSetBelongsTo == "NOTSET"){ // This is information about a non-set item.
		// Get the name that this attribute is referred to in the BT.
		// e.g. In the BT, "courseID" could be used in another component to refer to
		// the ID attribute that is part of the Course component. Note that this is
		// not correct BT syntax at present, but has been used temporarily until
		// data message passing is introduced.

		if (iTokenPos == -1){
			NString strMessage = "No 'NameInBT' found for a NOTSET item in the set info file.";
			CTranslateException cException(strMessage);
			throw cException;
		}

		NString strNameInBT = strSet.Tokenize(";", iTokenPos);

		if (iTokenPos == -1){
			NString strMessage = "No component name found for a NOTSET item in the set info file.";
			CTranslateException cException(strMessage);
			throw cException;
		}

		// Get the name of the component owning this attribute.
		NString strComponentName = strSet.Tokenize(";", iTokenPos);

		if (iTokenPos == -1){
			NString strMessage = "No attribute name found in the set info file for item: " + strNameInBT;
			CTranslateException cException(strMessage);
			throw cException;
		}

		// Get the name of the attribute.
		NString strAttribute = strSet.Tokenize(";", iTokenPos);

		if (iTokenPos == -1){
			NString strMessage = "No type found in the set info file for item: " + strNameInBT;
			CTranslateException cException(strMessage);
			throw cException;
		}

		// Get the type of the attribute.
		NString strType = strSet.Tokenize(";", iTokenPos);

		if (iTokenPos == -1){
			NString strMessage = "No elements found in the set info file for item: " + strNameInBT;
			CTranslateException cException(strMessage);
			throw cException;
		}

		// Get the elements of this type.
		NString strElements = strSet.Tokenize(";", iTokenPos);

		// Check if the type is a pre-defined type like Integer.
		if (strType == "#INTEGER#"){
			NString strStartValue = strElements;
			NString strEndValue = strSet.Tokenize(";", iTokenPos);
			if (iTokenPos == -1){
				NString strMessage = "No upper limit found in the set info file for the integer item: " + strNameInBT;
				CTranslateException cException(strMessage);
				throw cException;
			}

			strAttribute = TrimChangeCase(strAttribute, false);
			m_lIntegers.AddTail(strComponentName + "_" + strAttribute);
			m_lStartValues.AddTail(strStartValue);
			m_lEndValues.AddTail(strEndValue);

		}else{  // It is a user-defined type.
			// Store all this information.
			strAttribute = TrimChangeCase(strAttribute, false);

			if (strNameInBT == "/"){ // If there is no alternate name, then create one.
				strComponentName = TrimChangeCase(strComponentName,false);
				strNameInBT = strComponentName + "_" + strAttribute;
			}
			// Check whether the alternative name was already added.
	/////// Give an error here that there can't be two alternative names that are the same.
			NPosition cPos3 = m_lAlternateNames.Find(strNameInBT);
			if (cPos3.IsNull()){
				m_lAlternateNames.AddTail(strNameInBT);
			}
			int iAlternateLocation = FindListPosition(m_lAlternateNames,strNameInBT);
			
			m_lAttributes.AddTail(strAttribute);
			int iAttributeLocation = FindListPosition(m_lAttributes,strAttribute);
			m_mAlternativesToAttributes.SetAt(iAlternateLocation, iAttributeLocation);

			// Check whether the type was already added.
			NPosition cPos = m_cSetTypes.Find(strType);
			if (cPos.IsNull()){
				m_cSetTypes.AddTail(strType);
			}
			// Note, it was stored in the set types list even though it isn't
			// a set, because it should be translated the same way for the declarations in SAL.
			int iTypeLocation = FindListPosition(m_cSetTypes,strType);
			m_mAttributesToTypes.SetAt(iAlternateLocation, iTypeLocation);

			// Check whether the component was already added.
			NPosition cPos2 = m_lAttributeComponents.Find(strComponentName);
			if (cPos2.IsNull()){
				m_lAttributeComponents.AddTail(strComponentName);
			}
			int iComponentLocation = FindListPosition(m_lAttributeComponents,strComponentName);
			m_mAttributesToComponents.SetAt(iAlternateLocation, iComponentLocation);
				
			// Store the range of values for this attribute type.
			int iElementPos = 0;
			for (int i = 0; i < 5; i++){ // No more than 5 elements allowed.
				if (iElementPos != -1){
					NString strElement = strElements.Tokenize(",", iElementPos);
					// Associate the element with the set type.
					if (strElement != ""){
						AddElementToSet(strElement, strType);
					}else{
						if (i == 0){  // There are no elements specified at all.
							NString strMessage = "No elements found in the set info file for item: " + strNameInBT;
							CTranslateException cException(strMessage);
							throw cException;
						}
					}
				}
			}
		}

	}else{  // This is information about a set.
		if (iTokenPos == -1){
			NString strMessage = "No set name found in the set info file for a set item.";
			CTranslateException cException(strMessage);
			throw cException;
		}

		NString strSetName = strSet.Tokenize(";", iTokenPos);
		if (iTokenPos == -1){
			NString strMessage = "No type found in the set info file for the set item: " + strSetName;
			CTranslateException cException(strMessage);
			throw cException;
		}

		NString strSetType = strSet.Tokenize(";", iTokenPos);
		if (iTokenPos == -1){
			NString strMessage = "No elements found in the set info file for item: " + strSetName;
			CTranslateException cException(strMessage);
			throw cException;
		}
		strSetName = TrimChangeCase(strSetName,true);
		m_cSetNames.AddTail(strSetName);

		// Check whether the set type was already added.
		strSetType = TrimChangeCase(strSetType,true);
		NPosition cPos = m_cSetTypes.Find(strSetType);
		if (cPos.IsNull()){
			m_cSetTypes.AddTail(strSetType);
		}

		int iTypeLocation = FindListPosition(m_cSetTypes,strSetType);
		int iNameLocation = FindListPosition(m_cSetNames,strSetName);
		m_cSetNamesToTypes.SetAt(iNameLocation, iTypeLocation);

		// Add the set type to the list of unique set types.
		// (see description in the header file next to the definition of m_cSetNamesToUniqueTypes).
		
		if (strSetBelongsTo != "/"){ // If this set is an attribute of either a normal component
											 // or an element of another (parent) set.
			// Check whether the parent set was already added.
			strSetBelongsTo = TrimChangeCase(strSetBelongsTo,true);
			NPosition cPos = m_cParentSets.Find(strSetBelongsTo);
			if (cPos.IsNull()){
				m_cParentSets.AddTail(strSetBelongsTo);
			}
		////////////////// Check whether it needs to be added to the parent sets list, since the parent might be a normal component not a set.	
			m_cAttributeSets.AddTail(strSetName);
			int iParentSetLocation = FindListPosition(m_cParentSets,strSetBelongsTo);
			int iSetLocation = FindListPosition(m_cAttributeSets,strSetName);
			m_cSetsToParentSets.SetAt(iSetLocation, iParentSetLocation);
		}

		// Store the list of possible elements in the set.
		NString strSetRange = strSet.Tokenize(";", iTokenPos);
		int iElementPos = 0;
		for (int i = 0; i < 5; i++){ // No more than 5 elements allowed.
			if (iElementPos != -1){
				NString strElement = strSetRange.Tokenize(",", iElementPos);
				
				// Associate the element with the set type.
				if (strElement != ""){
					AddElementToSet(strElement, strSetType);
				}else{
					if (i == 0){  // There are no elements specified at all.
						NString strMessage = "No elements found in the set info file for item: " + strSetName;
						CTranslateException cException(strMessage);
						throw cException;
					}
				}
			}
		}
		NString strSetInitial;
		if (iTokenPos == -1){
			strSetInitial = ""; 
		}
		// Store the list of initial elements in the set.
		strSetInitial = strSet.Tokenize(";", iTokenPos);
		if (strSetInitial != ""){  // Note: If it is null, then there are no initial elements in the set - This is a valid possibility.
			int iInitialPos = 0;
			for (int i = 0; i < 5; i++){ // No more than 5 elements allowed.
				if (iInitialPos != -1){
					NString strElement = strSetInitial.Tokenize(",", iInitialPos);
					// Associate the element with the set name.
					if (strElement != ""){		
						AddInitialElement(strElement, strSetName);
					}
				}
			}
		}

		// Store the list of possible elements in the unique set.
		// (see description in the header file next to the definition of m_cSetNamesToUniqueTypes).
//		NString strSetRange2 = strSet.Tokenize(";"), iTokenPos;
//		int iElementPos2 = 0;
//		for (int i = 0; i < 5; i++){ // No more than 5 elements allowed.
//			if (iElementPos2 != -1){
//				NString strElement = strSetRange2.Tokenize(","), iElementPos2;
//				// Associate the element with the set type.
//				if (strElement != ""){
//					AddUniqueElementToSet(strElement, strSetType);
//				}
//			}
//		}
	}
}

// This function (despite its name), and the next three functions are for reading input from a TextBE file and 
// converting it into TranslateNode objects.
CTranslateNode* CTranslateSALMain::ReadSlice(){
//	FILE *pcFile;
	NString strLine;
	NString strLine2;
//	char cLine[4096];
	CTranslateNode* pcNode;
	CTranslateNode* pcRoot;
	
	NList<NString,NString>* plLastComponent; // This is for when the line is declaring state names
							// and the component name was specified on a previous line.
	bool bReachedTree = false; // Indicates whether the tree section of the file
							// has been reached.
	
	// Read the selected file.              
	// Note that this assumes that each definition (starting with a #)
	// in the TextBT file is on a new line. 
//	_tfopen_s(&pcFile,(LPCTSTR)strPathName,"rt");  
	plLastComponent = new NList<NString,NString>;

	bool bOneMoreLine = false;
	m_bReachedComp = false;
	bool bWrongTypeOfLine = false;

	try{
//	fgets(cLine,4096,pcFile); 
	int iFilePos1 = 0;
	strLine = m_strTree.Tokenize("\n", iFilePos1);
	if (iFilePos1 == -1){
		bWrongTypeOfLine = true;
	}
	while(iFilePos1 != -1){
	//	while(!feof(pcFile) || (bOneMoreLine == true)) {
//		strLine = cLine;
	//	if (!feof(pcFile) || (feof(pcFile) && strLine != "")){ // To make it ignore the last blank line.
			int iTokenPos = 0;
			NString strToken = strLine.Tokenize(" \t", iTokenPos);
			if ((strToken != "#T") && !bReachedTree){
				// This is still the component declarations section of the file.
				// Store the information and pass the last component name,
				// in case this is a state declarations line and the component name
				// that was previously parsed on another line is now needed.
				plLastComponent = StoreSliceInformation(strLine, plLastComponent);
			}else if (strToken == "#T"){
			//	if (!feof(pcFile)){
				int iLineBreakPos1 = 0;
				// Remove the last character as it is a line break character.
				strLine = strLine.Tokenize("\r", iLineBreakPos1);
							
				bReachedTree = true;
				delete plLastComponent; // The component declarations are finished so delete it.
				plLastComponent = NULL;
				pcNode = StoreSliceNodeInformation(strLine);
				pcRoot = pcNode;
			}else{ //bReachedTree == true.
				int iLineBreakPos1 = 0;
				// Remove the last character as it is a line break character.
				strLine = strLine.Tokenize("\r", iLineBreakPos1);
							
				pcNode = StoreSliceNodeInformation(strLine);
			}
		//	if (bOneMoreLine == true){
		//		bOneMoreLine = false; // Stop it reading anymore.
		//	}else{
				strLine = m_strTree.Tokenize("\n", iFilePos1);
		//	}			
	}
	if(bWrongTypeOfLine == true){  // Check whether this was a file with \r's only and no \n's. 
		iFilePos1 = 0;
		strLine = m_strTree.Tokenize("\r", iFilePos1);
		while(iFilePos1 != -1){
			int iTokenPos = 0;
				NString strToken = strLine.Tokenize(" \t", iTokenPos);
				if ((strToken != "#T") && !bReachedTree){
					// This is still the component declarations section of the file.
					// Store the information and pass the last component name,
					// in case this is a state declarations line and the component name
					// that was previously parsed on another line is now needed.
					plLastComponent = StoreSliceInformation(strLine, plLastComponent);
				}else if (strToken == "#T"){
				//	if (!feof(pcFile)){
						// Remove the last character as it is a line break character.
					//	int iLength = strLine.GetLength();
					//	strLine.Truncate(iLength - 1);
				//	}
					bReachedTree = true;
					delete plLastComponent; // The component declarations are finished so delete it.
					plLastComponent = NULL;
					pcNode = StoreSliceNodeInformation(strLine);
					pcRoot = pcNode;
				}else{ //bReachedTree == true.
				//	if (!feof(pcFile)){
						// Remove the last character as it is a line break character.
					//	int iLength = strLine.GetLength();
						//strLine.Truncate(iLength - 1);
				//	}
					pcNode = StoreSliceNodeInformation(strLine);
				}
			//	if (bOneMoreLine == true){
			//		bOneMoreLine = false; // Stop it reading anymore.
			//	}else{
					strLine = m_strTree.Tokenize("\r", iFilePos1);
		}
	}

	if (m_bReachedComp == false){  // This is probably not a .bt file, since no component declarations were found.
		// Throw an error.
		NString strMessage = "No component declarations found. Please check that the file is a valid .bt (TextBE) file.";
		CTranslateException cException(strMessage);
		throw cException;
	}

	if (bReachedTree == false){  // This is probably not a .bt file, since tree information was not found.
		// Throw an error.
		NString strMessage = "No BT (#T) section found. Please check that the file is a valid .bt (TextBE) file.";
		CTranslateException cException(strMessage);
		throw cException;
	}

	if (m_lBranchingNodes.GetSize() != 0){ // If there's anything still in the m_lBranchingNodes list.
		NString strMessage = "Please check your .bt file. The number of brackets is incorrect.";
		CTranslateException cException(strMessage);
		throw cException;
	}
	}catch (CTranslateException salEx){
//		AfxMessageBox(salEx.GetMessage());
//		fclose(pcFile);
		if (plLastComponent != NULL){
			delete plLastComponent; 
		}
		pcRoot = NULL;
		// Free the memory.
		NPosition cNodePosition = m_mTextBEMap.GetStartPosition();
		while(cNodePosition.IsNotNull()){
			CTranslateNode* pcTheNode;
			int iID;
			m_mTextBEMap.GetNextAssoc(cNodePosition,iID,pcTheNode);
			delete pcTheNode;
			pcTheNode = NULL;
		}
		m_mTextBEMap.RemoveAll();
		// Send the exception back so that the message can be returned.
		throw salEx;
	}

//	fclose(pcFile);

/*	// Show a file dialog box.//////////////////////////////////////////
	NString strTree = PrintTree(pcRoot);
	NString strTempFile = "H:\\test.txt";
		// Save the results to the specified file.
		FILE *pcFile2;
		_tfopen_s(&pcFile2,(LPCTSTR)strTempFile,"wt");
		_fputts((LPCTSTR)strTree, pcFile2);
		fclose(pcFile2);
		//////////////////////////////////////////////////////////////
*/
	// Free memory.
	NPosition cNodePosition = m_mTextBEMap.GetStartPosition();
	while(cNodePosition.IsNotNull()){
		CTranslateNode* pcTheNode;
		int iID;
		m_mTextBEMap.GetNextAssoc(cNodePosition,iID,pcTheNode);
		delete pcTheNode;
		pcTheNode = NULL;
	}
	m_mTextBEMap.RemoveAll();

	return pcRoot;
}

// Please see the description for the previous function.
NList<NString, NString>* CTranslateSALMain::StoreSliceInformation(NString strLine, NList<NString, NString>* plComponent){
	NString strToken, strToken2, strToken3, strToken4;
	// Remove the last character as it is a line break character.
	int iLineBreakPos1 = 0;
	strLine = strLine.Tokenize("\r", iLineBreakPos1);
	// Remove the last character as it is a line break character.
//	if (iLineBreakPos1 != -1){
//		int iLength = strLine.GetLength();
//		strLine.Truncate(iLength - 1);
//	}
	int iTokenPos = 0;
	strToken = strLine.Tokenize(" \t", iTokenPos);
	
	//	while (!strToken.IsEmpty()){
	strToken.Trim();
	if ((strToken == "#SC") || (strToken == "#C")){
		// This is a component.
		m_bReachedComp = true;  // The component declarations part has been reached.

		// Get the component identifier.
		strToken2 = strLine.Tokenize(" \t", iTokenPos);
		while (strToken2 != "" && strToken2.Trim() == ""){  // If strToken2 is a blank space but it's not the end of the line.
			strToken2 = strLine.Tokenize(" \t", iTokenPos);
		}
		strToken2.Trim();
		// Get the component name.
		strToken3 = strLine.Tokenize(" \t", iTokenPos);
		while (strToken3 != "" && strToken3.Trim() == ""){  // If strToken3 is a blank space but it's not the end of the line.
			strToken3 = strLine.Tokenize(" \t", iTokenPos);
		}
		strToken3.Trim();
		// Store this information.
//		StoreComponentInfo(strToken2, strToken3);
		// Return the new component name and ID in a list.
		delete plComponent; // Delete the last list.
		NList<NString,NString>* plCompList = new NList<NString,NString>;
		plCompList->AddTail(strToken2);
		plCompList->AddTail(strToken3);
		return plCompList;
	
	}else if (m_bReachedComp == true){ // If it is upto the component declarations part.
		// This is a behaviour.
		int iType;
		if (strToken == "#S"){
			iType = GSE_T_STATE;
		}else if (strToken == "#G"){
			iType = GSE_T_GUARD;
		}else if (strToken == "#L"){
			iType = GSE_T_CONDITION;
		}else if (strToken == "#E"){
			iType = GSE_T_EVENT; // This is the same as guard.
		}else if (strToken == "#II"){
			iType = GSE_T_INPUT1;
		}else if (strToken == "#IO"){
			iType = GSE_T_OUTPUT1;
		}else if (strToken == "#EI"){
			iType = GSE_T_INPUT;
		}else if (strToken == "#EO"){
			iType = GSE_T_OUTPUT;
		}else{ // Ignore everything else.
			// Return the last component name.
			return plComponent;
		}
		
		NString strCompID = plComponent->GetHead();
		NString strCompName = plComponent->GetTail();
		strToken2 = strLine.Tokenize(" \t", iTokenPos);
		while((!strToken2.IsEmpty()) && (strToken2 != "#R")){
			// Get the next state name.
			strToken3 = strLine.Tokenize(" \t", iTokenPos);
			if (strToken3.IsEmpty()){
				// Throw an error as the behaviour name was not found.
				// Note that it could also be that the behaviour ID was missing but the name was assumed to be the ID.
				// e.g. #S 1 Something - If this error was thrown then either Something is missing or 1 is missing and
				// Something was taken to be the ID value.
				NString strMessage = "Missing behaviour name after the ID: " + strToken2;
				strMessage = strMessage + " on line:\r\n" + strLine;
				strMessage = strMessage + "\r\nThis may be due to a space in a behaviour name.";
				CTranslateException cException(strMessage);
				throw cException;
			}
			// Store this information.
			StoreNodeInfo(strCompID, strCompName, strToken2, strToken3, iType);
			strToken2 = strLine.Tokenize(" \t", iTokenPos);
		}	
		// Return the last component name.
		return plComponent;

	}else if (m_bReachedComp == false){ // Store the requirements tags so that they can be ignored if they are
									  // later found in the #T section.

		while (strToken != "" && strToken.Trim() == ""){  // If strToken is a blank space but it's not the end of the line.
			strToken = strLine.Tokenize(" \t", iTokenPos);
		}

		// Ignore strToken if it is #RT.
		if (strToken == "#RT"){
			strToken = strLine.Tokenize(" \t", iTokenPos);
		}

		while(!strToken.IsEmpty()){
			m_lReqTags.AddTail(strToken.Trim());
			strToken = strLine.Tokenize(" \t", iTokenPos);

			while (strToken != "" && strToken.Trim() == ""){  // If strToken is a blank space but it's not the end of the line.
				strToken = strLine.Tokenize(" \t", iTokenPos);
			}

			if (!strToken.IsEmpty()){
				strToken = strLine.Tokenize(" \t", iTokenPos);
			}
		}
		return plComponent;  // It will actually be null anyway.

	}
	return NULL;
}

// Please see the description for the ReadSlice function.
void CTranslateSALMain::StoreNodeInfo(NString strComponentID, NString strComponentName, NString strStateID, NString strStateName, int iType){
	// Create a TranslateNode with this information.
	CTranslateNode* pcNode = new CTranslateNode;
	pcNode->SetComponentName(strComponentName.Trim());
	pcNode->SetStateName(strStateName.Trim());
	pcNode->SetType(iType);
	
	// This is not a proper node yet. After parsing the tree section of the TextBE
	// file, this could become several similar nodes.
	// Create a unique ID based on the TextBE ID's.
	NString strNewID = strComponentID + "_" + strStateID;
	// Store this ID.
	m_lTextBEList.AddTail(strNewID);
	int iPosition = FindListPosition(m_lTextBEList, strNewID);
	m_mTextBEMap.SetAt(iPosition,pcNode);
}

// Please see the description for the ReadSlice function
CTranslateNode* CTranslateSALMain::StoreSliceNodeInformation(NString strLine){
	NString strToken, strToken2, strToken3, strToken4;
	NString strFirst, strSecond, strID;
	CTranslateNode* pcNode;
	CTranslateNode* pcRoot = NULL;
	CTranslateNode* pcBranchingParent;
	CTranslateNode* pcParent = NULL;
	int iListPosition;
	bool bAtomic = false;
	bool bSequential = true; // default
	bool bParentAtomic = false;
	bool bParentSeq = true; // default.
	bool bFirstItem = true;
	bool bBranchingType = false;
	bool bError = false;
		
	int iTokenPos = 0;
	int iPosition = 0;
	strToken = strLine.Tokenize(" \t", iTokenPos);

	if (strToken == "#T"){ // Ignore this.
		strToken = strLine.Tokenize(" \t", iTokenPos);
	}
	while (strToken != "" && strToken.Trim() == ""){  // If strToken is a blank space but it's not the end of the line.
		strToken = strLine.Tokenize(" \t", iTokenPos);
	}
	strToken.Trim();
	if (strToken == "}"){
		// This is the end of a branching group.
		pcBranchingParent = m_lBranchingNodes.GetTail();
		m_lBranchingNodes.RemoveTail();
		int iSibling = pcBranchingParent->GetNumberOfChildren() - 1;
		for (int i = 0; i < pcBranchingParent->GetNumberOfChildren(); i++){
			int iChild = pcBranchingParent->GetChildID(i);
			CTranslateNode* pcChild;
			int iSuccess = m_mTranslateNodes.Lookup(iChild, pcChild);
			pcChild->SetSiblingNumber(iSibling);
		}
		return NULL;
	}
	
	// Ignore requirements tags and +/- symbols.
	NPosition cPosition = m_lReqTags.Find(strToken.Trim());
	if (cPosition.IsNotNull()){
		// This is a requirements tag.
		strToken = strLine.Tokenize(" \t", iTokenPos);
	}
	if (!strToken.IsEmpty()){
		strToken.Trim();
		if ((strToken == "-") || (strToken == "+") || (strToken == "--") || (strToken == "+-") || (strToken == "++")){
			// Ignore this tag.
			strToken = strLine.Tokenize(" \t", iTokenPos);
		}
	}
	
	
	while(!strToken.IsEmpty() && (bError == false)){
		strToken2 = strLine.Tokenize(" \t", iTokenPos);
		bAtomic = false;
		bSequential = true;

		while (strToken2 != "" && strToken2.Trim() == ""){  // If strToken2 is a blank space but it's not the end of the line.
			strToken2 = strLine.Tokenize(" \t", iTokenPos);
		}
		if (strToken2 != ""){   // There is an error in the .bt file if there are no more tokens on this line.
		bool bNodeIsBranching = false;
		bool bEndOfLine = false;
		bool bExtraCharacter = false;
		NString strLabel = "";
		NString strJumpingToLabel = "";

		strFirst = strToken;
		strToken3 = "";
		iPosition = strToken2.Find(";;");
		if (iPosition > -1){
			// This node is connected to the next one by an atomic connection.
			bAtomic = true;
			bSequential = false;
			strSecond = strToken2.Left(iPosition);

			// Check if there is anything after the ;; character.
			if ((strToken2.Right(strToken2.GetLength() - iPosition - 2)) != ""){
			// There is something after the ;; character.
			// Note that it is assumed that it cannot be a #N or #P because then
			// textBE would have given an error.
				strToken4 = strToken2.Right(strToken2.GetLength() - iPosition - 2);
				bExtraCharacter = true;
			}
		}else{
			iPosition = strToken2.Find(";");
			if (iPosition > -1){
				// This node is connected to the next one by a sequential link.
				bSequential = true;
				strSecond = strToken2.Left(iPosition);

				// Check if there is anything after the ;; character.
				if ((strToken2.Right(strToken2.GetLength() - iPosition - 1)) != ""){
				// There is something after the ;; character.
				// Note that it is assumed that it cannot be a #N or #P because then
				// textBE would have given an error.
					strToken4 = strToken2.Right(strToken2.GetLength() - iPosition - 1);
					bExtraCharacter = true;
				}
			}else{ // Check for a flag.
				strSecond = strToken2;
				strID = strFirst + "_" + strSecond;
				strToken3 = strLine.Tokenize(" \t", iTokenPos);

				// Check if it is a ; or ;; because there is a space between the previous node and the ; or ;; character.
				iPosition = strToken3.Find(";;");
				int iPosition2 = strToken3.Find("--");
				if ((iPosition > -1) && (iPosition2 == -1)){
					if (iPosition == 0){
						// This node is connected to the next one by an atomic connection.
						bAtomic = true;
						bSequential = false;
					
						// Check if there is anything after the ;; character.
						if ((strToken3.Right(strToken3.GetLength() - iPosition - 2)) != ""){
						// There is something after the ;; character.
						// Note that it is assumed that it cannot be a #N or #P because then
						// textBE would have given an error.
							strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 2);
							bExtraCharacter = true;
						}
						strToken3 = "";
					}else{
						// Token3 must be a label with a ;; character next to it with no space.
						strLabel = strToken3.Left(iPosition);

						// Check if there is anything after the ;; character.
						if ((strToken3.Right(strToken3.GetLength() - iPosition - 2)) != ""){
						// There is something after the ;; character.
						// Note that it is assumed that it cannot be a #N or #P because then
						// textBE would have given an error.
							strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 2);
							bExtraCharacter = true;
						}

						strToken3 = "";
						bAtomic = true;
						bSequential = false;
					}
				}else{
					iPosition = strToken3.Find(";");
					if ((iPosition > -1) && (iPosition2 == -1)){
						if (iPosition == 0){
							// This node is connected to the next one by a sequential link.
							bSequential = true;
							bAtomic = false;
												
							// Check if there is anything after the ; character.
							if ((strToken3.Right(strToken3.GetLength() - iPosition - 1)) != ""){
							// There is something after the ; character.
							// Note that it is assumed that it cannot be a #N or #P because then
							// textBE would have given an error.
								strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 1);
								bExtraCharacter = true;
							}
							strToken3 = "";
						}else{
							// Token3 must be a label with a ; character next to it with no space.
							strLabel = strToken3.Left(iPosition);

							// Check if there is anything after the ; character.
							if ((strToken3.Right(strToken3.GetLength() - iPosition - 1)) != ""){
							// There is something after the ; character.
							// Note that it is assumed that it cannot be a #N or #P because then
							// textBE would have given an error.
								strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 1);
								bExtraCharacter = true;
							}

							strToken3 = "";
							bAtomic = false;
							bSequential = true;
						}
					}else{
						// Check if the next token is a thread kill flag.
						iPosition = strToken3.Find("--");
						if (iPosition > -1){  
							// See if there is a ; or ;; after the flag.
							iPosition = strToken3.Find(";;");
							if (iPosition > -1){
								// This node is connected to the next one by an atomic connection.
								bAtomic = true;
								bSequential = false;
								strToken3 = strToken3.Left(iPosition);

								// Check if there is anything after the ;; character.
								if ((strToken3.Right(strToken3.GetLength() - iPosition - 2)) != ""){
								// There is something after the ;; character.
								// Note that it is assumed that it cannot be a #N or #P because then
								// textBE would have given an error.
									strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 2);
									bExtraCharacter = true;
								}
							}else{  
								iPosition = strToken3.Find(";");
								if (iPosition > -1){
									// This node is connected to the next one by a sequential link.
									bSequential = true;
									strToken3 = strToken3.Left(iPosition);

									// Check if there is anything after the ; character.
									if ((strToken3.Right(strToken3.GetLength() - iPosition - 1)) != ""){
									// There is something after the ; character.
									// Note that it is assumed that it cannot be a #N or #P because then
									// textBE would have given an error.
										strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 1);
										bExtraCharacter = true;
									}

								}else{ // Check for a #N or #P sign since this must be the end of a line.
									bEndOfLine = true;
									strToken4 = strLine.Tokenize(" \t", iTokenPos);
									if (strToken4 == "#N{"){
										// This is not a flag; it is a branching point.
										bNodeIsBranching = true;
										bBranchingType = false;
									}else if (strToken4 == "#P{"){
										// This is not a flag; it is a branching point.
										bNodeIsBranching = true;
										bBranchingType = true;
									}else if (strToken4 != "^" && strToken4 != "=>" && strToken4.Trim() != ""){
										NString strMessage = "Please check your .bt file. There is either a missing ; or ;; or an unrecognised flag after the thread kill node:\r\n" +
											strID + " on line:\r\n" + strLine;
										CTranslateException cException(strMessage);
										throw cException;
									}else{
										strToken3 = strToken4;
										strToken4 = "";
									}
								}
							}
						}else{
							bEndOfLine = true;
							
							strToken3.Trim();
							if (strToken3 == "#N{"){
								// This is not a flag; it is a branching point.
								bNodeIsBranching = true;
								bBranchingType = false;
								strToken3 = "";
							}else if (strToken3 == "#P{"){
								// This is not a flag; it is a branching point.
								bNodeIsBranching = true;
								bBranchingType = true;
								strToken3 = "";
							}else if (strToken3 != "^" && strToken3 != "=>" && strToken3.Trim() != ""){
								// The only valid possibility is that it contains a label for a reference node.
								// It can only be a label followed by a space and then a ; or ;; character,
								// or a label followed by a => or ^ character with or without a space.
								// Labels followed by a ; or ;; character without a space in between would have already been taken
								// care of in an earlier "if" section.
																
								iPosition = strToken3.Find("=>");
								if (iPosition > -1){
									strJumpingToLabel = strToken3.Left(iPosition);

									// Check if there is anything after the => character.
									if ((strToken3.Right(strToken3.GetLength() - iPosition - 2)) != ""){
									// There is something after the ; character.
									// Note that it is assumed that it cannot be a #N or #P because then
									// textBE would have given an error.
										strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 2);
										bExtraCharacter = true;
									}

									strToken3 = "=>";
								}else{
									iPosition = strToken3.Find("^");
									if (iPosition > -1){
										strJumpingToLabel = strToken3.Left(iPosition);

										// Check if there is anything after the => character.
										if ((strToken3.Right(strToken3.GetLength() - iPosition - 1)) != ""){
										// There is something after the ; character.
										// Note that it is assumed that it cannot be a #N or #P because then
										// textBE would have given an error.
											strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 1);
											bExtraCharacter = true;
										}

										strToken3 = "^";
									}else{
											// Since it didn't have a ; or ;; or => after the label with no space, check if it's there
											// with a space.
											strToken4 = strLine.Tokenize(" \t", iTokenPos);
											while (strToken4 != "" && strToken4.Trim() == ""){  // If strToken2 is a blank space but it's not the end of the line.
												strToken4 = strLine.Tokenize(" \t", iTokenPos);
											}
											
											iPosition = strToken4.Find("=>");
											if (iPosition > -1){
												if (iPosition == 0){
													strJumpingToLabel = strToken3;

													// Check if there is anything after the => character.
													if ((strToken4.Right(strToken4.GetLength() - iPosition - 2)) != ""){
													// There is something after the ; character.
													// Note that it is assumed that it cannot be a #N or #P because then
													// textBE would have given an error.
														strToken4 = strToken4.Right(strToken4.GetLength() - iPosition - 2);
														bExtraCharacter = true;
													}

													strToken3 = "=>";
												}else{  // There was a => but something else before it.
													NString strMessage = "Please check your .bt file. There is an unexpected symbol after the node:\r\n" +
														strID + " on line:\r\n" + strLine;
													CTranslateException cException(strMessage);
													throw cException;	
												}

											}else{

												iPosition = strToken4.Find("^");
												if (iPosition > -1){
													strJumpingToLabel = strToken3;

													// Check if there is anything after the => character.
													if ((strToken4.Right(strToken4.GetLength() - iPosition - 1)) != ""){
													// There is something after the ; character.
													// Note that it is assumed that it cannot be a #N or #P because then
													// textBE would have given an error.
														strToken4 = strToken4.Right(strToken4.GetLength() - iPosition - 1);
														bExtraCharacter = true;
													}

													strToken3 = "^";
												}else{
												iPosition = strToken4.Find(";;");
												if (iPosition > -1){
													if (iPosition == 0){
														strLabel = strToken3;

														// Check if there is anything after the ;; character.
														if ((strToken4.Right(strToken4.GetLength() - iPosition - 2)) != ""){
														// There is something after the ; character.
														// Note that it is assumed that it cannot be a #N or #P because then
														// textBE would have given an error.
															strToken4 = strToken4.Right(strToken4.GetLength() - iPosition - 2);
															bExtraCharacter = true;
														}

														strToken3 = "";
														bAtomic = true;
														bSequential = false;
													}else{  // There was a ;; but something else before it.
														NString strMessage = "Please check your .bt file. There is an unexpected symbol after the node:\r\n" +
															strID + " on line:\r\n" + strLine;
														CTranslateException cException(strMessage);
														throw cException;	
													}
												}else{
													iPosition = strToken4.Find(";");
													if (iPosition > -1){
														if (iPosition == 0){
															strLabel = strToken3;

															// Check if there is anything after the ; character.
															if ((strToken4.Right(strToken4.GetLength() - iPosition - 1)) != ""){
															// There is something after the ; character.
															// Note that it is assumed that it cannot be a #N or #P because then
															// textBE would have given an error.
																strToken4 = strToken4.Right(strToken4.GetLength() - iPosition - 1);
																bExtraCharacter = true;
															}

															strToken3 = "";
															bAtomic = true;
															bSequential = false;
														}else{  // There was a ; but something else before it.
															NString strMessage = "Please check your .bt file. There is an unexpected symbol after the node:\r\n" +
																strID + " on line:\r\n" + strLine;
															CTranslateException cException(strMessage);
															throw cException;	
														}
													}else if (strToken4 == "#N{"){
														// This is not a flag; it is a branching point.
														strLabel = strToken3;
														bNodeIsBranching = true;
														bBranchingType = false;
														strToken3 = "";
													}else if (strToken4 == "#P{"){
														// This is not a flag; it is a branching point.
														strLabel = strToken3;
														bNodeIsBranching = true;
														bBranchingType = true;
														strToken3 = "";

													}else{   // This doesn't make sense (thread kills after a label are currently not allowed).
														NString strMessage = "Please check your .bt file. Unrecognised symbol after the node:\r\n" +
																strID + " on line:\r\n" + strLine;
														CTranslateException cException(strMessage);
														throw cException;	
													}

												}
											}
											}
									}
								}
							}							
						}
					}
				}
			}
		}
		
		if (bError == false){
			strID = strFirst + "_" + strSecond;
			iListPosition = FindListPosition(m_lTextBEList, strID);
			if (iListPosition == -1){ // The string was not found.
				NString strMessage = "Please check your .bt file. The following item was not defined: \r\n" + 
						strID + " on line:\r\n" + strLine;
				CTranslateException cException(strMessage);
				throw cException;
			}
			int iSuccess = m_mTextBEMap.Lookup(iListPosition, pcNode);
			if (iSuccess == 0){ // The string was not found.
				NString strMessage = "Please check your .bt file. The following item was not defined: \r\n" + 
						strID + " on line:\r\n" + strLine;
				CTranslateException cException(strMessage);
				throw cException;
			}
			// Create a new Translate Node with this information.
			CTranslateNode* pcNewNode = new CTranslateNode;
			pcNewNode->SetComponentName(pcNode->GetComponentName());
			NString strStateName = pcNode->GetStateName();
			pcNewNode->SetType(pcNode->GetType());  // This line has to be here because if it is a forall or forone
													// node, in TextBE it is also a state-change, so the forall/forone type 
													// should override the state-change type.

			if (strStateName.Left(7) == "FORONE_"){
				pcNewNode->SetType(GSE_T_SETANY);
				strStateName.Delete(0,7);
				pcNewNode->SetStateName(strStateName);
			}else if (strStateName.Left(7) == "FORALL_"){
				pcNewNode->SetType(GSE_T_SETALL);
				strStateName.Delete(0,7);
				pcNewNode->SetStateName(strStateName);
			}else{
				pcNewNode->SetStateName(strStateName);
			}
			pcNewNode->SetJumpType(0); // This will be overridden if it is a reversion or reference node.
			pcNewNode->SetSiblingNumber(0); // This will be overridden later if there are more siblings.

			pcNewNode->SetLabel(strLabel);
			pcNewNode->SetJumpingToLabel(strJumpingToLabel);
			
			if (strToken3 == "^"){
				pcNewNode->SetJumpType(1);
				strToken3 = "";
			}else if (strToken3 == "=>"){
				pcNewNode->SetJumpType(2);
				strToken3 = "";
			}
			
			if (strToken3.Trim() != ""){ 
				pcNewNode->SetFlag(strToken3);
			}
		
			int iNodeID = m_iHighestTranslateID;
			if (m_iHighestTranslateID == 1){
				pcRoot = pcNewNode;
			}
			pcNewNode->SetNodeID(iNodeID);
			m_iHighestTranslateID++;
			m_mTranslateNodes.SetAt(iNodeID, pcNewNode);
		//int iJumpType = GetNumber(strJumpType);
	//	pcNode->SetJumpType(iJumpType); Check if this is needed!!
			pcNewNode->SetIsNodeAtomic(bParentAtomic);
			if (bFirstItem && (pcRoot != pcNewNode)){
				// This is the first item on the line so it is connected by a branching point.
				// Note that this does not apply to the root node.
				CTranslateNode* pcTemp = m_lBranchingNodes.GetTail();
				pcParent = pcTemp;
				if (pcParent->GetTextBEBranchingType() == false){
					pcNewNode->SetIsNodeNonDeterministic(true);
				}else{
					pcNewNode->SetIsNodeNonDeterministic(false);
				}
			
			}else if (pcRoot == pcNewNode){
				pcNewNode->SetParent(0);
			}
			pcNewNode->SetIsNodeSetOperation(false);
			pcNewNode->SetIsBlankNode(false);
			pcNewNode->SetIsUserDefinedAttribute(false);


	//	int iSiblingNumber = GetNumber(strSiblingNumber);
	//	pcNode->SetSiblingNumber(iSiblingNumber);
		
			if (pcRoot != pcNewNode){
				pcNewNode->SetParent(pcParent->GetNodeID());

				// Add this node to the parent's list of children.
				pcParent->AddChild(pcNewNode->GetNodeID());
			}

			// If this node is the root of a branching group, add it to the branching list.
			if (bNodeIsBranching == true){
				m_lBranchingNodes.AddTail(pcNewNode);
				pcNewNode->SetTextBEBranchingType(bBranchingType);
			}

			bParentAtomic = bAtomic;
			bParentSeq = bSequential;
			bFirstItem = false;
			pcParent = pcNewNode;

			if (bExtraCharacter == true){
				// There was another node that has already been parsed due to a missing
				// space after a ; or ;; character.
				strToken  = strToken4;
				bEndOfLine = false;
			}

			// Get the next item.
			if (bEndOfLine == false){  // There are still nodes on this line.
				if (bExtraCharacter == false){  // Only do this if there wasn't an extra character that was already parsed.
												// i.e. there was no space between the previous ; or ;; and the next node.
					strToken = strLine.Tokenize(" \t", iTokenPos);
				}

				// Check if this token is a ; or ;;. That means there was a space between the last node and the ; or ;;.
				if (strToken.Trim() == ";"){
					bParentSeq = true;
					strToken = strLine.Tokenize(" \t", iTokenPos);
				}else if (strToken.Trim() == ";;"){
					bParentAtomic = true;
					strToken = strLine.Tokenize(" \t", iTokenPos);
				}
	
				while (strToken != "" && strToken.Trim() == ""){  // If strToken is a blank space 
																		  // but it's not the end of the line.
					strToken = strLine.Tokenize(" \t", iTokenPos);
				}

				if (strToken == ""){  // There is an error in the .bt file since 
										  // the last node had a ; or ;; after it but now there's no next node.
					NString strMessage = "Please check your .bt file. There is no node after the node:\r\n" + 
						strID + " on line:\r\n" + strLine;
					CTranslateException cException(strMessage);
					throw cException;
				}
				// Ignore requirements tags and +/- symbols.
				NPosition cPosition = m_lReqTags.Find(strToken.Trim());
				if (cPosition.IsNotNull()){
					// This is a requirements tag.
					strToken = strLine.Tokenize(" \t", iTokenPos);
				}
				if (!strToken.IsEmpty()){
					strToken.Trim();
					if ((strToken == "-") || (strToken == "+") || (strToken == "--") || (strToken == "+-") || (strToken == "++")){
						// Ignore this tag.
						strToken = strLine.Tokenize(" \t", iTokenPos);
					}
				}

			}else{  // There are no more nodes on this line.
				strToken = "";
			}
		}
		}else{  // There is an error in the .bt file since there's a component name with no state name.
				NString strMessage = "Please check your .bt file. There is no state name after the component with ID:\r\n" 
					+ strToken + " on line:\r\n" + strLine;
				CTranslateException cException(strMessage);
				throw cException;
			}
		}
		if (bError == true){
			return NULL;
		}
		return pcRoot;
}

void CTranslateSALMain::AddElementToSet(NString strElement, NString strSet){
	//// Do something here if the set name isn't already in the list
	//// - this means that its type wasn't declared.

	int iSetTypePosition = FindListPosition(m_cSetTypes, strSet);
	NList<NString, NString>* plElements;
	int iSuccess = m_cSetElements.Lookup(iSetTypePosition, plElements);
	if (iSuccess == 0){ // No elements are currently associated with this set type.
		plElements = new NList<NString, NString>;
		plElements->AddTail(strElement);
		m_cSetElements.SetAt(iSetTypePosition, plElements);
	
	}else{ // There are already elements.
		NPosition cPos = plElements->Find(strElement);
		if (cPos.IsNull()){ // This element is not already in the list.
			plElements->AddTail(strElement);
			m_cSetElements.SetAt(iSetTypePosition, plElements);
		}
	}
}

void CTranslateSALMain::AddUniqueElementToSet(NString strElement, NString strSet){
	//// Do something here if the set name isn't already in the list
	//// - this means that its type wasn't declared.

	int iSetTypePosition = FindListPosition(m_cUniqueSetTypes, strSet);
	NList<NString, NString>* plElements;
	int iSuccess = m_cUniqueSetElements.Lookup(iSetTypePosition, plElements);
	if (iSuccess == 0){ // No elements are currently associated with this set type.
		plElements = new NList<NString, NString>;
		plElements->AddTail(strElement);
		m_cUniqueSetElements.SetAt(iSetTypePosition, plElements);
	
	}else{ // There are already elements.
		NPosition cPos = plElements->Find(strElement);
		if (cPos.IsNull()){ // This element is not already in the list.
			plElements->AddTail(strElement);
			m_cUniqueSetElements.SetAt(iSetTypePosition, plElements);
		}
	}
}

void CTranslateSALMain::AddInitialElement(NString strElement, NString strSet){
	//// Do something here if the set name isn't already in the list
	//// - this means that its type wasn't declared.

	int iSetNamePosition = FindListPosition(m_cSetNames, strSet);
	NList<NString, NString>* plElements;
	int iSuccess = m_cInitSetElements.Lookup(iSetNamePosition, plElements);
	if (iSuccess == 0){ // No elements are currently associated with this set type.
		plElements = new NList<NString, NString>;
		plElements->AddTail(strElement);
		m_cInitSetElements.SetAt(iSetNamePosition, plElements);
	
	}else{ // There are already elements.
		NPosition cPos = plElements->Find(strElement);
		if (cPos.IsNull()){ // This element is not already in the list.
			plElements->AddTail(strElement);
			m_cInitSetElements.SetAt(iSetNamePosition, plElements);
		}
	}
}
/*
void CTranslateSALMain::ReadSetElements(){
	FILE *pcFile;
	NString strLine;
	char cLine[4096];

	// Show a file dialog box.
	CFileDialog cFileDlg (TRUE, NULL, "*.*",
		OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
   
   
	if( cFileDlg.DoModal ()==IDOK )
	{
		NString strPathName = cFileDlg.GetPathName();
		NString strFileName = cFileDlg.GetFileName();
		
		// Read the selected file.
		_tfopen_s(&pcFile,(LPCTSTR)strPathName ,"rt");

		while(!feof(pcFile)) {
			fgets(cLine,4096,pcFile); 
			strLine = cLine;
			StoreElementInformation(strLine);
		}
		fclose(pcFile);
	}
}

void CTranslateSALMain::StoreElementInformation(NString strLine){
	// Remove the last character as it is a line break character.
	int iLength = strLine.GetLength();
	strLine.Truncate(iLength - 1);
	
	// Get the set type.
	int iTokenPos = 0;
	NString strSetType = strLine.Tokenize(","), iTokenPos;
	
	// Get the set elements.
	for (int i = 0; i < 3; i++){
		NString strElement = strLine.Tokenize(","), iTokenPos;
		if (strElement != ""){ // Sometimes there may be less than 3 elements.
			AddElementToSet(strElement, strSetType);
		}
	}
	//////// Throw an error here if there are more elements than three.
}
*/

void CTranslateSALMain::MatchSetExpression(CTranslateNode* pcNode){
//	FILE *pcFile;
	NString strStateName;
	NString strSetName;
	NString strSetType;
	NString strElement;
	NString strToken1;
	NString strToken2; 
	NString strToken3;
	NString strToken4;
	NString strToken5;
	NString strToken6;

//	char cLine[4096];

//	NString strPathName = "C:/sets/SetParserOutput.txt";
		
//	// Read the selected file.
//	_tfopen_s(&pcFile,(LPCTSTR)strPathName ,"rt");

//	// Read the first line of the file.
//	if (!feof(pcFile)){
//		fgets(cLine, 4096, pcFile);
//		strLine = cLine;
//		int iLength = strLine.GetLength();
//		strLine.Truncate(iLength - 1);
//	}
	// Read the rest of the lines. At each iteration, reads
	// the next line and analyses the previous line. This is 
	// because for some cases the next line is needed to decipher
	// the previous line and if it wasn't done this way, the next
	// line would not be analysed.
//	while(!feof(pcFile)) {
//		fgets(cLine,4096,pcFile); 
//		strNextLine = cLine;
//		int iNextLength = strNextLine.GetLength();
//		strNextLine.Truncate(iNextLength - 1);

	NString strComponentName = pcNode->GetComponentName();
	strComponentName = TrimChangeCase(strComponentName,false);
	strStateName = pcNode->GetStateName();
	int iType = pcNode->GetType();
	if (iType == GSE_T_STATE){
		int iTokenPos1 = 0;
		strToken1 = strStateName.Tokenize(":=", iTokenPos1);
		strToken2 = strStateName.Tokenize(":=", iTokenPos1);
		if (strToken2 != ""){   // Note that if it doesn't contain ":=",
									// it must be a normal state realisation (not sets).
			strSetName = strToken1;
			strSetType = GetSetType(strSetName, pcNode);
			if (strSetType != ""){   // This is a node with set operations.
				pcNode->SetIsNodeSetOperation(true);
				int iTokenPos2 = 0;
				strToken3 = strToken2.Tokenize("+", iTokenPos2);
				strToken4 = strToken2.Tokenize("+", iTokenPos2);
				if (strToken4 != ""){  // The string is in the format S := S + T or S := S + {x}
					if (strToken3 != strSetName){
						// The first part of the addition is not the same set.
						NString strMessage = "Invalid set operation:\r\n";
						strMessage = strMessage + "For set union or set addition, the set name after ':=' must be identical to the name before it.\r\n";
						strMessage = strMessage + "Node: " + pcNode->GetStateName();
						CTranslateException cException(strMessage);
						throw cException;
					}
					int iTokenPos3 = 0;
					strToken5 = strToken4.Tokenize("{", iTokenPos3);
					if (strToken5 != strToken4){  // This means that the "{" was found, but since there
												  // was nothing before it, the rest of the string went into strToken5.
						int iTokenPos4 = 0;
						strToken6 = strToken5.Tokenize("}", iTokenPos4);
						if (strToken6 == strToken5){  // The closing bracket wasn't found.
							NString strMessage = "Invalid set operation:\r\n";
							strMessage = strMessage + "Closing bracket not found for the set addition node:\r\n";
							strMessage = strMessage + pcNode->GetStateName();
							CTranslateException cException(strMessage);
							throw cException;
						}
						strElement = strToken6;
						pcNode->AddSetRule("add");
					
					}else{  // This is a set union node.
						strElement = strToken4;  // The other set name.
						pcNode->AddSetRule("union");
					}
				
				}else{
					iTokenPos2 = 0;
					strToken3 = strToken2.Tokenize("-", iTokenPos2);
					strToken4 = strToken2.Tokenize("-", iTokenPos2);
					if (strToken4 != ""){  // The string is in the format S := S - T or S := S - {x}
						if (strToken3 != strSetName){
							// The first part of the subtraction is not the same set.
							NString strMessage = "Invalid set operation:\r\n";
							strMessage = strMessage + "For set difference or set subtraction, the set name after ':=' must be identical to the name before it.\r\n";
							strMessage = strMessage + "Node: " + pcNode->GetStateName();
							CTranslateException cException(strMessage);
							throw cException;
						}
						int iTokenPos3 = 0;
						strToken5 = strToken4.Tokenize("{", iTokenPos3);
						if (strToken5 != strToken4){  // This means that the "{" was found, but since there
													  // was nothing before it, the rest of the string went into strToken5.
							int iTokenPos4 = 0;
							strToken6 = strToken5.Tokenize("}", iTokenPos4);
							if (strToken6 == strToken5){  // The closing bracket wasn't found.
								NString strMessage = "Invalid set operation:\r\n";
								strMessage = strMessage + "Closing bracket not found for the set subtraction node:\r\n";
								strMessage = strMessage + pcNode->GetStateName();
								CTranslateException cException(strMessage);
								throw cException;
							}
							strElement = strToken6;
							pcNode->AddSetRule("subtract");
					
						}else{  // This is a set union node.
							strElement = strToken4;  // The other set name.
							pcNode->AddSetRule("difference");
						}
					}else{
						iTokenPos2 = 0;
						strToken3 = strToken2.Tokenize("><", iTokenPos2);
						strToken4 = strToken2.Tokenize("><", iTokenPos2);
						if (strToken4 != ""){  // The string is in the format S := S >< T 
							if (strToken3 != strSetName){
								// The first part of the expression is not the same set.
								NString strMessage = "Invalid set operation:\r\n";
								strMessage = strMessage + "For set intersection, the set name after ':=' must be identical to the name before it.\r\n";
								strMessage = strMessage + "Node: " + pcNode->GetStateName();
								CTranslateException cException(strMessage);
								throw cException;
							}
							strElement = strToken4;  // The other set name.
							pcNode->AddSetRule("intersection");
						
						}else if (strToken2 == "{}"){  // The string is in the format S := {}
							strElement = "";
							pcNode->AddSetRule("empty");
						}else{  // The string is unrecognised.
							NString strMessage = "Unrecognised set expression.\r\n";
							strMessage = strMessage + "If it is not a set node, make sure its attribute name does not conflict with any names of sets.\r\n";
							strMessage = strMessage + "Node: " + pcNode->GetStateName();
							CTranslateException cException(strMessage);
							throw cException;
						}
					}
				}
				pcNode->AddSetVariable(strSetName);
				pcNode->AddSetVariable(strElement);
			}
		}
	}else if ((iType == GSE_T_CONDITION) || (iType == GSE_T_GUARD)){
		int iTokenPos1 = 0;
		strToken1 = strStateName.Tokenize(":", iTokenPos1);
		strToken2 = strStateName.Tokenize(":", iTokenPos1);
		if (strToken2 != ""){  // The string is in the format x : S
			strSetName = strToken2;
			strElement = strToken1;
			pcNode->AddSetRule("membership");
			pcNode->SetIsNodeSetOperation(true);
			pcNode->AddSetVariable(strSetName);
			pcNode->AddSetVariable(strElement);
		}else{
			iTokenPos1 = 0;
			strToken1 = strStateName.Tokenize("=", iTokenPos1);
			strToken2 = strStateName.Tokenize("=", iTokenPos1);
			if (strToken2 == "{}"){ // The string is in the format S = {}
				strSetName = strToken1;
				strElement = "";
				pcNode->AddSetRule("empty");
				pcNode->SetIsNodeSetOperation(true);
				pcNode->AddSetVariable(strSetName);
				pcNode->AddSetVariable(strElement);
			}else{
				if (strStateName.Left(1) == "|"){
					iTokenPos1 = 0;
					strToken1 = strStateName.Tokenize("|", iTokenPos1);
					strToken2 = strStateName.Tokenize("|", iTokenPos1);
					if (strToken2 != ""){ // The string is in the format |S| ? number, where ? can be =, <, >, <= or >=
						pcNode->SetIsNodeSetOperation(true);
						strSetName = strToken1;
						pcNode->AddSetRule("cardinality");
					
						if (strToken2.Left(2) == ">="){
							pcNode->AddSetRule("GreaterThanOrEqual");
							strToken2.Delete(0,2);
							strElement = strToken2;
						}else if (strToken2.Left(2) == "<="){
							pcNode->AddSetRule("LessThanOrEqual");
							strToken2.Delete(0,2);
							strElement = strToken2;
						}else if (strToken2.Left(1) == "="){
							pcNode->AddSetRule("EqualTo");
							strToken2.Delete(0,1);
							strElement = strToken2;
						}else if (strToken2.Left(1) == ">"){
							pcNode->AddSetRule("GreaterThan");
							strToken2.Delete(0,1);
							strElement = strToken2;
						}else if (strToken2.Left(1) == "<"){
							pcNode->AddSetRule("LessThan");
							strToken2.Delete(0,1);
							strElement = strToken2;
						}else{ // The expression is not valid.
							NString strMessage = "Unrecognised set expression.\r\n";
							strMessage = strMessage + "If it is not a set node, please remove the '|' characters.\r\n";
							strMessage = strMessage + "Node: " + pcNode->GetStateName();
							CTranslateException cException(strMessage);
							throw cException;
						}
						pcNode->AddSetVariable(strSetName);
						pcNode->AddSetVariable(strElement);
					}else{  // Either this is a set node that is missing a "|" or this is
						    // a non-set node that has a "|" which it should not have.
						NString strMessage = "Unrecognised set expression.\r\n";
						strMessage = strMessage + "If it is not a set node, please remove the '|' characters.\r\n";
						strMessage = strMessage + "Node: " + pcNode->GetStateName();
						CTranslateException cException(strMessage);
						throw cException;
					}
				}
			}
		}





	}else{  // The type is not valid for a set node.
		//// Throw exception.
	}

	







	/*	if (strLine.Left(5) == "VALUE"){
			// Store the variable or number that follows.

			if (strNextLine.Right(4) == "Name"){
				// It was a name of a variable.
				// Ignore the first 6 characters which say "VALUE_".
				NString strVariable = strLine.Mid(6); 
				pcNode->AddSetVariable(strVariable);

			}else if (strNextLine.Right(3) == "Num"){
				// It was a number - note: assuming that there can only be one
				// number per expression.
				NString strVariable = strLine.Mid(6); 
				pcNode->AddSetVariable(strVariable);
		//////////// Note: The above line should be changed to convert the variable to an int
				////////// and then store it as a number.

			}else if (strLine.Right(3) == "NOT"){
				pcNode->AddSetRule("NOT");
			}

		}else if (strLine.Left(4) == "RULE"){
			if (strLine.Mid(6,4) == "card"){
				pcNode->AddSetRule("cardinality");

			}else if (strLine.Mid(6,7) == "boolsym"){
				// Store the "LessThan" or "GreaterThan", etc. part.
				if (strLine.Mid(19) != ""){
					NString strBoolSymbol = strLine.Mid(19);
					if (strBoolSymbol != ""){
						// The "LessThan", etc. part is there - It is not a case where it is blank.
						pcNode->AddSetRule(strLine.Mid(19));
					}
				}
			}else if (strLine.Mid(6,5) == "union"){
				pcNode->AddSetRule("union");

			}else if (strLine.Mid(6,9) == "Attribute"){
				pcNode->AddSetRule("attribute");

			}else if (strLine.Mid(6,5) == "empty"){
				pcNode->AddSetRule("empty");

			}else if (strLine.Mid(6,3) == "mem"){
				pcNode->AddSetRule("membership");

			}else if (strLine.Mid(6,4) == "diff"){
				pcNode->AddSetRule("difference");

			}else if (strLine.Mid(6,9) == "intersect"){
				pcNode->AddSetRule("intersection");
			
			}else if (strLine.Mid(6,6) == "subset"){
				pcNode->AddSetRule("subset");
			}
			// Ignore all other cases.
		}
		strLine = strNextLine; */
//	}
//	fclose(pcFile);
}

NString CTranslateSALMain::GetSetType(NString strSetName, CTranslateNode* pcNode){
	strSetName = TrimChangeCase(strSetName,true);
	int iNamePosition = FindListPosition(m_cSetNames, strSetName);
	int iTypePosition;
	int iSuccess = m_cSetNamesToTypes.Lookup(iNamePosition, iTypePosition);
	if (iSuccess != 0){
		NString strType = GetListElement(m_cSetTypes, iTypePosition);
		strType = TrimChangeCase(strType,true);
		return strType;
	}
	return NULL;
}

void CTranslateSALMain::ExpandBranches(CTranslateNode* pcRoot){
	CTranslateNode* pcTopNode = ExpandNode(pcRoot); 
	// The returned node is the parent of the expanded sub-tree.
	// This is different to pcRoot because after expansion,
	// pcRoot isn't part of the tree anymore.
	CTranslateNode* pcChild;
	int iNumberOfChildren = pcTopNode->GetNumberOfChildren();

	for (int i = 0; i < iNumberOfChildren; i++){
		int iChildID = pcTopNode->GetChildID(i);
		pcChild = GetNode(iChildID);
		ExpandBranches(pcChild);
	}
}

CTranslateNode* CTranslateSALMain::ExpandNode(CTranslateNode* pcNode){
	bool bIsBlankNode = pcNode->IsBlankNode();
	if (!bIsBlankNode){  // Don't expand if it's a blank node.
		int iNode = pcNode->GetNodeID();
		int iType = pcNode->GetType();
		if ((iType == GSE_T_SETALL) || (iType == GSE_T_SETANY)){
			int iSetTypeLocation;
			NString strState = pcNode->GetStateName();
			int iPosition = 0;
			// Get the name used in place of the element name, e.g. for all c:Courses
			// would return "c".
			NString strOriginal = strState.Tokenize(":",iPosition);
			// Get the name of the set, e.g. for all c:Courses would return "Courses".
			NString strSetName = strState.Tokenize(":",iPosition);
			strOriginal.Trim();
			strSetName.Trim();
			strSetName = TrimChangeCase(strSetName,true);
		//	strOriginal = TrimChangeCase(strOriginal,false);
			// Find out the set type.
			int iSetNameLocation = FindListPosition(m_cSetNames, strSetName);
			int iSuccess = m_cSetNamesToTypes.Lookup(iSetNameLocation,iSetTypeLocation);		
			if (iSuccess == 0){  // The set name wasn't found.
				NString strMessage = "Unknown set name: " + strSetName;
				strMessage = strMessage + "\n\rPlease check your set information file.";
				CTranslateException cException(strMessage);
				throw cException;
			}

			NString strSetType = GetListElement(m_cSetTypes,iSetTypeLocation);
			strSetType = TrimChangeCase(strSetType,true);
			if (pcNode->GetComponentName() != strSetName){
				strSetName = pcNode->GetComponentName() + "_" + strSetName;
			}
			NList<NString, NString>* plElements;
			int iSuccess2 = m_cSetElements.Lookup(iSetTypeLocation,plElements);
			if (iSuccess2 == 0){  // The set elements weren't found.
				NString strMessage = "Set elements not defined for set type:" + strSetType;
				strMessage = strMessage + "\n\rPlease check your set information file.";
				CTranslateException cException(strMessage);
				throw cException;
			}

			int iNumberOfElements = (int) plElements->GetSize();
			// Check whether this node is part of a branch.
			int iSiblingNumber = pcNode->GetSiblingNumber();
			if (iSiblingNumber == 0){   // This node is not part of a branch.
				// Get this node's sets guard, if it has one.
				NString strEarlierSetsGuard = pcNode->RetrieveSetsGuard();

				// Create duplicate sub-trees for each element.
				// Since there's already one present, create n-1 trees.
				int iParent = pcNode->GetParent();
				CTranslateNode* pcParent;
				pcParent = GetNode(iParent);
				CTranslateNode* pcSubTreeRoot;
				for (int i = 0; i < iNumberOfElements-1; i++){
					pcSubTreeRoot = CopyTreeBelow(pcNode);
					// Set the sub-tree's parent to be this node's parent.
					int iSubTreeRoot = pcSubTreeRoot->GetNodeID();
					pcSubTreeRoot->SetParent(iParent);
					pcParent->AddChild(iSubTreeRoot);
					pcSubTreeRoot->SetSiblingNumber(iNumberOfElements-1);
					// Add a guard for checking whether the element is currently in the set.
					NString strElement = GetListElement(*plElements,i+1);
					NString strGuard = "set{" + strSetType + "}!contains?(" 
						+ TrimChangeCase(strSetName, false) + "," + strElement + ")";
					if (strEarlierSetsGuard != ""){ // The set node had a sets guard already.
						// i.e. The set node was a child of another set node.
						strGuard = strEarlierSetsGuard + " AND " + strGuard;
					}
					pcSubTreeRoot->StoreSetsGuard(strGuard);
				}

				// Remove this node from the parent.
				pcNode->SetParent(0);
				int iNodeLocation = pcParent->GetChildLocation(iNode);
				pcParent->RemoveChild(iNode);
				// Add this node's subtree to the parent.
				int iImmediateChildrenNumber = pcNode->GetNumberOfChildren();
				CTranslateNode* pcTopOfSubtree;
				int iTopOfSubtreeID;
			
				if (iImmediateChildrenNumber > 1){
					// Create a blank node to hold all the top nodes of the subtree together.
					pcTopOfSubtree = new CTranslateNode();
					iTopOfSubtreeID = m_iHighestTranslateID;
					pcTopOfSubtree->SetNodeID(iTopOfSubtreeID);
					m_mTranslateNodes.SetAt(m_iHighestTranslateID, pcTopOfSubtree);
					m_iHighestTranslateID++;
					pcTopOfSubtree->SetIsBlankNode(true);
					pcTopOfSubtree->SetIsNodeSetOperation(false);

					// Set the blank node to be the parent of pcNode's immediate children.
					for (int k = 0; k < iImmediateChildrenNumber; k++){
						int iImmediateChild = pcNode->GetChildID(k);
						pcTopOfSubtree->AddChild(iImmediateChild);
						CTranslateNode* pcImmediateChild = GetNode(iImmediateChild);
						pcImmediateChild->SetParent(iTopOfSubtreeID);
					}
				
				}else{  // There's only 1 child so there's no need of a blank node.
					iTopOfSubtreeID = pcNode->GetChildID(0);
					pcTopOfSubtree = GetNode(iTopOfSubtreeID);
				}

				// Add the new child at the same position that iNode used to have,
				// to prevent problems when continuing the expand branches depth-first traversal.
				pcParent->AddChildAtPosition(iTopOfSubtreeID,iNodeLocation);
				pcTopOfSubtree->SetParent(iParent);
				pcTopOfSubtree->SetSiblingNumber(iNumberOfElements-1);
				
				// Add a guard for checking whether the element is currently in the set.
				NString strElement = GetListElement(*plElements,0);
				NString strGuard = "set{" + strSetType + "}!contains?(" 
					+ TrimChangeCase(strSetName, false) + "," + strElement + ")";
				if (strEarlierSetsGuard != ""){ // The set node had a sets guard already.
					// i.e. The set node was a child of another set node.
					strGuard = strEarlierSetsGuard + " AND " + strGuard;
				}
				pcTopOfSubtree->StoreSetsGuard(strGuard);

				// Replace all the occurrences of the iterator name
				// in the sub-trees with the name of the elements in the set.
				// e.g. for ||s:Staff, then all nodes with "s" are replaced
				// with "s1", "s2", etc. if those were the element names.
				for (int j = 0; j < iNumberOfElements; j++){
					strElement = GetListElement(*plElements,j);
					int iChildID = pcParent->GetChildID(j);
					pcSubTreeRoot = GetNode(iChildID);
					RenameTree(pcSubTreeRoot, strOriginal, strElement);
					
					// If it's a || for all node, then do concurrent branching.
					if (iType == GSE_T_SETALL){
						pcSubTreeRoot->SetIsNodeNonDeterministic(false);
					}else{ // If it's a [] for some node, then do alternative branching.
						pcSubTreeRoot->SetIsNodeNonDeterministic(true);
					}
				}
				m_mTranslateNodes.RemoveKey(iNode);
				delete pcNode; // Delete since it can no longer be reached.

				return pcParent;

			}else{   // This node is part of a branch.
				// Get this node's sets guard, if it has one.
				NString strEarlierSetsGuard = pcNode->RetrieveSetsGuard();

				// Create a blank node to hold the new sub-trees together.
				CTranslateNode* pcBlankNode = new CTranslateNode;
				int iBlankNode = m_iHighestTranslateID;
				pcBlankNode->SetNodeID(iBlankNode);
				m_mTranslateNodes.SetAt(m_iHighestTranslateID, pcBlankNode);
				m_iHighestTranslateID++;
				pcBlankNode->SetIsBlankNode(true);
				pcBlankNode->SetSiblingNumber(iSiblingNumber);
				pcBlankNode->SetIsNodeNonDeterministic(pcNode->IsNodeNonDeterministic());
				pcBlankNode->SetIsNodeSetOperation(false);
				
				// Create duplicate sub-trees for each element.
				// Since there's already one present, create n-1 trees.
				int iParent = pcNode->GetParent();
				CTranslateNode* pcParent;
				pcParent = GetNode(iParent);
				CTranslateNode* pcSubTreeRoot;
				
				for (int i = 0; i < iNumberOfElements-1; i++){
					pcSubTreeRoot = CopyTreeBelow(pcNode);
					// Set the sub-tree's parent to be the blank node.
					int iSubTreeRoot = pcSubTreeRoot->GetNodeID();
					pcSubTreeRoot->SetParent(iBlankNode);
					pcBlankNode->AddChild(iSubTreeRoot);
					pcSubTreeRoot->SetSiblingNumber(iNumberOfElements-1);
					// Add a guard for checking whether the element is currently in the set.
					NString strElement = GetListElement(*plElements,i+1);
					NString strGuard = "set{" + strSetType + "}!contains?(" 
						+ TrimChangeCase(strSetName, false) + "," + strElement + ")";
					if (strEarlierSetsGuard != ""){ // The set node had a sets guard already.
						// i.e. The set node was a child of another set node.
						strGuard = strEarlierSetsGuard + " AND " + strGuard;
					}
					pcSubTreeRoot->StoreSetsGuard(strGuard);
				}

				// Set the parent of the blank node to be this node's parent.
				pcBlankNode->SetParent(iParent);
				int iNodeLocation = pcParent->GetChildLocation(iNode);
				pcParent->AddChildAtPosition(iBlankNode, iNodeLocation);

				// Remove this node from the parent.
				pcNode->SetParent(0);
				pcParent->RemoveChild(iNode);
				// Add this node's subtree to the blank node.
				int iImmediateChildrenNumber = pcNode->GetNumberOfChildren();
				CTranslateNode* pcTopOfSubtree;
				int iTopOfSubtreeID;
			
				if (iImmediateChildrenNumber > 1){
					// Create a blank node to hold all the top nodes of the subtree together.
					pcTopOfSubtree = new CTranslateNode();
					iTopOfSubtreeID = m_iHighestTranslateID;
					pcTopOfSubtree->SetNodeID(iTopOfSubtreeID);
					m_mTranslateNodes.SetAt(m_iHighestTranslateID, pcTopOfSubtree);
					m_iHighestTranslateID++;
					pcTopOfSubtree->SetIsBlankNode(true);
					pcTopOfSubtree->SetIsNodeSetOperation(false);

					// Set the blank node to be the parent of pcNode's immediate children.
					for (int k = 0; k < iImmediateChildrenNumber; k++){
						int iImmediateChild = pcNode->GetChildID(k);
						pcTopOfSubtree->AddChild(iImmediateChild);
						CTranslateNode* pcImmediateChild = GetNode(iImmediateChild);
						pcImmediateChild->SetParent(iTopOfSubtreeID);
					}
				
				}else{  // There's only 1 child so there's no need of a blank node.
					iTopOfSubtreeID = pcNode->GetChildID(0);
					pcTopOfSubtree = GetNode(iTopOfSubtreeID);
				}
				
				pcBlankNode->AddChildAtPosition(iTopOfSubtreeID,0);
				pcTopOfSubtree->SetParent(iBlankNode);
				pcTopOfSubtree->SetSiblingNumber(iNumberOfElements-1);
				// Add a guard for checking whether the element is currently in the set.
				NString strElement = GetListElement(*plElements,0);
				NString strGuard = "set{" + strSetType + "}!contains?(" 
					+ TrimChangeCase(strSetName, false) + "," + strElement + ")";
				if (strEarlierSetsGuard != ""){ // The set node had a sets guard already.
					// i.e. The set node was a child of another set node.
					strGuard = strEarlierSetsGuard + " AND " + strGuard;
				}
				pcTopOfSubtree->StoreSetsGuard(strGuard);

				// Replace all the occurrences of the iterator name
				// in the sub-trees with the name of the elements in the set.
				// e.g. for ||s:Staff, then all nodes with "s" are replaced
				// with "s1", "s2", etc. if those were the element names.
				int iPosition = 0;
				NString strState = pcNode->GetStateName();
				NString strOriginal = strState.Tokenize(":",iPosition);
				for (int j = 0; j < iNumberOfElements; j++){
					strElement = GetListElement(*plElements,j);
					int iChildID = pcBlankNode->GetChildID(j);
					pcSubTreeRoot = GetNode(iChildID);
					RenameTree(pcSubTreeRoot, strOriginal, strElement);
					
					// If it's a || for all node, then do concurrent branching.
					if (iType == GSE_T_SETALL){
						pcSubTreeRoot->SetIsNodeNonDeterministic(false);
					}else{ // If it's a [] for some node, then do alternative branching.
						pcSubTreeRoot->SetIsNodeNonDeterministic(true);
					}
				}
				m_mTranslateNodes.RemoveKey(iNode);
				delete pcNode; // Delete since it can no longer be reached.

				return pcBlankNode;
			}
		}
	}
	return pcNode; // This wasn't a node that was expanded so return it.
}

CTranslateNode* CTranslateSALMain::CopyTreeBelow(CTranslateNode *pcRoot){
	CTranslateNode* pcNode = NULL;
	int iChildNumber = pcRoot->GetNumberOfChildren();
	int iChild;
	if (iChildNumber == 1){ // There is only one child.
		iChild = pcRoot->GetChildID(0);
		CTranslateNode* pcChild = GetNode(iChild);
		pcNode = CopySubTree(pcChild); // Return the new child.
	
	}else if (iChildNumber > 1){ // There is more than one child.	
		// Create a blank node for holding all the branches together.
		// This is the node that will be returned.
		pcNode = new CTranslateNode;
		int iNodeID = m_iHighestTranslateID;
		pcNode->SetNodeID(iNodeID);
		m_mTranslateNodes.SetAt(m_iHighestTranslateID, pcNode);
		m_iHighestTranslateID++;
		pcNode->SetIsBlankNode(true);

		for (int i = 0; i < iChildNumber; i++){
			iChild = pcRoot->GetChildID(i);
			CTranslateNode* pcChild = GetNode(iChild);
			CTranslateNode* pcNewChild;
			pcNewChild = CopySubTree(pcChild);
			int iNewChildID = pcNewChild->GetNodeID();
			pcNode->AddChild(iNewChildID);
			pcNewChild->SetParent(iNodeID);
		}
	}
	return pcNode;
}

CTranslateNode* CTranslateSALMain::CopySubTree(CTranslateNode *pcRoot){
	CTranslateNode* pcNode = new CTranslateNode;
	int iNodeID = m_iHighestTranslateID;
	pcNode->SetNodeID(iNodeID);
	m_mTranslateNodes.SetAt(m_iHighestTranslateID, pcNode);
	m_iHighestTranslateID++;
	pcNode->SetComponentName(pcRoot->GetComponentName());
	pcNode->SetStateName(pcRoot->GetStateName());
	pcNode->SetBranchingType(pcRoot->GetBranchingType());
	pcNode->SetFlag(pcRoot->GetFlag());
	pcNode->SetIsBlankNode(pcRoot->IsBlankNode());
	pcNode->SetIsNodeAtomic(pcRoot->IsNodeAtomic());
	pcNode->SetIsNodeNonDeterministic(pcRoot->IsNodeNonDeterministic());
	pcNode->SetIsNodeSetOperation(pcRoot->IsNodeSetOperation());
	pcNode->SetJumpType(pcRoot->GetJumpType());
	pcNode->SetSiblingNumber(pcRoot->GetSiblingNumber());
	pcNode->SetType(pcRoot->GetType());
	pcNode->SetIsUserDefinedAttribute(pcRoot->IsUserDefinedAttribute());
	pcNode->SetAttributeType(pcRoot->GetAttributeType());
	pcNode->StoreTheParentSet(pcRoot->GetTheParentSet());
	pcNode->StoreTheOriginalName(pcRoot->GetTheOriginalName());

	int iChildNumber = pcRoot->GetNumberOfChildren();
	int iChild;
	for (int i = 0; i < iChildNumber; i++){
		iChild = pcRoot->GetChildID(i);
		CTranslateNode* pcChild = GetNode(iChild);
		CTranslateNode* pcNewChild;
		pcNewChild = CopySubTree(pcChild);
		int iNewChildID = pcNewChild->GetNodeID();
		pcNode->AddChild(iNewChildID);
		pcNewChild->SetParent(iNodeID);
	}
	return pcNode;
}

void CTranslateSALMain::RenameTree(CTranslateNode *pcRoot, NString strOriginalName, NString strNewName){
	// If the component name matches, then rename it.
	NString strComponentName = pcRoot->GetComponentName();
	// Remove spaces to ensure that 
	// they are both compared correctly, e.g. it will still
	// think that "Course" and "Course " are the same, even though
	// one has an extra space.
	strComponentName.Trim();
	strOriginalName.Trim();
	strNewName.Trim();
	
	if (strComponentName == strOriginalName){
		pcRoot->SetComponentName(strNewName+"Component"); // The word 'Component' is necessary because SAL does not allow the name of a
															  // set element to be used as a local variable.
		pcRoot->StoreTheParentSet(strOriginalName);
	}

	NString strState = pcRoot->GetStateName();
		
	// If the node's state contains the name and it is a set expression,
	// then rename it. Note that this only renames states that have the form:
	// s:=s+{t} (when renaming t to something else) or
	// t:n (when renaming t to something else) or
	// NOT(t:n) (when renaming t to something else).
	// There should be no spaces next to the colon in the last two forms shown above.
//	if (pcRoot->IsNodeSetOperation()){
		// Each separate case is handled below, because if strOriginalName is just replaced
		// with strNewName, it will also remove cases where the original name was just a part
		// of a different name. See below for more description about this.
		strState.Replace("{"+strOriginalName+"}", "{"+strNewName+"}");
		strState.Replace(strOriginalName+":", strNewName+":");
		strState.Replace(strOriginalName+" :", strNewName+" :");
		pcRoot->SetStateName(strState);
//	}

	// Replace states in the form: s:=t or s=t where t is the name being renamed.
	NString strToken;
	NString strToken2;
	int iTokenPos = 0;
	if (strState.Find(":=") != -1){
		strToken = strState.Tokenize(":=", iTokenPos);
		strToken2 = strState.Tokenize(":=", iTokenPos);
		strToken2.Trim();
		if (strToken2 == strOriginalName){ // The attribute name must be replaced.
			strState = strToken + ":=" + strNewName;	
			// The original name is still needed to check if this is a user-defined
			// attribute, so store it.
			pcRoot->StoreTheOriginalName(strOriginalName);
		}
	}else if (strState.Find("=") != -1){
		iTokenPos = 0;
		strToken = strState.Tokenize("=", iTokenPos);
		strToken2 = strState.Tokenize("=", iTokenPos);
		strToken2.Trim();
		if (strToken2 == strOriginalName){ // The attribute name must be replaced.
			strState = strToken + "=" + strNewName;	
			// The original name is still needed to check if this is a user-defined
			// attribute, so store it.
			pcRoot->StoreTheOriginalName(strOriginalName);
		}
	}

	// Rename user-defined attributes that are written in a format such as "Course_ID".
	// e.g. "Course_ID" may be replaced to "c1_ID". The same problem as described above
	// applies to this case, when another attribute ends with this name, e.g. "LastCourse_Text"
	// would be replaced with "Lastc1_Text".
	strState.Replace(strOriginalName+"_", strNewName+"Component_");
	pcRoot->SetStateName(strState);

	// Rename the rest of the tree.
	int iNumberOfChildren = pcRoot->GetNumberOfChildren();
	for (int i = 0; i < iNumberOfChildren; i++){
		int iChild = pcRoot->GetChildID(i);
		CTranslateNode* pcChild = GetNode(iChild);
		RenameTree(pcChild,strOriginalName,strNewName);
	}
}

// Replace user-defined alternative attribute names with their proper
// attribute names.
void CTranslateSALMain::ReplaceAttributes(CTranslateNode *pcRoot){
	NPosition cPosition;
	cPosition = m_lAlternateNames.GetHeadPosition();
	int iAltLocation = 0;
	while (cPosition.IsNotNull()){ // For each alternative name in the list.
		NString strAltName = m_lAlternateNames.GetNext(cPosition);
		NString strState = pcRoot->GetStateName();
		NString strOriginalState = strState;

		// Get the component name and proper attribute name.
		int iAttributeLocation;
		int iSuccess = m_mAlternativesToAttributes.Lookup(iAltLocation,iAttributeLocation);
		NString strAttribute = GetListElement(m_lAttributes,iAttributeLocation);
		int iComponentLocation;
		int iSuccess2 = m_mAttributesToComponents.Lookup(iAltLocation, iComponentLocation);
		NString strComponentName = GetListElement(m_lAttributeComponents, iComponentLocation);
		strComponentName = TrimChangeCase(strComponentName, false);
		strAttribute = TrimChangeCase(strAttribute, false); 
		NString strNewAttribute = strComponentName + "_" + strAttribute;

		// Replace any occurrences of the alternate name with the correct attribute name.
		strState.Replace(strAltName, strNewAttribute);
		if (strOriginalState != strState){ // Something was changed.
			pcRoot->SetIsUserDefinedAttribute(true);
			pcRoot->SetStateName(strState);

			// Associate the node with the type of its attribute/s.
			int iTypeLocation;
			int iTypeSuccess = m_mAttributesToTypes.Lookup(iAltLocation, iTypeLocation);
			pcRoot->SetAttributeType(iTypeLocation);
		}
		iAltLocation++;
	}

	// Rename the rest of the tree.
	int iNumberOfChildren = pcRoot->GetNumberOfChildren();
	for (int i = 0; i < iNumberOfChildren; i++){
		int iChild = pcRoot->GetChildID(i);
		CTranslateNode* pcChild = GetNode(iChild);
		ReplaceAttributes(pcChild);
	}
}

int CTranslateSALMain::GetUserDefinedType(NString strComponent, NString strAttribute, CTranslateNode* pcNode){
	NString strParentSet = pcNode->GetTheParentSet();
//	NString strOriginalName = pcNode->GetTheOriginalName();
	NString strFirstPart;
	NString strSecondPart;
//	if (strParentSet != ""){
//		strFirstPart = strParentSet;
//	}else{
//		strFirstPart = strComponent;
//	}   ////////////////////// Check whether the strParentSet thing is needed for anything.
//	if (strOriginalName != ""){
//		strSecondPart = strOriginalName;
//	}else{
//	strSecondPart = strAttribute;
//	}
//	NString strAttributeName = strFirstPart + "_" + strSecondPart;
	NString strAttributeName = strComponent + "_" + strAttribute;
	NPosition cPosition;
	cPosition = m_lAlternateNames.GetHeadPosition();
	int iAltLocation = 0;
	while (cPosition.IsNotNull()){ // For each alternative name in the list.
		NString strAltName = m_lAlternateNames.GetNext(cPosition);
		if (strAltName == strAttributeName){
			// This is the attribute.
			// Get the type of the attribute.
			int iTypeLocation;
			int iTypeSuccess = m_mAttributesToTypes.Lookup(iAltLocation, iTypeLocation);
			return iTypeLocation;
		}
		iAltLocation++;
	}
	// The attribute was not in the user-defined attributes list.
	return -1;
}

// This function returns true if the given string is a number that
// can be successfully converted into an integer. Otherwise, it returns
// false. To be used with GetNumber().
bool CTranslateSALMain::IsStringANumber(NString strNumberString){
	int iNumber;
	int iSuccess = sscanf(strNumberString.GetString().c_str(), "%d", &iNumber);
	if (iSuccess == 0 || iSuccess == EOF){ // check if something went wrong during the conversion
		iNumber = 0;
	}
	if (iNumber == 0){
		// This means that either the string was a "0" or the conversion failed.
		if (strNumberString == "0"){
			// The string was a "0".
			return true;
		}else{
			// The conversion failed so the string wasn't a number.
			return false;
		}
	}
	// The string was converted to a number.
	return true;
}

// This function converts a string to an integer. It is
// assumed that the string is a valid integer number. This can be
// checked by using the function IsStringANumber(). Note that if 
// there is an error, GetNumber() will return 0. To differentiate between
// an error 0 and the actual number 0, call IsStringANumber() first.
// If that function returns true, GetNumber() will return the actual
// number 0 with no errors.
int CTranslateSALMain::GetNumber(NString strNumberString){
	int iNumber;
	int iSuccess = sscanf(strNumberString.GetString().c_str(), "%d", &iNumber);
	if (iSuccess == 0 || iSuccess == EOF){ // check if something went wrong during the conversion
		iNumber = 0;
	}
	return iNumber;
}

// This function returns true if the given variable is in the Integers
// list; false otherwise. (The Integers list is a list of integers that
// have been declared as such by the user using the user information file).
// @param strVariable  The variable name,
// @return true or false.
bool CTranslateSALMain::IsInteger(NString strVariable){
	int iFind = FindListPosition(m_lIntegers, strVariable);
	if (iFind == -1){ // The variable wasn't in the Integers list.
		return false;
	}else{ // The variable was in the Integers list.
		return true;
	}
}

bool CTranslateSALMain::IsUppaal(){
	return m_bIsUPPAAL;
}

/*CTranslateNode* CTranslateSALMain::CreateTranslateNodesFromRandom(CTranslateRandom* pcRandom, CTranslateNode* pcOriginal)
{
	CTranslateNode* pcNode = ConvertToTranslateNodeFromRandom(pcOriginal);
	int iNodeID = m_iHighestTranslateID;
	pcNode->SetNodeID(iNodeID);
	m_mTranslateNodes.SetAt(m_iHighestTranslateID, pcNode);
	m_iHighestTranslateID++;
	int iChildNumber = pcOriginal->GetNumberOfChildren();
	int iOriginalChild;
	for (int i = 0; i < iChildNumber; i++){
		iOriginalChild = pcOriginal->GetChildID(i);
		CTranslateNode* pcOriginalChild = pcRandom->GetNode(iOriginalChild);
		CTranslateNode* pcChild = CreateTranslateNodesFromRandom(pcRandom, pcOriginalChild);
		int iChildID = pcChild->GetNodeID();
		pcNode->AddChild(iChildID);
		pcChild->SetParent(iNodeID);
	}
	
	return pcNode;
}	

CTranslateNode* CTranslateSALMain::ConvertToTranslateNodeFromRandom(CTranslateNode* pcOriginal)
{
	NString strComponent = pcOriginal->GetComponentName();
	NString strState = pcOriginal->GetStateName();
	NString strFlags = pcOriginal->GetFlag();
	int iType = pcOriginal->GetType();
	int iJumpType = pcOriginal->GetJumpType();
	int iBranching = pcOriginal->GetBranchingType();
	bool bIsNonDeter = pcOriginal->IsNodeNonDeterministic();
	bool bIsAtomic = pcOriginal->IsNodeAtomic();
	bool bIsSet = pcOriginal->IsNodeSetOperation();
	int iSiblingNumber = pcOriginal->GetSiblingNumber();

	// Create a TranslateNode with this information.
	CTranslateNode* pcNode = new CTranslateNode;
	pcNode->SetComponentName(strComponent);
	pcNode->SetStateName(strState);
	pcNode->SetFlag(strFlags);
	pcNode->SetType(iType);
	pcNode->SetJumpType(iJumpType);
	pcNode->SetBranchingType(iBranching);
	pcNode->SetIsNodeAtomic(bIsAtomic);
	pcNode->SetIsNodeNonDeterministic(bIsNonDeter);
	pcNode->SetIsNodeSetOperation(bIsSet);
	pcNode->SetSiblingNumber(iSiblingNumber);
	pcNode->SetIsBlankNode(false);
	pcNode->SetIsUserDefinedAttribute(false);
		
	return pcNode;
} */

void CTranslateSALMain::AddPCToInitialisation(NString strPC){
	m_lInitialisationPCs.AddTail(strPC);
}

int CTranslateSALMain::GetAtomicBlockCount(int iNode){
	int iCount;
	int iSuccess = m_mCountOfBlocksUsingNode.Lookup(iNode, iCount);
	if (iSuccess == 0){
		iCount = 0;
	}
	return iCount;
}

void CTranslateSALMain::SetAtomicBlockCount(int iNode, int iCount){
	m_mCountOfBlocksUsingNode.SetAt(iNode, iCount);
}

// This is for alternate selections only, to be used by TranslateRuleAltBranching.
// It stores the opposite guard for a given selection node that is part of an alternate branching.
void CTranslateSALMain::StoreOppositeBranch(int iNode, NString strGuard){
	m_cAlternateNodesToGuards.SetAt(iNode, strGuard);
}

NString CTranslateSALMain::GetOppositeBranch(int iNode){
	NString strGuard = "";
	int iSuccess = m_cAlternateNodesToGuards.Lookup(iNode,strGuard);
	return strGuard;
}

// This is for debugging purposes, to look at the details of a tree.
NString CTranslateSALMain::PrintTree(CTranslateNode* pcRoot){
	NString strTheTree = "\r\n";
	strTheTree.Format(strTheTree + "%d", pcRoot->GetNodeID());
	NString strComponentName = pcRoot->GetComponentName();
	NString strStateName = pcRoot->GetStateName();
	int iChildren = pcRoot->GetNumberOfChildren();
	strTheTree.Append(" " + strComponentName + " " + strStateName);
	NString strTemp = "";
	strTemp.Format("%d", pcRoot->GetType());
	strTheTree.Append(" (type) " + strTemp);
	strTemp = "";
	strTemp.Format("%d", pcRoot->GetJumpType());
	strTheTree.Append(" (jumpType) " + strTemp);
	strTemp = "";
	strTemp.Format("%d", pcRoot->GetNumberOfChildren());
	strTheTree.Append(" (children) " + strTemp);
	strTemp = "";
	strTemp.Format("%d", pcRoot->GetSiblingNumber());
	strTheTree.Append(" (siblings) " + strTemp);
	if (pcRoot->IsNodeAtomic() == true){
		strTheTree.Append(" isAtomic ");
	}
	if (pcRoot->IsNodeNonDeterministic() == true){
		strTheTree.Append(" isAlt ");
	}
	if (pcRoot->GetFlag() != ""){
		strTheTree.Append(" (flag) ");
		strTheTree.Append(pcRoot->GetFlag());
	}
	strTemp = "";
	strTemp.Format("%d", pcRoot->GetParent());
	strTheTree.Append(" (parent) " + strTemp);

	CTranslateNode* pcChild;
	int iChildID;
	for (int i = 0; i < iChildren; i++){
		iChildID = pcRoot->GetChildID(i);
		pcChild = GetNode(iChildID);
		strTheTree.Append(PrintTree(pcChild));
	}
	return strTheTree;
}

// This is for alternate selections that have an atomic branch.
void CTranslateSALMain::UpdateExtraTransition(int iGuardPosition, NString strFullGuard){
	// Get the current guard at that position.
	NString strGuard = GetListElement(m_lExtraGuards, iGuardPosition);
	// Add the new information to the guard.
	if (strGuard != ""){
		strGuard = strGuard + " AND NOT(" + strFullGuard + ")";
	}else{
		strGuard = "NOT(" + strFullGuard + ")";
	}

	// Replace the current guard with the new one.
	// Check if the guard is the head of the list.
	if (iGuardPosition == 0){
		NPosition cPosition2 = m_lExtraGuards.GetHeadPosition();
		m_lExtraGuards.SetAt(cPosition2, strGuard);
	}else{
		NPosition cPosition = m_lExtraGuards.GetHeadPosition();
		// Start the counter at 1 because after GetNext finds an element, it moves the
		// position pointer to the next element. Therefore the counter needs to be one
		// step ahead so that when the counter matches iGuardPosition, strCurrentElement
		// is actually the element before, but cPosition will be pointing to the right one.
		int iCounter = 1;  
		while (cPosition.IsNotNull()){
			NString strCurrentElement = m_lExtraGuards.GetNext(cPosition);
			if (iCounter == iGuardPosition){
				m_lExtraGuards.SetAt(cPosition, strGuard);
			}
			iCounter++;
		}
	}
}

