package org.lab.insurance.order.common.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrderDates {

	private LocalDateTime effective;
	private LocalDateTime valueDate;
	private LocalDateTime valued;
	private LocalDateTime processed;
	private LocalDateTime accounted;

}
