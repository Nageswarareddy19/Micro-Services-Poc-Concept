package com.currency.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currency.entity.CurrencyExchangeEntity;
import com.currency.model.CurrencyExchangeModel;
import com.currency.repositoty.CurrencyExchangeRepositoy;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

	@Autowired
	private CurrencyExchangeRepositoy repo;

	@Override
	public CurrencyExchangeModel findCurrencyFromAndTo(String from, String to) {

		CurrencyExchangeModel model = new CurrencyExchangeModel();
		

		CurrencyExchangeEntity entity = repo.findCurrencyValueFromAndTo(from, to);
		BeanUtils.copyProperties(entity, model);
		

		return model;
	}

	@Override
	public CurrencyExchangeModel findById(Integer id) {
		CurrencyExchangeModel model = new CurrencyExchangeModel();
		Optional<CurrencyExchangeEntity> entity = repo.findById(id);
		CurrencyExchangeEntity exchangeEntity = entity.get();
		BeanUtils.copyProperties(exchangeEntity, model);
		
		return model;
	}
	
	
	

}
