package org.Transaction.Evidence;

import javax.annotation.Resource;

import org.Transaction.Evidence.service.FileService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication

public class MiltiplesarchivosApplication implements CommandLineRunner {
    
	@Resource
	FileService fileService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MiltiplesarchivosApplication.class, args);
	}
	
	@Override
	public void run(String... arg) throws Exception{
		//fileService.deleteAll();
		//fileService.init();
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
			}
		};
	}

}
