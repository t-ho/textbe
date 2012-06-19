package org.be.textbe.st.examples;
/*
 * @author tmyers
 * @version 0.1.1
 * @created 08.07.2011
 * 
 */



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.be.textbe.st.examples.AbstractExampleWizard;

public class STNotationExampleWizard extends AbstractExampleWizard{
	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		final List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.be.textbe.st.examples", "examples/org.be.textbe.st.examples.stnotation.zip", "org.be.textbe.st.examples.stnotation"));
		return projects;
	}
}