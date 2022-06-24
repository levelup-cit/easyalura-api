package br.com.alura.easyalura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.SpringDataJacksonConfiguration;

@SpringBootApplication
public class EasyaluraApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyaluraApplication.class, args);
	}

}
