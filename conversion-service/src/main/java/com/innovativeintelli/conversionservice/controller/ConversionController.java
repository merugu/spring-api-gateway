package com.innovativeintelli.conversionservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.innovativeintelli.conversionservice.domain.ConversionBean;
import com.innovativeintelli.conversionservice.proxy.ConversionServiceProxy;

@RestController
@RequestMapping("/api/conversion")
public class ConversionController {
	
	@Autowired
	private ConversionServiceProxy conversionServiceProxy;
	
	@GetMapping("/convert/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean convertCurrency(@PathVariable String from,
			@PathVariable String to, @PathVariable BigDecimal quantity) {
		RemitValue remitValue = conversionServiceProxy.remitExchangeValue(from, to);
		return new ConversionBean(remitValue.getId(), remitValue.getFrom(), remitValue.getTo(), remitValue.getConversionMultiple(), quantity, quantity.multiply(remitValue.getConversionMultiple()),remitValue.getPort());
	}
	
}
