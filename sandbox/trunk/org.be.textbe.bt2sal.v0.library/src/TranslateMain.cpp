// File name: CTranslateMain.cpp
// Author/s : Nisansala Yatapanage
// Date built: 17/10/2006
// Last updated: 17/10/2006
// Purpose: Abstract main translation class.
//
// Algorithms used:
// Description of Algorithm#:
//


#include "TranslateMain.h"
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
#include <tchar.h>


CTranslateMain::CTranslateMain(void)
{
}

CTranslateMain::~CTranslateMain(void)
{

}

// Select the options for performing the SAL translation.
void CTranslateMain::SelectOptions(void)
{
}

// Parse the current Behavior Tree to identify which translation
// rules to apply and to check that the tree contains valid syntax.
// Then translate the BT to another language.
void CTranslateMain::ParseBT(int iTreeID)
{
}

/** Add a boolean input variable. This variable will be later written to
 *  the INPUT section of the SAL module.
 *  @param name  The name of the variable.
 */
void CTranslateMain::AddInputVariable(NString strName)
{
}	

	/** Add a boolean output variable. This variable will be later written to
	 *  the OUTPUT section of the SAL module.
	 *  @param name  The name of the variable.
	 */
void CTranslateMain::AddOutputVariable(NString strName){
}
	
	/** Add a local boolean variable. This variable will be later written to
	 *  the LOCAL section of the SAL module.
	 *  @param name  The name of the variable.
	 */
void CTranslateMain::AddLocalBoolean(NString strName){
}	

	/** Add an Integer attribute. This variable will be later 
	 *  declared as an Integer type in the SAL code.
	 */
void CTranslateMain::AddIntegerAttribute(NString strName){
}

	/** Add a local variable (not a boolean) and its state. 
	 *  If a variable with that name already exists, the state will be added to
	 *  its list of states. This variable will be later written to the LOCAL 
	 *  section of the SAL module, with a defined TYPE. 
	 *
	 *  @param name  The name of the variable,
	 *  @param state  The name of the state of the variable.
	 */
void CTranslateMain::AddLocalVariable(NString strName, NString strState){	
}	

/** Creates a link between an internal output node and the list of
 *  matching internal input nodes. The information is stored in a 
 *  map variable.
 *  @param iOutputNode   The ID of the output node,
 *  @param lInputNodes   The list of input nodes.
 */
void CTranslateMain::AddInternalMsgAssociation(int iOutputNode, NList<int, int>* plInputNodes){
}

/** Returns a list of the matching internal input nodes for a given
 *  internal output node.
 *  @param iOutputNode   The ID of the output node,
 *  @return   The list of ID's of input nodes.
 */
NList<int, int>* CTranslateMain::GetInternalMsgAssociation(int iOutputNode){
	return NULL;
}

int CTranslateMain::FindListPosition(NList<NString, NString>& cList, NString strValue)
{
	return 0;
}

void CTranslateMain::RemoveFromList(NList<NString, NString>& cList, int iIndex)
{
}

	/** Add a guard for a transition, associating it with a node.
	 *  @param  n   The node the guard applies to,
	 *  @param  guard  The transition guard as a string.
	 */
void CTranslateMain::AddNodeGuard(int iNode, NString strGuard){
}
	
	/** Add a list of actions for a transition, associating it with a node.
	 *  @param  n   The node the actions apply to,
	 *  @param  actions The action string list.
	 */
void CTranslateMain::AddNodeAction(int iNode, NList<NString, NString>* plActions){
}

void CTranslateMain::RemoveNodeTransition(int iNode){
}

	/** Add an extra action for the transition already associated with a node.
	 *  @param  n   The node the transition is associated with,
	 *  @param  action  The transition action as a string.
	 */
void CTranslateMain::AddExtraNodeAction(int iNode, NString strAction){
}

	/** Add a guard and a list of actions for a transition that does not apply 
	 *  to any node, e.g. negative selection transitions.
	 *
	 *  @param  guard  The transition guard as a string.
	 *  @param  actions  The transitions actions as a list of strings.
	 */
int CTranslateMain::AddExtraTransition(NString strGuard, NList<NString,NString>* plActions){
	return -1;
}

// View related extra transition methods to be completed.

	/** Increase the range of a program counter to the given value.
	 *  @param  pc  The program counter name as a string,
	 *  @param  value  The integer value.
	 */
void CTranslateMain::AddPCRange(int iProgramCounter, int iValue){
}
	
	/** Returns a string representing the name of a new unused program counter.
	 *  @return  The pc name.
	 */
NString CTranslateMain::GetNewProgramCounter(){
	return "";
}
	
	/** Returns the name of the given node's program counter.
	 *  (This is the pc which allows the node to execute).
	 *  @param  n  The node,
	 *  @return The name of the program counter.
	 */
NString CTranslateMain::GetPCForNode(int iNode){
	return "";
}
	
	/** Returns the value of the given node's program counter in the node's guard.
	 *  (This is the value of the pc which allows the node to execute).
	 *  @param  n  The node,
	 *  @return The integer value of the program counter.
	 */
int CTranslateMain::GetPCValueForNode(int iNode){
	return 0;
}
	
	/** Returns the guard for the given node.
	 *  @return The guard.
	 */
NString CTranslateMain::GetGuard(int iNode){
	return "";
}
	
	/** Returns the actions for the given node.
	 *  @return  A list of strings representing each action.
	 */
NList<NString, NString>* CTranslateMain::GetActions(int iNode){
	return NULL;
}
	
// RemovePCUpdates method to be completed (only needed for synchronisation).

	/** Returns a list of the program counters of threads created at or below
	 *  the given node.
	 *  @param n  The node,
	 *  @return  A list of the names of the program counters.
	 */
NList<NString, NString>* CTranslateMain::FindThreadsToKill(int iNode){
	return NULL;
}

	/** Returns true is a node is atomic, false otherwise.
	 *  This is different to using GSEDataManager to check
	 *  if a node is atomic, since this counts a node as atomic
	 *  even if it is the parent node of an atomic transition.
	 *  @param iNode  the node to test.
	 */
bool CTranslateMain::IsAtomic(int iNode){
	return false;
}

	/** Add an atomic guard. 
	 *  @param  n   The node the guard applies to,
	 *  @param  guard  The transition guard as a string.
	 */
void CTranslateMain::AddAtomicGuard(int iNode, NString strGuard){
}

	/** Add an atomic action list. 
	 *  @param  n   The node the guard applies to,
	 *  @param  actions  The transition actions as a list.
	 */
void CTranslateMain::AddAtomicActions(int iNode, NList<NString, NString>* plActions){
}
	
	/** Returns the atomic guard for the given node.
	 *  @return The guard.
	 */
NString CTranslateMain::GetAtomicGuard(int iNode){		
	return "";
}
	
	/** Returns the atomic actions for the given node.
	 *  @return  A list of strings representing each action.
	 */
NList<NString, NString>* CTranslateMain::GetAtomicActions(int iNode){
	return NULL;
}

// Assigns program counter names and values and ID's to each node that
// is a descendent of the given node (excludes the given node).
// Parameter:  iRootNode = the ID of the root node of the sub-tree.
void CTranslateMain::CreateIDValues(int iRootNode){
}

	/** Adjust the given string so that it contains no spaces and starts with
	 *  either a capital or simple letter as requested.
	 *  @param  s   The string,
	 *  @param  upperCase  true if the first letter should be upper-case, false if lower-case.
	 */
NString CTranslateMain::TrimChangeCase(NString strName, bool bToUpperCase){
	return "";
}
	
bool CTranslateMain::UsingViews(){
	return false;
}

	/** Removes repeated assignment statements from a set of action updates.
	 *  If a variable is updated to two or more different states, the last state is used
	 *  and the rest of the updates are removed.
	 *  @param list  a list of Strings of transition update statements.
	 */
void CTranslateMain::RemoveAssignmentRepeats(NList<NString, NString>& lAssignments){
}

/** Returns the type of translation currently selected by the user.
	 */
int CTranslateMain::GetTranslationType()
{
	return 0;
}

	/** Removes repeated updates of internal message variables, 
	 *  where the variable is updated to both true and false. In this
	 *  case, the update to true is kept, and the updates to false are 
	 *  removed.
	 *  @param updates The list of Strings of update statements to check,
	 *  @param messageNames The list of the names of the messages involved in the updates.
	 */
void CTranslateMain::RemoveMessageConflicts(NList<NString, NString>& lUpdates, NList<NString, NString>& lMessageNames){
}

	/** Adds a string to the string which is used for the messageReady declaration 
	 *  for translation type 4.
	 *  @param m  the string to add.
	 */
void CTranslateMain::AddMessageString(NString strMessage){
}

// Identifies the initialisation nodes - these are the root node and its descendents which
// are all part of an atomic block and are all state-realisations. If the root node is not
// followed by an atomic connection, then the root node is identified as the only initialisation
// node. If any of the init nodes (incl. the root) are not state-changes, an exception is thrown.
// Parameters:  iRootNode = the ID of the root node,
//				lInitNodes = a list (passed by reference) which will be populated with the ID's
//					of all identified initialisation nodes. This list can later be used for 
//					translating the init information.
void CTranslateMain::TranslateInitNodes(int iRootNode, NList<int, int>& lInitNodes){
}

void CTranslateMain::StoreTranslationStep(int iNode, int iRuleID, int iOtherNode, NList<int, int>* plSecondaryRules)
{	
}

NList<NString, NString>* CTranslateMain::ConvertGuardToList(NString strGuard){
	NList<NString, NString>* plGuardList = new NList<NString, NString>;
	int iPos = 0;
	NString strToken = strGuard.Tokenize("AND",iPos);
	while (strToken != ""){
		plGuardList->AddTail(strToken);
		strToken = strGuard.Tokenize("AND",iPos);		
	}
	return plGuardList;
}