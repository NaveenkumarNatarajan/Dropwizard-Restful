/*
 * Author:NaveenKumar
 */
package org.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.service.ConfigDetail;


@Path("api.org.contentservice/v1")
public class ContentResource {

private final ConfigDetail dataSource;
	
	public ContentResource (ConfigDetail  dataSource) {
		this.dataSource = dataSource;
	}
	
	@GET
	@Path("/greetings")
	public String printHello(){
		return "hello world";
	}
	
	@GET
	@Path("/getDBCredential")
	public String printDBCredential(){
		return "IP Address:"+dataSource.getDB_Server_IP_Address()+";User Name:"+dataSource.getUserName()+
				";Password:"+dataSource.getPassword();
	}
	
	
}
