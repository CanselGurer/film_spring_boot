package com.bilgeadam.film.yonetim.sistemi.configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bilgeadam.film.yonetim.sistemi.entity.Film;
import com.bilgeadam.film.yonetim.sistemi.entity.repository.FilmRepository;



@Configuration
public class FilmConfiguration {
	@Bean
	CommandLineRunner runner(FilmRepository repository) { //dependency injection
		return args -> {
			List<Film> filmler= List.of(
		new Film(1, "Tarzan",LocalDate.of(2000, Month.FEBRUARY,12), BigDecimal.valueOf(1234567.54)),
		new Film(2, "Hulk", LocalDate.of(2000, Month.FEBRUARY, 15), BigDecimal.valueOf(1454844.54)),
		new Film(3, "Superman", LocalDate.of(2000, Month.FEBRUARY, 16), BigDecimal.valueOf(587715.54))
		);
			repository.saveAll(filmler);
			
	};
	
}
}
