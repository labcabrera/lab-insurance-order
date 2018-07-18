package org.lab.insurance.order.common.model;

import java.math.BigDecimal;

import org.lab.insurance.order.common.HasState;
import org.lab.insurance.order.common.validation.ValidMarketOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
@ValidMarketOrder
public class MarketOrder implements HasState {

	@Id
	private String id;

	@DBRef
	private Asset asset;

	private MarketOrderType type;
	private MarketOrderSource source;

	private State currentState;
	private OrderDates dates;

	private BigDecimal units;
	private BigDecimal grossAmount;
	private BigDecimal netAmount;
	private BigDecimal nav;

	public enum States {
		INITIAL, PROCESSED, VALUED, ACCOUNTED;
	}
}
