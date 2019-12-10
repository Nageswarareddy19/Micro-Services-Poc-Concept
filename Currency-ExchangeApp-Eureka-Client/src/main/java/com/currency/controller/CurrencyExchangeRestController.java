package com.currency.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.model.CurrencyExchangeModel;
import com.currency.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeRestController {

	@Autowired
	private CurrencyExchangeService service;

	@GetMapping(value = "findCurrencyFromAndTo/from/{from}/to/{to}", produces = "application/json")
	public CurrencyExchangeModel findCurrecnyFromAndTo(@PathVariable("from") String from,
			@PathVariable("to") String to) {
		CurrencyExchangeModel model = service.findCurrencyFromAndTo(from, to);

		return model;

	}

	@GetMapping(value = "findById/{id}", produces = "application/json")
	public CurrencyExchangeModel findByID(@PathVariable("id") Integer id) {

		CurrencyExchangeModel model = service.findById(id);
		return model;

	}

}
