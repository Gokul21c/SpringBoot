package com.nareshit;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class CswpBootApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(CswpBootApplication.class);
	
	@Autowired
	DataSource ds;
	
	@Autowired
	HikariDataSource hds;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CswpBootApplication.class, args);
	}
	
	@Bean
	public HibernateJpaSessionFactoryBean sessionfactory() {
		return new HibernateJpaSessionFactoryBean();
	}

	@Override
	public void run(String... args) throws Exception {
		logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Warning log");
        logger.error("Error log");
		System.out.println("current ds is:\t"+ds);
		System.out.println("pool details:\t"+hds.getConnectionTimeout());
		
	}
	
	
}

