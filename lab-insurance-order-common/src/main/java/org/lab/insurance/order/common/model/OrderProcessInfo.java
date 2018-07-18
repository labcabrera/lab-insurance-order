package org.lab.insurance.order.common.model;

import lombok.Data;

@Data
public class OrderProcessInfo {

	private OrderSellStrategy sellStrategy;
	private OrderBuyStrategy buyStrategy;
	private String portfolioPassive;
	private String portfolioActive;

}
