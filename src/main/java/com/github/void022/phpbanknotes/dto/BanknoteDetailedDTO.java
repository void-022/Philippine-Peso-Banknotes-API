package com.github.void022.phpbanknotes.dto;

public class BanknoteDetailedDTO {
	private Long noteId;
	private float denomination;
	private String firstIssued;
	private String withdrawal;
	private String seriesName;
	private String obverse;
	private String reverse;
	private String mainColor;
	private String obverseImageUrl;
	private String reverseImageUrl;

	public BanknoteDetailedDTO() {
	}

	public BanknoteDetailedDTO(Long noteId, float denomination, String firstIssued, String withdrawal,
			String seriesName, String obverse, String reverse, String mainColor, String obverseImageUrl,
			String reverseImageUrl) {
		super();
		this.noteId = noteId;
		this.denomination = denomination;
		this.firstIssued = firstIssued;
		this.withdrawal = withdrawal;
		this.seriesName = seriesName;
		this.obverse = obverse;
		this.reverse = reverse;
		this.mainColor = mainColor;
		this.obverseImageUrl = obverseImageUrl;
		this.reverseImageUrl = reverseImageUrl;
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

	public String getObverse() {
		return obverse;
	}

	public void setObverse(String obverse) {
		this.obverse = obverse;
	}

	public String getReverse() {
		return reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public String getMainColor() {
		return mainColor;
	}

	public void setMainColor(String mainColor) {
		this.mainColor = mainColor;
	}

	public String getObverseImageUrl() {
		return obverseImageUrl;
	}

	public void setObverseImageUrl(String obverseImageUrl) {
		this.obverseImageUrl = obverseImageUrl;
	}

	public String getReverseImageUrl() {
		return reverseImageUrl;
	}

	public void setReverseImageUrl(String reverseImageUrl) {
		this.reverseImageUrl = reverseImageUrl;
	}

}
