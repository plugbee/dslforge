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
package org.dslforge.workbench.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;


public class BasicWorkbenchView extends ViewPart {

	public static final String ID = "org.dslforge.views.basicworkbenchview";
	
	private TableViewer viewer;

	/**
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */
	class ViewContentProvider implements IStructuredContentProvider {

		private static final long serialVersionUID = 1L;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		
		private static final long serialVersionUID = 1L;

		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
	     final Browser b = new Browser(parent, SWT.NONE);
	       // b.setUrl("www.dslforge.com");
	     String content = "<!doctype html><html lang=\"en\"><head> <meta charset=\"utf-8\"><title>The Brand New Web Site</title><meta name=\"description\" content=\"The Brand New Web Site\"><meta name=\"author\" content=\"Barattalo.it\"><link rel=\"stylesheet\" href=\"css/styles.css?v=1.0\"><!--[if lt IE 9]><script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script><![endif]--></head><body> <script src=\"js/scripts.js\"></script></body></html>";
	        b.setText(content);
	        b.addProgressListener(new ProgressListener() {
	            @Override
	            public void completed(ProgressEvent event) {
	                System.out.println("Page loaded");
	            //    System.out.println(b.execute("alert(\"1\");"));
	            }
	            @Override
	            public void changed(ProgressEvent event) {
	            }
	        });
		
//		OpenCheatSheetAction action = new OpenCheatSheetAction("org.dslforge.rap.workbench.cheatsheet2");
//		action.run();
		//CheatSheetView view = ViewUtilities.showCheatSheetView();
		
		
		
		
//	    parent.getShell().setText( "CkEditor Demo" );
//	    parent.setLayout( new GridLayout( 1, false ) );
//	    // CkEditor
//	    final CKEditor ckEditor = new CKEditor( parent, SWT.NONE );
//	    ckEditor.setFont( new Font( parent.getDisplay(), "fantasy", 19, 0 ) );
//	    ckEditor.setText( "Hello Fantasy Font" );
//	    ckEditor.setLayoutData( new GridData() );
//	    ckEditor.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
//	    ToolBar toolbar = new ToolBar( parent, SWT.FLAT );
//	    ToolItem printBtn = new ToolItem( toolbar, SWT.PUSH );
//	    printBtn.setText( "Print" );
//	    printBtn.addSelectionListener( new SelectionAdapter() {
//	      @Override
//	      public void widgetSelected( SelectionEvent e ) {
//	        System.out.println( ckEditor.getText() );
//	      }
//	    } );
//	    ToolItem destrBtn = new ToolItem( toolbar, SWT.PUSH );
//	    destrBtn.setText( "Dispose" );
//	    destrBtn.addSelectionListener( new SelectionAdapter() {
//	      @Override
//	      public void widgetSelected( SelectionEvent e ) {
//	        ckEditor.dispose();
//	      }
//	    } );
//	    ToolItem fontBtn = new ToolItem( toolbar, SWT.PUSH );
//	    fontBtn.setText( "Font" );
//	    fontBtn.addSelectionListener( new SelectionAdapter() {
//	      @Override
//	      public void widgetSelected( SelectionEvent e ) {
//	        ckEditor.setFont( new Font( PlatformUI.getWorkbench().getDisplay(), "serif", 9, 0 ) );
//	      }
//	    } );
//	    ToolItem clearBtn = new ToolItem( toolbar, SWT.NONE );
//	    clearBtn.setText( "Clear" );
//	    clearBtn.addSelectionListener( new SelectionAdapter() {
//	      @Override
//	      public void widgetSelected( SelectionEvent e ) {
//	        ckEditor.setText( "" );
//	      }
//	    } );
//        
	}

	// helping classes
	// ////////////////

	private List<Point> points = new ArrayList<Point>();
	private Image image;
	
	/**
	 * 3. We use a MouseListener to react to the user's clicks. A left click
	 * adds a Point. Any other click removes a point. The click triggers a
	 * redraw operation.
	 */
	private final class CanvasMouseListener extends MouseAdapter {
		private static final long serialVersionUID = 1L;

		@Override
		public void mouseDown(MouseEvent e) {
			if (e.button == 1) {
				Point p = new Point(e.x, e.y);
				points.add(p);
				System.out.println("Added point: " + p);
				((Canvas) e.widget).redraw();
			} else {
				if (!points.isEmpty()) {
					Point p = points.remove(points.size() - 1);
					System.out.println("Removed point: " + p);
					((Canvas) e.widget).redraw();
				}
			}
		}
	}

	/**
	 * 4. We use a PointListener to draw on the Canvas. The listener has access
	 * to a GC object. This is our 'brush' for drawing on the canvas. We draw
	 * the image first and then a sequence of lines, using the stored points
	 * (step 3).
	 */
	private final class CanvasPaintListener implements PaintListener {
		private static final long serialVersionUID = 1L;

		public void paintControl(PaintEvent event) {
			GC gc = event.gc;
			gc.drawImage(image, 0, 0);
			int width = 4;
			gc.setLineWidth(width);
			gc.setForeground(event.widget.getDisplay().getSystemColor(
					SWT.COLOR_GREEN));
			if (points.size() == 1) { // only a single point: draw a circle
				Point start = points.get(0);
				int offset = width / 2;
				gc.drawOval(start.x - offset, start.y - offset, width, width);
			} else { // multiple points: draw lines
				Point start = null;
				for (Point p : points) {
					if (start != null) {
						gc.drawLine(start.x, start.y, p.x, p.y);
					}
					start = p;
				}
			}
		}
	}

	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
}
