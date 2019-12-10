package com.currency.repositoty;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.currency.entity.CurrencyExchangeEntity;

@Repository
public interface CurrencyExchangeRepositoy extends JpaRepository<CurrencyExchangeEntity, Serializable> {

	@Query(value = "from CurrencyExchangeEntity where currencyFrom= :from  and currencyTo= :to")
	public CurrencyExchangeEntity findCurrencyValueFromAndTo(String from, String to);

}
//SELECT * FROM  currency_exchange_dtls
//WHERE currency_from='usd' AND currency_to='ind';