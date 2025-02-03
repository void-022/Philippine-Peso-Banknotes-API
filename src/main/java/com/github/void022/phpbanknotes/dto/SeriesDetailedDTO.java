package com.github.void022.phpbanknotes.dto;

import java.util.List;

public class SeriesDetailedDTO {
	private Long seriesId;
	private String name;
	private String info;
	private List<BanknoteListDTO> banknotes;

	public SeriesDetailedDTO(Long seriesId, String name, String info, List<BanknoteListDTO> banknotes) {
		super();
		this.seriesId = seriesId;
		this.name = name;
		this.info = info;
		this.banknotes = banknotes;
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

	public List<BanknoteListDTO> getBanknotes() {
		return banknotes;
	}

	public void setBanknotes(List<BanknoteListDTO> banknotes) {
		this.banknotes = banknotes;
	}

}
