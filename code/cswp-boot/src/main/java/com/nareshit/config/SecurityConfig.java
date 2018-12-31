package com.nareshit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("richard").password("test").roles("admin")
		.and().withUser("wilson").password("test").roles("user");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.regexMatchers("/admin/*").hasRole("admin")
		.regexMatchers("/doctor/*").hasRole("doctor")
		.and()
		.formLogin()
		 .loginProcessingUrl("/login")
		 .loginPage("/admin")
		 .defaultSuccessUrl("/")
		 .and()
		 .logout()
		 .logoutSuccessUrl("/")
		 .and().csrf().disable();
	}
}
