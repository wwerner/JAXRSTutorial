package net.wolfgangwerner.tutorial.jaxrs.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Actor {
	private String name;

	@XmlElement(name="who")
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}