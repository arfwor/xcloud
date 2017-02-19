package org.learning.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@ImportResource({"classpath*:/META-INF/*/service/*.service.xml",
        "classpath*:/META-INF/*/servlet/*.servlet.xml"})
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Application {

    @Bean
    @LoadBalanced
    public RestOperations getRestOperations() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
