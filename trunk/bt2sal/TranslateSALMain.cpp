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

#include "StdAfx.h"
#include "TranslateSALMain.h"
#include "OptionsWindow.h"
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
#include "ResultsWindow.h"
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
#include "TranslateSlicer.h"
#include "TranslateNode.h"
#include "NList.h"
#include "NPosition.h"
#include <list>
//#import "msxml4.dll"
// using namespace MSXML2;
//#using <mscorlib.dll>
//using namespace System;
//using namespace System::IO;
//using namespace System::Xml;


#ifdef _DEBUG
#define new DEBUG_NEW
#endif



CTranslateSALMain::CTranslateSALMain(void)
{
	m_bTranslateWithViews = false;
	m_iOptionSelected = 1;
	m_iBufOptionSelected = 2;
	m_bTranslateWithRandomBT = false;
	m_bDisplayTimes = true;
//	m_strIterationsNumber = _T("100");
	m_strPathName = _T("");
	m_strFileName = _T("");
	m_bUsingBESE = false;
}

CTranslateSALMain::~CTranslateSALMain(void)
{

}

// Select the options for performing the SAL translation.
void CTranslateSALMain::SelectOptions(void)
{
	COptionsWindow cOptionsDialog;
	// Set it at the previously selected options.
	cOptionsDialog.SetOptions(m_iOptionSelected, m_iBufOptionSelected, m_bTranslateWithViews, m_bTranslateWithRandomBT, m_bDisplayTimes, m_strPathName, m_strFileName, m_strPathName2, m_strFileName2, m_strCriterion);
	// Show the options dialog.
	cOptionsDialog.DoModal();
	// Get the new selections.
	m_iOptionSelected = cOptionsDialog.GetOptions();
	m_iBufOptionSelected = cOptionsDialog.GetBufOption();
	m_bTranslateWithViews = cOptionsDialog.GetViewOption();
	m_bTranslateWithRandomBT = cOptionsDialog.UseRandomBT();
	m_bDisplayTimes = cOptionsDialog.DisplayTimes();
	m_strPathName = cOptionsDialog.m_strPathName;
	m_strFileName = cOptionsDialog.m_strFileName;
	m_strPathName2 = cOptionsDialog.m_strPathName2;
	m_strFileName2 = cOptionsDialog.m_strFileName2;
	m_strCriterion = cOptionsDialog.m_strCriterion;
	
		NList <int, int> test;
		test.AddTail(1);
		test.AddTail(2);
		//std::list<CString>::iterator cRulePosition1 = test.GetHeadPosition();
		NPosition cRulePosition1 = test.GetHeadPosition();
//		if (test.IsNull(cRulePosition1)){
//			int t = 3;
//		}
		while (cRulePosition1.IsNotNull()){
			int testint;
			testint = test.GetNext(cRulePosition1);
			CString message = _T("");
			message.Format(_T("%d"),testint);
			AfxMessageBox(message);
		}

		std::list<int> test2;
		test2.push_back(1);
		test2.push_back(2);
		std::list<int>::iterator listposition;
		listposition = test2.begin();
		while (listposition != test2.end()){
			int number = *listposition;
			CString message2 = _T("");
			message2.Format(_T("%d"),number);
			AfxMessageBox(message2);
			listposition++;
		}
	int someint = 4;
/*	NList someposition = (NList) someint;
		std::list<CTranslateNode*> test3;
NList<int,int> testlist;
testlist.AddTail(4);
testlist.AddHead(3);
std::list<int>::iterator testiterator = testlist.GetHeadPosition();
int testint = testlist.GetNext(testiterator);
int testint2= testlist.GetNext(testiterator);
std::list<int>::iterator testiterator2 = testlist.Find(4);
std::list<int>::iterator testiterator4 = testlist.Find(2);
if (testlist.IsNull(testiterator2)){
	int w = 2;
}
if (testlist.IsNull(testiterator4)){
	int w = 3;
}
		CTranslateNode* nodetest = new CTranslateNode();
		nodetest->SetComponentName(_T("Hello"));
		CTranslateNode* nodetest2 = new CTranslateNode();
		nodetest2->SetComponentName(_T("Tata"));
		test3.push_back(nodetest);
		test3.push_back(nodetest2);
		std::list<CTranslateNode*>::iterator listposition2;
		listposition2 = test3.begin();
		while (listposition2 != test3.end()){
			CTranslateNode* node = (CTranslateNode*) *listposition2;			
			AfxMessageBox(node->GetComponentName());
			listposition2++;
		}
		delete nodetest;
		delete nodetest2;
		*/
}

// Parse the current Behavior Tree to identify which translation
// rules to apply and to check that the tree contains valid syntax.
// Then translate the BT to SAL.
void CTranslateSALMain::ParseBT(int iTreeID, bool bUsingSets, bool bUsingBESE)
{
//	CTranslateRandom* pcRandom; // This will only be used if a random BT is being used.
	CFileTime cStartTime;
	CFileTime cTranslateStartTime;
	CFileTime cPauseTime1;
	CFileTime cRestartTime1;
	CFileTime cFinishTime;
	CFileTime cSetParsingStartTime;
	CFileTime cSetParsingFinishTime;
	CFileTime cReadingTime;
	bool bError = false;
	m_bUsingBESE = bUsingBESE;

	m_bIsUPPAAL = false;
	m_iTreeID = iTreeID;
	
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
	CTranslateNode* pcRandomRoot;
	CTranslateNode* pcTranslateRoot;
	cTranslateMain.m_bDisplayTimes = m_bDisplayTimes;
	cTranslateMain.m_bTranslateWithRandomBT = m_bTranslateWithRandomBT;
	cTranslateMain.m_bTranslateWithViews = m_bTranslateWithViews;
	
//	cTranslateMain.m_strIterationsNumber = m_strIterationsNumber;
	cTranslateMain.m_iOptionSelected = m_iOptionSelected;

	bUsingSets = m_bTranslateWithRandomBT;
	bool bReadFile = false;
	try{

//	if (!m_bTranslateWithRandomBT){  // This is a normal BT created by the user.
	// Open the Behavior Tree from a file according to the slicing syntax.
		if (m_bUsingBESE){  // The user wants to translate a BESE file.
			// Show a file dialog box.
	/*	CFileDialog cFileDlg (TRUE, NULL, _T("*.*"),
				OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
		if(cFileDlg.DoModal ()==IDOK ){
			CString strPathName = cFileDlg.GetPathName();
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
				AfxMessageBox(_T("Parse Error: ") + parseError);
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
		}else{ // The user wants to translate a TextBE file.
			// Show a file dialog box.
			CFileDialog cFileDlg (TRUE, NULL, _T("*.*"),
				OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
			if(cFileDlg.DoModal ()==IDOK ){
				CString strPathName = cFileDlg.GetPathName();
				CString strFileName = cFileDlg.GetFileName();
				cTranslateMain.m_iHighestTranslateID = 1;
				pcTranslateRoot = cTranslateMain.ReadSlice(strPathName, strFileName);
				if (pcTranslateRoot == NULL){
					CString strMessage = _T("");
					CTranslateException cException(strMessage);
					throw cException;
				}
				iRootNode = pcTranslateRoot->GetNodeID();
				bReadFile = true;
			}else{
				bReadFile = false;
			}
		}
	
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
		//	CFileDialog cFileDlg (TRUE, NULL, _T("*.*"),
		//			OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
		//	if(cFileDlg.DoModal ()==IDOK ){
		//		CString strPathName = cFileDlg.GetPathName();
			//	CString strFileName = cFileDlg.GetFileName();
		//	
				if (m_bDisplayTimes){
					cSetParsingStartTime = CFileTime::GetCurrentTime(); 
				}
				
				if (m_bTranslateWithRandomBT){ // This means that it has set nodes.
					if ((m_strPathName == _T("")) || (m_strFileName == _T(""))){
						CString strMessage = _T("You have not selected a set information file. ");
						CTranslateException cException(strMessage);
						throw cException;
					}
					cTranslateMain.ReadSetInformation(m_strPathName, m_strFileName);
					cTranslateMain.ReplaceAttributes(pcTranslateRoot);
		//			cTranslateMain.ReadSetElements();
					cTranslateMain.ExpandBranches(pcTranslateRoot);
					// Find all the set nodes and parse their expressions.
					for (int s = 1; s < cTranslateMain.m_iHighestTranslateID; s++){
						CTranslateNode* pcCurrentSetNode;
						std::map<int, CTranslateNode*>::iterator iSetSuccess = cTranslateMain.m_mTranslateNodes.find(s);
						pcCurrentSetNode = iSetSuccess->second;
						if (iSetSuccess != cTranslateMain.m_mTranslateNodes.end()){
						//	if (pcCurrentSetNode->IsNodeSetOperation() == true){
								// The node is a set operation.
				//				lSetNodes.AddTail(pcCurrentSetNode);
								// Store its state name to a file for the parser to read.
							//	CString strStateName = pcCurrentSetNode->GetStateName();
							//	strStateName = strStateName + _T("\r\n");
							//	FILE *pcParserFile;
							//	CString strPathName = _T("C:/sets/BTSetExp.txt");
							//	_tfopen_s(&pcParserFile,(LPCTSTR)strPathName,_T("wt"));
							//	_fputts((LPCTSTR)strStateName,pcParserFile);
							//	fclose(pcParserFile);

								// Run the parser.
							//	CString strCmd =_T("C:/sets/parser");
							//	_tsystem((LPCTSTR)strCmd);

								// Parse the node's set expression.
								cTranslateMain.MatchSetExpression(pcCurrentSetNode);
						//	}
						}
					}
					if (m_bDisplayTimes){
						cSetParsingFinishTime = CFileTime::GetCurrentTime(); 
					}
				}
	//		}
	//	}////////////////////// SLICING SECTION STARTS HERE //////////////////////////////////////////////////
		if (m_bTranslateWithViews){  //////// Change this to a slicing checkbox option.
			// Find the slice of the tree based on the user's given criterion.
	/*		pcTranslateRoot->SetParent(0);
			CTranslateSlicer cSlicer;
			iRootNode = pcTranslateRoot->GetNodeID();
			cTranslateMain.MakeLongIDs(iRootNode);	
		//	CString strCriterion = cTranslateMain.m_strCriterion;
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

		if (m_bDisplayTimes){
			cStartTime = CFileTime::GetCurrentTime(); 
		}

		// Find the initialisation nodes.
		NList<int,int> lInitNodes;   
		cTranslateMain.TranslateInitNodes(iRootNode, lInitNodes);
	
		// Create the ID values and program counters.
		cTranslateMain.m_iHighestProgramCounter = 0;
		cTranslateMain.CreateIDValues(cTranslateMain.m_iStartNode);
		cTranslateMain.m_strMessageReady = _T("");

		// Create an empty actions list for the root node.
		// This is to handle branching directly after the root node.
		NList<CString, CString>* plRootActions = new NList<CString, CString>;
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
		   CString strMessage;
		   strMessage = _T("Behavior Tree Parsing error: The Behavior Tree is not valid according to the rules. \n");
		   strMessage.Append(_T("Problem may be due to nodes: \n"));
					
		   NPosition cLeafPos = cLeafNodes.GetHeadPosition();
		   while (cLeafPos.IsNotNull()){
				int iCurrentLeafNode = cLeafNodes.GetNext(cLeafPos);
				CTranslateNode* pcLeaf = cTranslateMain.GetNode(iCurrentLeafNode);
				CString strLeafComponent = pcLeaf->GetComponentName();
				CString strLeafState = pcLeaf->GetStateName();
				CString strLeafName = strLeafComponent + _T("-") + strLeafState;
				strMessage.Append(strLeafName);
				if (cLeafPos.IsNotNull()){ // This isn't the last node.
					strMessage.Append(_T(",\n"));
				}
		   }
		   CTranslateException cException(strMessage);
		   throw cException;
		}
						
			
		if (m_bDisplayTimes){
			cTranslateStartTime = CFileTime::GetCurrentTime(); 
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
		CString strFileName = _T("");  
		CString strText = strFileName + _T(":CONTEXT=\r\n");	

		// Write the BEGIN line.
		strText.Append(_T("BEGIN\r\n"));

		// This section writes the state type declarations.
		CString strComponentName, strStateName;  
	
		// Write the local variable state type declarations.	
		int iLocalCounter = 0;
		NPosition cLocalPosition = cTranslateMain.m_cLocalComponents.GetHeadPosition();
		while(cLocalPosition.IsNotNull()){
			CString strComponentName = cTranslateMain.m_cLocalComponents.GetNext(cLocalPosition);
			strText.Append(TrimChangeCase(strComponentName, true) 
				+ _T(": TYPE={"));
			// Get the states for this component.
			NList<CString,CString>* plStates;
			std::map<int, NList<CString, CString>*>::iterator iSuccess = cTranslateMain.m_cLocalStates.find(iLocalCounter);
			plStates = iSuccess->second;
			int iStateCounter = 0;
			NPosition cStatePosition = plStates->GetHeadPosition();
			while(cStatePosition.IsNotNull()){
				CString strStateName = plStates->GetNext(cStatePosition);
				if (iStateCounter == 0){ // This is the first state element.
					strText.Append(TrimChangeCase(strStateName, false));
				}else{ // This is not the first state element.
					strText.Append(_T(",") + TrimChangeCase(strStateName, false));
				}
				iStateCounter++;
			}
			strText.Append(_T("};\r\n"));
			iLocalCounter++;
		}

		if (bUsingSets){
			// Write the set type declarations.
			int iSetCounter = 0;
			NPosition cSetTypePosition = cTranslateMain.m_cSetTypes.GetHeadPosition();
			while(cSetTypePosition.IsNotNull()){
				CString strSetType = cTranslateMain.m_cSetTypes.GetNext(cSetTypePosition);
				strText.Append(TrimChangeCase(strSetType, true) + _T(": TYPE={"));
				// Get the possible elements for this set type.
				NList<CString,CString>* plElements;
				std::map<int, NList<CString, CString>*>::iterator iSuccess = cTranslateMain.m_cSetElements.find(iSetCounter);
				plElements = iSuccess->second;
				int iElementCounter = 0;
				NPosition cElementPosition = plElements->GetHeadPosition();
				while(cElementPosition.IsNotNull()){
					CString strElementName = plElements->GetNext(cElementPosition);
					if (iElementCounter == 0){ // This is the first element.
						strText.Append(TrimChangeCase(strElementName, false));
					}else{ // This is not the first element.
						strText.Append(_T(",") + TrimChangeCase(strElementName, false));
					}
					iElementCounter++;
				}
				strText.Append(_T("};\r\n"));
				iSetCounter++;
			}
		}

		// Write the start of the module.
		strText.Append(_T("\r\nbehavior:MODULE=\r\nBEGIN\r\n"));
	       		
		// Write the Input variable declarations.
		CString strInputSection = _T("INPUT ");
		NPosition cInputPosition;
		cInputPosition = cTranslateMain.m_cInputVariables.GetHeadPosition();
		int iInputCounter = 0;
		while(cInputPosition.IsNotNull()){
			CString strCurrentInput = cTranslateMain.m_cInputVariables.GetNext(cInputPosition);  
			strCurrentInput = TrimChangeCase(strCurrentInput, false);
			if (iInputCounter == 0){  // This is the first element.
				strInputSection.Append(strCurrentInput);
			}else{
				strInputSection.Append(_T(",") + strCurrentInput);
			}
			iInputCounter++;
		}
		strInputSection.Append(_T(":BOOLEAN\r\n"));
		if (iInputCounter > 0){ 
			// Only write the INPUT words if input variables exist.
			strText.Append(strInputSection);
		}

		// Write the Output variable declarations.
		CString strOutputSection = _T("OUTPUT ");	
		NPosition cOutputPosition;
		cOutputPosition = cTranslateMain.m_cOutputVariables.GetHeadPosition();
		int iOutputCounter = 0;
		while(cOutputPosition.IsNotNull()){
			CString strCurrentOutput = cTranslateMain.m_cOutputVariables.GetNext(cOutputPosition); 
			strCurrentOutput = TrimChangeCase(strCurrentOutput, false);	
			if (iOutputCounter == 0){  // This is the first element.
				strOutputSection.Append(strCurrentOutput);
			}else{
				strOutputSection.Append(_T(",") + strCurrentOutput);
			}
			iOutputCounter++;
		}
		strOutputSection.Append(_T(":BOOLEAN\r\n"));
		if (iOutputCounter > 0){ 
			// Only write the OUTPUT words if input variables exist.
			strText.Append(strOutputSection);
		}
	    
		// Write the Local variable declarations.  		
		strText.Append(_T("LOCAL\r\n"));   
		NPosition cComponentPosition = cTranslateMain.m_cLocalComponents.GetHeadPosition();
		while(cComponentPosition.IsNotNull()){
			CString strComponentName = cTranslateMain.m_cLocalComponents.GetNext(cComponentPosition);
			strText.Append(TrimChangeCase(strComponentName, false) 
			  + _T(": ") + TrimChangeCase(strComponentName, true) + _T(",\r\n"));
		}

		// Write the Integer variable declarations.
		NPosition cIntegerPosition2 = cTranslateMain.m_lIntegers.GetHeadPosition();
		int iIntListPosition = 0;
		while (cIntegerPosition2.IsNotNull()){
			CString strIntegerName = cTranslateMain.m_lIntegers.GetNext(cIntegerPosition2);
			strText.Append(strIntegerName + _T(":[") 
				+ GetListElement(cTranslateMain.m_lStartValues,iIntListPosition)
				+ _T("..") + GetListElement(cTranslateMain.m_lEndValues,iIntListPosition) + _T("],\r\n"));
			iIntListPosition++;
		}

		// Write the user-defined attribute declarations.
		NPosition cUserAttributePos = cTranslateMain.m_lUserDefinedAttributes.GetHeadPosition();
		int iAttributeLocation = 0;
		while(cUserAttributePos.IsNotNull()){
			CString strAttributeName = cTranslateMain.m_lUserDefinedAttributes.GetNext(cUserAttributePos);
			int iTypeLocation;
			std::map<int, int>::iterator iAttributeSuccess = cTranslateMain.m_mUserAttributeTypes.find(iAttributeLocation);
			iTypeLocation = iAttributeSuccess->second;
			if (iAttributeSuccess == cTranslateMain.m_mUserAttributeTypes.end()){  // The type could not be found in the map.
				CString strMessage = _T("Type not defined for the attribute: ");
				strMessage = strMessage + strAttributeName;
				CTranslateException cException(strMessage);
				throw cException;
			}
 			CString strAttributeType = GetListElement(cTranslateMain.m_cSetTypes, iTypeLocation);
			strText.Append(TrimChangeCase(strAttributeName, false) 
			  + _T(": ") + TrimChangeCase(strAttributeType, true) + _T(",\r\n"));
			iAttributeLocation++;
		}

		if (cTranslateMain.m_iOptionSelected == 2){
			strText.Append(_T("internalMessages:BOOLEAN,\r\n"));

		}else if (cTranslateMain.m_iOptionSelected == 4){
       		strText.Append(_T("internalActions: BOOLEAN,\r\n"));
			strText.Append(_T("messageReady: BOOLEAN,\r\n"));
 		}
	       		
		// Write the local boolean declarations (under the Local section).
		NPosition cLocalBooleanPosition;
		cLocalBooleanPosition = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
		while(cLocalBooleanPosition.IsNotNull()){
			CString strCurrentBoolean = cTranslateMain.m_cLocalBooleans.GetNext(cLocalBooleanPosition);
			strCurrentBoolean = TrimChangeCase(strCurrentBoolean, false);
			strText.Append(strCurrentBoolean + _T(":BOOLEAN,\r\n"));
		}
	  
		// Write the local integer attribute declarations
		// (under the Local section).
		NPosition cIntegerPosition;
		cIntegerPosition = cTranslateMain.m_cIntegerAttributes.GetHeadPosition();
		while(cIntegerPosition.IsNotNull()){
			CString strCurrentInteger = cTranslateMain.m_cIntegerAttributes.GetNext(cIntegerPosition);
			strCurrentInteger = TrimChangeCase(strCurrentInteger, false);
			strText.Append(strCurrentInteger + _T(":[-100..100],\r\n"));
		}
	  
		if (bUsingSets){
			// Write the local set declarations.
			int iLocalSetCounter = 0;
			NPosition cSetPosition = cTranslateMain.m_cSetNames.GetHeadPosition();
			while (cSetPosition.IsNotNull()){
				CString strSetName = cTranslateMain.m_cSetNames.GetNext(cSetPosition);
				int iSetTypePosition;
				std::map<int, int>::iterator iSuccess = cTranslateMain.m_cSetNamesToTypes.find(iLocalSetCounter);
				iSetTypePosition = iSuccess->second;
				CString strSetType = GetListElement(cTranslateMain.m_cSetTypes,iSetTypePosition);
				// Check if this set is an attribute of another set.
				NPosition cIsInAttributeList = cTranslateMain.m_cAttributeSets.Find(strSetName);
				if (cIsInAttributeList.IsNotNull()){
					// The set is an attribute of either an element of another set or a normal component.
					int iParentPosition;
					int iAttributePosition = FindListPosition(cTranslateMain.m_cAttributeSets,strSetName);
					std::map<int, int>::iterator iParentSuccess = cTranslateMain.m_cSetsToParentSets.find(iAttributePosition);
					iParentPosition = iParentSuccess->second;
					if (iParentSuccess != cTranslateMain.m_cSetsToParentSets.end()){  
/////////// Do something if it is 0 as an error occurred.
						CString strParentSet = GetListElement(cTranslateMain.m_cParentSets,iParentPosition);
						// Find the location of the parent set in the normal set list.
						int iParentNameLocation = FindListPosition(cTranslateMain.m_cSetNames,strParentSet);
						// Find the type of the parent set.
						int iParentTypeLocation;
						std::map<int, int>::iterator iParentTypeSuccess = cTranslateMain.m_cSetNamesToTypes.find(iParentNameLocation);
						iParentTypeLocation = iParentTypeSuccess->second;
						if (iParentTypeSuccess != cTranslateMain.m_cSetNamesToTypes.end()){ // The set is an attribute of an element of another set, 
											  // e.g. if set s is an attribute of each element c of set t, so
											  // there would be a ||c:t or []c:t and under it, c_s refers to c's attribute s.
							CString strParentType = GetListElement(cTranslateMain.m_cSetTypes,
								iParentTypeLocation);
							// Get the elements of the parent set.
							NList<CString, CString>* plParentElements;
							std::map<int, NList<CString, CString>*>::iterator iElementSuccess = cTranslateMain.m_cSetElements.find(iParentTypeLocation);
							plParentElements = iElementSuccess->second;
							if (iElementSuccess != cTranslateMain.m_cSetElements.end()){ 
	/////////// Do something if it is 0 as an error occurred.
								NPosition cParentElementPos;
								cParentElementPos = plParentElements->GetHeadPosition();
								while (cParentElementPos.IsNotNull()){
									CString strCurrentElement = plParentElements->GetNext(cParentElementPos);
									CString strFullName = strCurrentElement + _T("_") + strSetName;
									strText.Append(TrimChangeCase(strFullName, false));
									strText.Append(_T(": set{"));
									strText.Append(TrimChangeCase(strSetType, true));
									strText.Append(_T("}!Set,\r\n"));
								}
							}
						}else{  // The set is an attribute of a component that is not part of another set,
								// e.g. if the set was s and it was an attribute of the component c, i.e. c_s.
							CString strFullName = strParentSet + _T("_") + strSetName;
							strText.Append(TrimChangeCase(strFullName, false));
							strText.Append(_T(": set{"));
							strText.Append(TrimChangeCase(strSetType, true));
							strText.Append(_T("}!Set,\r\n"));
						}
					}
				}else{
					// The set is not an attribute of another set.
					strText.Append(TrimChangeCase(strSetName, false));
					strText.Append(_T(": set{"));				
					strText.Append(TrimChangeCase(strSetType, true));
					strText.Append(_T("}!Set,\r\n"));
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
			CString strViewLine = _T("view:[1..");
			strViewLine.Format(strViewLine + _T("%d"), iMaxView);
			strText.Append(strViewLine);
			strText.Append(_T("],\r\n"));
		}

		// Write the program counter declarations (under the Local section).
		for (int i = 1; i <= cTranslateMain.m_iHighestProgramCounter; i++){
			CString strPCText = _T("pc");
			strPCText.Format(strPCText + _T("%d"),i);
			strPCText.Append(_T(": [0.."));
			int iHighestValue;
			std::map<int, int>::iterator iSuccess = cTranslateMain.m_cPCRanges.find(i);
			iHighestValue = iSuccess->second;
			strPCText.Format(strPCText + _T("%d"), iHighestValue);
			strText.Append(strPCText);
			strText.Append(_T("]"));
       		if (i < cTranslateMain.m_iHighestProgramCounter){   
				// This isn't the last element.
				strText.Append(_T(","));
			}
			strText.Append(_T("\r\n"));		
		}

		if (cTranslateMain.m_iOptionSelected == 2){
       		if (cTranslateMain.m_cLocalBooleans.GetSize() > 0){
				strText.Append(_T("DEFINITION\r\n"));
				strText.Append(_T("internalMessages = "));		
			
				NPosition cLocalPosition;
				cLocalPosition = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
				int iBooleanCounter = 0;

				while(cLocalPosition.IsNotNull()){
					CString strCurrentBoolean = cTranslateMain.m_cLocalBooleans.GetNext(cLocalBooleanPosition);  
					if (iBooleanCounter == 0){  // This is the first element.
						strText.Append(_T("(") + TrimChangeCase(strCurrentBoolean, false));  
					}else{
						strText.Append(_T(" OR (") + TrimChangeCase(strCurrentBoolean, false)); 
					}
					iBooleanCounter++;
					strText.Append(_T("\r\n"));
				}
				
			}else{
				// There are no internal messages in the module 
				// so set internalMessages to false.
				strText.Append(_T("DEFINITION\r\n"));
				strText.Append(_T("internalMessages = false\r\n\r\n"));
			}
		
		}else if (cTranslateMain.m_iOptionSelected == 4){
			if (cTranslateMain.m_cLocalBooleans.GetSize() > 0){
				strText.Append(_T("DEFINITION\r\n"));
				strText.Append(_T("messageReady = ") 
					+ cTranslateMain.m_strMessageReady + _T("\r\n\r\n"));
			
			}else{
				// There are no internal messages in the 
				// module so set messageReady to false.
				strText.Append(_T("DEFINITION\r\n"));
				strText.Append(_T("messageReady = false\r\n\r\n"));
			}
			strText.Append(_T("DEFINITION\r\n"));
			CString strTempText;
			strTempText.Append(_T("internalActions = "));
			
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
								CString strGuard;
								std::map<int, CString>::iterator iSuccess = cTranslateMain.m_cNodesToGuards.find(iNode);
								strGuard = iSuccess->second;
								if (iSuccess != cTranslateMain.m_cNodesToGuards.end()){
									if (iInternalActionCount != 0){
									// This isn't the first action.
										strTempText.Append(_T("OR "));
									}else{
										strTempText.Append(_T("\r\n"));
									}
									strTempText.Append(_T("(") +
										strGuard + _T(")\r\n"));
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
					CString strGuard;
					std::map<int, CString>::iterator iSuccess = cTranslateMain.m_cNodesToGuards.find(iNode);
					strGuard = iSuccess->second;
					if (iSuccess != cTranslateMain.m_cNodesToGuards.end()){
						if (iInternalActionCount != 0){ // This is not the first action.
							strTempText.Append(_T("OR "));
						}else{
							strTempText.Append(_T("\r\n"));
						}
						strTempText.Append(_T("(") + strGuard + _T(")\r\n"));
						iInternalActionCount++;
						////////// Add failure view section here.
					}
				}	
			}
			if (iInternalActionCount == 0){
				// There were no internal actions.		
				strTempText.Append(_T("false\r\n"));
			}
			strTempText.Append(_T("\r\n"));
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
								CString strGuard;
								std::map<int, CString>::iterator iSuccess = cTranslateMain.m_cNodesToGuards.find(iNode);
								strGuard = iSuccess->second;
								if (iSuccess != cTranslateMain.m_cNodesToGuards.end()){
									// Add the updates to set all messages back to false.
									if (!plBlock->ContainsInternalInput()){
										NList<CString,CString>* plActionList;
										std::map<int, NList<CString, CString>*>::iterator iSuccess2 = cTranslateMain.m_cNodesToActions.find(iNode);
										plActionList = iSuccess2->second;
										if (iSuccess2 != cTranslateMain.m_cNodesToActions.end()){
											NPosition cBooleanPos = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
											while (cBooleanPos.IsNotNull()){
												CString strLocalBoolean = cTranslateMain.m_cLocalBooleans.GetNext(cBooleanPos);
												plActionList->AddTail(strLocalBoolean + _T("'=false"));
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
					NList<CString,CString>* plActionList;
					std::map<int, NList<CString, CString>*>::iterator iSuccess2 = cTranslateMain.m_cNodesToActions.find(iNode);
					plActionList = iSuccess2->second;
					if (iSuccess2 != cTranslateMain.m_cNodesToActions.end()){
						NPosition cLocalBooleanPosition;
						cLocalBooleanPosition = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
						while(cLocalBooleanPosition.IsNotNull()){
							CString strCurrentBoolean = cTranslateMain.m_cLocalBooleans.GetNext(cLocalBooleanPosition);
							strCurrentBoolean = TrimChangeCase(strCurrentBoolean, false);
							plActionList->AddTail(strCurrentBoolean + _T("'=false"));
						}		
						cTranslateMain.RemoveMessageConflicts(*plActionList,cTranslateMain.m_cLocalBooleans);
						cTranslateMain.m_cNodesToActions.SetAt(iNode,plActionList);
					}
				}	
			}
		}	
				
		// Initialisation section.
		strText.Append(_T(""));
		strText.Append(_T("INITIALIZATION\r\n"));
		 
		if (bUsingSets){ // Get information about any initialisation of variables.
			if (m_bDisplayTimes){
				cPauseTime1 = CFileTime::GetCurrentTime(); // Stop timing as it is opening files.
			}
			// Read the initialisation file, if one was specified by the user.
			if (m_strPathName2 != _T("")){
				FILE *pcFile;
				CString strLine;
				char cLine[4096];

				if (m_bDisplayTimes){
					cReadingTime = CFileTime::GetCurrentTime(); 
				}
				
					// Read the selected file.
					_tfopen_s(&pcFile,(LPCTSTR)m_strPathName2,_T("rt"));

					while(!feof(pcFile)) { // Read each line.
						fgets(cLine,4096,pcFile); 
						strLine = cLine;
						if (!feof(pcFile) && (strLine.Trim() != _T(""))){ // To make it ignore the last blank line.
							// Initialise the variables described by this line.
							// Remove the last character as it is a line break character.
							int iLength = strLine.GetLength();
							strLine.Truncate(iLength - 1);	
							int iTokenPos = 0;
							CString strOwnerVariable = strLine.Tokenize(_T(";"), iTokenPos);
							CString strVariable = strLine.Tokenize(_T(";"), iTokenPos);
							CString strInitialState = strLine.Tokenize(_T(";"), iTokenPos);
						
							// Initialise the variables.
							int iOwnerNameLocation = FindListPosition(cTranslateMain.m_cSetNames,strOwnerVariable);
							// Find the type of the parent set.
							int iOwnerTypeLocation;
							std::map<int, int>::iterator iOwnerTypeSuccess = cTranslateMain.m_cSetNamesToTypes.find(iOwnerNameLocation);
							iOwnerTypeLocation = iOwnerTypeSuccess->second;
							if (iOwnerTypeSuccess != cTranslateMain.m_cSetNamesToTypes.end()){
	/////////// Do something if it is 0 as an error occurred.
								CString strOwnerType = GetListElement(cTranslateMain.m_cSetTypes,
									iOwnerTypeLocation);
								// Get the elements of the parent set.
								NList<CString, CString>* plOwnerElements;
		/////////// Do something if it is 0 as an error occurred.
									NPosition cOwnerElementPos;
									cOwnerElementPos = plOwnerElements->GetHeadPosition();
									while (cOwnerElementPos.IsNotNull()){
										CString strCurrentElement = plOwnerElements->GetNext(cOwnerElementPos);
										strCurrentElement = TrimChangeCase(strCurrentElement, false);
										CString strFullName;
										if (strVariable != _T("/")){  // This is an initialisation of an attribute of a set element.
											strFullName = strCurrentElement + _T("Component_") + strVariable;
										}else{  // This is an initialisation of a state of a set element.
											strVariable = TrimChangeCase(strVariable, false);
											strFullName = strCurrentElement  + _T("Component");
										}
										CString strFullState = strFullName + _T("_") + strInitialState;
										strText.Append(TrimChangeCase(strFullName, false));
										strText.Append(_T("="));
										strText.Append(TrimChangeCase(strFullState, false) + _T(";\r\n"));
									}
								}
							}
						}
					}
					fclose(pcFile);
				}
		//	}
			
		
			if (m_bDisplayTimes){
				cRestartTime1 = CFileTime::GetCurrentTime(); 
			}
		}

		NPosition cInitPosition;
		cInitPosition = lInitNodes.GetHeadPosition();
		while (cInitPosition.IsNotNull()){
			int iCurrentNode = lInitNodes.GetNext(cInitPosition);
			CTranslateNode* pcNode = cTranslateMain.GetNode(iCurrentNode);
			CString strComponent;
			strComponentName = pcNode->GetComponentName();
			CString strState;
			strStateName = pcNode->GetStateName();
			CString strAction;
			strComponentName = TrimChangeCase(strComponentName, false);
			strStateName = TrimChangeCase(strStateName, false);
			CString strFinalComp = strComponentName;
			CString strFinalState = strComponentName + _T("_") + strStateName;
		
			// Check for attributes.
			int iTokenPos = 0;
			CString strToken = strStateName.Tokenize(_T(":="), iTokenPos);
			CString strToken2 = strStateName.Tokenize(_T(":="), iTokenPos);
			if (strToken2 != _T("")){ // The state contains attributes.
				strToken = TrimChangeCase(strToken, false);
				strToken2 = TrimChangeCase(strToken2, false);
				// Check if the first component is an integer type variable.
				if (cTranslateMain.IsInteger(strComponentName + _T("_") + strToken)){
					// Check if the second value is an integer.
					if (IsStringANumber(strToken2)){
						strFinalComp = strComponentName + _T("_") + strToken;
						strFinalState = strToken2;
					}else{ // The second value must be another attribute.
						strFinalComp = strComponentName + _T("_") + strToken;
						strFinalState = strComponentName + _T("_") + strToken2;
					}
				}else{ // It is a normal attribute.
					// Change the component name & state to attribute style.
					strFinalComp = strComponentName + _T("_") + strToken;
					strFinalState = strComponentName + _T("_") + strToken + _T("_") + strToken2;
				}
			}
			strAction = strFinalComp + _T("=") + strFinalState + _T(";");
			strText.Append(strAction + _T("\r\n"));
		}
		
		// Initialise the sets variables.
		if (bUsingSets){
			int iNumberOfSets = (int) cTranslateMain.m_cSetNames.GetSize();
			for (int setNo = 0; setNo < iNumberOfSets; setNo++){
				CString strFullSetName;
				CString strSetName = GetListElement(cTranslateMain.m_cSetNames,setNo);
				// The set may be an attribute of another set. If so, include the component
				// name in the set name, for each element of the other set.
				int iSetLocation = FindListPosition(cTranslateMain.m_cAttributeSets,strSetName);
				int iParentSetLocation;
				std::map<int, int>::iterator iSetSuccess = cTranslateMain.m_cSetsToParentSets.find(iSetLocation);
				iParentSetLocation = iSetSuccess->second;
				if (iSetSuccess != cTranslateMain.m_cSetsToParentSets.end()){
					// This set is an attribute.
					CString strParentSet = GetListElement(cTranslateMain.m_cParentSets, iParentSetLocation);
					// Find the location of the parent set in the normal set list.
					int iParentNameLocation = FindListPosition(cTranslateMain.m_cSetNames,strParentSet);
					// Find the type of the parent set.
					int iParentTypeLocation;
					std::map<int, int>::iterator iParentTypeSuccess = cTranslateMain.m_cSetNamesToTypes.find(iParentNameLocation);
					iParentTypeLocation = iParentTypeSuccess->second;
					if (iParentTypeSuccess != cTranslateMain.m_cSetNamesToTypes.end()){
												  // The set is an attribute of an element of another set, 
											      // e.g. if set s is an attribute of each element c of set t, so
											      // there would be a ||c:t or []c:t and under it, c_s refers to c's attribute s.
						CString strParentType = GetListElement(cTranslateMain.m_cSetTypes, iParentTypeLocation);
						// Get the elements of the parent set.
						NList<CString, CString>* plParentElements;
						std::map<int, NList<CString, CString>*>::iterator iElementSuccess = cTranslateMain.m_cSetElements.find(iParentTypeLocation);
						plParentElements = iElementSuccess->second;
						if (iElementSuccess != cTranslateMain.m_cSetElements.end()){
	/////////// Do something if it is 0 as an error occurred.
							NPosition cParentElementPos;
							cParentElementPos = plParentElements->GetHeadPosition();
							while (cParentElementPos.IsNotNull()){
								CString strCurrentElement = plParentElements->GetNext(cParentElementPos);
								strFullSetName = strCurrentElement + _T("_") + strSetName;
								strFullSetName = TrimChangeCase(strFullSetName, false);

								NList<CString, CString>* plInitial;
								std::map<int, NList<CString, CString>*>::iterator iInitialSuccess = cTranslateMain.m_cInitSetElements.find(setNo);
								plInitial = iInitialSuccess->second;
								if (iInitialSuccess != cTranslateMain.m_cInitSetElements.end()){
									strText.Append(strFullSetName);
									strText.Append(_T("={"));
									NPosition cInitialPos;
									cInitialPos = plInitial->GetHeadPosition();
									int iInitialCounter = 0;
									while (cInitialPos.IsNotNull()){
										CString strInitialValue = plInitial->GetNext(cInitialPos);
										if (iInitialCounter != 0){
											// This is not the first element.
											strText.Append(_T(","));
										}
										strText.Append(strInitialValue);
										iInitialCounter++;
									}
									strText.Append(_T("};\r\n"));
								}else{ // No initial values were stored.
									strText.Append(strFullSetName);
									int iSetTypeLocation;
									int iTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(setNo,iSetTypeLocation);
									CString strSetType = GetListElement(cTranslateMain.m_cSetTypes, iSetTypeLocation);
									strSetType = TrimChangeCase(strSetType, true);
									strText.Append(_T("=set{") + strSetType + _T("}!empty_set;\r\n"));
								}

							}
						}
					}else{  // The set is an attribute of a component that is not part of another set,
						    // e.g. if the set was s and it was an attribute of the component c, i.e. c_s.
						strFullSetName = strParentSet + _T("_") + strSetName;
						strFullSetName = TrimChangeCase(strFullSetName, false);

						NList<CString, CString>* plInitial;
						int iInitialSuccess = cTranslateMain.m_cInitSetElements.Lookup(setNo,plInitial);
						if (iInitialSuccess > 0){
							strText.Append(strFullSetName);
							strText.Append(_T("={"));
							NPosition cInitialPos;
							cInitialPos = plInitial->GetHeadPosition();
							int iInitialCounter = 0;
							while (cInitialPos.IsNotNull()){
								CString strInitialValue = plInitial->GetNext(cInitialPos);
								if (iInitialCounter != 0){
									// This is not the first element.
									strText.Append(_T(","));
								}
								strText.Append(strInitialValue);
								iInitialCounter++;
							}
							strText.Append(_T("};\r\n"));
						}else{ // No initial values were stored.
							strText.Append(strFullSetName);
							int iSetTypeLocation;
							int iTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(setNo,iSetTypeLocation);
							CString strSetType = GetListElement(cTranslateMain.m_cSetTypes, iSetTypeLocation);
							strSetType = TrimChangeCase(strSetType, true);
							strText.Append(_T("=set{") + strSetType + _T("}!empty_set;\r\n"));
						}
					}
				}else{ // The set is not an attribute.
					strFullSetName = strSetName;
					strFullSetName = TrimChangeCase(strFullSetName, false);

					NList<CString, CString>* plInitial;
					int iInitialSuccess = cTranslateMain.m_cInitSetElements.Lookup(setNo,plInitial);
					if (iInitialSuccess > 0){
						strText.Append(strFullSetName);
						strText.Append(_T("={"));
						NPosition cInitialPos;
						cInitialPos = plInitial->GetHeadPosition();
						int iInitialCounter = 0;
						while (cInitialPos.IsNotNull()){
							CString strInitialValue = plInitial->GetNext(cInitialPos);
							if (iInitialCounter != 0){
								// This is not the first element.
								strText.Append(_T(","));
							}
							strText.Append(strInitialValue);
							iInitialCounter++;
						}
						strText.Append(_T("};\r\n"));
					}else{ // No initial values were stored.
						strText = strText + strFullSetName;
						int iSetTypeLocation;
						int iTypeSuccess = cTranslateMain.m_cSetNamesToTypes.Lookup(setNo,iSetTypeLocation);
						CString strSetType = GetListElement(cTranslateMain.m_cSetTypes, iSetTypeLocation);
						strSetType = TrimChangeCase(strSetType, true);
						strText.Append(_T("=set{") + strSetType + _T("}!empty_set;\r\n"));
					}
				}
			}
		}

		// Initialise the local messages to false.
		NPosition cLocalBooleanPosition2;
		cLocalBooleanPosition2 = cTranslateMain.m_cLocalBooleans.GetHeadPosition();
		while(cLocalBooleanPosition2.IsNotNull()){
			CString strCurrentBool = cTranslateMain.m_cLocalBooleans.GetNext(cLocalBooleanPosition2);
			strCurrentBool = TrimChangeCase(strCurrentBool, false);
			strText.Append(strCurrentBool + _T("=false;\r\n"));
		}

		// Initialise the external output messages to false.
		NPosition cLocalBooleanPosition3;
		cLocalBooleanPosition3 = cTranslateMain.m_cOutputVariables.GetHeadPosition();
		while(cLocalBooleanPosition3.IsNotNull()){
			CString strCurrentBool = cTranslateMain.m_cOutputVariables.GetNext(cLocalBooleanPosition3);
			strCurrentBool = TrimChangeCase(strCurrentBool, false);
			strText.Append(strCurrentBool + _T("=false;\r\n"));
		}
	
		// Initialise the program counters.
		// Initialise the program counters of the top node or nodes and set them to 1.
		CTranslateNode* pcStartNode = cTranslateMain.GetNode(cTranslateMain.m_iStartNode);
		int iRootChildren = pcStartNode->GetNumberOfChildren();
		NList<CString, CString> lRootChildrenPCs;
		for (int i = 0; i < iRootChildren; i++){
			int iRootChild = pcStartNode->GetChildID(i);
			CString strRootChildPC = cTranslateMain.GetPCForNode(iRootChild);
			strText.Append(strRootChildPC);
			strText.Append(_T("=1;\r\n"));
			lRootChildrenPCs.AddTail(strRootChildPC);
		}	
		// Initialise any program counters that were included from alternative atomic branching to 1.
		NPosition cInitialPCPos = cTranslateMain.m_lInitialisationPCs.GetHeadPosition();
		while (cInitialPCPos.IsNotNull()){
			CString strInitialisePC = cTranslateMain.m_lInitialisationPCs.GetNext(cInitialPCPos);
			// Check if it was already initialised.
			NPosition cAlreadyInitialisedPos = lRootChildrenPCs.Find(strInitialisePC);
			if (cAlreadyInitialisedPos == NULL){
				// It wasn't already initialised.
				strText.Append(strInitialisePC);
				strText.Append(_T("=1;\r\n"));
			}
		}
		// Initialise all other program counters to 0.
		for (int i = 1; i < cTranslateMain.m_iHighestProgramCounter + 1; i++){
			CString strPC = _T("pc");
			strPC.Format(strPC + _T("%d"), i);
			NPosition cPos = lRootChildrenPCs.Find(strPC);
			NPosition cPos2 = cTranslateMain.m_lInitialisationPCs.Find(strPC); 
			if ((cPos == NULL) && (cPos2 == NULL)){ // This wasn't already initialised.
				strText.Append(strPC);
				strText.Append(_T("=0;\r\n"));
			}
		}
	       		
		if (m_iOptionSelected == 3){
       		for (int i = 1; i < cTranslateMain.m_iHighestProgramCounter + 1; i++){
				CString strPC = _T("pc");
				strPC.Format(strPC + _T("%d"), i);
				strText.Append(strPC);
				strText.Append(_T("Allowed=false;\r\n"));
 			}
 			strText.Append(_T("allThreadsBlocked=false;\r\n"));
  		}
	       		
		/* This section writes the transitions section.
		 */
		strText.Append(_T("TRANSITION\r\n[\r\n"));
		
		// Get the guard & action for each node.
		int iTransitionNumber = 1;
		NPosition cNodePosition;
		cNodePosition = cAllNodes.GetHeadPosition();

		CString strTransition;
		while(cNodePosition.IsNotNull()){
			int iCurrentNode = cAllNodes.GetNext(cNodePosition);
			CString strGuard;
			int iSuccess = cTranslateMain.m_cNodesToGuards.Lookup(iCurrentNode,strGuard);
			
			if (iSuccess != 0){
				// Write the guard.
				strTransition = _T("A");
				strTransition.Format(strTransition + _T("%d"), iTransitionNumber);
				strText.Append(strTransition);
			
				// Include the sets guard if it exists.
				CTranslateNode* pcCurrentNode = cTranslateMain.GetNode(iCurrentNode);
				if (pcCurrentNode->RetrieveSetsGuard() != _T("")){
					strGuard = pcCurrentNode->RetrieveSetsGuard() + _T(" AND ") + strGuard;
				}
				strText.Append(_T(":") + strGuard);
				
				// Write the action.
				strText.Append(_T("-->\r\n"));
				NList<CString,CString>* plActions;
				int iActionSuccess = cTranslateMain.m_cNodesToActions.Lookup(iCurrentNode, plActions);
				if (iActionSuccess != 0){
					NPosition cActionPosition;
					cActionPosition = plActions->GetHeadPosition();
					while(cActionPosition.IsNotNull()){
						CString strCurrentAction = plActions->GetNext(cActionPosition);
						strText.Append(_T("\t") + strCurrentAction + _T(";\r\n"));
					}
				}
				strText.Append(_T("[]\r\n\r\n"));
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
			CString strExtraGuard = cTranslateMain.m_lExtraGuards.GetNext(cExtraPosition);
			strTransition = _T("A");
			strTransition.Format(strTransition + _T("%d"), iTransitionNumber);
			strText.Append(strTransition);
			strText.Append(_T(":") + strExtraGuard);
			strText.Append(_T("-->\r\n"));

			// Write the action.
			NList<CString,CString>* plExtraActions;
			int iExtraSuccess = cTranslateMain.m_cExtraActions.Lookup(iExtraCount,plExtraActions);
			if (iExtraSuccess != 0){
				NPosition cExtraActionPosition;
				cExtraActionPosition = plExtraActions->GetHeadPosition();
				while(cExtraActionPosition.IsNotNull()){
					CString strExtraAction = plExtraActions->GetNext(cExtraActionPosition);
					strText.Append(_T("\t") + strExtraAction + _T(";\r\n"));
				}
			}
			strText.Append(_T("[]\r\n\r\n"));
			iTransitionNumber++;
			iExtraCount++;
		}

		// Write the Else empty transition.
		strTransition = _T("A");
		strTransition.Format(strTransition + _T("%d"), iTransitionNumber);
		strText.Append(strTransition);
		strText.Append(_T(": ELSE --> \r\n]\r\n\r\n"));
		strText.Append(_T("END; % of MODULE\r\n\r\nEND\r\n"));

		CResultsWindow cResultsDialog;

		// Calculate the times taken.
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
			CString strParsingTime = _T("");
			strParsingTime.Format(strParsingTime + _T("%d"), cParsingTime);
			CString strTranslationTime = _T("");
			strTranslationTime.Format(strTranslationTime + _T("%d"), cTranslationTime);
			
			if (bUsingSets){
				strTranslationTime.Append(_T("; Time for reading initialisation file: "));
				strTranslationTime.Format(strTranslationTime + _T("%d"), cReadingInitialTime);
				strParsingTime.Append(_T("; Time for parsing set info: "));
				strParsingTime.Format(strParsingTime + _T("%d"), cRunningParserTime);
			}

			cResultsDialog.SetTimes(strParsingTime, strTranslationTime);
		}

		// Get the details about the BT if it is a randomly created BT.
	//	if (m_bTranslateWithRandomBT){
	//		CString strNodesNumber = _T("");
	//		strNodesNumber.Format(strNodesNumber + _T("%d"), pcRandom->GetNumberOfNodes());
	//		CString strBranchesNumber = _T("");
	//		strBranchesNumber.Format(strBranchesNumber + _T("%d"), pcRandom->GetNumberOfBranches());
		//	CString strReversionsNumber = _T("");
	//		strReversionsNumber.Format(strReversionsNumber + _T("%d"), pcRandom->GetNumberOfReversions());
	//		CString strMacrosNumber = _T("");
		//	strMacrosNumber.Format(strMacrosNumber + _T("%d"), pcRandom->GetNumberOfMacros());
	//		CString strThreadKillNumber = _T("");
	//		strThreadKillNumber.Format(strThreadKillNumber + _T("%d"), pcRandom->GetNumberOfThreadKills());
			
	//		cResultsDialog.SetRandomInformation(strNodesNumber, strBranchesNumber, 
	//			strReversionsNumber, strMacrosNumber, strThreadKillNumber);
	//	}

		// Show the translation.
		cResultsDialog.SetResultsText(strText);
		cResultsDialog.DoModal();	
		}
	}catch (CTranslateException salEx){
		if (salEx.GetMessage() != _T("")){
			AfxMessageBox(salEx.GetMessage());
		}
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
			if (lBlocksToDelete.Find(pcCurrentBlock) == NULL){
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

	std::map<int,CTranslateNode*>::iterator cNodePosition = cTranslateMain.m_mTranslateNodes.begin();
	while(cNodePosition != cTranslateMain.m_mTranslateNodes.end()){
		CTranslateNode* pcTheNode = (*cNodePosition).second;
		delete pcTheNode;
		pcTheNode = NULL;
	}
	cTranslateMain.m_mTranslateNodes.clear();

	std::map<int,NList<CString, CString>*>::iterator cSetPosition = cTranslateMain.m_cSetElements.begin();
	while(cSetPosition != cTranslateMain.m_cSetElements.end()){
		NList<CString, CString>* plList = (*cSetPosition).second;
		delete plList;
		plList = NULL;
	}
	cTranslateMain.m_cSetElements.clear();

	std::map<int,NList<CString, CString>*>::iterator cSetInitPosition = cTranslateMain.m_cInitSetElements.begin();
	while(cSetInitPosition != cTranslateMain.m_cInitSetElements.end()){
		NList<CString, CString>* plList = (*cSetInitPosition).second;
		delete plList;
		plList = NULL;
	}
	cTranslateMain.m_cInitSetElements.clear();

	std::map<int,NList<CString, CString>*>::iterator cStatePosition = cTranslateMain.m_cLocalStates.begin();
	while(cStatePosition != cTranslateMain.m_cLocalStates.end()){
		NList<CString, CString>* plStates = (*cStatePosition).second;
		delete plStates;
		plStates = NULL;
	}
	cTranslateMain.m_cLocalStates.clear();
	
	std::map<int,NList<CString, CString>*>::iterator cActionPosition = cTranslateMain.m_cNodesToActions.begin();
	while(cActionPosition != cTranslateMain.m_cNodesToActions.end()){
		NList<CString,CString>* plStates = (*cActionPosition).second;
		delete plStates;
		plStates = NULL;
	}
	cTranslateMain.m_cNodesToActions.clear();

	std::map<int,NList<CString, CString>*>::iterator cExtraPosition = cTranslateMain.m_cExtraActions.begin();
	while(cExtraPosition != cTranslateMain.m_cExtraActions.end()){
		NList<CString,CString>* plStates = (*cExtraPosition).second;
		delete plStates;
		plStates = NULL;
	}
	cTranslateMain.m_cExtraActions.clear();

	std::map<int,NList<CString, CString>*>::iterator cAtomicActionPos = cTranslateMain.m_cAtomicNodesToActions.begin();
	while(cAtomicActionPos != cTranslateMain.m_cAtomicNodesToActions.end()){
		NList<CString,CString>* plStates = (*cAtomicActionPos).second;
		delete plStates;
		plStates = NULL;
	}
	cTranslateMain.m_cAtomicNodesToActions.clear();

	std::map<int,NList<int, int>*>::iterator cInternalPos = cTranslateMain.m_cMatchingInternal.begin();
	while(cInternalPos != cTranslateMain.m_cMatchingInternal.end()){
		NList<int,int>* plInputs = (*cInternalPos).second;
		delete plInputs;
		plInputs = NULL;
	}
	cTranslateMain.m_cMatchingInternal.clear();

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
	
}

void CTranslateSALMain::MakeLongIDs(int iRootNode){
	CTranslateNode* pcRootNode = GetNode(iRootNode);
	CString strID;

	if (iRootNode == 1){
		strID = _T("0");
		pcRootNode->SetStringID(strID);
	}else{
		strID = pcRootNode->GetStringID();
	}
	for (int i = 0; i < pcRootNode->GetNumberOfChildren(); i++){
		int iChild = pcRootNode->GetChildID(i);
		CTranslateNode* pcChild = GetNode(iChild);
		CString strChildID = _T("");
		strChildID.Format(strID + _T("%d"), i);
		pcChild->SetStringID(strChildID);
		MakeLongIDs(iChild);
	}
}

/** Add a boolean input variable. This variable will be later written to
 *  the INPUT section of the SAL module.
 *  @param name  The name of the variable.
 */
void CTranslateSALMain::AddInputVariable(CString strName)
{
	NPosition cPosition = m_cInputVariables.Find(strName);
	if (cPosition == NULL){
		m_cInputVariables.AddTail(strName);
	}
}	

	/** Add a boolean output variable. This variable will be later written to
	 *  the OUTPUT section of the SAL module.
	 *  @param name  The name of the variable.
	 */
void CTranslateSALMain::AddOutputVariable(CString strName){
	NPosition cPosition = m_cOutputVariables.Find(strName);
	if (cPosition == NULL){
		m_cOutputVariables.AddTail(strName);
	}
}
	
	/** Add a local boolean variable. This variable will be later written to
	 *  the LOCAL section of the SAL module.
	 *  @param name  The name of the variable.
	 */
void CTranslateSALMain::AddLocalBoolean(CString strName){
	NPosition cPosition = m_cLocalBooleans.Find(strName);
	if (cPosition == NULL){
		m_cLocalBooleans.AddTail(strName);
	}
}	

	/** Add an Integer attribute. This variable will be later 
	 *  declared as an Integer type in the SAL code.
	 */ 
//////////// This function appears to be deprecated. Check this.
void CTranslateSALMain::AddIntegerAttribute(CString strName){
	NPosition cPosition = m_cIntegerAttributes.Find(strName);
	if (cPosition == NULL){
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
void CTranslateSALMain::AddLocalVariable(CString strName, CString strState){	
	int iLocation = FindListPosition(m_cLocalComponents,strName);
	if (iLocation == -1){
		NList<CString,CString> *plStates = new NList<CString,CString>;
		plStates->AddTail(strState);
		m_cLocalComponents.AddTail(strName);
		iLocation = FindListPosition(m_cLocalComponents,strName);
		m_cLocalStates.SetAt(iLocation,plStates);
	}else{
		NList<CString,CString> *plStates;
		int iSuccess = m_cLocalStates.Lookup(iLocation,plStates);
		if (plStates->Find(strState) == NULL){
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

int CTranslateSALMain::FindListPosition(NList<CString, CString>& cList, CString strValue)
{
	NPosition cPosition = cList.GetHeadPosition();
	int iCounter = -1;
	int iIndex = -1;
	while(cPosition.IsNotNull()){
		CString strCurrentString = cList.GetNext(cPosition);
		iCounter++;
		if (strCurrentString == strValue){
			iIndex = iCounter;
		}
	}
	return iIndex;
}


CString CTranslateSALMain::GetListElement(NList<CString, CString>& cList, int iPosition)
{
	int iCounter = 0;
	CString strElement;
	NPosition cPosition = cList.GetHeadPosition();
	while(cPosition.IsNotNull()){
		CString strCurrentString = cList.GetNext(cPosition);
		if (iCounter == iPosition){
			strElement = strCurrentString;
		}
		iCounter++;
	}
	return strElement;
}

void CTranslateSALMain::RemoveFromList(NList<CString, CString>& cList, int iIndex)
{
	NPosition cPosition = cList.GetHeadPosition();
	int iCounter = 0;
	while(cPosition.IsNotNull()){
		if (iCounter == iIndex){
			// This is the element to remove.
			cList.RemoveAt(cPosition);
			cPosition = NULL; // To get out of the loop.
		}else{
			CString strCurrentString = cList.GetNext(cPosition);
			iCounter++;
		}
	}
}

	/** Add a guard for a transition, associating it with a node.
	 *  @param  n   The node the guard applies to,
	 *  @param  guard  The transition guard as a string.
	 */
void CTranslateSALMain::AddNodeGuard(int iNode, CString strGuard){
	m_cNodesToGuards.SetAt(iNode,strGuard);
}
	
	/** Add a list of actions for a transition, associating it with a node.
	 *  @param  n   The node the actions apply to,
	 *  @param  actions The action string list.
	 */
void CTranslateSALMain::AddNodeAction(int iNode, NList<CString, CString>* plActions){
	RemoveAssignmentRepeats(*plActions);
	// Check if there is already a list stored for this node.
	NList<CString, CString>* plCurrentActions;
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
void CTranslateSALMain::AddExtraNodeAction(int iNode, CString strAction){
	NList<CString,CString>* plCurrentActions;
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
						plCurrentActions = new NList<CString, CString>;
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
int CTranslateSALMain::AddExtraTransition(CString strGuard, NList<CString,CString>* plActions){
	int iPosition = -1;
	RemoveAssignmentRepeats(*plActions);
	iPosition = FindListPosition(m_lExtraGuards, strGuard);
	if (iPosition == -1){ // The guard was not already there so add it.
		m_lExtraGuards.AddTail(strGuard);
		iPosition = FindListPosition(m_lExtraGuards, strGuard);
	}else{ // The guard was there so delete the old action list.
		NList<CString, CString>* plOldActions;
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
CString CTranslateSALMain::GetNewProgramCounter(){
	m_iHighestProgramCounter++;
	CString strNewProgramCounter = _T("pc");
	strNewProgramCounter.Format(strNewProgramCounter + _T("%d"), m_iHighestProgramCounter);
	m_cPCRanges.SetAt(m_iHighestProgramCounter, 2);
	return strNewProgramCounter;
}
	
	/** Returns the name of the given node's program counter.
	 *  (This is the pc which allows the node to execute).
	 *  @param  n  The node,
	 *  @return The name of the program counter.
	 */
CString CTranslateSALMain::GetPCForNode(int iNode){
	CString strProgramCounter = _T("");
	int iProgramCounter;
	int iSuccess = m_cNodesToPCs.Lookup(iNode, iProgramCounter);
	if (iSuccess != -1){
		strProgramCounter = _T("pc");
		strProgramCounter.Format(strProgramCounter+_T("%d"), iProgramCounter);
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
CString CTranslateSALMain::GetGuard(int iNode){
	CString strGuard = _T("");
	int iSuccess = m_cNodesToGuards.Lookup(iNode,strGuard);
	return strGuard;
}
	
	/** Returns the actions for the given node.
	 *  @return  A list of strings representing each action.
	 */
NList<CString, CString>* CTranslateSALMain::GetActions(int iNode){
	NList<CString, CString>* plActions;
	int iSuccess = m_cNodesToActions.Lookup(iNode,plActions);
	return plActions;
}
	
// RemovePCUpdates method to be completed (only needed for synchronisation).

	/** Returns a list of the program counters of threads created at or below
	 *  the given node.
	 *  @param n  The node,
	 *  @return  A list of the names of the program counters.
	 */
NList<CString, CString>* CTranslateSALMain::FindThreadsToKill(int iNode, bool bCallingForReversion){
	NList<CString, CString>* plThreadsToKill = new NList<CString, CString>;
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
			if (cPos == NULL){ // Kill this thread.
				CString strCurrentPC = _T("pc");
				strCurrentPC.Format(strCurrentPC + _T("%d"), i);
				if (bCallingForReversion){
					strCurrentPC.Append(_T("'=0"));
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
		int iNextBranch;
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
void CTranslateSALMain::AddAtomicGuard(int iNode, CString strGuard){
	// Store the new guard with the given node.
	m_cAtomicNodesToGuards.SetAt(iNode, strGuard);
}

	/** Add an atomic action list. 
	 *  @param  n   The node the guard applies to,
	 *  @param  actions  The transition actions as a list.
	 */
void CTranslateSALMain::AddAtomicActions(int iNode, NList<CString, CString>* plActions){
	NList<CString, CString>* plCurrentActions;
	int iSuccess = m_cAtomicNodesToActions.Lookup(iNode, plCurrentActions);
	if (iSuccess != 0){ // There are already some actions associated with this node.
		// Copy all the current actions to the new list.
		NPosition cListPos;
		cListPos = plCurrentActions->GetHeadPosition();
		while (cListPos.IsNotNull()){
			CString strAction = plCurrentActions->GetNext(cListPos);
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
CString CTranslateSALMain::GetAtomicGuard(int iNode){		
	CString strGuard = _T("");
	int iSuccess = m_cAtomicNodesToGuards.Lookup(iNode, strGuard);
	return strGuard;
}
	
	/** Returns the atomic actions for the given node.
	 *  @return  A list of strings representing each action.
	 */
NList<CString, CString>* CTranslateSALMain::GetAtomicActions(int iNode){
	NList<CString, CString>* plActions;
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
	CString strCurrentID;
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
			strCurrentID = _T("0");
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
			strCurrentID.Format(strCurrentID + _T("%d"), 0);	
			m_cNodesToIDs.SetAt(iCurrentNode, strCurrentID);

			// Increase the highest pc count if this is the first time pc1 was used.
			if (bUsedPC1 == false){
				bUsedPC1 = true;
				m_iHighestProgramCounter++; // Increase it to 2.
			}

		}else{  // The node is either not part of an atomic block or it is the top node of an atomic block.
			if (iSiblingNumber == 0){  // This is a single node.
				// Set the ID to be an extension of the parent node's ID.
				strCurrentID.Format(strCurrentID + _T("%d"), 0);	
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
					CString strSiblingID;
					int iSuccess = m_cNodesToIDs.Lookup(iSiblingNode,strSiblingID);
					if (iSuccess == 0){  // If this node hasn't already been assigned an ID by a sibling.
						int iSuccess2 = m_cNodesToIDs.Lookup(iParentNode,strCurrentID);
						if (iSuccess2 == 0){
							strCurrentID = _T("0");
						}
						strCurrentID.Format(strCurrentID + _T("%d"), i);	
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
CString CTranslateSALMain::TrimChangeCase(CString strName, bool bToUpperCase){
	// Replace white spaces between words with underscores.
	strName.Trim();
	strName.Trim(_T(""));
	strName.Replace(_T(" "),_T("_"));
	strName.Replace(_T("-"),_T("_"));
	if (strName.Left(4) != _T("NOT(")){
	//	strName.Replace(_T("("),_T("_"));
//		strName.Replace(_T(")"),_T(""));  ///// This doesn't work because then NOT(something)'s won't be done right.
	
		// Change the first letter into upper or lower case as specified.
		CString strFirstLetter = strName.Left(1);
		if (bToUpperCase == true){
			strFirstLetter = strFirstLetter.MakeUpper();
		}else{
			strFirstLetter = strFirstLetter.MakeLower();
		}
		int iLength = strName.GetLength();
		CString strTemp = strName.Mid(1,iLength);
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
void CTranslateSALMain::RemoveAssignmentRepeats(NList<CString, CString>& lAssignments){
		/* If the actions include "allThreadsBlocked", then set it to true.
		 * This is because if there was a < > node and a > < node in the same atomic block, 
		 * the allThreadsBlocked should be set to true for the output message.
		 */
		int iNoOfBlockedTrue = 0;
		int iNoOfBlockedFalse = 0;
		NPosition cListPosition = lAssignments.GetHeadPosition();
		while (cListPosition.IsNotNull()){ 
			CString strCurrent = lAssignments.GetNext(cListPosition);
			if (strCurrent == _T("allThreadsBlocked'=true")){
				iNoOfBlockedTrue++;
			}else if (strCurrent == _T("allThreadsBlocked'=false")){
				iNoOfBlockedFalse++;
			}
		}
		if ((iNoOfBlockedTrue > 0) && (iNoOfBlockedFalse > 0)){
			NPosition cLocation;
			cLocation = lAssignments.Find(_T("allThreadsBlocked'=false"));
			if (cLocation.IsNotNull()){
				lAssignments.RemoveAt(cLocation);
			}
		}
		
		// Remove the rest of the repeated statements.
		NList<CString, CString> lFirstParts;
		cListPosition = lAssignments.GetHeadPosition();
		while (cListPosition.IsNotNull()){
			CString strCurrent = lAssignments.GetNext(cListPosition);
			int iPos = 0;
			CString strToken = strCurrent.Tokenize(_T("'="),iPos);

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
void CTranslateSALMain::RemoveMessageConflicts(NList<CString, CString>& lUpdates, NList<CString, CString>& lMessageNames){
	CString strMessage;
	bool bContainsFalseMsg;
	NPosition cMessagePosition;
	cMessagePosition = lMessageNames.GetHeadPosition();
	while (cMessagePosition.IsNotNull()){
		strMessage = lMessageNames.GetNext(cMessagePosition);
		if (lUpdates.Find(strMessage + _T("'=true")).IsNotNull()){
			NPosition cMsgPosition;
			cMsgPosition = lUpdates.Find(strMessage + _T("'=false"));
			if (cMsgPosition == NULL){
				bContainsFalseMsg = false;
			}else{
				bContainsFalseMsg = true;
			}
			while(bContainsFalseMsg == true){
				NPosition cFalsePosition;
				cFalsePosition = lUpdates.Find(strMessage + _T("'=false"));
				if (cFalsePosition.IsNotNull()){
					lUpdates.RemoveAt(cFalsePosition);
				}
				cFalsePosition = lUpdates.Find(strMessage + _T("'=false"));
				if (cFalsePosition == NULL){
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
void CTranslateSALMain::AddMessageString(CString strMessage){
	if (m_strMessageReady != _T("")){//If there's already an entry stored.
		m_strMessageReady = m_strMessageReady + _T("OR ");
		m_strMessageReady = m_strMessageReady + strMessage;
		m_strMessageReady = m_strMessageReady + _T("\r\n");
	}else{
		m_strMessageReady = m_strMessageReady + strMessage;
		m_strMessageReady = m_strMessageReady + _T("\r\n");
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
		CTranslateException cException(_T("Root node must be a state-realisation."));
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
			CTranslateException cException(_T("Initialisation block must all be state-realisations with no branching."));
			throw cException;
		}else{
			int iLastNode = lInitNodes.GetTail();
			m_iStartNode = iLastNode;
			NPosition cInitPosition;
			cInitPosition = lInitNodes.GetHeadPosition();
			while (cInitPosition.IsNotNull()){
				int iCurrentNode = lInitNodes.GetNext(cInitPosition);
				CTranslateNode* pcCurrentNode = GetNode(iCurrentNode);
				CString strComponentName;
				strComponentName = pcCurrentNode->GetComponentName();
				CString strStateName;
				strStateName = pcCurrentNode->GetStateName();
				//CString strAction;
				strComponentName = TrimChangeCase(strComponentName, false);
				strStateName = TrimChangeCase(strStateName, false);
				CString strFinalComp = strComponentName;
				CString strFinalState = strComponentName + _T("_") + strStateName;
				// Check for attributes.
				int iTokenPos = 0;
				CString strToken = strStateName.Tokenize(_T(":="), iTokenPos);
				CString strToken2 = strStateName.Tokenize(_T(":="), iTokenPos);
				if (strToken2 != _T("")){ // The state contains attributes.
					strToken = TrimChangeCase(strToken, false);
					strToken2 = TrimChangeCase(strToken2, false);

					// Check if the first component is an integer type variable.
					if (IsInteger(strComponentName + _T("_") + strToken)){
						// Check if the second value is an integer.
						if (IsStringANumber(strToken2)){
							strFinalComp = strComponentName + _T("_") + strToken;
							strFinalState = strToken2;
						}else{ // The second value must be another attribute.
							strFinalComp = strComponentName + _T("_") + strToken;
							strFinalState = strComponentName + _T("_") + strToken2;
						}
					}else{ // It is a normal attribute.
						// Change the component name & state to attribute style.
						strFinalComp = strComponentName + _T("_") + strToken;
						strFinalState = strComponentName + _T("_") + strToken + _T("_") + strToken2;
						AddLocalVariable(strFinalComp, strFinalState);
					}
				}else{ // The state doesn't contain attributes.
				//strAction = strFinalComp + _T("=") + strFinalState;
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
		CString strChildName = bstrChildName;
		if (strChildName == _T("CHILDREN")){  // Ignore the other XML child nodes like "REQUIREMENTS" etc.
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

	_bstr_t bstrSearchItem = _T("COMP_NAME");	
	MSXML::IXMLDOMNodePtr pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	if (pComponent == NULL){  // Something is wrong since there should be a component name.
		CString strError = _T("Could not find component name for node: ");
		strError.Format(strError + _T("%d"), m_iHighestTranslateID);
		strError.Append(_T("\r\nPossible cause may be incorrect format in XML file."));
		AfxMessageBox(strError);
		return NULL;
	}
	_variant_t vItemValue = pComponent->GetnodeValue();
	CString strComponent = vItemValue.bstrVal;

	bstrSearchItem = _T("NAME");
	pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	if (pComponent == NULL){  // Something is wrong since there should be a behavior name.
		CString strError = _T("Could not find behavior name for node:");
		strError.Format(strError + _T("%d"), m_iHighestTranslateID);
		strError.Append(_T("\r\nPossible cause may be incorrect format in XML file."));
		AfxMessageBox(strError);
		return NULL;
	}
	vItemValue = pComponent->GetnodeValue();
	CString strState = vItemValue.bstrVal;

	bstrSearchItem = _T("OPERATOR");
	pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	CString strFlags;
	int iJumpType = GSE_J_NO;
	if (pComponent.IsNotNull()){  
		vItemValue = pComponent->GetnodeValue();
		strFlags = vItemValue.bstrVal;
		strFlags.Trim(_T(" "));
		if (strFlags == _T("=>")){  // a reference (go-to) node.
			iJumpType = GSE_J_GOTO;
			strFlags = _T("");
		}else if (strFlags == _T("^")){
			iJumpType = GSE_J_REVERSION;
			strFlags = _T("");
		}else{
			iJumpType = GSE_J_NO;
		}
	}
	
	bool bIsSet = false;  // Set nodes are not yet possible in BESE.

	bstrSearchItem = _T("PARENT_REL_TYPE");
	pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	bool bIsAtomic = false;
	if (pComponent.IsNotNull()){
		vItemValue = pComponent->GetnodeValue();
		CString strLinkType = vItemValue.bstrVal;
		if (strLinkType == _T("atomic")){
			bIsAtomic = true;
		}
	}

	bool bIsNonDeter = false;
	bstrSearchItem = _T("ND_CHOICE");
	pComponent = pmAttributes->getNamedItem(bstrSearchItem);
	if (pComponent.IsNotNull()){
		vItemValue = pComponent->GetnodeValue();
		CString strBranchingType = vItemValue.bstrVal;
		if (strBranchingType == _T("true")){
			bIsNonDeter = true;
		}
	}

	_bstr_t bstrNodeType = pXMLNode->GetnodeName();
	CString strNodeType = bstrNodeType;
	int iType = GSE_T_STATE;  // Default to state realisation.
	if (strNodeType == _T("STATE")){
		iType = GSE_T_STATE;
	}else if (strNodeType == _T("GUARDED_EVENT")){
		iType = GSE_T_GUARD;
	}else if (strNodeType == _T("EVENT")){
		iType = GSE_T_EVENT;  // Note this is treated the same as external input.
	}else if (strNodeType == _T("SELECTION")){
		iType = GSE_T_CONDITION;
	}else if (strNodeType == _T("EXTERNAL_OUTPUT")){
		iType = GSE_T_OUTPUT;
	}else if (strNodeType == _T("EXTERNAL_INPUT")){
		iType = GSE_T_INPUT;
	}else if (strNodeType == _T("INTENAL_OUTPUT")){
		iType = GSE_T_OUTPUT1;
	}else if (strNodeType == _T("INTERNAL_INPUT")){
		iType = GSE_T_INPUT1;
	}else{  // This is an error.
		CString strError = _T("Could not find type (e.g. event/state/guard) for node:");
		strError.Format(strError + _T("%d"), m_iHighestTranslateID);
		strError.Append(_T("\r\nPossible cause may be incorrect format in XML file."));
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
	int s = (int) cAllNodes.GetSize();
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

void CTranslateSALMain::ReadSetInformation(CString strPathName, CString strFileName){
	FILE *pcFile;
	CString strLine;
	char cLine[4096];
	
	// Read the selected file.
	_tfopen_s(&pcFile,(LPCTSTR)strPathName,_T("rt"));

	while(!feof(pcFile)) {
		fgets(cLine,4096,pcFile); 
		strLine = cLine;
		if (!feof(pcFile)){ // To make it ignore the last blank line.
			if (strLine.Trim() != _T("")){
				StoreSetInformation(strLine);
			}
		}
	}
	fclose(pcFile);
}

void CTranslateSALMain::StoreSetInformation(CString strSet){
	// Remove the last character as it is a line break character.
	int iLength = strSet.GetLength();
	strSet.Truncate(iLength - 1);
	
	// Store the set name, set type and the set it belongs to, if applicable.
	int iTokenPos = 0;
	CString strSetBelongsTo = strSet.Tokenize(_T(";"), iTokenPos);
	
	if (strSetBelongsTo == _T("NOTSET")){ // This is information about a non-set item.
		// Get the name that this attribute is referred to in the BT.
		// e.g. In the BT, "courseID" could be used in another component to refer to
		// the ID attribute that is part of the Course component. Note that this is
		// not correct BT syntax at present, but has been used temporarily until
		// data message passing is introduced.

		if (iTokenPos == -1){
			CString strMessage = _T("No 'NameInBT' found for a NOTSET item in the set info file.");
			CTranslateException cException(strMessage);
			throw cException;
		}

		CString strNameInBT = strSet.Tokenize(_T(";"), iTokenPos);

		if (iTokenPos == -1){
			CString strMessage = _T("No component name found for a NOTSET item in the set info file.");
			CTranslateException cException(strMessage);
			throw cException;
		}

		// Get the name of the component owning this attribute.
		CString strComponentName = strSet.Tokenize(_T(";"), iTokenPos);

		if (iTokenPos == -1){
			CString strMessage = _T("No attribute name found in the set info file for item: " + strNameInBT);
			CTranslateException cException(strMessage);
			throw cException;
		}

		// Get the name of the attribute.
		CString strAttribute = strSet.Tokenize(_T(";"), iTokenPos);

		if (iTokenPos == -1){
			CString strMessage = _T("No type found in the set info file for item: " + strNameInBT);
			CTranslateException cException(strMessage);
			throw cException;
		}

		// Get the type of the attribute.
		CString strType = strSet.Tokenize(_T(";"), iTokenPos);

		if (iTokenPos == -1){
			CString strMessage = _T("No elements found in the set info file for item: " + strNameInBT);
			CTranslateException cException(strMessage);
			throw cException;
		}

		// Get the elements of this type.
		CString strElements = strSet.Tokenize(_T(";"), iTokenPos);

		// Check if the type is a pre-defined type like Integer.
		if (strType == _T("#INTEGER#")){
			CString strStartValue = strElements;
			CString strEndValue = strSet.Tokenize(_T(";"), iTokenPos);
			if (iTokenPos == -1){
				CString strMessage = _T("No upper limit found in the set info file for the integer item: " + strNameInBT);
				CTranslateException cException(strMessage);
				throw cException;
			}

			strAttribute = TrimChangeCase(strAttribute, false);
			m_lIntegers.AddTail(strComponentName + _T("_") + strAttribute);
			m_lStartValues.AddTail(strStartValue);
			m_lEndValues.AddTail(strEndValue);

		}else{  // It is a user-defined type.
			// Store all this information.
			strAttribute = TrimChangeCase(strAttribute, false);

			if (strNameInBT == _T("/")){ // If there is no alternate name, then create one.
				strComponentName = TrimChangeCase(strComponentName,false);
				strNameInBT = strComponentName + _T("_") + strAttribute;
			}
			// Check whether the alternative name was already added.
	/////// Give an error here that there can't be two alternative names that are the same.
			NPosition cPos3 = m_lAlternateNames.Find(strNameInBT);
			if (cPos3 == NULL){
				m_lAlternateNames.AddTail(strNameInBT);
			}
			int iAlternateLocation = FindListPosition(m_lAlternateNames,strNameInBT);
			
			m_lAttributes.AddTail(strAttribute);
			int iAttributeLocation = FindListPosition(m_lAttributes,strAttribute);
			m_mAlternativesToAttributes.SetAt(iAlternateLocation, iAttributeLocation);

			// Check whether the type was already added.
			NPosition cPos = m_cSetTypes.Find(strType);
			if (cPos == NULL){
				m_cSetTypes.AddTail(strType);
			}
			// Note, it was stored in the set types list even though it isn't
			// a set, because it should be translated the same way for the declarations in SAL.
			int iTypeLocation = FindListPosition(m_cSetTypes,strType);
			m_mAttributesToTypes.SetAt(iAlternateLocation, iTypeLocation);

			// Check whether the component was already added.
			NPosition cPos2 = m_lAttributeComponents.Find(strComponentName);
			if (cPos2 == NULL){
				m_lAttributeComponents.AddTail(strComponentName);
			}
			int iComponentLocation = FindListPosition(m_lAttributeComponents,strComponentName);
			m_mAttributesToComponents.SetAt(iAlternateLocation, iComponentLocation);
				
			// Store the range of values for this attribute type.
			int iElementPos = 0;
			for (int i = 0; i < 5; i++){ // No more than 5 elements allowed.
				if (iElementPos != -1){
					CString strElement = strElements.Tokenize(_T(","), iElementPos);
					// Associate the element with the set type.
					if (strElement != _T("")){
						AddElementToSet(strElement, strType);
					}else{
						if (i == 0){  // There are no elements specified at all.
							CString strMessage = _T("No elements found in the set info file for item: " + strNameInBT);
							CTranslateException cException(strMessage);
							throw cException;
						}
					}
				}
			}
		}

	}else{  // This is information about a set.
		if (iTokenPos == -1){
			CString strMessage = _T("No set name found in the set info file for a set item.");
			CTranslateException cException(strMessage);
			throw cException;
		}

		CString strSetName = strSet.Tokenize(_T(";"), iTokenPos);
		if (iTokenPos == -1){
			CString strMessage = _T("No type found in the set info file for the set item: " + strSetName);
			CTranslateException cException(strMessage);
			throw cException;
		}

		CString strSetType = strSet.Tokenize(_T(";"), iTokenPos);
		if (iTokenPos == -1){
			CString strMessage = _T("No elements found in the set info file for item: " + strSetName);
			CTranslateException cException(strMessage);
			throw cException;
		}
		strSetName = TrimChangeCase(strSetName,true);
		m_cSetNames.AddTail(strSetName);

		// Check whether the set type was already added.
		strSetType = TrimChangeCase(strSetType,true);
		NPosition cPos = m_cSetTypes.Find(strSetType);
		if (cPos == NULL){
			m_cSetTypes.AddTail(strSetType);
		}

		int iTypeLocation = FindListPosition(m_cSetTypes,strSetType);
		int iNameLocation = FindListPosition(m_cSetNames,strSetName);
		m_cSetNamesToTypes.SetAt(iNameLocation, iTypeLocation);

		// Add the set type to the list of unique set types.
		// (see description in the header file next to the definition of m_cSetNamesToUniqueTypes).
		
		if (strSetBelongsTo != _T("/")){ // If this set is an attribute of either a normal component
											 // or an element of another (parent) set.
			// Check whether the parent set was already added.
			strSetBelongsTo = TrimChangeCase(strSetBelongsTo,true);
			NPosition cPos = m_cParentSets.Find(strSetBelongsTo);
			if (cPos == NULL){
				m_cParentSets.AddTail(strSetBelongsTo);
			}
		////////////////// Check whether it needs to be added to the parent sets list, since the parent might be a normal component not a set.	
			m_cAttributeSets.AddTail(strSetName);
			int iParentSetLocation = FindListPosition(m_cParentSets,strSetBelongsTo);
			int iSetLocation = FindListPosition(m_cAttributeSets,strSetName);
			m_cSetsToParentSets.SetAt(iSetLocation, iParentSetLocation);
		}

		// Store the list of possible elements in the set.
		CString strSetRange = strSet.Tokenize(_T(";"), iTokenPos);
		int iElementPos = 0;
		for (int i = 0; i < 5; i++){ // No more than 5 elements allowed.
			if (iElementPos != -1){
				CString strElement = strSetRange.Tokenize(_T(","), iElementPos);
				
				// Associate the element with the set type.
				if (strElement != _T("")){
					AddElementToSet(strElement, strSetType);
				}else{
					if (i == 0){  // There are no elements specified at all.
						CString strMessage = _T("No elements found in the set info file for item: " + strSetName);
						CTranslateException cException(strMessage);
						throw cException;
					}
				}
			}
		}
		CString strSetInitial;
		if (iTokenPos == -1){
			strSetInitial = _T(""); 
		}
		// Store the list of initial elements in the set.
		strSetInitial = strSet.Tokenize(_T(";"), iTokenPos);
		if (strSetInitial != _T("")){  // Note: If it is null, then there are no initial elements in the set - This is a valid possibility.
			int iInitialPos = 0;
			for (int i = 0; i < 5; i++){ // No more than 5 elements allowed.
				if (iInitialPos != -1){
					CString strElement = strSetInitial.Tokenize(_T(","), iInitialPos);
					// Associate the element with the set name.
					if (strElement != _T("")){		
						AddInitialElement(strElement, strSetName);
					}
				}
			}
		}

		// Store the list of possible elements in the unique set.
		// (see description in the header file next to the definition of m_cSetNamesToUniqueTypes).
//		CString strSetRange2 = strSet.Tokenize(_T(";"), iTokenPos);
//		int iElementPos2 = 0;
//		for (int i = 0; i < 5; i++){ // No more than 5 elements allowed.
//			if (iElementPos2 != -1){
//				CString strElement = strSetRange2.Tokenize(_T(","), iElementPos2);
//				// Associate the element with the set type.
//				if (strElement != _T("")){
//					AddUniqueElementToSet(strElement, strSetType);
//				}
//			}
//		}
	}
}

// This function (despite its name), and the next three functions are for reading input from a TextBE file and 
// converting it into TranslateNode objects.
CTranslateNode* CTranslateSALMain::ReadSlice(CString strPathName, CString strFileName){
	FILE *pcFile;
	CString strLine;
	CString strLine2;
	char cLine[4096];
	CTranslateNode* pcNode;
	CTranslateNode* pcRoot;
	NList<CString,CString>* plLastComponent; // This is for when the line is declaring state names
							// and the component name was specified on a previous line.
	bool bReachedTree = false; // Indicates whether the tree section of the file
							// has been reached.
	
	// Read the selected file.
	// Note that this assumes that each definition (starting with a #)
	// in the TextBT file is on a new line. 
	_tfopen_s(&pcFile,(LPCTSTR)strPathName,_T("rt"));
	plLastComponent = new NList<CString,CString>;

	bool bOneMoreLine = false;
	m_bReachedComp = false;

	try{
	fgets(cLine,4096,pcFile); 
	while(!feof(pcFile) || (bOneMoreLine == true)) {
		strLine = cLine;
	//	if (!feof(pcFile) || (feof(pcFile) && strLine != _T(""))){ // To make it ignore the last blank line.
			int iTokenPos = 0;
			CString strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
			if ((strToken != _T("#T")) && !bReachedTree){
				// This is still the component declarations section of the file.
				// Store the information and pass the last component name,
				// in case this is a state declarations line and the component name
				// that was previously parsed on another line is now needed.
				plLastComponent = StoreSliceInformation(strLine, plLastComponent);
			}else if (strToken == _T("#T")){
				if (!feof(pcFile)){
					// Remove the last character as it is a line break character.
					int iLength = strLine.GetLength();
					strLine.Truncate(iLength - 1);
				}
				bReachedTree = true;
				delete plLastComponent; // The component declarations are finished so delete it.
				plLastComponent = NULL;
				pcNode = StoreSliceNodeInformation(strLine);
				pcRoot = pcNode;
			}else{ //bReachedTree == true.
				if (!feof(pcFile)){
					// Remove the last character as it is a line break character.
					int iLength = strLine.GetLength();
					strLine.Truncate(iLength - 1);
				}
				pcNode = StoreSliceNodeInformation(strLine);
			}
			if (bOneMoreLine == true){
				bOneMoreLine = false; // Stop it reading anymore.
			}else{
				if (fgets(cLine,4096,pcFile).IsNotNull()){	
					strLine2 = cLine;

					if (feof(pcFile)){  // The end of the file was reached but if it's come in here
										// then there was something useful on the line before the end-of-file
										// character, so repeat the while loop for this line.
						bOneMoreLine = true;
					}
				}			
				// Parse the last line if necessary.
				// This was needed because otherwise if the last line that was just read contains the end-of-file
				// character, it won't go into the while loop and will miss the last line. The fgets line has to be
				// here at the end and not at the top because otherwise if there is a blank line (no spaces) at the end
				// of the file, then when it reads that line (at the top), it reaches feof and leaves cLine to contain
				// the value that it did on the last iteration, so the second-last line is used again, which causes errors.
			
			}			
	}

	if (m_bReachedComp == false){  // This is probably not a .bt file, since no component declarations were found.
		// Throw an error.
		CString strMessage = _T("No component declarations found. Please check that the file is a valid .bt (TextBE) file.");
		CTranslateException cException(strMessage);
		throw cException;
	}

	if (bReachedTree == false){  // This is probably not a .bt file, since tree information was not found.
		// Throw an error.
		CString strMessage = _T("No BT (#T) section found. Please check that the file is a valid .bt (TextBE) file.");
		CTranslateException cException(strMessage);
		throw cException;
	}

	if (m_lBranchingNodes.GetSize() != 0){ // If there's anything still in the m_lBranchingNodes list.
		CString strMessage = _T("Please check your .bt file. The number of brackets is incorrect.");
		CTranslateException cException(strMessage);
		throw cException;
	}
	}catch (CTranslateException salEx){
		AfxMessageBox(salEx.GetMessage());
		fclose(pcFile);
		if (plLastComponent.IsNotNull()){
			delete plLastComponent; 
		}
		pcRoot = NULL;
	}

	fclose(pcFile);
/*	// Show a file dialog box.//////////////////////////////////////////
	CString strTree = PrintTree(pcRoot);
	CString strTempFile = _T("H:\\test.txt");
		// Save the results to the specified file.
		FILE *pcFile2;
		_tfopen_s(&pcFile2,(LPCTSTR)strTempFile,_T("wt"));
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
NList<CString, CString>* CTranslateSALMain::StoreSliceInformation(CString strLine, NList<CString, CString>* plComponent){
	CString strToken, strToken2, strToken3, strToken4;
	// Remove the last character as it is a line break character.
	int iLength = strLine.GetLength();
	strLine.Truncate(iLength - 1);
	int iTokenPos = 0;
	strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
	
	//	while (!strToken.IsEmpty()){
	strToken.Trim();
	if ((strToken == _T("#SC")) || (strToken == _T("#C"))){
		// This is a component.

		m_bReachedComp = true;  // The component declarations part has been reached.

		// Get the component identifier.
		strToken2 = strLine.Tokenize(_T(" \t"), iTokenPos);
		while (strToken2 != _T("") && strToken2.Trim() == _T("")){  // If strToken2 is a blank space but it's not the end of the line.
			strToken2 = strLine.Tokenize(_T(" \t"), iTokenPos);
		}
		strToken2.Trim();
		// Get the component name.
		strToken3 = strLine.Tokenize(_T(" \t"), iTokenPos);
		while (strToken3 != _T("") && strToken3.Trim() == _T("")){  // If strToken3 is a blank space but it's not the end of the line.
			strToken3 = strLine.Tokenize(_T(" \t"), iTokenPos);
		}
		strToken3.Trim();
		// Store this information.
//		StoreComponentInfo(strToken2, strToken3);
		// Return the new component name and ID in a list.
		delete plComponent; // Delete the last list.
		NList<CString,CString>* plCompList = new NList<CString,CString>;
		plCompList->AddTail(strToken2);
		plCompList->AddTail(strToken3);
		return plCompList;
	
	}else if (m_bReachedComp == true){ // If it is upto the component declarations part.
		// This is a behaviour.
		int iType;
		if (strToken == _T("#S")){
			iType = GSE_T_STATE;
		}else if (strToken == _T("#G")){
			iType = GSE_T_GUARD;
		}else if (strToken == _T("#L")){
			iType = GSE_T_CONDITION;
		}else if (strToken == _T("#E")){
			iType = GSE_T_EVENT; // This is the same as guard.
		}else if (strToken == _T("#II")){
			iType = GSE_T_INPUT1;
		}else if (strToken == _T("#IO")){
			iType = GSE_T_OUTPUT1;
		}else if (strToken == _T("#EI")){
			iType = GSE_T_INPUT;
		}else if (strToken == _T("#EO")){
			iType = GSE_T_OUTPUT;
		}else{ // Ignore everything else.
			// Return the last component name.
			return plComponent;
		}
		
		CString strCompID = plComponent->GetHead();
		CString strCompName = plComponent->GetTail();
		strToken2 = strLine.Tokenize(_T(" \t"), iTokenPos);
		while((!strToken2.IsEmpty()) && (strToken2 != _T("#R"))){
			// Get the next state name.
			strToken3 = strLine.Tokenize(_T(" \t"), iTokenPos);
			if (iTokenPos == -1){
				// Throw an error as the behaviour name was not found.
				// Note that it could also be that the behaviour ID was missing but the name was assumed to be the ID.
				// e.g. #S 1 Something - If this error was thrown then either Something is missing or 1 is missing and
				// Something was taken to be the ID value.
				CString strMessage = _T("Missing behaviour name after the ID: " + strToken2);
				strMessage = strMessage + _T(" on line:\r\n" + strLine);
				strMessage = strMessage + _T("\r\nThis may be due to a space in a behaviour name.");
				CTranslateException cException(strMessage);
				throw cException;
			}
			// Store this information.
			StoreNodeInfo(strCompID, strCompName, strToken2, strToken3, iType);
			strToken2 = strLine.Tokenize(_T(" \t"), iTokenPos);
		}	
		// Return the last component name.
		return plComponent;

	}else if (m_bReachedComp == false){ // Store the requirements tags so that they can be ignored if they are
									  // later found in the #T section.

		while (strToken != _T("") && strToken.Trim() == _T("")){  // If strToken is a blank space but it's not the end of the line.
			strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
		}

		// Ignore strToken if it is #RT.
		if (strToken == _T("#RT")){
			strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
		}

		while(!strToken.IsEmpty()){
			m_lReqTags.AddTail(strToken.Trim());
			strToken = strLine.Tokenize(_T(" \t"), iTokenPos);

			while (strToken != _T("") && strToken.Trim() == _T("")){  // If strToken is a blank space but it's not the end of the line.
				strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
			}

			if (!strToken.IsEmpty()){
				strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
			}
		}
		return plComponent;  // It will actually be null anyway.

	}
/*
	CString strNodeID = strLine.Tokenize(_T(" "), iTokenPos);
	CString strComponentName = strLine.Tokenize(_T(","), iTokenPos);
	CString strStateName = strLine.Tokenize(_T(","), iTokenPos);
	CString strFlag = strLine.Tokenize(_T(","), iTokenPos);
	CString strType = strLine.Tokenize(_T(","), iTokenPos);
	CString strBranchingType = strLine.Tokenize(_T(","), iTokenPos);
	CString strJumpType = strLine.Tokenize(_T(","), iTokenPos);
	CString strSiblingNumber = strLine.Tokenize(_T(","), iTokenPos);
	CString strChildrenNumber = strLine.Tokenize(_T(","), iTokenPos);
	CString strParent = strLine.Tokenize(_T(","), iTokenPos);
	CString strIsBlankNode = strLine.Tokenize(_T(","), iTokenPos);
	CString strIsNodeNonDeter = strLine.Tokenize(_T(","), iTokenPos);
	CString strIsAtomic = strLine.Tokenize(_T(","), iTokenPos);

	// Create a TranslateNode with this information.
	CTranslateNode* pcNode = new CTranslateNode;
	pcNode->SetComponentName(strComponentName);
	pcNode->SetStateName(strStateName);
	if (strFlag == _T(" ")){  // It was meant to be a blank flag so delete the space.
		strFlag = _T("");
	}
	pcNode->SetFlag(strFlag);
	int iType = GetNumber(strType);
	pcNode->SetType(iType);
	int iJumpType = GetNumber(strJumpType);
	pcNode->SetJumpType(iJumpType);
	int iBranchingType = GetNumber(strBranchingType);
	pcNode->SetBranchingType(iBranchingType);
	if (strIsAtomic == _T("true;")){
		pcNode->SetIsNodeAtomic(true);
	}else{
		pcNode->SetIsNodeAtomic(false);
	}
	if (strIsNodeNonDeter == _T("true")){
		pcNode->SetIsNodeNonDeterministic(true);
	}else{
		pcNode->SetIsNodeNonDeterministic(false);
	}
	pcNode->SetIsNodeSetOperation(false);
	int iSiblingNumber = GetNumber(strSiblingNumber);
	pcNode->SetSiblingNumber(iSiblingNumber);
	if (strIsBlankNode == _T("true")){
		pcNode->SetIsBlankNode(true);
	}else{
		pcNode->SetIsBlankNode(false);
	}
	pcNode->SetIsUserDefinedAttribute(false);
	int iNodeID = GetNumber(strNodeID);
	pcNode->SetNodeID(iNodeID);
	m_mTranslateNodes.SetAt(iNodeID, pcNode);
	m_iHighestTranslateID = iNodeID;
	int iParent = GetNumber(strParent);
	pcNode->SetParent(iParent);

	// Add this node to the parent's list of children.
	if (iParent != 0){
		CTranslateNode* pcParent; 
		int iSuccess = m_mTranslateNodes.Lookup(iParent, pcParent);
		pcParent->AddChild(iNodeID);
	}

	return pcNode;*/
}

// Please see the description for the ReadSlice function.
void CTranslateSALMain::StoreNodeInfo(CString strComponentID, CString strComponentName, CString strStateID, CString strStateName, int iType){
	// Create a TranslateNode with this information.
	CTranslateNode* pcNode = new CTranslateNode;
	pcNode->SetComponentName(strComponentName.Trim());
	pcNode->SetStateName(strStateName.Trim());
	pcNode->SetType(iType);
	
	// This is not a proper node yet. After parsing the tree section of the TextBE
	// file, this could become several similar nodes.
	// Create a unique ID based on the TextBE ID's.
	CString strNewID = strComponentID + _T("_") + strStateID;
	// Store this ID.
	m_lTextBEList.AddTail(strNewID);
	int iPosition = FindListPosition(m_lTextBEList, strNewID);
	m_mTextBEMap.SetAt(iPosition,pcNode);
}

// Please see the description for the ReadSlice function
CTranslateNode* CTranslateSALMain::StoreSliceNodeInformation(CString strLine){
	CString strToken, strToken2, strToken3, strToken4;
	CString strFirst, strSecond, strID;
	CTranslateNode* pcNode;
	CTranslateNode* pcRoot = NULL;
	CTranslateNode* pcBranchingParent;
	CTranslateNode* pcParent;
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
	strToken = strLine.Tokenize(_T(" \t"), iTokenPos);

	if (strToken == _T("#T")){ // Ignore this.
		strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
	}
	while (strToken != _T("") && strToken.Trim() == _T("")){  // If strToken is a blank space but it's not the end of the line.
		strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
	}
	strToken.Trim();
	if (strToken == _T("}")){
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
		strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
	}
	if (!strToken.IsEmpty()){
		strToken.Trim();
		if ((strToken == _T("-")) || (strToken == _T("+")) || (strToken == _T("--")) || (strToken == _T("+-")) || (strToken == _T("++"))){
			// Ignore this tag.
			strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
		}
	}
	
	
	while(!strToken.IsEmpty() && (bError == false)){
		strToken2 = strLine.Tokenize(_T(" \t"), iTokenPos);
		bAtomic = false;
		bSequential = true;

		while (strToken2 != _T("") && strToken2.Trim() == _T("")){  // If strToken2 is a blank space but it's not the end of the line.
			strToken2 = strLine.Tokenize(_T(" \t"), iTokenPos);
		}
		if (strToken2 != _T("")){   // There is an error in the .bt file if there are no more tokens on this line.
		bool bNodeIsBranching = false;
		bool bEndOfLine = false;
		bool bExtraCharacter = false;
		CString strLabel = _T("");
		CString strJumpingToLabel = _T("");

		strFirst = strToken;
		strToken3 = _T("");
		iPosition = strToken2.Find(_T(";;"));
		if (iPosition > -1){
			// This node is connected to the next one by an atomic connection.
			bAtomic = true;
			bSequential = false;
			strSecond = strToken2.Left(iPosition);

			// Check if there is anything after the ;; character.
			if ((strToken2.Right(strToken2.GetLength() - iPosition - 2)) != _T("")){
			// There is something after the ;; character.
			// Note that it is assumed that it cannot be a #N or #P because then
			// textBE would have given an error.
				strToken4 = strToken2.Right(strToken2.GetLength() - iPosition - 2);
				bExtraCharacter = true;
			}
		}else{
			iPosition = strToken2.Find(_T(";"));
			if (iPosition > -1){
				// This node is connected to the next one by a sequential link.
				bSequential = true;
				strSecond = strToken2.Left(iPosition);

				// Check if there is anything after the ;; character.
				if ((strToken2.Right(strToken2.GetLength() - iPosition - 1)) != _T("")){
				// There is something after the ;; character.
				// Note that it is assumed that it cannot be a #N or #P because then
				// textBE would have given an error.
					strToken4 = strToken2.Right(strToken2.GetLength() - iPosition - 1);
					bExtraCharacter = true;
				}
			}else{ // Check for a flag.
				strSecond = strToken2;
				strID = strFirst + _T("_") + strSecond;
				strToken3 = strLine.Tokenize(_T(" \t"), iTokenPos);

				// Check if it is a ; or ;; because there is a space between the previous node and the ; or ;; character.
				iPosition = strToken3.Find(_T(";;"));
				int iPosition2 = strToken3.Find(_T("--"));
				if ((iPosition > -1) && (iPosition2 == -1)){
					if (iPosition == 0){
						// This node is connected to the next one by an atomic connection.
						bAtomic = true;
						bSequential = false;
					
						// Check if there is anything after the ;; character.
						if ((strToken3.Right(strToken3.GetLength() - iPosition - 2)) != _T("")){
						// There is something after the ;; character.
						// Note that it is assumed that it cannot be a #N or #P because then
						// textBE would have given an error.
							strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 2);
							bExtraCharacter = true;
						}
						strToken3 = _T("");
					}else{
						// Token3 must be a label with a ;; character next to it with no space.
						strLabel = strToken3.Left(iPosition);

						// Check if there is anything after the ;; character.
						if ((strToken3.Right(strToken3.GetLength() - iPosition - 2)) != _T("")){
						// There is something after the ;; character.
						// Note that it is assumed that it cannot be a #N or #P because then
						// textBE would have given an error.
							strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 2);
							bExtraCharacter = true;
						}

						strToken3 = _T("");
						bAtomic = true;
						bSequential = false;
					}
				}else{
					iPosition = strToken3.Find(_T(";"));
					if ((iPosition > -1) && (iPosition2 == -1)){
						if (iPosition == 0){
							// This node is connected to the next one by a sequential link.
							bSequential = true;
							bAtomic = false;
												
							// Check if there is anything after the ; character.
							if ((strToken3.Right(strToken3.GetLength() - iPosition - 1)) != _T("")){
							// There is something after the ; character.
							// Note that it is assumed that it cannot be a #N or #P because then
							// textBE would have given an error.
								strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 1);
								bExtraCharacter = true;
							}
							strToken3 = _T("");
						}else{
							// Token3 must be a label with a ; character next to it with no space.
							strLabel = strToken3.Left(iPosition);

							// Check if there is anything after the ; character.
							if ((strToken3.Right(strToken3.GetLength() - iPosition - 1)) != _T("")){
							// There is something after the ; character.
							// Note that it is assumed that it cannot be a #N or #P because then
							// textBE would have given an error.
								strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 1);
								bExtraCharacter = true;
							}

							strToken3 = _T("");
							bAtomic = false;
							bSequential = true;
						}
					}else{
						// Check if the next token is a thread kill flag.
						iPosition = strToken3.Find(_T("--"));
						if (iPosition > -1){  
							// See if there is a ; or ;; after the flag.
							iPosition = strToken3.Find(_T(";;"));
							if (iPosition > -1){
								// This node is connected to the next one by an atomic connection.
								bAtomic = true;
								bSequential = false;
								strToken3 = strToken3.Left(iPosition);

								// Check if there is anything after the ;; character.
								if ((strToken3.Right(strToken3.GetLength() - iPosition - 2)) != _T("")){
								// There is something after the ;; character.
								// Note that it is assumed that it cannot be a #N or #P because then
								// textBE would have given an error.
									strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 2);
									bExtraCharacter = true;
								}
							}else{  
								iPosition = strToken3.Find(_T(";"));
								if (iPosition > -1){
									// This node is connected to the next one by a sequential link.
									bSequential = true;
									strToken3 = strToken3.Left(iPosition);

									// Check if there is anything after the ; character.
									if ((strToken3.Right(strToken3.GetLength() - iPosition - 1)) != _T("")){
									// There is something after the ; character.
									// Note that it is assumed that it cannot be a #N or #P because then
									// textBE would have given an error.
										strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 1);
										bExtraCharacter = true;
									}

								}else{ // Check for a #N or #P sign since this must be the end of a line.
									bEndOfLine = true;
									strToken4 = strLine.Tokenize(_T(" \t"), iTokenPos);
									if (strToken4 == _T("#N{")){
										// This is not a flag; it is a branching point.
										bNodeIsBranching = true;
										bBranchingType = false;
									}else if (strToken4 == _T("#P{")){
										// This is not a flag; it is a branching point.
										bNodeIsBranching = true;
										bBranchingType = true;
									}else if (strToken4 != _T("^") && strToken4 != _T("=>") && strToken4.Trim() != _T("")){
										CString strMessage = _T("Please check your .bt file. There is either a missing ; or ;; or an unrecognised flag after the thread kill node:\r\n") +
											strID + _T(" on line:\r\n") + strLine;
										CTranslateException cException(strMessage);
										throw cException;
									}else{
										strToken3 = strToken4;
										strToken4 = _T("");
									}
								}
							}
						}else{
							bEndOfLine = true;
							
							strToken3.Trim();
							if (strToken3 == _T("#N{")){
								// This is not a flag; it is a branching point.
								bNodeIsBranching = true;
								bBranchingType = false;
								strToken3 = _T("");
							}else if (strToken3 == _T("#P{")){
								// This is not a flag; it is a branching point.
								bNodeIsBranching = true;
								bBranchingType = true;
								strToken3 = _T("");
							}else if (strToken3 != _T("^") && strToken3 != _T("=>") && strToken3.Trim() != _T("")){
								// The only valid possibility is that it contains a label for a reference node.
								// It can only be a label followed by a space and then a ; or ;; character,
								// or a label followed by a => or ^ character with or without a space.
								// Labels followed by a ; or ;; character without a space in between would have already been taken
								// care of in an earlier "if" section.
																
								iPosition = strToken3.Find(_T("=>"));
								if (iPosition > -1){
									strJumpingToLabel = strToken3.Left(iPosition);

									// Check if there is anything after the => character.
									if ((strToken3.Right(strToken3.GetLength() - iPosition - 2)) != _T("")){
									// There is something after the ; character.
									// Note that it is assumed that it cannot be a #N or #P because then
									// textBE would have given an error.
										strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 2);
										bExtraCharacter = true;
									}

									strToken3 = _T("=>");
								}else{
									iPosition = strToken3.Find(_T("^"));
									if (iPosition > -1){
										strJumpingToLabel = strToken3.Left(iPosition);

										// Check if there is anything after the => character.
										if ((strToken3.Right(strToken3.GetLength() - iPosition - 1)) != _T("")){
										// There is something after the ; character.
										// Note that it is assumed that it cannot be a #N or #P because then
										// textBE would have given an error.
											strToken4 = strToken3.Right(strToken3.GetLength() - iPosition - 1);
											bExtraCharacter = true;
										}

										strToken3 = _T("^");
									}else{
											// Since it didn't have a ; or ;; or => after the label with no space, check if it's there
											// with a space.
											strToken4 = strLine.Tokenize(_T(" \t"), iTokenPos);
											while (strToken4 != _T("") && strToken4.Trim() == _T("")){  // If strToken2 is a blank space but it's not the end of the line.
												strToken4 = strLine.Tokenize(_T(" \t"), iTokenPos);
											}
											
											iPosition = strToken4.Find(_T("=>"));
											if (iPosition > -1){
												if (iPosition == 0){
													strJumpingToLabel = strToken3;

													// Check if there is anything after the => character.
													if ((strToken4.Right(strToken4.GetLength() - iPosition - 2)) != _T("")){
													// There is something after the ; character.
													// Note that it is assumed that it cannot be a #N or #P because then
													// textBE would have given an error.
														strToken4 = strToken4.Right(strToken4.GetLength() - iPosition - 2);
														bExtraCharacter = true;
													}

													strToken3 = _T("=>");
												}else{  // There was a => but something else before it.
													CString strMessage = _T("Please check your .bt file. There is an unexpected symbol after the node:\r\n") +
														strID + _T(" on line:\r\n") + strLine;
													CTranslateException cException(strMessage);
													throw cException;	
												}

											}else{

												iPosition = strToken4.Find(_T("^"));
												if (iPosition > -1){
													strJumpingToLabel = strToken3;

													// Check if there is anything after the => character.
													if ((strToken4.Right(strToken4.GetLength() - iPosition - 1)) != _T("")){
													// There is something after the ; character.
													// Note that it is assumed that it cannot be a #N or #P because then
													// textBE would have given an error.
														strToken4 = strToken4.Right(strToken4.GetLength() - iPosition - 1);
														bExtraCharacter = true;
													}

													strToken3 = _T("^");
												}else{
												iPosition = strToken4.Find(_T(";;"));
												if (iPosition > -1){
													if (iPosition == 0){
														strLabel = strToken3;

														// Check if there is anything after the ;; character.
														if ((strToken4.Right(strToken4.GetLength() - iPosition - 2)) != _T("")){
														// There is something after the ; character.
														// Note that it is assumed that it cannot be a #N or #P because then
														// textBE would have given an error.
															strToken4 = strToken4.Right(strToken4.GetLength() - iPosition - 2);
															bExtraCharacter = true;
														}

														strToken3 = _T("");
														bAtomic = true;
														bSequential = false;
													}else{  // There was a ;; but something else before it.
														CString strMessage = _T("Please check your .bt file. There is an unexpected symbol after the node:\r\n") +
															strID + _T(" on line:\r\n") + strLine;
														CTranslateException cException(strMessage);
														throw cException;	
													}
												}else{
													iPosition = strToken4.Find(_T(";"));
													if (iPosition > -1){
														if (iPosition == 0){
															strLabel = strToken3;

															// Check if there is anything after the ; character.
															if ((strToken4.Right(strToken4.GetLength() - iPosition - 1)) != _T("")){
															// There is something after the ; character.
															// Note that it is assumed that it cannot be a #N or #P because then
															// textBE would have given an error.
																strToken4 = strToken4.Right(strToken4.GetLength() - iPosition - 1);
																bExtraCharacter = true;
															}

															strToken3 = _T("");
															bAtomic = true;
															bSequential = false;
														}else{  // There was a ; but something else before it.
															CString strMessage = _T("Please check your .bt file. There is an unexpected symbol after the node:\r\n") +
																strID + _T(" on line:\r\n") + strLine;
															CTranslateException cException(strMessage);
															throw cException;	
														}
													}else if (strToken4 == _T("#N{")){
														// This is not a flag; it is a branching point.
														strLabel = strToken3;
														bNodeIsBranching = true;
														bBranchingType = false;
														strToken3 = _T("");
													}else if (strToken4 == _T("#P{")){
														// This is not a flag; it is a branching point.
														strLabel = strToken3;
														bNodeIsBranching = true;
														bBranchingType = true;
														strToken3 = _T("");

													}else{   // This doesn't make sense (thread kills after a label are currently not allowed).
														CString strMessage = _T("Please check your .bt file. Unrecognised symbol after the node:\r\n") +
																strID + _T(" on line:\r\n") + strLine;
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
			strID = strFirst + _T("_") + strSecond;
			iListPosition = FindListPosition(m_lTextBEList, strID);
			if (iListPosition == -1){ // The string was not found.
				CString strMessage = _T("Please check your .bt file. The following item was not defined: \r\n") + 
						strID + _T(" on line:\r\n") + strLine;
				CTranslateException cException(strMessage);
				throw cException;
			}
			int iSuccess = m_mTextBEMap.Lookup(iListPosition, pcNode);
			if (iSuccess == 0){ // The string was not found.
				CString strMessage = _T("Please check your .bt file. The following item was not defined: \r\n") + 
						strID + _T(" on line:\r\n") + strLine;
				CTranslateException cException(strMessage);
				throw cException;
			}
			// Create a new Translate Node with this information.
			CTranslateNode* pcNewNode = new CTranslateNode;
			pcNewNode->SetComponentName(pcNode->GetComponentName());
			CString strStateName = pcNode->GetStateName();
			pcNewNode->SetType(pcNode->GetType());  // This line has to be here because if it is a forall or forone
													// node, in TextBE it is also a state-change, so the forall/forone type 
													// should override the state-change type.

			if (strStateName.Left(7) == _T("FORONE_")){
				pcNewNode->SetType(GSE_T_SETANY);
				strStateName.Delete(0,7);
				pcNewNode->SetStateName(strStateName);
			}else if (strStateName.Left(7) == _T("FORALL_")){
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
			
			if (strToken3 == _T("^")){
				pcNewNode->SetJumpType(1);
				strToken3 = _T("");
			}else if (strToken3 == _T("=>")){
				pcNewNode->SetJumpType(2);
				strToken3 = _T("");
			}
			
			if (strToken3.Trim() != _T("")){ 
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
					strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
				}

				// Check if this token is a ; or ;;. That means there was a space between the last node and the ; or ;;.
				if (strToken.Trim() == _T(";")){
					bParentSeq = true;
					strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
				}else if (strToken.Trim() == _T(";;")){
					bParentAtomic = true;
					strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
				}
	
				while (strToken != _T("") && strToken.Trim() == _T("")){  // If strToken is a blank space 
																		  // but it's not the end of the line.
					strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
				}

				if (strToken == _T("")){  // There is an error in the .bt file since 
										  // the last node had a ; or ;; after it but now there's no next node.
					CString strMessage = _T("Please check your .bt file. There is no node after the node:\r\n") + 
						strID + _T(" on line:\r\n") + strLine;
					CTranslateException cException(strMessage);
					throw cException;
				}
				// Ignore requirements tags and +/- symbols.
				NPosition cPosition = m_lReqTags.Find(strToken.Trim());
				if (cPosition.IsNotNull()){
					// This is a requirements tag.
					strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
				}
				if (!strToken.IsEmpty()){
					strToken.Trim();
					if ((strToken == _T("-")) || (strToken == _T("+")) || (strToken == _T("--")) || (strToken == _T("+-")) || (strToken == _T("++"))){
						// Ignore this tag.
						strToken = strLine.Tokenize(_T(" \t"), iTokenPos);
					}
				}

			}else{  // There are no more nodes on this line.
				strToken = _T("");
			}
		}
		}else{  // There is an error in the .bt file since there's a component name with no state name.
				CString strMessage = _T("Please check your .bt file. There is no state name after the component with ID:\r\n") 
					+ strToken + _T(" on line:\r\n") + strLine;
				CTranslateException cException(strMessage);
				throw cException;
			}
		}
		if (bError == true){
			return NULL;
		}
		return pcRoot;
}

void CTranslateSALMain::AddElementToSet(CString strElement, CString strSet){
	//// Do something here if the set name isn't already in the list
	//// - this means that its type wasn't declared.

	int iSetTypePosition = FindListPosition(m_cSetTypes, strSet);
	NList<CString, CString>* plElements;
	int iSuccess = m_cSetElements.Lookup(iSetTypePosition, plElements);
	if (iSuccess == 0){ // No elements are currently associated with this set type.
		plElements = new NList<CString, CString>;
		plElements->AddTail(strElement);
		m_cSetElements.SetAt(iSetTypePosition, plElements);
	
	}else{ // There are already elements.
		NPosition cPos = plElements->Find(strElement);
		if (cPos == NULL){ // This element is not already in the list.
			plElements->AddTail(strElement);
			m_cSetElements.SetAt(iSetTypePosition, plElements);
		}
	}
}

void CTranslateSALMain::AddUniqueElementToSet(CString strElement, CString strSet){
	//// Do something here if the set name isn't already in the list
	//// - this means that its type wasn't declared.

	int iSetTypePosition = FindListPosition(m_cUniqueSetTypes, strSet);
	NList<CString, CString>* plElements;
	int iSuccess = m_cUniqueSetElements.Lookup(iSetTypePosition, plElements);
	if (iSuccess == 0){ // No elements are currently associated with this set type.
		plElements = new NList<CString, CString>;
		plElements->AddTail(strElement);
		m_cUniqueSetElements.SetAt(iSetTypePosition, plElements);
	
	}else{ // There are already elements.
		NPosition cPos = plElements->Find(strElement);
		if (cPos == NULL){ // This element is not already in the list.
			plElements->AddTail(strElement);
			m_cUniqueSetElements.SetAt(iSetTypePosition, plElements);
		}
	}
}

void CTranslateSALMain::AddInitialElement(CString strElement, CString strSet){
	//// Do something here if the set name isn't already in the list
	//// - this means that its type wasn't declared.

	int iSetNamePosition = FindListPosition(m_cSetNames, strSet);
	NList<CString, CString>* plElements;
	int iSuccess = m_cInitSetElements.Lookup(iSetNamePosition, plElements);
	if (iSuccess == 0){ // No elements are currently associated with this set type.
		plElements = new NList<CString, CString>;
		plElements->AddTail(strElement);
		m_cInitSetElements.SetAt(iSetNamePosition, plElements);
	
	}else{ // There are already elements.
		NPosition cPos = plElements->Find(strElement);
		if (cPos == NULL){ // This element is not already in the list.
			plElements->AddTail(strElement);
			m_cInitSetElements.SetAt(iSetNamePosition, plElements);
		}
	}
}
/*
void CTranslateSALMain::ReadSetElements(){
	FILE *pcFile;
	CString strLine;
	char cLine[4096];

	// Show a file dialog box.
	CFileDialog cFileDlg (TRUE, NULL, _T("*.*"),
		OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
   
   
	if( cFileDlg.DoModal ()==IDOK )
	{
		CString strPathName = cFileDlg.GetPathName();
		CString strFileName = cFileDlg.GetFileName();
		
		// Read the selected file.
		_tfopen_s(&pcFile,(LPCTSTR)strPathName ,_T("rt"));

		while(!feof(pcFile)) {
			fgets(cLine,4096,pcFile); 
			strLine = cLine;
			StoreElementInformation(strLine);
		}
		fclose(pcFile);
	}
}

void CTranslateSALMain::StoreElementInformation(CString strLine){
	// Remove the last character as it is a line break character.
	int iLength = strLine.GetLength();
	strLine.Truncate(iLength - 1);
	
	// Get the set type.
	int iTokenPos = 0;
	CString strSetType = strLine.Tokenize(_T(","), iTokenPos);
	
	// Get the set elements.
	for (int i = 0; i < 3; i++){
		CString strElement = strLine.Tokenize(_T(","), iTokenPos);
		if (strElement != _T("")){ // Sometimes there may be less than 3 elements.
			AddElementToSet(strElement, strSetType);
		}
	}
	//////// Throw an error here if there are more elements than three.
}
*/

void CTranslateSALMain::MatchSetExpression(CTranslateNode* pcNode){
//	FILE *pcFile;
	CString strStateName;
	CString strSetName;
	CString strSetType;
	CString strElement;
	CString strToken1;
	CString strToken2; 
	CString strToken3;
	CString strToken4;
	CString strToken5;
	CString strToken6;

//	char cLine[4096];

//	CString strPathName = _T("C:/sets/SetParserOutput.txt");
		
//	// Read the selected file.
//	_tfopen_s(&pcFile,(LPCTSTR)strPathName ,_T("rt"));

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

	CString strComponentName = pcNode->GetComponentName();
	strComponentName = TrimChangeCase(strComponentName,false);
	strStateName = pcNode->GetStateName();
	int iType = pcNode->GetType();
	if (iType == GSE_T_STATE){
		int iTokenPos1 = 0;
		strToken1 = strStateName.Tokenize(_T(":="), iTokenPos1);
		strToken2 = strStateName.Tokenize(_T(":="), iTokenPos1);
		if (strToken2 != _T("")){   // Note that if it doesn't contain ":=",
									// it must be a normal state realisation (not sets).
			strSetName = strToken1;
			strSetType = GetSetType(strSetName, pcNode);
			if (strSetType != _T("")){   // This is a node with set operations.
				pcNode->SetIsNodeSetOperation(true);
				int iTokenPos2 = 0;
				strToken3 = strToken2.Tokenize(_T("+"), iTokenPos2);
				strToken4 = strToken2.Tokenize(_T("+"), iTokenPos2);
				if (strToken4 != _T("")){  // The string is in the format S := S + T or S := S + {x}
					if (strToken3 != strSetName){
						// The first part of the addition is not the same set.
						CString strMessage = _T("Invalid set operation:\r\n");
						strMessage = strMessage + _T("For set union or set addition, the set name after ':=' must be identical to the name before it.\r\n");
						strMessage = strMessage + _T("Node: ") + pcNode->GetStateName();
						CTranslateException cException(strMessage);
						throw cException;
					}
					int iTokenPos3 = 0;
					strToken5 = strToken4.Tokenize(_T("{"), iTokenPos3);
					if (strToken5 != strToken4){  // This means that the "{" was found, but since there
												  // was nothing before it, the rest of the string went into strToken5.
						int iTokenPos4 = 0;
						strToken6 = strToken5.Tokenize(_T("}"), iTokenPos4);
						if (strToken6 == strToken5){  // The closing bracket wasn't found.
							CString strMessage = _T("Invalid set operation:\r\n");
							strMessage = strMessage + _T("Closing bracket not found for the set addition node:\r\n");
							strMessage = strMessage + pcNode->GetStateName();
							CTranslateException cException(strMessage);
							throw cException;
						}
						strElement = strToken6;
						pcNode->AddSetRule(_T("add"));
					
					}else{  // This is a set union node.
						strElement = strToken4;  // The other set name.
						pcNode->AddSetRule(_T("union"));
					}
				
				}else{
					iTokenPos2 = 0;
					strToken3 = strToken2.Tokenize(_T("-"), iTokenPos2);
					strToken4 = strToken2.Tokenize(_T("-"), iTokenPos2);
					if (strToken4 != _T("")){  // The string is in the format S := S - T or S := S - {x}
						if (strToken3 != strSetName){
							// The first part of the subtraction is not the same set.
							CString strMessage = _T("Invalid set operation:\r\n");
							strMessage = strMessage + _T("For set difference or set subtraction, the set name after ':=' must be identical to the name before it.\r\n");
							strMessage = strMessage + _T("Node: ") + pcNode->GetStateName();
							CTranslateException cException(strMessage);
							throw cException;
						}
						int iTokenPos3 = 0;
						strToken5 = strToken4.Tokenize(_T("{"), iTokenPos3);
						if (strToken5 != strToken4){  // This means that the "{" was found, but since there
													  // was nothing before it, the rest of the string went into strToken5.
							int iTokenPos4 = 0;
							strToken6 = strToken5.Tokenize(_T("}"), iTokenPos4);
							if (strToken6 == strToken5){  // The closing bracket wasn't found.
								CString strMessage = _T("Invalid set operation:\r\n");
								strMessage = strMessage + _T("Closing bracket not found for the set subtraction node:\r\n");
								strMessage = strMessage + pcNode->GetStateName();
								CTranslateException cException(strMessage);
								throw cException;
							}
							strElement = strToken6;
							pcNode->AddSetRule(_T("subtract"));
					
						}else{  // This is a set union node.
							strElement = strToken4;  // The other set name.
							pcNode->AddSetRule(_T("difference"));
						}
					}else{
						iTokenPos2 = 0;
						strToken3 = strToken2.Tokenize(_T("><"), iTokenPos2);
						strToken4 = strToken2.Tokenize(_T("><"), iTokenPos2);
						if (strToken4 != _T("")){  // The string is in the format S := S >< T 
							if (strToken3 != strSetName){
								// The first part of the expression is not the same set.
								CString strMessage = _T("Invalid set operation:\r\n");
								strMessage = strMessage + _T("For set intersection, the set name after ':=' must be identical to the name before it.\r\n");
								strMessage = strMessage + _T("Node: ") + pcNode->GetStateName();
								CTranslateException cException(strMessage);
								throw cException;
							}
							strElement = strToken4;  // The other set name.
							pcNode->AddSetRule(_T("intersection"));
						
						}else if (strToken2 == _T("{}")){  // The string is in the format S := {}
							strElement = _T("");
							pcNode->AddSetRule(_T("empty"));
						}else{  // The string is unrecognised.
							CString strMessage = _T("Unrecognised set expression.\r\n");
							strMessage = strMessage + _T("If it is not a set node, make sure its attribute name does not conflict with any names of sets.\r\n");
							strMessage = strMessage + _T("Node: ") + pcNode->GetStateName();
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
		strToken1 = strStateName.Tokenize(_T(":"), iTokenPos1);
		strToken2 = strStateName.Tokenize(_T(":"), iTokenPos1);
		if (strToken2 != _T("")){  // The string is in the format x : S
			strSetName = strToken2;
			strElement = strToken1;
			pcNode->AddSetRule(_T("membership"));
			pcNode->SetIsNodeSetOperation(true);
			pcNode->AddSetVariable(strSetName);
			pcNode->AddSetVariable(strElement);
		}else{
			iTokenPos1 = 0;
			strToken1 = strStateName.Tokenize(_T("="), iTokenPos1);
			strToken2 = strStateName.Tokenize(_T("="), iTokenPos1);
			if (strToken2 == _T("{}")){ // The string is in the format S = {}
				strSetName = strToken1;
				strElement = _T("");
				pcNode->AddSetRule(_T("empty"));
				pcNode->SetIsNodeSetOperation(true);
				pcNode->AddSetVariable(strSetName);
				pcNode->AddSetVariable(strElement);
			}else{
				if (strStateName.Left(1) == _T("|")){
					iTokenPos1 = 0;
					strToken1 = strStateName.Tokenize(_T("|"), iTokenPos1);
					strToken2 = strStateName.Tokenize(_T("|"), iTokenPos1);
					if (strToken2 != _T("")){ // The string is in the format |S| ? number, where ? can be =, <, >, <= or >=
						pcNode->SetIsNodeSetOperation(true);
						strSetName = strToken1;
						pcNode->AddSetRule(_T("cardinality"));
					
						if (strToken2.Left(2) == _T(">=")){
							pcNode->AddSetRule(_T("GreaterThanOrEqual"));
							strToken2.Delete(0,2);
							strElement = strToken2;
						}else if (strToken2.Left(2) == _T("<=")){
							pcNode->AddSetRule(_T("LessThanOrEqual"));
							strToken2.Delete(0,2);
							strElement = strToken2;
						}else if (strToken2.Left(1) == _T("=")){
							pcNode->AddSetRule(_T("EqualTo"));
							strToken2.Delete(0,1);
							strElement = strToken2;
						}else if (strToken2.Left(1) == _T(">")){
							pcNode->AddSetRule(_T("GreaterThan"));
							strToken2.Delete(0,1);
							strElement = strToken2;
						}else if (strToken2.Left(1) == _T("<")){
							pcNode->AddSetRule(_T("LessThan"));
							strToken2.Delete(0,1);
							strElement = strToken2;
						}else{ // The expression is not valid.
							CString strMessage = _T("Unrecognised set expression.\r\n");
							strMessage = strMessage + _T("If it is not a set node, please remove the '|' characters.\r\n");
							strMessage = strMessage + _T("Node: ") + pcNode->GetStateName();
							CTranslateException cException(strMessage);
							throw cException;
						}
						pcNode->AddSetVariable(strSetName);
						pcNode->AddSetVariable(strElement);
					}else{  // Either this is a set node that is missing a "|" or this is
						    // a non-set node that has a "|" which it should not have.
						CString strMessage = _T("Unrecognised set expression.\r\n");
						strMessage = strMessage + _T("If it is not a set node, please remove the '|' characters.\r\n");
						strMessage = strMessage + _T("Node: ") + pcNode->GetStateName();
						CTranslateException cException(strMessage);
						throw cException;
					}
				}
			}
		}





	}else{  // The type is not valid for a set node.
		//// Throw exception.
	}

	







	/*	if (strLine.Left(5) == _T("VALUE")){
			// Store the variable or number that follows.

			if (strNextLine.Right(4) == _T("Name")){
				// It was a name of a variable.
				// Ignore the first 6 characters which say "VALUE_".
				CString strVariable = strLine.Mid(6); 
				pcNode->AddSetVariable(strVariable);

			}else if (strNextLine.Right(3) == _T("Num")){
				// It was a number - note: assuming that there can only be one
				// number per expression.
				CString strVariable = strLine.Mid(6); 
				pcNode->AddSetVariable(strVariable);
		//////////// Note: The above line should be changed to convert the variable to an int
				////////// and then store it as a number.

			}else if (strLine.Right(3) == _T("NOT")){
				pcNode->AddSetRule(_T("NOT"));
			}

		}else if (strLine.Left(4) == _T("RULE")){
			if (strLine.Mid(6,4) == _T("card")){
				pcNode->AddSetRule(_T("cardinality"));

			}else if (strLine.Mid(6,7) == _T("boolsym")){
				// Store the "LessThan" or "GreaterThan", etc. part.
				if (strLine.Mid(19) != _T("")){
					CString strBoolSymbol = strLine.Mid(19);
					if (strBoolSymbol != _T("")){
						// The "LessThan", etc. part is there - It is not a case where it is blank.
						pcNode->AddSetRule(strLine.Mid(19));
					}
				}
			}else if (strLine.Mid(6,5) == _T("union")){
				pcNode->AddSetRule(_T("union"));

			}else if (strLine.Mid(6,9) == _T("Attribute")){
				pcNode->AddSetRule(_T("attribute"));

			}else if (strLine.Mid(6,5) == _T("empty")){
				pcNode->AddSetRule(_T("empty"));

			}else if (strLine.Mid(6,3) == _T("mem")){
				pcNode->AddSetRule(_T("membership"));

			}else if (strLine.Mid(6,4) == _T("diff")){
				pcNode->AddSetRule(_T("difference"));

			}else if (strLine.Mid(6,9) == _T("intersect")){
				pcNode->AddSetRule(_T("intersection"));
			
			}else if (strLine.Mid(6,6) == _T("subset")){
				pcNode->AddSetRule(_T("subset"));
			}
			// Ignore all other cases.
		}
		strLine = strNextLine; */
//	}
//	fclose(pcFile);
}

CString CTranslateSALMain::GetSetType(CString strSetName, CTranslateNode* pcNode){
	strSetName = TrimChangeCase(strSetName,true);
	int iNamePosition = FindListPosition(m_cSetNames, strSetName);
	int iTypePosition;
	int iSuccess = m_cSetNamesToTypes.Lookup(iNamePosition, iTypePosition);
	if (iSuccess != 0){
		CString strType = GetListElement(m_cSetTypes, iTypePosition);
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
			CString strState = pcNode->GetStateName();
			int iPosition = 0;
			// Get the name used in place of the element name, e.g. for all c:Courses
			// would return "c".
			CString strOriginal = strState.Tokenize(_T(":"),iPosition);
			// Get the name of the set, e.g. for all c:Courses would return "Courses".
			CString strSetName = strState.Tokenize(_T(":"),iPosition);
			strOriginal.Trim();
			strSetName.Trim();
			strSetName = TrimChangeCase(strSetName,true);
		//	strOriginal = TrimChangeCase(strOriginal,false);
			// Find out the set type.
			int iSetNameLocation = FindListPosition(m_cSetNames, strSetName);
			int iSuccess = m_cSetNamesToTypes.Lookup(iSetNameLocation,iSetTypeLocation);		
			if (iSuccess == 0){  // The set name wasn't found.
				CString strMessage = _T("Unknown set name: " + strSetName);
				strMessage = strMessage + _T("\n\rPlease check your set information file.");
				CTranslateException cException(strMessage);
				throw cException;
			}

			CString strSetType = GetListElement(m_cSetTypes,iSetTypeLocation);
			strSetType = TrimChangeCase(strSetType,true);
			if (pcNode->GetComponentName() != strSetName){
				strSetName = pcNode->GetComponentName() + _T("_") + strSetName;
			}
			NList<CString, CString>* plElements;
			int iSuccess2 = m_cSetElements.Lookup(iSetTypeLocation,plElements);
			if (iSuccess2 == 0){  // The set elements weren't found.
				CString strMessage = _T("Set elements not defined for set type:" + strSetType);
				strMessage = strMessage + _T("\n\rPlease check your set information file.");
				CTranslateException cException(strMessage);
				throw cException;
			}

			int iNumberOfElements = (int) plElements->GetSize();
			// Check whether this node is part of a branch.
			int iSiblingNumber = pcNode->GetSiblingNumber();
			if (iSiblingNumber == 0){   // This node is not part of a branch.
				// Get this node's sets guard, if it has one.
				CString strEarlierSetsGuard = pcNode->RetrieveSetsGuard();

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
					CString strElement = GetListElement(*plElements,i+1);
					CString strGuard = _T("set{") + strSetType + _T("}!contains?(") 
						+ TrimChangeCase(strSetName, false) + _T(",") + strElement + _T(")");
					if (strEarlierSetsGuard != _T("")){ // The set node had a sets guard already.
						// i.e. The set node was a child of another set node.
						strGuard = strEarlierSetsGuard + _T(" AND ") + strGuard;
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
				CString strElement = GetListElement(*plElements,0);
				CString strGuard = _T("set{") + strSetType + _T("}!contains?(") 
					+ TrimChangeCase(strSetName, false) + _T(",") + strElement + _T(")");
				if (strEarlierSetsGuard != _T("")){ // The set node had a sets guard already.
					// i.e. The set node was a child of another set node.
					strGuard = strEarlierSetsGuard + _T(" AND ") + strGuard;
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
				CString strEarlierSetsGuard = pcNode->RetrieveSetsGuard();

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
					CString strElement = GetListElement(*plElements,i+1);
					CString strGuard = _T("set{") + strSetType + _T("}!contains?(") 
						+ TrimChangeCase(strSetName, false) + _T(",") + strElement + _T(")");
					if (strEarlierSetsGuard != _T("")){ // The set node had a sets guard already.
						// i.e. The set node was a child of another set node.
						strGuard = strEarlierSetsGuard + _T(" AND ") + strGuard;
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
				CString strElement = GetListElement(*plElements,0);
				CString strGuard = _T("set{") + strSetType + _T("}!contains?(") 
					+ TrimChangeCase(strSetName, false) + _T(",") + strElement + _T(")");
				if (strEarlierSetsGuard != _T("")){ // The set node had a sets guard already.
					// i.e. The set node was a child of another set node.
					strGuard = strEarlierSetsGuard + _T(" AND ") + strGuard;
				}
				pcTopOfSubtree->StoreSetsGuard(strGuard);

				// Replace all the occurrences of the iterator name
				// in the sub-trees with the name of the elements in the set.
				// e.g. for ||s:Staff, then all nodes with "s" are replaced
				// with "s1", "s2", etc. if those were the element names.
				int iPosition = 0;
				CString strState = pcNode->GetStateName();
				CString strOriginal = strState.Tokenize(_T(":"),iPosition);
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
	CTranslateNode* pcNode;
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

void CTranslateSALMain::RenameTree(CTranslateNode *pcRoot, CString strOriginalName, CString strNewName){
	// If the component name matches, then rename it.
	CString strComponentName = pcRoot->GetComponentName();
	// Remove spaces to ensure that 
	// they are both compared correctly, e.g. it will still
	// think that "Course" and "Course " are the same, even though
	// one has an extra space.
	strComponentName.Trim();
	strOriginalName.Trim();
	strNewName.Trim();
	
	if (strComponentName == strOriginalName){
		pcRoot->SetComponentName(strNewName+_T("Component")); // The word 'Component' is necessary because SAL does not allow the name of a
															  // set element to be used as a local variable.
		pcRoot->StoreTheParentSet(strOriginalName);
	}

	CString strState = pcRoot->GetStateName();
		
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
		strState.Replace(_T("{")+strOriginalName+_T("}"), _T("{")+strNewName+_T("}"));
		strState.Replace(strOriginalName+_T(":"), strNewName+_T(":"));
		strState.Replace(strOriginalName+_T(" :"), strNewName+_T(" :"));
		pcRoot->SetStateName(strState);
//	}

	// Replace states in the form: s:=t or s=t where t is the name being renamed.
	CString strToken;
	CString strToken2;
	int iTokenPos = 0;
	if (strState.Find(_T(":=")) != -1){
		strToken = strState.Tokenize(_T(":="), iTokenPos);
		strToken2 = strState.Tokenize(_T(":="), iTokenPos);
		strToken2.Trim();
		if (strToken2 == strOriginalName){ // The attribute name must be replaced.
			strState = strToken + _T(":=") + strNewName;	
			// The original name is still needed to check if this is a user-defined
			// attribute, so store it.
			pcRoot->StoreTheOriginalName(strOriginalName);
		}
	}else if (strState.Find(_T("=")) != -1){
		iTokenPos = 0;
		strToken = strState.Tokenize(_T("="), iTokenPos);
		strToken2 = strState.Tokenize(_T("="), iTokenPos);
		strToken2.Trim();
		if (strToken2 == strOriginalName){ // The attribute name must be replaced.
			strState = strToken + _T("=") + strNewName;	
			// The original name is still needed to check if this is a user-defined
			// attribute, so store it.
			pcRoot->StoreTheOriginalName(strOriginalName);
		}
	}

	// Rename user-defined attributes that are written in a format such as "Course_ID".
	// e.g. "Course_ID" may be replaced to "c1_ID". The same problem as described above
	// applies to this case, when another attribute ends with this name, e.g. "LastCourse_Text"
	// would be replaced with "Lastc1_Text".
	strState.Replace(strOriginalName+_T("_"), strNewName+_T("Component_"));
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
		CString strAltName = m_lAlternateNames.GetNext(cPosition);
		CString strState = pcRoot->GetStateName();
		CString strOriginalState = strState;

		// Get the component name and proper attribute name.
		int iAttributeLocation;
		int iSuccess = m_mAlternativesToAttributes.Lookup(iAltLocation,iAttributeLocation);
		CString strAttribute = GetListElement(m_lAttributes,iAttributeLocation);
		int iComponentLocation;
		int iSuccess2 = m_mAttributesToComponents.Lookup(iAltLocation, iComponentLocation);
		CString strComponentName = GetListElement(m_lAttributeComponents, iComponentLocation);
		strComponentName = TrimChangeCase(strComponentName, false);
		strAttribute = TrimChangeCase(strAttribute, false); 
		CString strNewAttribute = strComponentName + _T("_") + strAttribute;

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

int CTranslateSALMain::GetUserDefinedType(CString strComponent, CString strAttribute, CTranslateNode* pcNode){
	CString strParentSet = pcNode->GetTheParentSet();
//	CString strOriginalName = pcNode->GetTheOriginalName();
	CString strFirstPart;
	CString strSecondPart;
//	if (strParentSet != _T("")){
//		strFirstPart = strParentSet;
//	}else{
//		strFirstPart = strComponent;
//	}   ////////////////////// Check whether the strParentSet thing is needed for anything.
//	if (strOriginalName != _T("")){
//		strSecondPart = strOriginalName;
//	}else{
//	strSecondPart = strAttribute;
//	}
//	CString strAttributeName = strFirstPart + _T("_") + strSecondPart;
	CString strAttributeName = strComponent + _T("_") + strAttribute;
	NPosition cPosition;
	cPosition = m_lAlternateNames.GetHeadPosition();
	int iAltLocation = 0;
	while (cPosition.IsNotNull()){ // For each alternative name in the list.
		CString strAltName = m_lAlternateNames.GetNext(cPosition);
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
bool CTranslateSALMain::IsStringANumber(CString strNumberString){
	int iNumber;
	iNumber = _ttoi(strNumberString);
	if (iNumber == 0){
		// This means that either the string was a "0" or the conversion failed.
		if (strNumberString == _T("0")){
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
int CTranslateSALMain::GetNumber(CString strNumberString){
	int iNumber;
	iNumber = _ttoi(strNumberString);
	return iNumber;
}

// This function returns true if the given variable is in the Integers
// list; false otherwise. (The Integers list is a list of integers that
// have been declared as such by the user using the user information file).
// @param strVariable  The variable name,
// @return true or false.
bool CTranslateSALMain::IsInteger(CString strVariable){
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

CTranslateNode* CTranslateSALMain::CreateTranslateNodesFromRandom(CTranslateRandom* pcRandom, CTranslateNode* pcOriginal)
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
	CString strComponent = pcOriginal->GetComponentName();
	CString strState = pcOriginal->GetStateName();
	CString strFlags = pcOriginal->GetFlag();
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
}

void CTranslateSALMain::AddPCToInitialisation(CString strPC){
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
void CTranslateSALMain::StoreOppositeBranch(int iNode, CString strGuard){
	m_cAlternateNodesToGuards.SetAt(iNode, strGuard);
}

CString CTranslateSALMain::GetOppositeBranch(int iNode){
	CString strGuard = _T("");
	int iSuccess = m_cAlternateNodesToGuards.Lookup(iNode,strGuard);
	return strGuard;
}

// This is for debugging purposes, to look at the details of a tree.
CString CTranslateSALMain::PrintTree(CTranslateNode* pcRoot){
	CString strTheTree = _T("\r\n");
	strTheTree.Format(strTheTree + _T("%d"), pcRoot->GetNodeID());
	CString strComponentName = pcRoot->GetComponentName();
	CString strStateName = pcRoot->GetStateName();
	int iChildren = pcRoot->GetNumberOfChildren();
	strTheTree.Append(_T(" ") + strComponentName + _T(" ") + strStateName);
	CString strTemp = _T("");
	strTemp.Format(_T("%d"), pcRoot->GetType());
	strTheTree.Append(_T(" (type) ") + strTemp);
	strTemp = _T("");
	strTemp.Format(_T("%d"), pcRoot->GetJumpType());
	strTheTree.Append(_T(" (jumpType) ") + strTemp);
	strTemp = _T("");
	strTemp.Format(_T("%d"), pcRoot->GetNumberOfChildren());
	strTheTree.Append(_T(" (children) ") + strTemp);
	strTemp = _T("");
	strTemp.Format(_T("%d"), pcRoot->GetSiblingNumber());
	strTheTree.Append(_T(" (siblings) ") + strTemp);
	if (pcRoot->IsNodeAtomic() == true){
		strTheTree.Append(_T(" isAtomic "));
	}
	if (pcRoot->IsNodeNonDeterministic() == true){
		strTheTree.Append(_T(" isAlt "));
	}
	if (pcRoot->GetFlag() != _T("")){
		strTheTree.Append(_T(" (flag) ") + pcRoot->GetFlag());
	}
	strTemp = _T("");
	strTemp.Format(_T("%d"), pcRoot->GetParent());
	strTheTree.Append(_T(" (parent) ") + strTemp);

	CTranslateNode* pcChild;
	int iChildID;
	for (int i = 0; i < iChildren; i++){
		iChildID = pcRoot->GetChildID(i);
		pcChild = GetNode(iChildID);
		int y = 4;
		int z = 5;
		strTheTree.Append(PrintTree(pcChild));
	}
	return strTheTree;
}

// This is for alternate selections that have an atomic branch.
void CTranslateSALMain::UpdateExtraTransition(int iGuardPosition, CString strFullGuard){
	// Get the current guard at that position.
	CString strGuard = GetListElement(m_lExtraGuards, iGuardPosition);
	// Add the new information to the guard.
	if (strGuard != _T("")){
		strGuard = strGuard + _T(" AND NOT(") + strFullGuard + _T(")");
	}else{
		strGuard = _T("NOT(") + strFullGuard + _T(")");
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
			CString strCurrentElement = m_lExtraGuards.GetNext(cPosition);
			if (iCounter == iGuardPosition){
				m_lExtraGuards.SetAt(cPosition, strGuard);
			}
			iCounter++;
		}
	}
}

