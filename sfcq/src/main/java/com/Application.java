package com;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.context.support.StandardServletEnvironment;

@EnableWebSecurity
@SpringBootApplication
@PropertySource("classpath:postgres-config.properties")
public class Application {
	
	private static Logger log = LoggerFactory.getLogger(Application.class);
	
	@Value("${spring.profiles.active}")
    String profile ;

    public static void main(String[] args) {
       // SpringApplication.run(Application.class, args);
        SpringApplication springApplication = new SpringApplication(Application.class);
        ApplicationContext ctx = springApplication.run(args);
        
        log.debug("Let's inspect the profiles provided by Spring Boot:");
        String profiles[] = ctx.getEnvironment().getActiveProfiles();
        for (int i = 0; i < profiles.length; i++)
            log.debug("profile=" + profiles[i]);

        log.debug("Let's inspect the properties provided by Spring Boot:");
        MutablePropertySources propertySources = ((StandardServletEnvironment) ctx.getEnvironment())
                .getPropertySources();
        Iterator<org.springframework.core.env.PropertySource<?>> iterator = propertySources.iterator();
        while (iterator.hasNext()) {
            Object propertySourceObject = iterator.next();
            if ( propertySourceObject instanceof org.springframework.core.env.PropertySource ) {
                org.springframework.core.env.PropertySource<?> propertySource = (org.springframework.core.env.PropertySource<?>) propertySourceObject;
                log.debug("propertySource=" + propertySource.getName() + " values=" + propertySource.getSource() + "class=" + propertySource.getClass());           
            }         
        }
    }
}
