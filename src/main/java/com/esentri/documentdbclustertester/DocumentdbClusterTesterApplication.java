package com.esentri.documentdbclustertester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DocumentdbClusterTesterApplication {

	public static void main(String[] args) {
		System.setProperty ("javax.net.ssl.trustStore","src/main/resources/rds-2019-truststore.jks");
		System.setProperty ("javax.net.ssl.trustStorePassword","mongoit");
		SpringApplication.run(DocumentdbClusterTesterApplication.class, args);
	}

}
