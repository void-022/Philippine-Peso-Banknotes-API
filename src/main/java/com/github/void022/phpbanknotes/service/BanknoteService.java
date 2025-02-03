package com.github.void022.phpbanknotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.void022.phpbanknotes.dto.BanknoteDetailedDTO;
import com.github.void022.phpbanknotes.dto.BanknoteListDTO;
import com.github.void022.phpbanknotes.repository.BanknoteRepo;

@Service
public class BanknoteService {

	@Autowired
	private BanknoteRepo banknoteRepo;

	public List<BanknoteListDTO> getAllBanknote() {
		return banknoteRepo.findAllBanknote();
	}

	public BanknoteDetailedDTO getBanknoteById(Long noteId) {
		return banknoteRepo.findById(noteId)
		        .map(banknote -> new BanknoteDetailedDTO(
		            banknote.getNoteId(),
		            banknote.getDenomination(),
		            banknote.getFirstIssued(),
		            banknote.getWithdrawal(),
		            banknote.getSeries().getName(),
		            banknote.getObverse(),
		            banknote.getReverse(),
		            banknote.getMainColor(),
		            banknote.getObverseImageUrl(),
		            banknote.getReverseImageUrl()
		        ))
		        .orElse(new BanknoteDetailedDTO());  // Returns a blank DTO if not found
	}
}
