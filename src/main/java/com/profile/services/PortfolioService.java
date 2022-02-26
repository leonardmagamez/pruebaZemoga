package com.profile.services;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.profile.entieies.Portfolio;
import com.profile.repositories.PortfolioRepository;

@Service
public class PortfolioService {
	
	@Inject
	PortfolioRepository portfolioRepository;
	
	public PortfolioService(PortfolioRepository portfolioRepository) {
		this.portfolioRepository = portfolioRepository;
	}

	public List<Portfolio> findAll() {
		return (List<Portfolio>) portfolioRepository.findAll();
	
	}

	public Portfolio findById(final Long id) {
		Optional<Portfolio> dbPortfolio = portfolioRepository.findById(id);
		
		if(dbPortfolio.isPresent()) {
			return dbPortfolio.get();
		}
		
		return null;
	}

	public Portfolio updatePortfolio(@Valid Portfolio portfolio) {
		Portfolio oldPortfolio = findById(portfolio.getIdportfolio());
		if(oldPortfolio != null) {
			portfolioRepository.save(portfolio);
		}
		return portfolio;
	}
}
