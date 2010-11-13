package net.wolfgangwerner.tutorial.jaxrs.application;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"application-context.xml");
		ctx.registerShutdownHook();
		ctx.start();
	}
}