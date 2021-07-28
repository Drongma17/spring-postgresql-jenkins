package com.thonglam.postgresqljpacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class SpringbootPostgresqlHibernateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlHibernateCrudApplication.class, args);



		RestTemplate restTemplate=new RestTemplate();
		List response = restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts", List.class);
		response.forEach(post->{
			System.out.println(post);
			System.out.println("");
		});
	}

}
