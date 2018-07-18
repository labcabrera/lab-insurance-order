package org.lab.insurance.order.core.processor;

import org.lab.insurance.order.common.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderValorizationScheduler {

	public Order process(Order request) {
		throw new RuntimeException("Not implemented");
		// Date execution = request.getDates().getValueDate();
		// Assert.notNull(execution, "Missing order value date");
		//
		// InsuranceTask task = new InsuranceTask();
		// task.setData(new Order(request.getId()));
		// task.setDestinationQueue(env.getProperty("queues.order.valorization"));
		// task.setExecution(execution);
		//
		// scheduler.schedule(task);
		// return request;
	}

}
