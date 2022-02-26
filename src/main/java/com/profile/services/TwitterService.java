package com.profile.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

@Service
public class TwitterService {
	
	@Inject
	private final Twitter twitter;
	
	public TwitterService(Twitter twitter) {
		this.twitter = twitter;
	}

	public List<Tweet> getLastTweets(final String twitterUserName) {
		List<Tweet> listTweet = twitter.timelineOperations().getUserTimeline(twitterUserName, 5);
		if(listTweet.isEmpty()) {
			return null;
		}
		
		return listTweet;
	}
}
