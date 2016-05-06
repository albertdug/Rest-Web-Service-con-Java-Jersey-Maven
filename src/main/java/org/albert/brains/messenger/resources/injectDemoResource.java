package org.albert.brains.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class injectDemoResource {

	@GET
	@Path("annotations")
	public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam,
											@HeaderParam("headerparam") String headerParam,
											@CookieParam("name") String cookie){
		return "Matrix Param: " + matrixParam + " - Header Param: " + headerParam + " - Cookie: " + cookie ;
	}
	
	@GET
	@Path("context")
	public String getParamsUsingContext(@Context UriInfo uniInfo){
		String path = uniInfo.getAbsolutePath().toString();
		return "path: " + path;
	}

}
