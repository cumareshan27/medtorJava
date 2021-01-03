package com.learn.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.learn.api.EmployeeApi;


@SpringBootApplication
@ComponentScan(basePackageClasses = EmployeeApi.class)

public class FirstApiApplication {

	public static void main(String[] args) {
		System.out.println("Boot Application Started..!!");
		SpringApplication.run(FirstApiApplication.class, args);
	}

}
