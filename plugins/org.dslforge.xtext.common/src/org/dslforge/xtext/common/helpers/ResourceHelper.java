/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.xtext.common.helpers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.google.common.collect.Lists;
import com.google.inject.Provider;


public class ResourceHelper {
	
	public static final String MODELS_FOLDER = "model";
	
	private ResourceHelper() {}
	
	/**
	 * Returns primary resources in current platform
	 * @return
	 */
	public static URI getPrimaryResourceURI() {
		List<URI> resourceURIs = new ArrayList<URI>();
		return resourceURIs.get(0);
	}
	
	/**
	 * Returns primary resource of projectName project
	 * @param projectName
	 * @return
	 */
	public static URI getPrimaryResourceURI(String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		if (!resourceURIs.isEmpty())
			return resourceURIs.get(0);
		return null;
	}
	
	/**
	 * Returns secondary resources in current platform
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIs() {
		List<URI> resourceURIs = new ArrayList<URI>();
		return resourceURIs;
	}
	
	/**
	 * Returns secondary resources of projectName project
	 * @param projectName
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIs(String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		return resourceURIs;
	}

	/**
	 * Returns secondary resource uris with the given extension
	 * 
	 * @param extension
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIsByExtension(String extension) {
		List<URI> resourceURIs = new ArrayList<URI>();
		return resourceURIs;
	}
	
	/**
	 * Returns secondary resource uris with the given extension contained in the given project
	 * 
	 * @param extension
	 * @param projectName
	 * @return
	 */
	public static List<URI> getSecondaryResourceURIsByExtension(String extension, String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		return resourceURIs;
	}
	
	/**
	 * Returns the standalone primary resource URI contained in the given project 
	 * 
	 * @param projectName
	 * @return
	 */
	public static URI getStandaloneResourceURI(String projectName) {
		List<URI> resourceURIs = new ArrayList<URI>();
		return resourceURIs.get(0);
	}
	
	public static URI computeURI(String projectName, String shortName, String extension) {
		return computeURI(projectName, shortName, extension, null);
	}
	
	@SuppressWarnings("deprecation")
	public static URI computeURI(String projectName, String shortName, String extension, String fragment) {
		String stringURI = projectName + "/" + MODELS_FOLDER + "/"+ shortName + "." + extension;
		if (fragment!=null)
			stringURI = stringURI + fragment;
		return URI.createPlatformResourceURI(stringURI);
	}

	public static URI computeURI(File file) {
		return URI.createPlatformResourceURI(file.getAbsolutePath(), true);
	}
	
	public static URI computeURI(File file, String extension) {
		URI specResourceURI = URI.createPlatformResourceURI(file.getAbsolutePath().toString(), true);
		if (getFileExtension(specResourceURI).equals(extension))
			return specResourceURI;
		List<URI> secondaryResourceURIsByExtension = getSecondaryResourceURIsByExtension(extension, file.getName());
		if (secondaryResourceURIsByExtension.isEmpty())
			return null;
		return secondaryResourceURIsByExtension.get(0);
	}

	public static String getFileExtension(URI uri) {
		String[] segments = uri.segments();
		int len = segments.length;
		if (len == 0) return null;
		String lastSegment = segments[len - 1];
		int i = lastSegment.indexOf('.');
		return i < 0 ? null : lastSegment.substring(i + 1);
	}
	
	public static String getFileExtension(File file) {
		String name = file.getName();
		int index = name.indexOf('.');
		if (index == -1)
			return null;
		if (index == (name.length() - 1))
			return "";
		return name.substring(index + 1);
	}
	
	public static String getFileExtension(Resource resource) {
		String name = resource.getURI().lastSegment();
		int index = name.indexOf('.');
		if (index == -1)
			return null;
		if (index == (name.length() - 1))
			return "";
		return name.substring(index + 1);
	}
	
	/**
	 * Returns the resource factory of the resource with the given uri and the given extension from the extension to factory map
	 * 
	 * @param uri
	 * @param extensionToFactoryMap
	 * @param extension
	 * @return
	 */
	public static Object getFactory (URI uri, Map<String, Object> extensionToFactoryMap, String extension) {
		Object resourceFactory = null;
		boolean extensionToFactoryMapIsEmpty = extensionToFactoryMap.isEmpty();
		if (!extensionToFactoryMapIsEmpty) {
			resourceFactory = extensionToFactoryMap.get(extension);
		}
		if (resourceFactory == null) {
			throw new RuntimeException("Unresolved proxy: " + uri.toString());
		}
		return resourceFactory;
	}

	public static Resource.Factory convert(Object resourceFactory) {
		if (resourceFactory instanceof Resource.Factory.Descriptor)
			return ((Resource.Factory.Descriptor)resourceFactory).createFactory();
		return (Resource.Factory)resourceFactory;
	}

	/**
	 * Returns the service provider of the resource with the given uri and the given extension from the extension to factory map
	 * 
	 * @param uri
	 * @param extensionToFactoryMap
	 * @param extension
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static IResourceServiceProvider getServiceProvider(URI uri, Map<String, Object> extensionToFactoryMap, String extension) {
		Object object = getFactory(uri, extensionToFactoryMap, extension);
		if (object instanceof Provider<?>) {
			return ((Provider<IResourceServiceProvider>) object).get();
		}
		return (IResourceServiceProvider) object;
	}
	
	/**
	 * Forces proxies resolution of the given type in the given resource set
	 * 
	 * @param type
	 * @param resourceSet
	 * @return
	 */
	public static EDataType resolveDataType(EDataType type, ResourceSet resourceSet) {
		if (type.eIsProxy()) {
			URI proxyURI = ((InternalEObject) type).eProxyURI();
			final URI uri = proxyURI.trimFragment();
			Resource resource = resourceSet.getResource(uri, true);
			final String fragment = proxyURI.fragment();
			if (((LazyLinkingResource)resource).getEncoder().isCrossLinkFragment(resource, fragment)) {
				EObject target = resource.getEObject(fragment);
				if (target != null) {
					type= (EDataType) target;
				} else {
					throw new RuntimeException("Unresolved proxy: " + proxyURI.toString());
				}
			}
		}
		return type;
	}
	
	/**
	 * Forces proxies resolution of the given object and its direct and indirect content objects in the given resource set
	 * 
	 * @param root
	 * @param resourceSet
	 */
	public static void resolveProxies(EObject root, ResourceSet resourceSet) {
		TreeIterator<EObject> eAllContents = root.eAllContents();
		while (eAllContents.hasNext()) {
			EObject candidate = eAllContents.next();
			EList<EObject> references = candidate.eCrossReferences();
			for (EObject proxy : references) {
				if (proxy.eIsProxy()) {
					URI proxyURI = ((InternalEObject) proxy).eProxyURI();
					Resource resource = root.eResource();
					final String fragment = proxyURI.fragment();
					if (((LazyLinkingResource)resource).getEncoder().isCrossLinkFragment(resource, fragment)) {
						EObject target = resource.getEObject(fragment);
						if (target != null) {
							proxy= target;
						} else {
							//FIXME: clarify when this situation may happen
							throw new RuntimeException("Unresolved proxy: "  + proxyURI.toString());
						}
					}
				}
			}
		}
	}
	
	/**
	 * Workaround: resource factories management with periodic file extensions are not handled currently in EMF.
	 * 
	 * @param uri
	 * @param resourceSet
	 * @return loaded resource
	 */
	public static Resource createResource(URI uri, ResourceSet resourceSet) {
		Resource.Factory.Registry factoryRegistry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> extensionToFactoryMap = factoryRegistry.getExtensionToFactoryMap();		
		Resource.Factory factory = convert(getFactory(uri, extensionToFactoryMap, getFileExtension(uri)));
		if (factory != null){ 
			Resource resource= factory.createResource(uri);
			addResource(resource, resourceSet);
			return resource;
		}
		return null;
	}

	public static Resource addResource(Resource resource, ResourceSet resourceSet) {
		URI uri = resource.getURI();
		Resource r = resourceSet.getResource(uri, false);
		if (r == null) {
			resourceSet.getResources().add(resource);
			return resource;
		} else {
			return r;
		}
	}

	public static void removeResource(Resource resource, ResourceSet resourceSet) {
		if (resourceSet.getResources().contains(resource))
			resourceSet.getResources().remove(resource);
	}

	/**
	 * Loads a resource in the given resource set.
	 * 
	 * @param uri
	 * @param resourceSet
	 * @return
	 */
	public static Resource loadResource(URI uri, ResourceSet resourceSet) {
		Resource resource = resourceSet.getResource(uri, false);
		if (resource != null)
			return resource;
		resource = createResource(uri, resourceSet);
		if (resource != null) {
			try {
				resource.load(Collections.EMPTY_MAP);
				addResource(resource, resourceSet);
			} catch (IOException e) {
				if (e instanceof IOWrappedException) {
					// FIXME: resource does not exist, return null
				} else {
					e.printStackTrace();
				}
			}
		}
		return resource;
	}

	public static void unloadResource(Resource resource, ResourceSet resourceSet) {
		resource.unload();
		removeResource(resource, resourceSet);
	}

	/**
	 * Loads a model from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadResource(File file, ResourceSet resourceSet) {
		String fileExtension = getFileExtension(file);
		if (fileExtension.equals(FileExtension.PRIMARY_EXTENSION))
			return loadPrimaryResource(file, resourceSet);
		return loadModel(file, resourceSet);		
	}
	
	/**
	 * Loads a model from the given file in the given resource set 
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadModel(File file, ResourceSet resourceSet) {
		URI uri = URI.createPlatformResourceURI(file.getAbsolutePath().toString(), true);			
		Resource resource = loadResource(uri, resourceSet);
		EObject modelRoot = resource.getContents().get(0);
		if (modelRoot!=null) {
			EcoreUtil.resolveAll(modelRoot);
			return Lists.newArrayList(modelRoot);
		}
		return Collections.emptyList();
	}

	/**
	 * Loads the standalone primary resource of the given project in the given resource set
	 * 
	 * @param resourceSet
	 * @param projectName
	 * @return
	 */
	public static EObject loadStandaloneResource(ResourceSet resourceSet, String projectName) {
		URI emfURI = getStandaloneResourceURI(projectName);
		if (resourceSet.getURIConverter().exists(emfURI, null)) {
			Resource standaloneResource = resourceSet.getResource(emfURI, true);
			EObject targetRoot = standaloneResource.getContents().get(0);
			if (targetRoot!=null)
				return targetRoot;
		}
		return null;
	}

	/**
	 * Loads the standalone primary resource of the given project in a new resource set
	 * 
	 * @param projectName
	 * @return
	 */
	public static Resource loadStandaloneResource(String projectName) {
		URI standaloneResourceURI = getStandaloneResourceURI(projectName);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(standaloneResourceURI, true);
		return resource;
	}

	/**
	 * Loads the primary resource of the current project in the given resource set
	 * 
	 * @param projectName
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(String projectName, ResourceSet resourceSet) {
		URI specResourceURI = getPrimaryResourceURI(projectName);
		if (specResourceURI==null)
			throw new RuntimeException ("File not found");
		return loadPrimaryResource(specResourceURI, resourceSet);
	}
	
	/**
	 * Loads the primary resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(File file, ResourceSet resourceSet) {
		URI specResourceURI = computeURI(file, FileExtension.PRIMARY_EXTENSION);
		if (specResourceURI==null)
			throw new RuntimeException ("File not found");
		return loadPrimaryResource(specResourceURI, resourceSet);
	}

	/**
	 * Loads the primary resource with the given URI in the given resource set
	 * 
	 * @param specResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadPrimaryResource(URI specResourceURI, ResourceSet resourceSet) {
		Resource specResource = loadResource(specResourceURI, resourceSet);
		EObject primaryResourceRoot = specResource.getContents().get(0);
		return Lists.newArrayList(primaryResourceRoot);
	}

	/**
	 * Loads the Data resource from the given file in the given resource set
	 * 
	 * @param file
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDataResource(File file, ResourceSet resourceSet) {
		URI dataResourceURI = computeURI(file, FileExtension.PRIMARY_EXTENSION);
		if (dataResourceURI==null)
			throw new RuntimeException ("File not found");
		return loadDataResource(dataResourceURI, resourceSet);
	}
	
	/**
	 * Loads the Data resource with the given URI in the given resource set
	 * 
	 * @param dataResourceURI
	 * @param resourceSet
	 * @return
	 */
	public static List<EObject> loadDataResource(URI dataResourceURI, ResourceSet resourceSet) {
		Resource dataResource = loadResource(dataResourceURI, resourceSet);
		if (!dataResource.getContents().isEmpty()) {
			EObject dataRoot = dataResource.getContents().get(0);
			loadExternalLibrary(resourceSet);
			EcoreUtil2.resolveAll(dataRoot);
			return dataRoot.eContents();
		}
		return Collections.emptyList();
	}
	
	/**
	 * Loads the external library specified in the external library loader extension points
	 * 
	 * @param resourceSet
	 */
	public static void loadExternalLibrary(ResourceSet resourceSet) {
		Map<String, URI> fPackagesInScope = PlatformHelper.getPackagesInScopeURIs();
		for (Map.Entry<String, URI> entry : fPackagesInScope.entrySet()) {
			QualifiedName packageNsURI = QualifiedName.create(entry.getKey());
			URI nsURI = URI.createURI(packageNsURI.toString());
			EPackage ecoreModel = resourceSet.getPackageRegistry().getEPackage(nsURI.toString());
			if (ecoreModel !=null){
				EPackage loadedEPackage = PlatformHelper.loadEPackage(nsURI.toString(), resourceSet);
				Resource packageResource = loadedEPackage.eResource();
				if (packageResource!=null) {
					resourceSet.getResources().add(packageResource);
				}
			}
		}
	}	
}