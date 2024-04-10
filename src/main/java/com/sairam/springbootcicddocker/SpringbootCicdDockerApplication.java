package com.sairam.springbootcicddocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdDockerApplication.class, args);
	}

	@GetMapping("/about")
	public String getAbout(@RequestParam String info){
		return "Responding from docker container "+info;
	}
}
