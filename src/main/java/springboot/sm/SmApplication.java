package springboot.sm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmApplication.class, args);
		System.out.println("SM");
	}

}
