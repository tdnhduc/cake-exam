package com.cake.origination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) // TODO: remove later
public class OriginationSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OriginationSvcApplication.class, args);
	}

}
