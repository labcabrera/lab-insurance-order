package org.lab.insurance.order.common;

import org.lab.insurance.order.common.model.State;

public interface HasState {

	State getCurrentState();

	void setCurrentState(State state);

}
