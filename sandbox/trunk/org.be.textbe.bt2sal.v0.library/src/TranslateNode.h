#pragma once
#include "NList.h"
#include "NString.h"
#include <tchar.h>

class CTranslateNode
{
public:
	CTranslateNode(void);
public:
	~CTranslateNode(void);
public:
	int GetNodeID();
	NString GetComponentName();
	NString GetStateName();
	NString GetFlag();
	int GetNumberOfChildren();
	int GetChildID(int iIndex);
	int GetType();
	int GetJumpType();
	int GetBranchingType();
	void SetComponentName(NString strComponent);
	void SetStateName(NString strState);
	void SetFlag(NString strFlag);
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
	NString GetSetVariable(int iIndex);
	void AddSetVariable(NString strVariable);
	NString GetSetRule(int iIndex);
	void AddSetRule(NString strRule);
	int GetNumberOfVariables();
	int GetNumberOfRules();
	bool IsBoolSymbol(NString strRule);
	NString GetTheParentSet();
	void StoreTheParentSet(NString strSet);
	bool HasParentSet();
	NString RetrieveSetsGuard();
	void StoreSetsGuard(NString strGuard);
	bool IsUserDefinedAttribute();
	void SetIsUserDefinedAttribute(bool bIsUserDefined);
	int GetAttributeType();
	void SetAttributeType(int iType);
	bool IsIntegerExpression();
	void SetIsIntegerExpression(bool bIsIntExp);
	void StoreTheOriginalName(NString strOriginal);
	NString GetTheOriginalName();
	void AddExtraInfo(NString strTag, NString strName);
	NList<NString, NString>* GetExtraInfoNames();
	NList<NString, NString>* GetExtraInfoTags();
	void SetGuardPosition(int iPosition);
	int GetGuardPosition();
	bool GetTextBEBranchingType();
	void SetTextBEBranchingType(bool bTextBEType);
	void SetLabel(NString strLabel);
	NString GetLabel();
	void SetJumpingToLabel(NString strLabel);
	NString GetJumpingToLabel();
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
	void SetStringID(NString strID);
	NString GetStringID();
	void SetIsLeafInSlice(bool bIsLeaf);
	bool IsLeafInSlice();

private:
	int m_iNodeID;
	NString m_strComponentName;
	NString m_strStateName;
	NString m_strFlag;
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
	NList<NString, NString>* m_plExtraInfoNames;
	NList<NString, NString>* m_plExtraInfoTags;
	NString m_strLabel; // The label of this node.
	NString m_strJumpingToLabel; // The label of the node that this node jumps to.
	int m_iBlankParent;
	int m_iThreadNumber;
	int m_iTarget; // This is for jump nodes and slicing only.
	int m_iActualTarget; // Same as above.
	NString m_strLongID;
	bool m_bIsLeafNodeInSlice;
	
	// Variables for set expressions.
	NList<NString, NString> m_lSetVariables;
	NList<NString, NString> m_lSetRules;
	NString m_strParentSet;
	NString m_strOriginal;
	int m_iNumber;
	NString m_strSetsGuard; // The guard for checking whether an element is currently in the set.

	bool m_bIsUserDefinedAttribute; // The node contains a user-defined attribute.
	// i.e. an attribute that has been defined in a text file, not automatically determined from the BT.

	bool m_bIsIntegerExpression; // The node's behavior part is an integer expression,
	// such as s > 2, s < 5 or s = 7.

	int m_iAttributeType; // The location in the set types list of the type of the user-defined attributes. 

	bool m_bDataIsSetElement;  // This is true if this is an internal output node with a data parameter
							// that is an element of a set. (See the explanation in TranslateRuleInternal.cpp).
};
