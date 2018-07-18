package org.lab.insurance.order.common.model;

import java.math.BigDecimal;
import java.util.List;

import org.lab.insurance.order.common.HasIdentifier;
import org.lab.insurance.order.common.HasState;
import org.lab.insurance.order.common.validation.ValidOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Representa un movimiento u operacion de entrada/salida de fondos en un contrato.
 */
@Document
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ValidOrder
@ToString(of = { "id", "type" })
public class Order implements HasState, HasIdentifier<String> {

	public enum States {
		INITIAL, TO_PROCESS, PROCESSING, PROCESSED, VALUING, VALUED, ACCOUNTING, ACCOUNTED;
	}

	@Id
	String id;

	OrderType type;

	String ownerId;

	State currentState;
	OrderDates dates;
	OrderProcessInfo processInfo;

	List<OrderDistribution> sellDistribution;
	List<OrderDistribution> buyDistribution;
	List<MarketOrder> marketOrders;

	BigDecimal grossAmount;
	BigDecimal netAmount;

	public Order(String id) {
		this.id = id;
	}

}
