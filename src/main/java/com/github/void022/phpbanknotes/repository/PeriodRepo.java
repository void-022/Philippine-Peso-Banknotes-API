package com.github.void022.phpbanknotes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.github.void022.phpbanknotes.dto.PeriodDTO;
import com.github.void022.phpbanknotes.model.Period;

@Repository
public interface PeriodRepo extends JpaRepository<Period, Long> {

	@Query("SELECT new com.github.void022.phpbanknotes.dto.PeriodDTO(p.periodId, p.name, p.info, null) FROM Period p")
	List<PeriodDTO> findAllPeriod();

}
