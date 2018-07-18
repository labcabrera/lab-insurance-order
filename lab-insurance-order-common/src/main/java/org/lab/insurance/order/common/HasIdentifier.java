package org.lab.insurance.order.common;

import java.io.Serializable;

public interface HasIdentifier<T extends Serializable> {

	T getId();

	void setId(T t);

}
