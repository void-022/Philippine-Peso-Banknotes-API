package com.github.void022.phpbanknotes.model;

public class Period {
	int periodId;
	String name;
	String info;

	public Period() {
	}

	public Period(int periodId, String name, String info) {
		super();
		this.periodId = periodId;
		this.name = name;
		this.info = info;
	}

	public int getPeriod_id() {
		return periodId;
	}

	public void setPeriod_id(int period_id) {
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
