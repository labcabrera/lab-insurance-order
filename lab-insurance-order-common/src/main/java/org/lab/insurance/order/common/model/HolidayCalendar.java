package org.lab.insurance.order.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class HolidayCalendar {

	@Id
	private String id;
	private String name;

}
