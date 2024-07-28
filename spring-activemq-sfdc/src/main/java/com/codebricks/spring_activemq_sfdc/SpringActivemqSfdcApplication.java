package com.codebricks.spring_activemq_sfdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringActivemqSfdcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActivemqSfdcApplication.class, args);
	}

}
