
package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/order")
    public String getOrder() {
        //String user = restTemplate().getForObject("http://localhost:9091/user", String.class); //Order Service Talk to User-service
        String user = restTemplate().getForObject("http://user-service:9091/user", String.class);
        return "Order placed by -> " + user;
    }
}
