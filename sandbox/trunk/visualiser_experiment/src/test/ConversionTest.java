package test;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

public class ConversionTest {

	@Test
	public void test() throws IOException {

		for (int j = 1; j < 10; j++) {

			URI uri = URI.createPlatformPluginURI(
					"/visualiser_experiment/testfiles/RBT" + j + ".bt", false);
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.createResource(uri);
			r.load(null);
			EList<EObject> contents = r.getContents();

			if (!contents.isEmpty()) {
				EObject eObject = contents.get(0);
				System.out.println(eObject);
			} else {
				System.out.println("Empty! " + j);
			}

		}
	}
}
