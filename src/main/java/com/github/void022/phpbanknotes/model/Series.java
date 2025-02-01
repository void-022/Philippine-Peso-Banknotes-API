package com.github.void022.phpbanknotes.model;

public class Series {
	int seriesId;
	String name;
	String info;
	int periodId;

	public Series() {
	}

	public Series(int seriesId, String name, String info, int periodId) {
		super();
		this.seriesId = seriesId;
		this.name = name;
		this.info = info;
		this.periodId = periodId;
	}

	public int getSeries_id() {
		return seriesId;
	}

	public void setSeries_id(int series_id) {
		this.seriesId = series_id;
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

	public int getPeriod_id() {
		return periodId;
	}

	public void setPeriod_id(int period_id) {
		this.periodId = period_id;
	}

}
