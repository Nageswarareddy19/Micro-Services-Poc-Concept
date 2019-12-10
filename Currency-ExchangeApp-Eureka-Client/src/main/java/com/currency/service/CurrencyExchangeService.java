package com.currency.service;

import com.currency.model.CurrencyExchangeModel;

public interface CurrencyExchangeService {

	public CurrencyExchangeModel findCurrencyFromAndTo(String from, String to);
	
	

	CurrencyExchangeModel findById(Integer id);
	
			

}
