package com.innovativeintelli.remitservice.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovativeintelli.remitservice.RemitValue;

@RestController
@RequestMapping("/api/remitservice/")
public class RemitController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Environment environment;
	
	@GetMapping("/remit/from/{from}/to/{to}")
	public RemitValue remitExchangeValue(@PathVariable String from,@PathVariable String to) {
		logger.info(from + " Remit Service " + to);
		RemitValue remitValue=  new RemitValue(1L, "USD", "INR", BigDecimal.valueOf(73.82));
		remitValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return remitValue;
	}

}
