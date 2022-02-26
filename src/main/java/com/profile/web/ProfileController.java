package com.profile.web;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.profile.entieies.Portfolio;
import com.profile.services.PortfolioService;
import com.profile.services.TwitterService;

@Controller
public class ProfileController {
	
	@Inject
	private final PortfolioService portfolioService;
	
	@Inject
	private final TwitterService twitterService;
	
	 
	public ProfileController(PortfolioService portfolioService, TwitterService twitterService) {
		this.portfolioService = portfolioService;
		this.twitterService = twitterService;
	}
	
	@GetMapping("/")
	public String listPortfolios(Model model) {
		model.addAttribute("portfolios", portfolioService.findAll());
		return "index";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(Model model, @PathVariable("id") Long id) {
		 Portfolio portfolio = portfolioService.findById(id);
	     model.addAttribute("portfolio", portfolio);
	     return "edit";
	}
	
	@PostMapping("/update/{id}")
	public String editProfile(Model model, @PathVariable final String id, @Valid Portfolio portfolio, BindingResult result) {
		portfolio.setIdportfolio(Long.parseLong(id));
		if(result.hasErrors()) {
			System.err.println(result.getErrorCount());
			portfolio.setIdportfolio(Long.parseLong(id));
			return "edit";
		}
		portfolioService.updatePortfolio(portfolio);
		return "redirect:/";
	}
	
	@GetMapping("/view/{id}")
	public String viewProfile(Model model, @PathVariable final String id) {
		Portfolio portfolio = portfolioService.findById(Long.parseLong(id));
		if(portfolio != null) {
			List<Tweet> tweetList = twitterService.getLastTweets(portfolio.getTwitterUserName());
			model.addAttribute("tweetList", tweetList != null ? tweetList : null);
			model.addAttribute("portfolio", portfolio);
		}
				
		return "view";
	}

}
