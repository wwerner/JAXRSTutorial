package net.wolfgangwerner.tutorial.jaxrs.model;

import java.util.Map;

public class Movie {
	private String title;
	private Map<String, Actor> cast;

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public Map<String, Actor> getCast() { return cast; }
	public void setCast(Map<String, Actor> cast) { this.cast = cast; }
}