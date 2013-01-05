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
#include "NString.h"

class CTranslateSALMain : public CTranslateMain
{
	
public:
	CTranslateSALMain(void);
public:
	~CTranslateSALMain(void);
public:
	void SelectOptions(const char* strTree, int iPriority, int iBuff, int iWithSets, const char* strSets, const char* strInit);
public:
	NString ParseBT(int iTreeID, bool bUsingSets, bool bUsingBESE);
public:
	void AddInputVariable(NString strName);
	void AddOutputVariable(NString strName);
	void AddLocalBoolean(NString strName);
	void AddIntegerAttribute(NString strName);
	void AddLocalVariable(NString strName, NString strState);
	void AddInternalMsgAssociation(int iOutputNode, NList<int, int>* plInputNodes);
	NList<int, int>* GetInternalMsgAssociation(int iOutputNode);
	int FindListPosition(NList<NString, NString>& cList, NString strValue);
	NString GetListElement(NList<NString, NString>& cList, int iPosition);
	void RemoveFromList(NList<NString, NString>& cList, int iIndex);
	void AddNodeGuard(int iNode, NString strGuard);
	void AddNodeAction(int iNode, NList<NString, NString>* plActions);
	void RemoveNodeTransition(int iNode);
	void AddExtraNodeAction(int iNode, NString strAction);
	int AddExtraTransition(NString strGuard, NList<NString,NString>* plActions);
	void AddPCRange(int iProgramCounter, int iValue);
	NString GetNewProgramCounter();
	NString GetPCForNode(int iNode);
	int GetPC(int iNode);
	int GetPCValueForNode(int iNode);
	void SetPCValueForNode(int iNode, int iPCValue);
	NString GetGuard(int iNode);
	NList<NString, NString>* GetActions(int iNode);
	NList<NString, NString>* FindThreadsToKill(int iNode, bool bCallingForReversion);
	int FindNextHighestPC(int iNode);
	void AddAtomicGuard(int iNode, NString strGuard);
	void AddAtomicActions(int iNode, NList<NString, NString>* plActions);
	NString GetAtomicGuard(int iNode);
	NList<NString, NString>* GetAtomicActions(int iNode);
	void CreateIDValues(int iRootNode);
	NString TrimChangeCase(NString strName, bool bToUpperCase);
	bool IsAtomic(int iNode);
	NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* GetAtomicBlocks(int iNode);
	void SetAtomicBlock(int iNode, CTranslateAtomicBlock* pcAtomicBlock);
	int GetTranslationType();
	bool UsingViews();
	bool UsingRandomBT();
	bool ShowTimes();
	void RemoveAssignmentRepeats(NList<NString, NString>& lAssignments);
	void RemoveMessageConflicts(NList<NString, NString>& lUpdates, NList<NString, NString>& lMessageNames);
	void AddMessageString(NString strMessage);
	void TranslateInitNodes(int iRootNode, NList<int, int>& lInitNodes);
	void StoreTranslationStep(int iNode, int iRuleID, int iOtherNode, NList<int, int>* plSecondaryRules);
	CTranslateNode* GetNode(int iNodeID);
//	CTranslateNode* CreateTranslateNodes(MSXML::IXMLDOMNodePtr pXMLNode);
//	CTranslateNode* ConvertToTranslateNode(MSXML::IXMLDOMNodePtr pXMLNode);
	void GetDescendents(NList<int, int>& cDescendents, int iNode);
	void GetLeafNodes(int iRootNode, NList<int, int>& cLeafNodes);
	void ReadSetInformation();
	void StoreSetInformation(NString strSetInfo);
	CTranslateNode* ReadSlice();
	CTranslateNode* StoreSliceNodeInformation(NString strLine);
	NList<NString, NString>* StoreSliceInformation(NString strLine, NList<NString, NString>* plComponent);
	void StoreNodeInfo(NString strComponentID, NString strComponentName, NString strStateID, NString strStateName, int iType);
	//void StoreStateInfo(NString strComponentID, NString strStateID, NString strStateName, int iType);
	void AddElementToSet(NString strElement, NString strSet);
	void AddUniqueElementToSet(NString strElement, NString strSet);
	void AddInitialElement(NString strElement, NString strSet);
//	void ReadSetElements(void);
//	void StoreElementInformation(NString strLine);
	void MatchSetExpression(CTranslateNode* pcNode);
	NString GetSetType(NString strSetName, CTranslateNode* pcNode);
	void ExpandBranches(CTranslateNode* pcRoot);
	CTranslateNode* ExpandNode(CTranslateNode* pcNode);
	CTranslateNode* CopySubTree(CTranslateNode* pcRoot);
	CTranslateNode* CopyTreeBelow(CTranslateNode* pcRoot);
	void RenameTree(CTranslateNode* pcRoot, NString strOriginalName, NString strNewName);
	void ReplaceAttributes(CTranslateNode* pcRoot);
	int GetUserDefinedType(NString strComponent, NString strAttribute, CTranslateNode* pcNode);
	int GetNumber(NString strNumberString);
	bool IsStringANumber(NString strNumberString);
	bool IsInteger(NString strVariable);
	bool IsUppaal(void);
//	CTranslateNode* CreateTranslateNodesFromRandom(CTranslateRandom* pcRandom, CTranslateNode* pcOriginal);
//	CTranslateNode* ConvertToTranslateNodeFromRandom(CTranslateNode* pcOriginal);
	void AddPCToInitialisation(NString strPC);
	void SetAtomicBlockCount(int iNode, int iCount);
	int GetAtomicBlockCount(int iNode);
	void StoreOppositeBranch(int iNode, NString strGuard);
	NString GetOppositeBranch(int iNode);
	void UpdateExtraTransition(int iGuardPosition, NString strFullGuard);
	NString PrintTree(CTranslateNode* pcRoot);
	void MakeLongIDs(int iRootNode);


public:
//	int m_iTreeID;
	NString m_strTree;
	int m_iOptionSelected;
	int m_iBufOptionSelected;
	int m_iRootNode;
	bool m_bTranslateWithRandomBT;
	bool m_bTranslateWithViews;
	bool m_bDisplayTimes;
	bool m_bUsingBESE; // true = translating from BESE, false = translating from TextBE.
	NString m_strSets;  // The file that contains set information.
	NString m_strInit;
//	NString m_strPathName2;  // The file that contains initialisation information for sets.
//	NString m_strFileName2;
//	NString m_strCriterion;   // The slicing criteria entered by the user.
	NList<int, int> m_lAtomicNodes;
	

	// A map from nodes to lists of atomic blocks.
	NMap<int, NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>*> m_mNodesToAtomicBlocks;

	NList<CTranslateStep*, CTranslateStep*> m_lSteps;
	int m_iHighestTranslateID;

	// Mappings from nodes to translation information.
	
	// Maps Translate Node ID's to Translate Nodes.
	NMap<int, CTranslateNode*> m_mTranslateNodes;

	// Maps nodes to guard strings.
	NMap<int, NString> m_cNodesToGuards;
	// Maps nodes to lists of action strings.
	NMap<int, NList<NString, NString>*> m_cNodesToActions;
	
	// Maps atomic nodes to guard strings.
	NMap<int, NString> m_cAtomicNodesToGuards;
	// Maps atomic nodes to lists of action strings.
	NMap<int, NList<NString, NString>*> m_cAtomicNodesToActions;

	// Maps alternate selection nodes to their opposite guards (the NOT case).
	NMap<int, NString> m_cAlternateNodesToGuards;

	// A list of guards not associated with any node.
	NList<NString,NString> m_lExtraGuards;
	/* Maps the position of extra guards in the list to
	 * lists of extra actions.
	 */
	NMap<int, NList<NString, NString>*> m_cExtraActions; 

	 // A list of the component names for local variables.
	NList<NString, NString> m_cLocalComponents;
	 /* A map from the position of local variables
	  * in the component list to their list of states.
	  */
	NMap<int, NList<NString, NString>*> m_cLocalStates; 
	
	// A list of variables that are integers (as was declared in the user's information file).
	NList<NString, NString> m_lIntegers;

	// A list of the starting (minimum) values of the integers. (The first value in this list
	// is the starting value for the first integer in the integers list and so on).
	NList<NString, NString> m_lStartValues;

	// A list of the end (maximum) values of the integers. (The first value in this list
	// is the end value for the first integer in the integers list and so on).
	NList<NString, NString> m_lEndValues;

	// A list of set variable names.
	NList<NString, NString> m_cSetNames;
	 /* A map from the position of set names
	  * in the list to the position of a set type in the types list.
	  */
	NMap<int, int> m_cSetNamesToTypes; 

	// A list of the set types.
	NList<NString, NString> m_cSetTypes;

	// A list of parent sets. (Sets that contain set attributes).
	NList<NString, NString> m_cParentSets;

	// A list of sets that are attributes of other sets.
	NList<NString, NString> m_cAttributeSets;

	 /* A map from the position of set types
	  * in the list to their list of elements.
	  */
	NMap<int, NList<NString, NString>*> m_cSetElements; 
	
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
	NList<NString, NString> m_cUniqueSetTypes;

	 /* A map from the position of unique set types
	  * in the list to their list of elements (see above description).
	  */
	NMap<int, NList<NString, NString>*> m_cUniqueSetElements; 
	

	 /* A map from the position of set names
	  * in the list to the position of a parent set in the parent set list.
	  */
	NMap<int, int> m_cSetsToParentSets; 
	
	/* A map from the position of set names
	  * in the list to their list of initial elements.
	  */
	NMap<int, NList<NString, NString>*> m_cInitSetElements; 

	// A list of user-defined attributes (as obtained from the user-defined information text file).
	NList<NString, NString> m_lAttributes;

	// A map from the position of attributes in the list to the position of types in the set type list.
	// (Although these are not set attributes, the set type list is still used).
	NMap<int, int> m_mAttributesToTypes;

	// A list of components that own user-defined attributes.
	NList<NString, NString> m_lAttributeComponents;

	// A map from the position of attributes in the list to the position of owner components in the component list.
	NMap<int, int> m_mAttributesToComponents; 

	// A map from the position of alternative names in the list to the position of attributes.
	// (See TranslateSALMain.cpp, approx. line 1852 for a detailed description).
	NMap<int, int> m_mAlternativesToAttributes; 

	// A list of alternate names used for user-defined attributes.
	// (See TranslateSALMain.cpp, approx. line 1852 for a detailed description).
	NList<NString, NString> m_lAlternateNames;

	// A list of the final user-defined attributes (after set nodes have been expanded).
	NList<NString, NString> m_lUserDefinedAttributes;

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
	NMap<int, NString> m_cNodesToIDs;	
	// The current highest number used for a PC name.
	int m_iHighestProgramCounter; 	
	// Maps PC names to their highest value.
	NMap<int, int> m_cPCRanges;  

	// A list of the ID's of branching nodes.
	NList<NString, NString> m_lBranchingIDs;
	// Maps the position of branching nodes in the ID list to their PC's.
	NMap<int, int> m_cBranchingPCs;

	// Lists of input and output variables and local Boolean variables.
	NList<NString, NString> m_cOutputVariables;
	NList<NString, NString> m_cInputVariables;
	NList<NString, NString> m_cLocalBooleans;
	NList<NString, NString> m_cIntegerAttributes;

	//The string containing the definition of messageReady for translation type 4.					  
	NString m_strMessageReady;

	NList<NString, NString> m_lInitialisationPCs;

	bool m_bIsUPPAAL;

	int m_iStartNode;

	// A map from node ID's to a number representing how many atomic blocks are still
	// using the node. This is to work out whether or not the node's transition can 
	// be deleted.
	NMap<int, int> m_mCountOfBlocksUsingNode;

	// A list of nodes that were created when parsing a TextBE file.
	NList<NString, NString> m_lTextBEList;

	// A map from the position of nodes in the textBE list above to a TranslateNode 
	// object that contains its name, type, etc. but could end up being several 
	// similar nodes in the BT.
	// This is only used when parsing TextBE files.
	NMap<int, CTranslateNode*> m_mTextBEMap;

	// A list of branching nodes. This is only used for parsing TextBE files.
	NList<CTranslateNode*, CTranslateNode*> m_lBranchingNodes;

	// A list of requirements tags to ignore. This is only used when parsing TextBE files.
	NList<NString,NString> m_lReqTags;

	// Indicates whether the component declarations part of the file has been reached.
	// This is only used when parsing TextBE files.
	bool m_bReachedComp; 

};
