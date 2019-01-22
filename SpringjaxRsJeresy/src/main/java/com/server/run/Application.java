package com.server.run;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.StringVendorExtension;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.*")
@EnableSwagger2
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_12).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.server")).paths(PathSelectors.any()).build()
				.pathMapping("/").useDefaultResponseMessages(false);
	}

	public ApiInfo apiInfo() {
		StringVendorExtension vendorExtension = new StringVendorExtension("", "");
		Collection<VendorExtension> vendorExtensions = new ArrayList<>();
		vendorExtensions.add(vendorExtension);

		Contact contactInfo = new Contact("AtechRef", "www.atechref.com", "atechsoft@gmail.com");

		return new ApiInfo("SpringBoot-Swagger2-JaxRS",
				"Example project showing how to integrate spring boot "
						+ "web app using jaxrs instead of springmvc with swagger and springfox.",
				"1.0", "For Demo only", contactInfo, "Apache 2.0", "www.apache.org", vendorExtensions);
	}

}
