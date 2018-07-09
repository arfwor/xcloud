package org.learning.cloud.consumer.service;

import org.learning.cloud.consumer.domain.Consumer;

public interface IConsumerService {

    String SERVICE_ID = "consumer.consumerService";

    Consumer getConsumer(String id);
}
