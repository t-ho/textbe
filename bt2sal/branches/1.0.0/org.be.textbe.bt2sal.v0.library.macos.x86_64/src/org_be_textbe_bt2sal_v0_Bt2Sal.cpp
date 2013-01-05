#include "org_be_textbe_bt2sal_v0_Bt2Sal.h"
#include "TranslateSALMain.h"
#include "NString.h"

JNIEXPORT jstring JNICALL Java_org_be_textbe_bt2sal_v0_Bt2Sal_translateToSal(
		JNIEnv* env, jobject jobj, jstring strTree, jint iPriority, jint iBuff,
		jint iWithSets, jstring strSets, jstring strInit) {
	CTranslateSALMain cTranslator;
	// Convert the jstrings to char strings.

	const char* strConvertedTree = env->GetStringUTFChars(strTree, 0);
	const char* strConvertedSets = env->GetStringUTFChars(strSets, 0);
	const char* strConvertedInit = env->GetStringUTFChars(strInit, 0);

	// Call the translator.
	cTranslator.SelectOptions(strConvertedTree, iPriority, iBuff, iWithSets,
			strConvertedSets, strConvertedInit);
	NString strNResult = cTranslator.ParseBT(0, false, false);

	env->ReleaseStringUTFChars(strInit, strConvertedInit);
	env->ReleaseStringUTFChars(strSets, strConvertedSets);
	env->ReleaseStringUTFChars(strTree, strConvertedTree);

	/*
	 * Convert the result into a jstring.
	 */
	std::string strWResult = strNResult.GetString();
	const char* strFinalResult = strWResult.c_str();

	return env->NewStringUTF(strFinalResult);

}

