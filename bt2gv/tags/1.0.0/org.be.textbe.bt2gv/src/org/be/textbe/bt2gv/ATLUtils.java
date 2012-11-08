package org.be.textbe.bt2gv;

/*******************************************************************************
 * Copyright (c) 2009 INRIA. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     INRIA - Initial API and implementation
 *     
 ******************************************************************************/

import java.util.HashMap;
import java.util.Map;

import org.eclipse.m2m.atl.common.ATLLaunchConstants;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;

/**
 * Provides utilities for ATL transformation launching
 * 
 * @author Hugo Bruneliere
 */
final class ATLUtils {

	private static final String EMF = "EMF";

	private static ATLUtils instance;

	private static ILauncher launcher;
	private static ModelFactory modelFactory;
	private static Map<String, Object> options;
	private static EMFInjector injector;
	private static EMFExtractor extractor;

	private ATLUtils() throws ATLCoreException {

		options = new HashMap<String, Object>();
		modelFactory = CoreService.getModelFactory(EMF);
		injector = (EMFInjector) CoreService.getInjector(EMF);
		extractor = (EMFExtractor) CoreService.getExtractor(EMF);
		
		resetLauncher();
	}

	public static final ATLUtils getInstance() throws ATLCoreException {
		if (instance == null)
			instance = new ATLUtils();
		return instance;
	}

	public void resetLauncher() throws ATLCoreException {
		launcher = CoreService.getLauncher(ATLLaunchConstants.EMF_VM_NAME);
		launcher.initialize(options);
	}

	public ILauncher getLauncher() {
		return launcher;
	}

	public ModelFactory getModelFactory() {
		return modelFactory;
	}

	public void unload(IModel model) {
		if (model instanceof EMFModel) {
			((EMFModelFactory) modelFactory).unload((EMFModel) model);
		}
	}

	public Map<String, Object> getOptions() {
		return options;
	}

	public EMFInjector getInjector() {
		return injector;
	}

	public EMFExtractor getExtractor() {
		return extractor;
	}

}
