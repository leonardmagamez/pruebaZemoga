package com.profile.web;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.profile.entieies.Portfolio;
import com.profile.services.PortfolioService;
import com.profile.services.TwitterService;

public class ProfileControllerTest {
	
	private static ProfileController profileController;
	private static PortfolioService mockedPortfolioService;
	private static TwitterService mockedTwitterService;
	private static BindingResult mockedBindingResult;
	private static Model mockedModel;

	@BeforeAll
	public static void setUpUserControllerInstance() {
		mockedPortfolioService = mock(PortfolioService.class);
		mockedTwitterService = mock(TwitterService.class);
		mockedBindingResult = mock(BindingResult.class);
		mockedModel = mock(Model.class);
		profileController = new ProfileController(mockedPortfolioService, mockedTwitterService);
	}
	
	@Test
	public void calledCorrectListPortfolios() {
		assertThat(profileController.listPortfolios(mockedModel)).isEqualTo("index");
	}
	
	@Test
	public void calledCorrectViewProfile() {
		assertThat(profileController.viewProfile(mockedModel,"1")).isEqualTo("view");
	}
	
	@Test
	public void calledCorrectShowUpdateForm() {
		assertThat(profileController.showUpdateForm(mockedModel, 1L)).isEqualTo("edit");
	}
	
	@Test
	public void calledCorrectEditProfile() {
		Portfolio mockPortfolio = mock(Portfolio.class);
		assertThat(profileController.editProfile(mockedModel, "2", mockPortfolio, mockedBindingResult)).isEqualTo("redirect:/");
	}
	
}
