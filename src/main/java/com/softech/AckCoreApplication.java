package com.softech;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.softech.Controller.mainController;

@SpringBootApplication
public class AckCoreApplication {
	
	static Logger logger=Logger.getLogger(mainController.class);
	public static void main(String[] args) {
		SpringApplication.run(AckCoreApplication.class, args);
		logger.info("core app started");
		System.out.println("core app started....");
	}

}
