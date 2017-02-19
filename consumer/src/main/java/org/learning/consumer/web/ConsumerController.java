package org.learning.consumer.web;

import org.learning.consumer.domain.Consumer;
import org.learning.consumer.service.IConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
//@RequestMapping("consumer")
public class ConsumerController {

	private Logger logger = LoggerFactory.getLogger(ConsumerController.class);

	@Autowired
	@Qualifier(IConsumerService.SERVICE_ID)
	private IConsumerService consumerService;

	@RequestMapping(method = GET, value = "/consumes/{id}",
//			consumes = { APPLICATION_JSON_UTF8_VALUE },
			produces = { APPLICATION_JSON_UTF8_VALUE })
	public Consumer consumes(@PathVariable String id) {
		if (logger.isDebugEnabled()) {
			logger.debug("consumer: " + id);
		}
		return consumerService.getConsumer(id);
	}
}
