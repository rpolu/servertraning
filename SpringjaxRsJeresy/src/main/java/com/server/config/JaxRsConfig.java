package com.server.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.config.SwaggerConfigLocator;
import io.swagger.jaxrs.config.SwaggerContextService;

@Component
@ApplicationPath("/api")
public class JaxRsConfig extends ResourceConfig {

	public JaxRsConfig() {
		BeanConfig swaggerConfig = new BeanConfig();
		swaggerConfig.setBasePath("/api");
		swaggerConfig.setResourcePackage("com.server.rest");
		swaggerConfig.setPrettyPrint(true);
		swaggerConfig.setScan(true);
		SwaggerConfigLocator.getInstance().putConfig(SwaggerContextService.CONFIG_ID_DEFAULT, swaggerConfig);
		packages("com.server");
	}
}
