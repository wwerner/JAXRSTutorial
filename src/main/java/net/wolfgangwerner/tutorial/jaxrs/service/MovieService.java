package net.wolfgangwerner.tutorial.jaxrs.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public class MovieService {
	
	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String hello() { return "hello world"; }
}