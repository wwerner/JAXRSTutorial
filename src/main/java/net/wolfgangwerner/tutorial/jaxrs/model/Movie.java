package net.wolfgangwerner.tutorial.jaxrs.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement
@XmlType(propOrder={"title", "cast"})
public class Movie {
	private String title;
	private Map<String, Actor> cast;

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public Map<String, Actor> getCast() { return cast; }
	public void setCast(Map<String, Actor> cast) { this.cast = cast; }
}