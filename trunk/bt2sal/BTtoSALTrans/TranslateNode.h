#pragma once
#include "NList.h"

class CTranslateNode
{
public:
	CTranslateNode(void);
public:
	~CTranslateNode(void);
public:
	int GetNodeID();
	CString GetComponentName();
	CString GetStateName();
	CString GetFlag();
	int GetNumberOfChildren();
	int GetChildID(int iIndex);
	int GetType();
	int GetJumpType();
	int GetBranchingType();
	void SetComponentName(CString strComponent);
	void SetStateName(CString strState);
	void SetFlag(CString strFlag);
	void SetType(int iType);
	void SetJumpType(int iJumpType);
	void SetBranchingType(int iBranchType);
	void SetNodeID(int iNodeID);
	void AddChild(int iChildID);
	void AddChildAtPosition(int iChildID, int iPosition);
	int GetChildLocation(int iChildID);
	void RemoveChild(int iChildID);
	void SetIsNodeNonDeterministic(bool bIsDeter);
	bool IsNodeNonDeterministic();
	void SetParent(int iParent);
	int GetParent();
	void SetSiblingNumber(int iSiblings);
	int GetSiblingNumber();
	bool IsNodeAtomic(); 
	bool IsNodeSetOperation();
	void SetIsNodeAtomic(bool bIsAtomic);
	void SetIsNodeSetOperation(bool bIsSet);
	bool IsBlankNode();
	void SetIsBlankNode(bool bIsBlank);
	CString GetSetVariable(int iIndex);
	void AddSetVariable(CString strVariable);
	CString GetSetRule(int iIndex);
	void AddSetRule(CString strRule);
	int GetNumberOfVariables();
	int GetNumberOfRules();
	bool IsBoolSymbol(CString strRule);
	CString GetTheParentSet();
	void StoreTheParentSet(CString strSet);
	bool HasParentSet();
	CString RetrieveSetsGuard();
	void StoreSetsGuard(CString strGuard);
	bool IsUserDefinedAttribute();
	void SetIsUserDefinedAttribute(bool bIsUserDefined);
	int GetAttributeType();
	void SetAttributeType(int iType);
	bool IsIntegerExpression();
	void SetIsIntegerExpression(bool bIsIntExp);
	void StoreTheOriginalName(CString strOriginal);
	CString GetTheOriginalName();
	void AddExtraInfo(CString strTag, CString strName);
	NList<CString, CString>* GetExtraInfoNames();
	NList<CString, CString>* GetExtraInfoTags();
	void SetGuardPosition(int iPosition);
	int GetGuardPosition();
	bool GetTextBEBranchingType();
	void SetTextBEBranchingType(bool bTextBEType);
	void SetLabel(CString strLabel);
	CString GetLabel();
	void SetJumpingToLabel(CString strLabel);
	CString GetJumpingToLabel();
	bool HasDataFromSet();
	void SetHasDataFromSet(bool bHasDataFromSet);
	void AddBlankParent(int iBlankParent);
	int GetBlankParent();
	int GetThreadNumber();
	void SetThreadNumber(int iThread);
	void SetTarget(int iTarget);
	int GetTarget();
	void SetActualTarget(int iTarget);
	int GetActualTarget();
	void SetStringID(CString strID);
	CString GetStringID();
	void SetIsLeafInSlice(bool bIsLeaf);
	bool IsLeafInSlice();

private:
	int m_iNodeID;
	CString m_strComponentName;
	CString m_strStateName;
	CString m_strFlag;
	NList<int, int> m_lChildren;
	int m_iType;
	int m_iJumpType;
	int m_iBranchingType;
	int m_iSiblingNumber;
	int m_iParent;
	bool m_bIsBlankNode;
	bool m_bIsNodeNonDeter;
	bool m_bIsSet;
	bool m_bIsAtomic;
	int m_iGuardPosition;
	bool m_bTextBEBranching;
	NList<CString, CString>* m_plExtraInfoNames;
	NList<CString, CString>* m_plExtraInfoTags;
	CString m_strLabel; // The label of this node.
	CString m_strJumpingToLabel; // The label of the node that this node jumps to.
	int m_iBlankParent;
	int m_iThreadNumber;
	int m_iTarget; // This is for jump nodes and slicing only.
	int m_iActualTarget; // Same as above.
	CString m_strLongID;
	bool m_bIsLeafNodeInSlice;
	
	// Variables for set expressions.
	NList<CString, CString> m_lSetVariables;
	NList<CString, CString> m_lSetRules;
	CString m_strParentSet;
	CString m_strOriginal;
	int m_iNumber;
	CString m_strSetsGuard; // The guard for checking whether an element is currently in the set.

	bool m_bIsUserDefinedAttribute; // The node contains a user-defined attribute.
	// i.e. an attribute that has been defined in a text file, not automatically determined from the BT.

	bool m_bIsIntegerExpression; // The node's behavior part is an integer expression,
	// such as s > 2, s < 5 or s = 7.

	int m_iAttributeType; // The location in the set types list of the type of the user-defined attributes. 

	bool m_bDataIsSetElement;  // This is true if this is an internal output node with a data parameter
							// that is an element of a set. (See the explanation in TranslateRuleInternal.cpp).
};
