package com.admfactory.jersey;

import java.util.HashMap;
import java.util.Hashtable;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class JerseyHelloWorldController {

    @GET
    @Path("api/{name}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Object get(@PathParam("name") String name) {
	Hashtable<String, String> response = new Hashtable<String, String>();

	response.put("message", "Hello " + name + " !");

	return response;
    }

    @POST
    @Path("api")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public Object post(HashMap<String, String> request) {
	Hashtable<String, String> response = new Hashtable<String, String>();

	String name = request.get("name");

	response.put("message", "Hello " + name + " !");

	return response;
    }
}
