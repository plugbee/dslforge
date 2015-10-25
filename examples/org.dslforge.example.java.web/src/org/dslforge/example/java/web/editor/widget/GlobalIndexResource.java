package org.dslforge.example.java.web.editor.widget;

import org.eclipse.rap.ui.resources.IResource;

public final class GlobalIndexResource implements IResource {

  public String getCharset() {
    return "UTF-8";
  }

  public ClassLoader getLoader() {
    return this.getClass().getClassLoader();
  }

  public String getLocation() {
    return "src-js/org/dslforge/example/java/web/global-index.js"; //$NON-NLS-1$
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
