package com.cursorest.eventmanagementapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;



@EntityScan(basePackageClasses = {EventmanagementApi2Application.class,Jsr310Converters.class })
@SpringBootApplication
public class EventmanagementApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(EventmanagementApi2Application.class, args);
	}

}
