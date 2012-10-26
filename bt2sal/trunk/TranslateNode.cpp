#include "StdAfx.h"
#include "TranslateNode.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif

CTranslateNode::CTranslateNode(void)
{
	m_plExtraInfoTags = new NList<CString, CString>;
	m_plExtraInfoNames = new NList<CString, CString>;
	m_bIsBlankNode = false;
	m_bIsAtomic = false;
	m_bIsSet = false;
	m_bIsNodeNonDeter = false;
	m_iGuardPosition = -1;
	m_bTextBEBranching = false;
	m_strLabel = _T("");
	m_strJumpingToLabel = _T("");
}

CTranslateNode::~CTranslateNode(void)
{
	delete m_plExtraInfoTags;
	delete m_plExtraInfoNames;
}
int CTranslateNode::GetNodeID(){
	return m_iNodeID;
}
CString CTranslateNode::GetComponentName(){
	return m_strComponentName;
}
CString CTranslateNode::GetStateName(){
	return m_strStateName;
}
CString CTranslateNode::GetFlag(){
	return m_strFlag;
}
int CTranslateNode::GetType(){
	return m_iType;
}
int CTranslateNode::GetNumberOfChildren(){
	return m_lChildren.GetSize();
}
int CTranslateNode::GetChildID(int iIndex){
	NPosition cPos;
	cPos = m_lChildren.GetHeadPosition();
	int iLocation = 0;
	while (cPos.IsNotNull()){
		int iChildID = m_lChildren.GetNext(cPos);
		if (iIndex == iLocation){  // This is the required child.
			return iChildID;
		}
		iLocation++;
	}
	return 0; // Child not found.
}

int CTranslateNode::GetJumpType(){
	return m_iJumpType;
}

int CTranslateNode::GetBranchingType(){
	return m_iBranchingType;
}

void CTranslateNode::SetNodeID(int iNodeID){
	m_iNodeID = iNodeID;
}
void CTranslateNode::SetComponentName(CString strComponent){
	m_strComponentName = strComponent;
}
void CTranslateNode::SetStateName(CString strState){
	m_strStateName = strState;
}
void CTranslateNode::SetFlag(CString strFlag){
	m_strFlag = strFlag;
}
void CTranslateNode::SetType(int iType){
	m_iType = iType;
}

void CTranslateNode::AddChild(int iChildID){
	m_lChildren.AddTail(iChildID);
}

// Insert a child at the given position.
// Note: The child will only be inserted if there are already
// iPosition number of elements, otherwise nothing will happen.
void CTranslateNode::AddChildAtPosition(int iChildID, int iPosition){
	if (iPosition == 0){  // It should be added to the start of the list.
		m_lChildren.AddHead(iChildID);
	}else{
		NPosition cPos;
		cPos = m_lChildren.GetHeadPosition();
		int iLocation = 0;
		while (cPos.IsNotNull()){
			int iCurrentChild = m_lChildren.GetNext(cPos);
			if (iLocation == (iPosition-1)){
				// cPos is now at the position just before the place 
				// where the ID is to be inserted.
				m_lChildren.InsertAfter(cPos, iChildID);
			}
			iLocation++;
		}
	}
}

void CTranslateNode::RemoveChild(int iChildID){
	NPosition cPos;
	cPos = m_lChildren.Find(iChildID);
	if (cPos.IsNotNull()){
		m_lChildren.RemoveAt(cPos);
	}
}

int CTranslateNode::GetChildLocation(int iChildID){
	NPosition cPos;
	cPos = m_lChildren.GetHeadPosition();
	int iLocation = 0;
	while (cPos.IsNotNull()){
		int iCurrentChild = m_lChildren.GetNext(cPos);
		if (iCurrentChild == iChildID){  // This is the required child.
			return iLocation;
		}
		iLocation++;
	}
	return 0; // Child not found.
}

void CTranslateNode::SetJumpType(int iJumpType){
	m_iJumpType = iJumpType;
}

void CTranslateNode::SetBranchingType(int iBranchType){
	m_iBranchingType = iBranchType;;
}

int CTranslateNode::GetSiblingNumber(){
	return m_iSiblingNumber;
}
void CTranslateNode::SetSiblingNumber(int iSiblings){
	m_iSiblingNumber = iSiblings;
}
int CTranslateNode::GetParent(){
	return m_iParent;
}
void CTranslateNode::SetParent(int iParent){
	m_iParent = iParent;
}
bool CTranslateNode::IsNodeNonDeterministic()
{
	return m_bIsNodeNonDeter;
}
void CTranslateNode::SetIsNodeNonDeterministic(bool bIsDeter)
{
	m_bIsNodeNonDeter = bIsDeter;
}

bool CTranslateNode::IsNodeAtomic()
{
	return m_bIsAtomic;
}
void CTranslateNode::SetIsNodeAtomic(bool bIsAtomic)
{
	m_bIsAtomic = bIsAtomic;
}
bool CTranslateNode::IsNodeSetOperation()
{
	return m_bIsSet;
}
void CTranslateNode::SetIsNodeSetOperation(bool bIsSet)
{
	m_bIsSet = bIsSet;
}

bool CTranslateNode::IsBlankNode(){
	return m_bIsBlankNode;
}
void CTranslateNode::SetIsBlankNode(bool bIsBlank){
	m_bIsBlankNode = bIsBlank;
}

CString CTranslateNode::GetSetVariable(int iIndex){
	int iCurrentIndex = 0;
	NPosition cPosition;
	cPosition = m_lSetVariables.GetHeadPosition();
	while (cPosition.IsNotNull()){
		CString strVariable = m_lSetVariables.GetNext(cPosition);
		if (iIndex == iCurrentIndex){
			return strVariable;
		}
		iCurrentIndex++;
	}
	return NULL;
}

void CTranslateNode::AddSetVariable(CString strVariable){
	m_lSetVariables.AddTail(strVariable);
}

CString CTranslateNode::GetSetRule(int iIndex){
	int iCurrentIndex = 0;
	NPosition cPosition;
	cPosition = m_lSetRules.GetHeadPosition();
	while (cPosition.IsNotNull()){
		CString strRule = m_lSetRules.GetNext(cPosition);
		if (iIndex == iCurrentIndex){
			return strRule;
		}
		iCurrentIndex++;
	}
	return NULL;
}

void CTranslateNode::AddSetRule(CString strRule){
	m_lSetRules.AddTail(strRule);
}

int CTranslateNode::GetNumberOfVariables(){
	return m_lSetVariables.GetSize();
}

int CTranslateNode::GetNumberOfRules(){
	return m_lSetRules.GetSize();
}

bool CTranslateNode::IsBoolSymbol(CString strRule){
	if (strRule == _T("LessThan")){
		return true;
	}else if (strRule == _T("GreaterThan")){
		return true;
	}else if (strRule == _T("EqualTo")){
		return true;
	}else if (strRule == _T("LessThanOrEqual")){
		return true;
	}else if (strRule == _T("GreaterThanOrEqual")){
		return true;
	}
	return false; // It didn't match one of those expressions.
}

void CTranslateNode::StoreTheParentSet(CString strSet){
	m_strParentSet = strSet;
}

CString CTranslateNode::GetTheParentSet(){
	return m_strParentSet;
}

void CTranslateNode::StoreTheOriginalName(CString strOriginal){
	m_strOriginal = strOriginal;
}

CString CTranslateNode::GetTheOriginalName(){
	return m_strOriginal;
}

bool CTranslateNode::HasParentSet(){
	if (m_strParentSet == _T("")){
		return false;
	}else{
		return true;
	}
}

void CTranslateNode::StoreSetsGuard(CString strGuard){
	m_strSetsGuard = strGuard;
}

CString CTranslateNode::RetrieveSetsGuard(){
	return m_strSetsGuard;
}

bool CTranslateNode::IsUserDefinedAttribute(){
	return m_bIsUserDefinedAttribute;
}

void CTranslateNode::SetIsUserDefinedAttribute(bool bIsUserDefined){
	m_bIsUserDefinedAttribute = bIsUserDefined;
}

int CTranslateNode::GetAttributeType(){
	return m_iAttributeType;
}

void CTranslateNode::SetAttributeType(int iType){
	m_iAttributeType = iType;
}

bool CTranslateNode::IsIntegerExpression(){
	return m_bIsIntegerExpression;
}

void CTranslateNode::SetIsIntegerExpression(bool bIsIntExp){
	m_bIsIntegerExpression = bIsIntExp;
}

void CTranslateNode::AddExtraInfo(CString strTag, CString strName){
	m_plExtraInfoTags->AddTail(strTag);
	m_plExtraInfoNames->AddTail(strName);
}

NList<CString, CString>* CTranslateNode::GetExtraInfoTags(){
	return m_plExtraInfoTags;
}

NList<CString, CString>* CTranslateNode::GetExtraInfoNames(){
	return m_plExtraInfoNames;
}

/* This method is used only when there is a set of alternate selection 
 * nodes and one of the branches is atomic. It is used by TranslateParsingMethods
 * and TranslateRuleAltBranching.
 */
void CTranslateNode::SetGuardPosition(int iPosition){
	m_iGuardPosition = iPosition;
}

// See comments for SetGuardPosition.
int CTranslateNode::GetGuardPosition(){
	return m_iGuardPosition;
}

// This is only for parsing TextBE files.
// Do not use for any other purpose and do not mix up with getIsNodeNonDeterministic etc.
bool CTranslateNode::GetTextBEBranchingType(){
	// false = alternative, true = concurrent.
	return m_bTextBEBranching;
}

// This is only for parsing TextBE files. See the description for the previous method.
void CTranslateNode::SetTextBEBranchingType(bool bTextBEType){
	m_bTextBEBranching = bTextBEType;
}

void CTranslateNode::SetLabel(CString strLabel){
	m_strLabel = strLabel;
}

CString CTranslateNode::GetLabel(){
	return m_strLabel;
}

void CTranslateNode::SetJumpingToLabel(CString strLabel){
	m_strJumpingToLabel = strLabel;
}

CString CTranslateNode::GetJumpingToLabel(){
	return m_strJumpingToLabel;
}

bool CTranslateNode::HasDataFromSet(){
	return m_bDataIsSetElement;
}

void CTranslateNode::SetHasDataFromSet(bool bHasDataFromSet){
	m_bDataIsSetElement = bHasDataFromSet;
}

//////// This is for slicing.
void CTranslateNode::AddBlankParent(int iBlankParent){
	m_iBlankParent = iBlankParent;
}

//////// This is for slicing
int CTranslateNode::GetBlankParent(){
	return m_iBlankParent;
}

//////// This is for slicing.
int CTranslateNode::GetThreadNumber(){
	return m_iThreadNumber;
}

//////// This is for slicing
void CTranslateNode::SetThreadNumber(int iThread){
	m_iThreadNumber = iThread;
}

//////// This is for slicing.
int CTranslateNode::GetTarget(){
	return m_iTarget;
}

//////// This is for slicing
void CTranslateNode::SetTarget(int iTarget){
	m_iTarget = iTarget;
}

void CTranslateNode::SetStringID(CString strID){
	m_strLongID = strID;
}

CString CTranslateNode::GetStringID(){
	return m_strLongID;
}

//////// This is for slicing.
int CTranslateNode::GetActualTarget(){
	return m_iActualTarget;
}

//////// This is for slicing
void CTranslateNode::SetActualTarget(int iTarget){
	m_iActualTarget = iTarget;
}

//////// This is for slicing.
bool CTranslateNode::IsLeafInSlice(){
	return m_bIsLeafNodeInSlice;
}

//////// This is for slicing
void CTranslateNode::SetIsLeafInSlice(bool bIsLeaf){
	m_bIsLeafNodeInSlice = bIsLeaf;
}