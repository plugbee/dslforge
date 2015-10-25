package org.dslforge.authentication.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Gemini JPA sample activator class
 * 
 * @author mkeith
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class Activator implements BundleActivator /*, ServiceTrackerCustomizer*/ {

    private BundleContext ctx;
    private ServiceTracker emfTracker;

    public void start(BundleContext context) throws Exception {
        ctx = context;
		System.out.println("[DSLFORGE] " + "org.dslforge.authentication" + " : started!");
        /* We are in the same bundle as the persistence unit so the services should be 
         * available when we start up (if nothing bad happened) and the tracker is really 
         * just saving us the lookup, but this is the idea of how you would listen for a 
         * persistence unit coming from another bundle.
         */
//        emfTracker = new ServiceTracker(ctx, EntityManagerFactory.class.getName(), this);
//        emfTracker.open();
    }

    public void stop(BundleContext context) throws Exception {
 //      emfTracker.close();
		System.out.println("[DSLFORGE] " + "org.dslforge.authentication" + " : stopped!");    	
    }
    
//    /*========================*/
//    /* ServiceTracker methods */
//    /*========================*/
//    public Object addingService(ServiceReference ref) {
//        Bundle b = ref.getBundle();
//        Object service = b.getBundleContext().getService(ref);
//        String unitName = (String)ref.getProperty(EntityManagerFactoryBuilder.JPA_UNIT_NAME);
//        if (unitName.equals("dslforge")) {
//            new AuthenticationService().run((EntityManagerFactory)service);
//        }
//        return service;
//    }
//    public void modifiedService(ServiceReference ref, Object service) {}
//    public void removedService(ServiceReference ref, Object service) {}    
}