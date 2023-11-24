package br.com.rd.gestaoTransporte;

import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestaoTransporteServiceApplication {
	
	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(GestaoTransporteServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GestaoTransporteServiceApplication.class, args);
		log.info("START!................................................................", new Date());
	}

}
