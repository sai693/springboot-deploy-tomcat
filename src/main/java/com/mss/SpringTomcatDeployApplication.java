package com.mss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTomcatDeployApplication {

	@GetMapping("/get")
	public String get()
	{
		return "Deployed in  a TomCat Server";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTomcatDeployApplication.class, args);
	}

}
