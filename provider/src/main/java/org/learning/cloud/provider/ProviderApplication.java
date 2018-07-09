package org.learning.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:/META-INF/*/service/*.service.xml",
        "classpath*:/META-INF/*/servlet/*.servlet.xml"})
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
