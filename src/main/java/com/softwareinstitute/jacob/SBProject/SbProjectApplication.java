package com.softwareinstitute.jacob.SBProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProjectApplication.class, args);
	}

	@GetMapping("/getcat")
	public String catResponse(){
		Cat cat1 = new Cat("ella",11);

		return cat1.getJsonObjectOfCat();
	}

}
