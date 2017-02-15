package org.dslforge.xtext.common;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.dirigible.ide.common.CommonParameters;
import org.eclipse.dirigible.ide.repository.RepositoryFacade;
import org.eclipse.dirigible.repository.api.IRepository;
import org.eclipse.dirigible.repository.api.IRepositoryPaths;
import org.eclipse.dirigible.repository.api.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

public class DirigibleWorkspaceHandler extends URIHandlerImpl {
	
	public DirigibleWorkspaceHandler() {
		super();
	}
	
	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		IResource resource = getFromRepository(uri);  
		byte[] content = resource.getContent();
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(content);
		return byteArrayInputStream;
	}
	
	private IResource getFromRepository(URI uri) {
		String fileString = uri.toPlatformString(true);
		IRepository repository = RepositoryFacade.getInstance().getRepository();
		String resourcePath = 
				IRepositoryPaths.DB_DIRIGIBLE_USERS + CommonParameters.getUserName() +
				IRepositoryPaths.SEPARATOR +
				IRepositoryPaths.WORKSPACE_FOLDER_NAME + fileString;
		IResource resource = repository.getResource(resourcePath);
		return resource;
	}
	
	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
		return super.createOutputStream(uri, options);
	}
	
	@Override
	public boolean canHandle(URI uri) {
		return super.canHandle(uri);
	}
}