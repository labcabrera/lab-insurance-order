package org.lab.insurance.order.common.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Holiday {

	@Id
	private String id;

	private Date holidayDate;
	private String name;
	private HolidayCalendar calendar;

}
