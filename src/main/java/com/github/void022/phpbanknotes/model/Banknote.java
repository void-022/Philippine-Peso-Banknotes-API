package com.github.void022.phpbanknotes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Banknote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long noteId;
	@Column(nullable = false)
	private float denomination;
	private String firstIssued;
	private String withdrawal;
	@ManyToOne
	@JoinColumn(name = "series_id")
	private Series series;
	private String obverse;
	private String reverse;
	private String mainColor;
	private String obverseImageUrl;
	private String reverseImageUrl;

	public Banknote() {
	}

	public Banknote(Long noteId, float denomination, String firstIssued, String withdrawal, Series series,
			String obverse, String reverse, String mainColor, String obverseImageUrl, String reverseImageUrl) {
		super();
		this.noteId = noteId;
		this.denomination = denomination;
		this.firstIssued = firstIssued;
		this.withdrawal = withdrawal;
		this.series = series;
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

	public Series getSeries() {
		return series;
	}

	public void setSeriesId(Series series) {
		this.series = series;
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
