package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebProjApplication.class, args);
		
		System.out.println("working");
	}

}
