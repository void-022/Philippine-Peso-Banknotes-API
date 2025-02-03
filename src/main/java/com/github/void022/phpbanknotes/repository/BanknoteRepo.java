package com.github.void022.phpbanknotes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.github.void022.phpbanknotes.dto.BanknoteListDTO;
import com.github.void022.phpbanknotes.model.Banknote;

@Repository
public interface BanknoteRepo extends JpaRepository<Banknote, Long> {

	@Query("SELECT new com.github.void022.phpbanknotes.dto.BanknoteListDTO( "
			+ "b.noteId, b.denomination, b.firstIssued, b.withdrawal, b.series.name) FROM Banknote b ORDER BY b.noteId ASC")
	List<BanknoteListDTO> findAllBanknote();

	@Query("SELECT new com.github.void022.phpbanknotes.dto.BanknoteListDTO("
			+ "b.noteId, b.denomination, b.firstIssued, b.withdrawal, b.series.name) FROM Banknote b"
			+ " WHERE b.series.seriesId = ?1")
	List<BanknoteListDTO> findSeriesBanknotes(Long seriesId);

	Optional<Banknote> findById(Long noteId);

}
