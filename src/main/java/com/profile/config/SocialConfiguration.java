package com.profile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
public class SocialConfiguration {
	
	@Value("${spring-social-twitter-app-id}")
	private String consumerKey;
	
	@Value("${spring-social-twitter-app-secret}")
	private String consumerSecret;

	@Value("${twitter.access.token}")
	private String accessToken;

	@Value("${twitter.access.token.secret}")
	private String accessTokenSecret;

	@Bean
	TwitterTemplate getTwitterTemplate() {
		
		return new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
	}
}
