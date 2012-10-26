// File name: GSEMethod.h
// Author/s :
// Date built: 24/5/2006
// Last updated:
// Purpose: 
// Algorithms used:
// Description of Algorithm#:
//
//

#pragma once


#define GSE_T_STATE 1   // state realisation
#define GSE_T_CONDITION 2  // condition
#define GSE_T_EVENT 3  // EVENT
#define GSE_T_GUARD 4  // Guard (three question marks)
#define GSE_T_INPUT 5  // input >>...<<
#define GSE_T_OUTPUT 6  // output <<..>>

// [1.154] SET OPERATION
#define GSE_T_INPUT1 7  // input1 >...<
#define GSE_T_OUTPUT1 8  // output 1 <...>
#define GSE_T_SETALL 9  // set all ||
#define GSE_T_SETANY 10  // set any []
// [1.154] END

#define GSE_J_NO 0   // not a jump
#define GSE_J_REVERSION 1  // a reversion
#define GSE_J_GOTO 2  // goto 

#define GSE_M_NO 0   // not a missing node
#define GSE_M_IMPLY 1  // an imply node with + sign
#define GSE_M_MISSING 2  // a missing node, with - sign 

#define GSE_L_NORMAL_LINK 1 // with array
#define GSE_L_ATOMIC_LINK 2 // 


