package com.bahadirmemis.springboot;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.entity.Urun;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import com.bahadirmemis.springboot.service.entityservice.UrunEntityService;
import java.util.Locale;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringBootTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTrainingApplication.class, args);
	}
}
