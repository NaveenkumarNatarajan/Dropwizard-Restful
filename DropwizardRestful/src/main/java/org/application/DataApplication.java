/*
 * Author:NaveenKumar
 */package org.application;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.eclipse.jetty.servlets.CrossOriginFilter;
import org.resource.ContentResource;
import org.service.ServiceConfiguration;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;

import java.util.EnumSet;

public class DataApplication extends Application<ServiceConfiguration>{
	
	public static void main(String[] args) throws Exception {
        new DataApplication().run(args);
    }
	
	@Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {
		
    }

	@Override
	public void run(ServiceConfiguration conf, Environment environment) throws Exception {
		
		System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
		final FilterRegistration.Dynamic cors =
		        environment.servlets().addFilter("CORS", CrossOriginFilter.class);

		// Configure CORS parameters
	    cors.setInitParameter("allowedOrigins", "*");
	    cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
	    cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");

		    // Add URL mapping
		cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");	    
		final ContentResource contentResource = new ContentResource(conf.getDbCredential());
		environment.jersey().register(contentResource);
	}
	
}
