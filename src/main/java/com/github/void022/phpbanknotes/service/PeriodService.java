package com.github.void022.phpbanknotes.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.void022.phpbanknotes.dto.PeriodDTO;
import com.github.void022.phpbanknotes.dto.SeriesListDTO;
import com.github.void022.phpbanknotes.repository.PeriodRepo;
import com.github.void022.phpbanknotes.repository.SeriesRepo;

@Service
public class PeriodService {

	@Autowired
	PeriodRepo periodRepo;
	@Autowired
	SeriesRepo seriesRepo;

	public List<PeriodDTO> getAllPeriods() {
		return periodRepo.findAllPeriod().stream().map(period -> {
			List<SeriesListDTO> seriesList = seriesRepo.findPeriodSeries(period.getPeriodId());
			return new PeriodDTO(period.getPeriodId(), period.getName(), period.getInfo(), seriesList);
		}).collect(Collectors.toList());
	}

}
