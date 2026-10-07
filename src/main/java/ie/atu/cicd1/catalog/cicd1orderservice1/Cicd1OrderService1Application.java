package ie.atu.cicd1.catalog.cicd1orderservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
public class Cicd1OrderService1Application {

    public static void main(String[] args) {
        SpringApplication.run(Cicd1OrderService1Application.class, args);
    }

}
