package com.github.void022.phpbanknotes.dto;

public class BanknoteListDTO {
	private Long noteId;
	private float denomination;
	private String firstIssued;
	private String withdrawal;
	private String seriesName;

	public BanknoteListDTO() {

	}

	public BanknoteListDTO(Long noteId, float denomination, String firstIssued, String withdrawal, String seriesName) {
		super();
		this.noteId = noteId;
		this.denomination = denomination;
		this.firstIssued = firstIssued;
		this.withdrawal = withdrawal;
		this.seriesName = seriesName;
	}

	public Long getNoteId() {
		return noteId;
	}

	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}

	public float getDenomination() {
		return denomination;
	}

	public void setDenomination(float denomination) {
		this.denomination = denomination;
	}

	public String getFirstIssued() {
		return firstIssued;
	}

	public void setFirstIssued(String firstIssued) {
		this.firstIssued = firstIssued;
	}

	public String getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(String withdrawal) {
		this.withdrawal = withdrawal;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}


}
