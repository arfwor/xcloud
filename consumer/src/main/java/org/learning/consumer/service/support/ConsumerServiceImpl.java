package org.learning.consumer.service.support;

import org.learning.consumer.domain.Consumer;
import org.learning.consumer.service.IConsumerService;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Service(IConsumerService.SERVICE_ID)
public class ConsumerServiceImpl implements IConsumerService {

    @Bean
    @LoadBalanced
    public RestOperations getRestOperations() {
        return new RestTemplate();
    }

    public Consumer getConsumer(String id) {
        System.out.println(getRestOperations());
        return null;
    }

}
