package org.lab.insurance.order.common.model;

public enum OrderBuyStrategy {

	/**
	 * Por porcentaje de cada {@link OrderDistribution}
	 */
	BY_PERCENT,

	/**
	 * Proporcional a la posicion matematica.
	 */
	PROPORTIONAL_TO_MP;

}
