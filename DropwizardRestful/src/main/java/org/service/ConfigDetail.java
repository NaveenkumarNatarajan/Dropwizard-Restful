/*
 * Author:NaveenKumar
 */
package org.service;

import javax.validation.constraints.NotNull;


public class ConfigDetail {

	@NotNull
	private String userName;
	@NotNull
	private String Password;
	@NotNull
	private String database;
	@NotNull
	private String DB_Server_IP_Address;
	@NotNull
	private String url;
	@NotNull
	private String driver;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		database = database;
	}
	public String getDB_Server_IP_Address() {
		return DB_Server_IP_Address;
	}
	public void setDB_Server_IP_Address(String dB_Server_IP_Address) {
		DB_Server_IP_Address = dB_Server_IP_Address;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	

}
