package com.currency.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name =" CURRENCY_EXCHANGE_DTLS")
@Data
public class CurrencyExchangeEntity {

	@Column(name = "ID")
	@Id
	private Integer id;
	@Column(name = "CURRENCY_FROM")
	private String currencyFrom;
	@Column(name = "CURRENCY_TO")
	private String currencyTo;
	@Column(name = "CURRENCY_VALUE")
	private Double currencyValue;

}
