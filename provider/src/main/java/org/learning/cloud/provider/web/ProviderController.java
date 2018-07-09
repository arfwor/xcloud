package org.learning.cloud.provider.web;

import org.learning.cloud.provider.domain.Produces;
import org.learning.cloud.provider.service.IProviderService;
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
//@RequestMapping("provider")
public class ProviderController {

	private static final Logger logger = LoggerFactory.getLogger(ProviderController.class);
	@Autowired
	@Qualifier(IProviderService.SERVICE_ID)
	private IProviderService providerService;

	@RequestMapping(method = GET, value = "/produces/{id}",
//			consumes = { APPLICATION_JSON_UTF8_VALUE },
			produces = { APPLICATION_JSON_UTF8_VALUE })
	public Produces produces(@PathVariable String id) {
		if (logger.isDebugEnabled()) {
			logger.debug("produces: " + id);
		}
		return providerService.getProduces(id);
	}
}
