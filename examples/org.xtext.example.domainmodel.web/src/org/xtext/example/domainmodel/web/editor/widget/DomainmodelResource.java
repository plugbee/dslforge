package org.xtext.example.domainmodel.web.editor.widget;

import org.eclipse.rap.ui.resources.IResource;

public final class DomainmodelResource implements IResource {

  public String getCharset() {
    return "UTF-8";
  }

  public ClassLoader getLoader() {
    return this.getClass().getClassLoader();
  }

  public String getLocation() { 	
    return "src-js/org/xtext/example/domainmodel/web/Domainmodel.js"; //$NON-NLS-1$
  }
  
  public boolean isExternal() {
    return false;
  }

  public boolean isJSLibrary() {
    return true;
  }

  public boolean isAccessible() {
    return false;
  }
}
