package ua.lviv.iot.lab8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.lab8.models.Function;
import ua.lviv.iot.lab8.models.FurnitureType;
import ua.lviv.iot.lab8.models.Screwdriver;
import ua.lviv.iot.lab8.repository.ScrewdriverRepository;

@SpringBootApplication
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(ScrewdriverRepository repository) {
		Screwdriver screwdriver = new Screwdriver("Flash", 220, Function.CUTTING, "Germany", 1000, FurnitureType.WOODEN,
				300);

		return (args) -> {
			repository.save(screwdriver);
			repository.findAll().forEach(obj -> System.out.println(obj));
		};
	}

}
