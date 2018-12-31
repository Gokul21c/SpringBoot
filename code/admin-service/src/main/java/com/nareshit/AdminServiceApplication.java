package com.nareshit;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@EnableResourceServer
@EnableAuthorizationServer
@RestController
public class AdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
	}
	
	@Bean
	public HibernateJpaSessionFactoryBean sessionfactory() {
		return new HibernateJpaSessionFactoryBean();
	}
	
	@RequestMapping("/profile")
	public Principal user(Principal p) {
		return p;
	}
	
	
	
	
}
