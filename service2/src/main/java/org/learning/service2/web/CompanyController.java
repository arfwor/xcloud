package org.learning.service2.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("company")
public class CompanyController {

	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);

	@Value("${basic.shiro.cookie.rme.cipher.key}")
	private String from;

	@RequestMapping("/from")
	public String from() {
		return from;
	}
}
