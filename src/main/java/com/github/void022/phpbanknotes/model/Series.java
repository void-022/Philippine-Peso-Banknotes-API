package com.github.void022.phpbanknotes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Series {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seriesId;
	private String name;
	private String info;
	@ManyToOne
	@JoinColumn(name = "period_id")
	private Period period;

	public Series() {
	}

	public Series(Long seriesId, String name, String info, Period period) {
		super();
		this.seriesId = seriesId;
		this.name = name;
		this.info = info;
		this.period = period;
	}

	public Long getSeries_id() {
		return seriesId;
	}

	public void setSeries_id(Long series_id) {
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

	public Period getPeriod() {
		return period;
	}

	public void setPeriod_id(Period period) {
		this.period = period;
	}

}
