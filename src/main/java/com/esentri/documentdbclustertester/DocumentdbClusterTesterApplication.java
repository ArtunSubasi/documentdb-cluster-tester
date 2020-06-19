package com.esentri.documentdbclustertester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DocumentdbClusterTesterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentdbClusterTesterApplication.class, args);
	}

}
