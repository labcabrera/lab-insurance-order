package org.lab.insurance.order.common.exception;

import java.util.Date;

import org.lab.insurance.order.common.model.Asset;

/**
 * Excepcion que representa la ausencia de un fondo en una determinada fecha.
 */
@SuppressWarnings("serial")
public class NoCotizationException extends RuntimeException {

	private final Asset asset;
	private final Date when;

	public NoCotizationException(Asset asset, Date when) {
		this.asset = asset;
		this.when = when;
	}

	public Asset getAsset() {
		return asset;
	}

	public Date getValueDate() {
		return when;
	}
}
