/*
 * Author:NaveenKumar
 */
package org.service;

import io.dropwizard.Configuration;


public class ServiceConfiguration extends Configuration {

	private ConfigDetail dbCredential;
	
	public ConfigDetail getDbCredential() {
		return dbCredential;
	}

	public void setDbCredentials(Configuration ConfigDetail) {
		this.dbCredential = dbCredential;
	}
}
