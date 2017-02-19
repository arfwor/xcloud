package org.learning.consumer.service.support;

import org.learning.consumer.domain.Consumer;
import org.learning.consumer.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

@Service(IConsumerService.SERVICE_ID)
public class ConsumerServiceImpl implements IConsumerService {

    @Autowired
    @LoadBalanced
    private RestOperations restOperations;

    @Override
    public Consumer getConsumer(String id) {
        String url = "http://provider/produces/{id}";
        return restOperations.getForObject(url, Consumer.class, id);
    }

}
