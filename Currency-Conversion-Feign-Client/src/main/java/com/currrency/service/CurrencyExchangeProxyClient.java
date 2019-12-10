package com.currrency.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currrency.model.CurrencyExchangeModel;

@FeignClient(name = "CURRENCY-EXCHANGE",url = "localhost:1111" )
public interface CurrencyExchangeProxyClient {

	@GetMapping(value ="/findCurrencyFromAndTo/from/{from}/to/{to}" )
	public CurrencyExchangeModel invokeCurrencyExchangeApi(@PathVariable("from") String from,@PathVariable("to")String to);
			
}
