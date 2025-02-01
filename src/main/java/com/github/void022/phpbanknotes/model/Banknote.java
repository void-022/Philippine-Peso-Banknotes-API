package com.github.void022.phpbanknotes.model;

public class Banknote {
	int noteId;
	float denomination;
	String firstIssued;
	String widthdrawal;
	int seriesId;
	String obverse;
	String reverse;
	String mainColor;
	String obverseImageUrl;
	String reverseImageUrl;

	public Banknote() {
	}

	public Banknote(int noteId, float denomination, String firstIssued, String widthdrawal, int seriesId,
			String obverse, String reverse, String mainColor, String obverseImageUrl, String reverseImageUrl) {
		super();
		this.noteId = noteId;
		this.denomination = denomination;
		this.firstIssued = firstIssued;
		this.widthdrawal = widthdrawal;
		this.seriesId = seriesId;
		this.obverse = obverse;
		this.reverse = reverse;
		this.mainColor = mainColor;
		this.obverseImageUrl = obverseImageUrl;
		this.reverseImageUrl = reverseImageUrl;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
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

	public String getWidthdrawal() {
		return widthdrawal;
	}

	public void setWidthdrawal(String widthdrawal) {
		this.widthdrawal = widthdrawal;
	}

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
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
