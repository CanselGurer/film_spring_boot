package com.bilgeadam.film.yonetim.sistemi.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Film {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
@NotEmpty
@NotNull
	private String ad;
	private LocalDate vizyonTarihi;
	private BigDecimal hasilat;
	
}
