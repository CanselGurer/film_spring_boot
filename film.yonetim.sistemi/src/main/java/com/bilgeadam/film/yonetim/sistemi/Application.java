package com.bilgeadam.film.yonetim.sistemi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bilgeadam.film.yonetim.sistemi.entity.Film;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		Film film =new Film(0, "Tarzan", LocalDate.of(2022, Month.JANUARY, 3), BigDecimal.valueOf(123456789.65));
//		Film f2 =Film.builder()
//		.ad("Hulk")
//		.vizyonTarihi(LocalDate.of(2022, Month.JANUARY, 3))
//		.hasilat(BigDecimal.valueOf(123456789.65))
//		build();
	}

}
