package com.currrency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.currrency.model.CurrencyConversionResponse;
import com.currrency.model.CurrencyExchangeModel;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {



	@Autowired
	private CurrencyExchangeProxyClient proxyClient;



	@Override
	public CurrencyConversionResponse convert(String from, String to, Double quantity) {
		CurrencyExchangeModel model = proxyClient.invokeCurrencyExchangeApi(from, to);

		Double totalCurrecncy = model.getCurrencyValue() * quantity;
		CurrencyConversionResponse response = new CurrencyConversionResponse();

		response.setTotalCurVal(totalCurrecncy);
		response.setQuantity(quantity);
		response.setCurrFrom(model.getCurrencyFrom());
		response.setCurrTo(model.getCurrencyTo());
		return response;

	}

}
