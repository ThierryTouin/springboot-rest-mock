package fr.touin.thierry.service.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@ComponentScan

// SPRING_SECURITY : debut 
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class})
//@EnableAutoConfiguration
// SPRING_SECURITY : fin 

@ImportResource({ "classpath:/applicationContext.xml" })
public class Application {

//	@Bean
//	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
//		return new ApplicationSecurity();
//	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		application.run(args);
	}
}
