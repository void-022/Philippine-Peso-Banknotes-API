package com.github.void022.phpbanknotes.dto;

public class SeriesListDTO {
	private Long seriesId;
	private String name;
	private String info;
	private String periodName;

	public SeriesListDTO(Long seriesId, String name, String info, String periodName) {
		super();
		this.seriesId = seriesId;
		this.name = name;
		this.info = info;
		this.periodName = periodName;
	}

	// -------getters and setters
	public Long getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Long seriesId) {
		this.seriesId = seriesId;
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

	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

}

