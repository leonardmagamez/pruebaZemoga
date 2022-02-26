package com.profile.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.profile.entieies.Portfolio;
import com.profile.repositories.PortfolioRepository;

public class PortfolioServiceTest {
	
	private static PortfolioRepository mockedPortfolioRepository;
	private static PortfolioService portfolioService;

	@BeforeAll
	public static void setUpUserControllerInstance() {
		mockedPortfolioRepository = mock(PortfolioRepository.class);
		portfolioService = new PortfolioService(mockedPortfolioRepository);
	}
	
	@Test
	public void calledCorrectFindAll() {
		List<Portfolio> portfolioList = new ArrayList<>();
		Portfolio mockedPortfolio = mock(Portfolio.class);
		
		portfolioList.add(mockedPortfolio);
		
		when(mockedPortfolioRepository.findAll()).thenReturn(portfolioList);
		
		when(portfolioService.findAll()).thenReturn(portfolioList);
	}
	
	@Test
	public void calledCorrectFindById() {
		Portfolio portfolio = new Portfolio();
		portfolio.setIdportfolio(1L);
		
		when(mockedPortfolioRepository.findById(1L)).thenReturn(Optional.of(portfolio));
	}

}
