package bri4ki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Bri4kiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bri4kiApplication.class, args);
	}

}
