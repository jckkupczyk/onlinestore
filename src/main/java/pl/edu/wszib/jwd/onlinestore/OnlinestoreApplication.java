package pl.edu.wszib.jwd.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:db.properties")
@SpringBootApplication
public class OnlinestoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlinestoreApplication.class, args);
    }

}
