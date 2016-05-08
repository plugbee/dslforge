/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.workspace.ui;

import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreePathViewerSorter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.internal.navigator.CommonNavigatorMessages;
import org.eclipse.ui.internal.navigator.NavigatorContentService;
import org.eclipse.ui.internal.navigator.NavigatorContentServiceContentProvider;
import org.eclipse.ui.internal.navigator.NavigatorPlugin;
import org.eclipse.ui.internal.navigator.Policy;
import org.eclipse.ui.navigator.INavigatorContentDescriptor;
import org.eclipse.ui.navigator.INavigatorContentService;
import org.eclipse.ui.navigator.INavigatorSorterService;
import org.eclipse.ui.navigator.Priority;

@SuppressWarnings({ "serial", "restriction" })
public class BasicWorkspaceSorter extends TreePathViewerSorter {

	static final Logger logger = Logger.getLogger(BasicWorkspaceSorter.class);
	
	private static final int LEFT_UNDERSTANDS = 1;
	private static final int RIGHT_UNDERSTANDS = 2; 
	private static final int BOTH_UNDERSTAND = LEFT_UNDERSTANDS | RIGHT_UNDERSTANDS; 

	private NavigatorContentService contentService;

	private INavigatorSorterService sorterService;

	public void setContentService(INavigatorContentService aContentService) {
		contentService = (NavigatorContentService) aContentService;
		sorterService = contentService.getSorterService();
	}

	public int category(Object element) {
		if (contentService == null)
			return 0;
		INavigatorContentDescriptor source = getSource(element);
		return source != null ? source.getSequenceNumber() : Priority.NORMAL_PRIORITY_VALUE;
	}

	private void logMissingExtension(Object parent, Object object) {
		NavigatorPlugin.logError(0, NLS.bind(CommonNavigatorMessages.CommonViewerSorter_NoContentExtensionForObject,
				object != null ? object.toString() : "<null>", parent != null ? parent.toString() : "<null>"), null); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	public int compare(Viewer viewer, TreePath parentPath, Object object1, Object object2) {
		if (contentService == null)
			return -1;
		INavigatorContentDescriptor sourceOfLvalue = getSource(object1);
		INavigatorContentDescriptor sourceOfRvalue = getSource(object2);
		Object parent;
		if (parentPath == null) {
			parent = viewer.getInput();
		} else {
			parent = parentPath.getLastSegment();
		}
		if (sourceOfLvalue == null) {
			logMissingExtension(parent, object1);
			return -1;
		}
		if (sourceOfRvalue == null) {
			logMissingExtension(parent, object2);
			return -1;
		}
		ViewerSorter sorter = null;
		if (sourceOfLvalue == sourceOfRvalue) {
			sorter = sorterService.findSorter(sourceOfLvalue, parent, object1, object2);
		} else {
			boolean flags[] = new boolean[4];
			flags[0] = sourceOfLvalue.isTriggerPoint(object1);
			flags[1] = sourceOfLvalue.isTriggerPoint(object2);
			flags[2] = sourceOfRvalue.isTriggerPoint(object1);
			flags[3] = sourceOfRvalue.isTriggerPoint(object2);
			int whoknows = 0;
			whoknows = whoknows | (flags[0] & flags[1] ? LEFT_UNDERSTANDS : 0);
			whoknows = whoknows | (flags[2] & flags[3] ? RIGHT_UNDERSTANDS : 0);
			switch (whoknows) {
			case BOTH_UNDERSTAND:
				sorter = sourceOfLvalue.getSequenceNumber() > sourceOfRvalue.getSequenceNumber() ? sorterService
						.findSorter(sourceOfLvalue, parent, object1, object2)
						: sorterService.findSorter(sourceOfRvalue, parent, object1, object2);
				break;
			case LEFT_UNDERSTANDS:
				sorter = sorterService.findSorter(sourceOfLvalue, parent, object1, object2);
				break;
			case RIGHT_UNDERSTANDS:
				sorter = sorterService.findSorter(sourceOfRvalue, parent, object1, object2);
				break;
			}
		}	
		if (sorter != null) {
			return sorter.compare(viewer, object1, object2);
		}
		int categoryDelta = category(object1) - category(object2);
		if (categoryDelta == 0) {
			return super.compare(viewer, object1, object2);
		}
		return categoryDelta;
	}

    public boolean isSorterProperty(Object element, String property) {
    	NavigatorContentServiceContentProvider contentProvider = (NavigatorContentServiceContentProvider) contentService.createCommonContentProvider();
    	TreePath[] parentPaths = contentProvider.getParents(element);
    	for (int i = 0; i < parentPaths.length; i++) {
    		if (isSorterProperty(parentPaths[i], element, property))
    			return true;
    	}
    	return false;
    }

    public boolean isSorterProperty(TreePath parentPath, Object element, String property) {
		INavigatorContentDescriptor contentDesc = getSource(element);
		if (parentPath.getSegmentCount() == 0)
			return false;
		ViewerSorter sorter = sorterService.findSorter(contentDesc, parentPath.getLastSegment(), element, null);
		if (sorter != null)
			return sorter.isSorterProperty(element, property);
        return false;
    }

	private INavigatorContentDescriptor getSource(Object o) {
		INavigatorContentDescriptor descriptor = contentService.getSourceOfContribution(o);
		if (descriptor != null) {
			if (Policy.DEBUG_SORT)
				logger.info("sort: " + descriptor + " object: " + o);
			return descriptor;
		}

		Set<?> descriptors = contentService.findDescriptorsByTriggerPoint(o, NavigatorContentService.CONSIDER_OVERRIDES);
		if (descriptors != null && descriptors.size() > 0) {
			descriptor = (INavigatorContentDescriptor) descriptors.iterator().next();
			if (Policy.DEBUG_SORT)
				logger.info("sort: " + descriptor + " object: " + o);
			return descriptor;
		}
		if (Policy.DEBUG_SORT)
			logger.info("sort: NULL object: " + o);
		return null;
	}
}