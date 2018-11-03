package com.innovativeintelli.conversionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.innovativeintelli.conversionservice.controller.RemitValue;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "remit-service")
public interface ConversionServiceProxy {

	@GetMapping("remit-service/api/remitservice/remit/from/{from}/to/{to}")
	public RemitValue remitExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
	
}
