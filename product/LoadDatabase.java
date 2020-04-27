package product;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase{
	
	@Bean
	CommandLineRunner initDatabase(ProductRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Product("Art Book", 25.99, "Barnes and Noble", 3)));
			log.info("Preloading " + repository.save(new Product("Math Book", 45.98, "TTU Bookstore", 6)));
		};
	}
}