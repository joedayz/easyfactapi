package pe.joedayz.easyfact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties
@EnableScheduling
@EnableCaching
public class EasyfactApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyfactApplication.class, args);
	}
}
