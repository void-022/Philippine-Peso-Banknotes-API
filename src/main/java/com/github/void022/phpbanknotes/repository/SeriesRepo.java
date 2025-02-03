package com.github.void022.phpbanknotes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.github.void022.phpbanknotes.dto.SeriesListDTO;
import com.github.void022.phpbanknotes.model.Series;

@Repository
public interface SeriesRepo extends JpaRepository<Series, Long> {


	@Query("SELECT new com.github.void022.phpbanknotes.dto.SeriesListDTO(s.seriesId, s.name, s.info, s.period.name) FROM Series s")
	List<SeriesListDTO> findAllSeries();

	@Query("SELECT new com.github.void022.phpbanknotes.dto.SeriesListDTO(s.seriesId, s.name, s.info, s.period.name) FROM Series s WHERE s.period.periodId = ?1")
	List<SeriesListDTO> findPeriodSeries(Long periodId);

	Optional<Series> findById(Long seriesId);
}
