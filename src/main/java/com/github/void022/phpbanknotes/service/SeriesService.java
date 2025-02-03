package com.github.void022.phpbanknotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.void022.phpbanknotes.dto.SeriesDetailedDTO;
import com.github.void022.phpbanknotes.dto.SeriesListDTO;
import com.github.void022.phpbanknotes.model.Series;
import com.github.void022.phpbanknotes.repository.BanknoteRepo;
import com.github.void022.phpbanknotes.repository.SeriesRepo;

@Service
public class SeriesService {

	@Autowired
	SeriesRepo seriesRepo;
	@Autowired
	BanknoteRepo banknoteRepo;

	public List<SeriesListDTO> getAllSeries() {
		return seriesRepo.findAllSeries();
	}

	public SeriesDetailedDTO getSeriesById(Long seriesId) {
		Series series = seriesRepo.findById(seriesId).orElse(new Series());
		return new SeriesDetailedDTO(series.getSeries_id(), series.getName(), series.getInfo(),
				banknoteRepo.findSeriesBanknotes(series.getSeries_id()));
	}

}
