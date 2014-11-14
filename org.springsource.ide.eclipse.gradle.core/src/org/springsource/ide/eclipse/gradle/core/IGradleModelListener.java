/*******************************************************************************
 * Copyright (c) 2012 Pivotal Software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/
package org.springsource.ide.eclipse.gradle.core;


/**
 * A listener that can be added to a project to get notified whenever the Gradle project's
 * model is set.
 * 
 * This model listener is deprecated because it doesn't work well in a world where
 * we manage models of different types. The calls to the modelChanged method does not
 * provide any information about *which* type of model changed.
 * 
 * @author Kris De Volder
 */
@Deprecated
public interface IGradleModelListener {
	
	/**
	 * Gets called when the model for a given project is changed. Note that the oldModel and new model could be instances
	 * of EclipseProject which is a subtype of HierarchicalEclipseProject.
	 */
	public void modelChanged(GradleProject project);
}
