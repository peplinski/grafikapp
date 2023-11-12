package pl.schedule.grafikapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class GrafikappApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrafikappApplication.class, args);

        String mongodbUri = System.getenv("MONGODB_NAME");
        System.out.println("MONGODB_NAME: " + mongodbUri);
    }

}
