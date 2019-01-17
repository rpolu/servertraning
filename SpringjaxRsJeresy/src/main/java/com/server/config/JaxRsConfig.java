package com.server.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
@Component
@ApplicationPath("/api")
public class JaxRsConfig extends ResourceConfig{
	public JaxRsConfig() {
		packages("com.server.rest");
	}

}
