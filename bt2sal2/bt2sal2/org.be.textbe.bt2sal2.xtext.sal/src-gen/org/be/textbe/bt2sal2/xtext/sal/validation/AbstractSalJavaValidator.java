package org.be.textbe.bt2sal2.xtext.sal.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractSalJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage.eINSTANCE);
		return result;
	}

}
