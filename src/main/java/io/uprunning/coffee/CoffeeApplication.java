package io.uprunning.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class CoffeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeApplication.class, args);
	}

}
