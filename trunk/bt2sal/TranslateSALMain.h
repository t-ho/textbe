// File name: TranslateSALMain.h
// Author/s : Nisansala Yatapanage
// Date built: 2/6/2006
// Last updated: 24/7/2006
// Purpose: Main class for performing translations between Behavior
//  Trees and other languages. At present this class only translates to
//  the SAL language. 
//
// Algorithms used:
// Description of Algorithm#:
//

#pragma once
#include "TranslateAtomicBlock.h"
#include "TranslateMain.h"
#include "TranslateStep.h"
#include "TranslateNode.h"
// #include "TranslateRandom.h"
#include "NList.h"
#include "NMap.h"

class CTranslateSALMain : public CTranslateMain
{
	
public:
	CTranslateSALMain(void);
public:
	~CTranslateSALMain(void);
public:
	void SelectOptions(void);
public:
	void ParseBT(int iTreeID, bool bUsingSets, bool bUsingBESE);
public:
	void AddInputVariable(CString strName);
	void AddOutputVariable(CString strName);
	void AddLocalBoolean(CString strName);
	void AddIntegerAttribute(CString strName);
	void AddLocalVariable(CString strName, CString strState);
	void AddInternalMsgAssociation(int iOutputNode, NList<int, int>* plInputNodes);
	NList<int, int>* GetInternalMsgAssociation(int iOutputNode);
	int FindListPosition(NList<CString, CString>& cList, CString strValue);
	CString GetListElement(NList<CString, CString>& cList, int iPosition);
	void RemoveFromList(NList<CString, CString>& cList, int iIndex);
	void AddNodeGuard(int iNode, CString strGuard);
	void AddNodeAction(int iNode, NList<CString, CString>* plActions);
	void RemoveNodeTransition(int iNode);
	void AddExtraNodeAction(int iNode, CString strAction);
	int AddExtraTransition(CString strGuard, NList<CString,CString>* plActions);
	void AddPCRange(int iProgramCounter, int iValue);
	CString GetNewProgramCounter();
	CString GetPCForNode(int iNode);
	int GetPC(int iNode);
	int GetPCValueForNode(int iNode);
	void SetPCValueForNode(int iNode, int iPCValue);
	CString GetGuard(int iNode);
	NList<CString, CString>* GetActions(int iNode);
	NList<CString, CString>* FindThreadsToKill(int iNode, bool bCallingForReversion);
	int FindNextHighestPC(int iNode);
	void AddAtomicGuard(int iNode, CString strGuard);
	void AddAtomicActions(int iNode, NList<CString, CString>* plActions);
	CString GetAtomicGuard(int iNode);
	NList<CString, CString>* GetAtomicActions(int iNode);
	void CreateIDValues(int iRootNode);
	CString TrimChangeCase(CString strName, bool bToUpperCase);
	bool IsAtomic(int iNode);
	NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* GetAtomicBlocks(int iNode);
	void SetAtomicBlock(int iNode, CTranslateAtomicBlock* pcAtomicBlock);
	int GetTranslationType();
	bool UsingViews();
	bool UsingRandomBT();
	bool ShowTimes();
	void RemoveAssignmentRepeats(NList<CString, CString>& lAssignments);
	void RemoveMessageConflicts(NList<CString, CString>& lUpdates, NList<CString, CString>& lMessageNames);
	void AddMessageString(CString strMessage);
	void TranslateInitNodes(int iRootNode, NList<int, int>& lInitNodes);
	void StoreTranslationStep(int iNode, int iRuleID, int iOtherNode, NList<int, int>* plSecondaryRules);
	CTranslateNode* GetNode(int iNodeID);
//	CTranslateNode* CreateTranslateNodes(MSXML::IXMLDOMNodePtr pXMLNode);
//	CTranslateNode* ConvertToTranslateNode(MSXML::IXMLDOMNodePtr pXMLNode);
	void GetDescendents(NList<int, int>& cDescendents, int iNode);
	void GetLeafNodes(int iRootNode, NList<int, int>& cLeafNodes);
	void ReadSetInformation(CString strPathName, CString strFileName);
	void StoreSetInformation(CString strSetInfo);
	CTranslateNode* ReadSlice(CString strPathName, CString strFileName);
	CTranslateNode* StoreSliceNodeInformation(CString strLine);
	NList<CString, CString>* StoreSliceInformation(CString strLine, NList<CString, CString>* plComponent);
	void StoreNodeInfo(CString strComponentID, CString strComponentName, CString strStateID, CString strStateName, int iType);
	//void StoreStateInfo(CString strComponentID, CString strStateID, CString strStateName, int iType);
	void AddElementToSet(CString strElement, CString strSet);
	void AddUniqueElementToSet(CString strElement, CString strSet);
	void AddInitialElement(CString strElement, CString strSet);
//	void ReadSetElements(void);
//	void StoreElementInformation(CString strLine);
	void MatchSetExpression(CTranslateNode* pcNode);
	CString GetSetType(CString strSetName, CTranslateNode* pcNode);
	void ExpandBranches(CTranslateNode* pcRoot);
	CTranslateNode* ExpandNode(CTranslateNode* pcNode);
	CTranslateNode* CopySubTree(CTranslateNode* pcRoot);
	CTranslateNode* CopyTreeBelow(CTranslateNode* pcRoot);
	void RenameTree(CTranslateNode* pcRoot, CString strOriginalName, CString strNewName);
	void ReplaceAttributes(CTranslateNode* pcRoot);
	int GetUserDefinedType(CString strComponent, CString strAttribute, CTranslateNode* pcNode);
	int GetNumber(CString strNumberString);
	bool IsStringANumber(CString strNumberString);
	bool IsInteger(CString strVariable);
	bool IsUppaal(void);
//	CTranslateNode* CreateTranslateNodesFromRandom(CTranslateRandom* pcRandom, CTranslateNode* pcOriginal);
//	CTranslateNode* ConvertToTranslateNodeFromRandom(CTranslateNode* pcOriginal);
	void AddPCToInitialisation(CString strPC);
	void SetAtomicBlockCount(int iNode, int iCount);
	int GetAtomicBlockCount(int iNode);
	void StoreOppositeBranch(int iNode, CString strGuard);
	CString GetOppositeBranch(int iNode);
	void UpdateExtraTransition(int iGuardPosition, CString strFullGuard);
	CString PrintTree(CTranslateNode* pcRoot);
	void MakeLongIDs(int iRootNode);


public:
	int m_iTreeID;
	int m_iOptionSelected;
	int m_iBufOptionSelected;
	int m_iRootNode;
	bool m_bTranslateWithRandomBT;
	bool m_bTranslateWithViews;
	bool m_bDisplayTimes;
	bool m_bUsingBESE; // true = translating from BESE, false = translating from TextBE.
	CString m_strPathName;  // The file that contains set information.
	CString m_strFileName;
	CString m_strPathName2;  // The file that contains initialisation information for sets.
	CString m_strFileName2;
	CString m_strCriterion;   // The slicing criteria entered by the user.
	NList<int, int> m_lAtomicNodes;
	

	// A map from nodes to lists of atomic blocks.
	NMap<int, NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>*> m_mNodesToAtomicBlocks;

	NList<CTranslateStep*, CTranslateStep*> m_lSteps;
	int m_iHighestTranslateID;

	// Mappings from nodes to translation information.
	
	// Maps Translate Node ID's to Translate Nodes.
	NMap<int, CTranslateNode*> m_mTranslateNodes;

	// Maps nodes to guard strings.
	NMap<int, CString> m_cNodesToGuards;
	// Maps nodes to lists of action strings.
	NMap<int, NList<CString, CString>*> m_cNodesToActions;
	
	// Maps atomic nodes to guard strings.
	NMap<int, CString> m_cAtomicNodesToGuards;
	// Maps atomic nodes to lists of action strings.
	NMap<int, NList<CString, CString>*> m_cAtomicNodesToActions;

	// Maps alternate selection nodes to their opposite guards (the NOT case).
	NMap<int, CString> m_cAlternateNodesToGuards;

	// A list of guards not associated with any node.
	NList<CString,CString> m_lExtraGuards;
	/* Maps the position of extra guards in the list to
	 * lists of extra actions.
	 */
	NMap<int, NList<CString, CString>*> m_cExtraActions; 

	 // A list of the component names for local variables.
	NList<CString, CString> m_cLocalComponents;
	 /* A map from the position of local variables
	  * in the component list to their list of states.
	  */
	NMap<int, NList<CString, CString>*> m_cLocalStates; 
	
	// A list of variables that are integers (as was declared in the user's information file).
	NList<CString, CString> m_lIntegers;

	// A list of the starting (minimum) values of the integers. (The first value in this list
	// is the starting value for the first integer in the integers list and so on).
	NList<CString, CString> m_lStartValues;

	// A list of the end (maximum) values of the integers. (The first value in this list
	// is the end value for the first integer in the integers list and so on).
	NList<CString, CString> m_lEndValues;

	// A list of set variable names.
	NList<CString, CString> m_cSetNames;
	 /* A map from the position of set names
	  * in the list to the position of a set type in the types list.
	  */
	NMap<int, int> m_cSetNamesToTypes; 

	// A list of the set types.
	NList<CString, CString> m_cSetTypes;

	// A list of parent sets. (Sets that contain set attributes).
	NList<CString, CString> m_cParentSets;

	// A list of sets that are attributes of other sets.
	NList<CString, CString> m_cAttributeSets;

	 /* A map from the position of set types
	  * in the list to their list of elements.
	  */
	NMap<int, NList<CString, CString>*> m_cSetElements; 
	
	 /* A map from the position of set names
	  * in the list to the position of their unique set type in the types list.
	  * e.g. a staff set and a student set could both have type Usertype,
	  * but Usertype contains u1,u2,u3 and u4, whereas the staff set only contains
	  * u1 and u2 and the student set only contains u3 and u4.
	  * In that case, the unique set type for staff has u1 and u2, while the
	  * unique set type for students has u3 and u4.
	  */
	NMap<int, int> m_cSetNamesToUniqueTypes; 

	// A list of the unique set types, see above description.
	NList<CString, CString> m_cUniqueSetTypes;

	 /* A map from the position of unique set types
	  * in the list to their list of elements (see above description).
	  */
	NMap<int, NList<CString, CString>*> m_cUniqueSetElements; 
	

	 /* A map from the position of set names
	  * in the list to the position of a parent set in the parent set list.
	  */
	NMap<int, int> m_cSetsToParentSets; 
	
	/* A map from the position of set names
	  * in the list to their list of initial elements.
	  */
	NMap<int, NList<CString, CString>*> m_cInitSetElements; 

	// A list of user-defined attributes (as obtained from the user-defined information text file).
	NList<CString, CString> m_lAttributes;

	// A map from the position of attributes in the list to the position of types in the set type list.
	// (Although these are not set attributes, the set type list is still used).
	NMap<int, int> m_mAttributesToTypes;

	// A list of components that own user-defined attributes.
	NList<CString, CString> m_lAttributeComponents;

	// A map from the position of attributes in the list to the position of owner components in the component list.
	NMap<int, int> m_mAttributesToComponents; 

	// A map from the position of alternative names in the list to the position of attributes.
	// (See TranslateSALMain.cpp, approx. line 1852 for a detailed description).
	NMap<int, int> m_mAlternativesToAttributes; 

	// A list of alternate names used for user-defined attributes.
	// (See TranslateSALMain.cpp, approx. line 1852 for a detailed description).
	NList<CString, CString> m_lAlternateNames;

	// A list of the final user-defined attributes (after set nodes have been expanded).
	NList<CString, CString> m_lUserDefinedAttributes;

	// A map from the position of final user-defined attributes in the list to the position of their type in the types list.
	NMap<int, int> m_mUserAttributeTypes;

	// Maps ID's of internal output nodes to the ID's of the matching internal 
	// input nodes.
	NMap<int, NList<int, int>*> m_cMatchingInternal;

	// Maps nodes to PC names.
	NMap<int, int> m_cNodesToPCs;  
	// Maps nodes to PC values.
	NMap<int, int> m_cNodesToPCValues;  
	// Maps nodes to ID values.
	NMap<int, CString> m_cNodesToIDs;	
	// The current highest number used for a PC name.
	int m_iHighestProgramCounter; 	
	// Maps PC names to their highest value.
	NMap<int, int> m_cPCRanges;  

	// A list of the ID's of branching nodes.
	NList<CString, CString> m_lBranchingIDs;
	// Maps the position of branching nodes in the ID list to their PC's.
	NMap<int, int> m_cBranchingPCs;

	// Lists of input and output variables and local Boolean variables.
	NList<CString, CString> m_cOutputVariables;
	NList<CString, CString> m_cInputVariables;
	NList<CString, CString> m_cLocalBooleans;
	NList<CString, CString> m_cIntegerAttributes;

	//The string containing the definition of messageReady for translation type 4.					  
	CString m_strMessageReady;

	NList<CString, CString> m_lInitialisationPCs;

	bool m_bIsUPPAAL;

	int m_iStartNode;

	// A map from node ID's to a number representing how many atomic blocks are still
	// using the node. This is to work out whether or not the node's transition can 
	// be deleted.
	NMap<int, int> m_mCountOfBlocksUsingNode;

	// A list of nodes that were created when parsing a TextBE file.
	NList<CString, CString> m_lTextBEList;

	// A map from the position of nodes in the textBE list above to a TranslateNode 
	// object that contains its name, type, etc. but could end up being several 
	// similar nodes in the BT.
	// This is only used when parsing TextBE files.
	NMap<int, CTranslateNode*> m_mTextBEMap;

	// A list of branching nodes. This is only used for parsing TextBE files.
	NList<CTranslateNode*, CTranslateNode*> m_lBranchingNodes;

	// A list of requirements tags to ignore. This is only used when parsing TextBE files.
	NList<CString,CString> m_lReqTags;

	// Indicates whether the component declarations part of the file has been reached.
	// This is only used when parsing TextBE files.
	bool m_bReachedComp; 

};
