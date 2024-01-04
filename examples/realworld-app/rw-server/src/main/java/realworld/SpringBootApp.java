package realworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import realworld.config.DefaultProperties;

@SpringBootApplication
public class SpringBootApp {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootApp.class);
		app.setDefaultProperties(DefaultProperties.getDefaultProperties());
		app.run(args);
	}
}
