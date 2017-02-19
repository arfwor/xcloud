package org.learning.consumer.service;

import org.learning.consumer.domain.Consumer;

public interface IConsumerService {

    String SERVICE_ID = "consumer.consumerService";

    Consumer getConsumer(String id);
}
