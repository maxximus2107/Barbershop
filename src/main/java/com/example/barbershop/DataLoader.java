package com.example.barbershop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.barbershop.model.HairStyle;
import com.example.barbershop.repository.HairStyleRepository;

@Configuration
public class DataLoader {

	@Bean
	CommandLineRunner initDatabase(HairStyleRepository repository) {
		return args -> {
			repository.save(new HairStyle("Buzz Cut", "A very short haircut.", 10.0, "buzzcut.jpg"));
			repository.save(new HairStyle("Crew Cut", "A short, stylish cut.", 15.0, "crewcut.jpg"));
			repository.save(new HairStyle("Pompadour", "A classic pompadour.", 20.0, "pompadour.jpg"));
		};
	}
}
