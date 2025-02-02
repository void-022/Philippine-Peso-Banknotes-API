package com.github.void022.phpbanknotes.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Period {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long periodId;
	private String name;
	private String info;

	public Period() {
	}

	public Period(Long periodId, String name, String info) {
		super();
		this.periodId = periodId;
		this.name = name;
		this.info = info;
	}

	public Long getPeriod_id() {
		return periodId;
	}

	public void setPeriod_id(Long period_id) {
		this.periodId = period_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
