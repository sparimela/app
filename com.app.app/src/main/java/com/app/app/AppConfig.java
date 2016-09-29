package com.app.app;

import org.apache.cxf.bus.spring.SpringBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;



@Configuration
@ImportResource({"classpath:/META-INF/app-context.xml"})
@ComponentScan({ "com.app" })
public class AppConfig {
	
	@Bean
	public SpringBus cxf() {        
	    return new SpringBus();
	}
}
