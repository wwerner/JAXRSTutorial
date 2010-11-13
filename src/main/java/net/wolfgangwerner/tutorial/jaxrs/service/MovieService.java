package net.wolfgangwerner.tutorial.jaxrs.service;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import net.wolfgangwerner.tutorial.jaxrs.model.Actor;
import net.wolfgangwerner.tutorial.jaxrs.model.Movie;

public class MovieService {
	private Map<String, Movie> movieStore = new HashMap<String, Movie>();

	public MovieService() {
		super();

		Movie bluesBrothers = new Movie();
		bluesBrothers.setTitle("Blues Brothers");
		
		Actor dan = new Actor();
		dan.setName("Dan Aykroyd");

		Actor john = new Actor();
		john.setName("John Belushi");

		Actor carrie = new Actor();
		carrie.setName("Carrie Fisher");

		Map<String, Actor> cast = new HashMap<String, Actor>();
		cast.put("Jake Blues", john);
		cast.put("Elwood Blues", dan);
		cast.put("Mystery Woman", carrie);


		bluesBrothers.setCast(cast);

		movieStore.put("bluesBrothers", bluesBrothers);
	}
	
	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String hello() { return "hello world"; }
	
	@GET
	@Path("/movies/{id}")
	@Produces({"application/json", "text/xml"})
	public Movie getMovie(@PathParam("id") String id) { return movieStore.get(id); }
	
	@GET
	@Path("/movies")
	@Produces({"application/json", "text/xml"})
	public Collection<Movie> getMovie() { return movieStore.values(); }
	
	@POST
	@Path("/movies/{id}")
	@Consumes({"application/json", "text/xml"})
	public Response postMovie(@PathParam("id") String id, Movie movie) { 
		movieStore.put(id, movie); 
		return Response.created(URI.create("/movies/" + id)).build();	
	}
}