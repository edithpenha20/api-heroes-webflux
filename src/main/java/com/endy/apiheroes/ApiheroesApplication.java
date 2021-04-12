package com.endy.apiheroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;

@SpringBootApplication
@EnableDynamoDBRepositories
public class ApiheroesApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiheroesApplication.class, args);
		System.out.println("Super poderes com Webflux");
	}

}
