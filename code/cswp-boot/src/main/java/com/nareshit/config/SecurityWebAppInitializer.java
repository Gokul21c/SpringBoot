package com.nareshit.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebAppInitializer extends AbstractSecurityWebApplicationInitializer {

	SecurityWebAppInitializer(){
		super(SecurityConfig.class);
	}
}
