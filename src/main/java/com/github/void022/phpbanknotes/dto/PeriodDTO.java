package com.github.void022.phpbanknotes.dto;

import java.util.List;

public class PeriodDTO {

	private Long periodId;
	private String name;
	private String info;
	private List<SeriesListDTO> series;

	public PeriodDTO(Long periodId, String name, String info, List<SeriesListDTO> series) {
		super();
		this.periodId = periodId;
		this.name = name;
		this.info = info;
		this.series = series;
	}

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
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

	public List<SeriesListDTO> getSeries() {
		return series;
	}

	public void setSeries(List<SeriesListDTO> series) {
		this.series = series;
	}

}
