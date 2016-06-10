package com.retalia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.retalia.models.Challenge;
import com.retalia.models.UserChallenge;


@EnableAutoConfiguration
@ComponentScan("com.retalia")
public class App {
	private static List<Challenge> challenges;
	private static List<UserChallenge> userChallenges;

	public static void main(String[] args){
		challenges= new ArrayList<Challenge>();
		userChallenges= new ArrayList<UserChallenge>();
		SpringApplication.run(App.class, args);
	}

	public static int getNumNextChallenge() {
		return challenges.size();
	}
	public static int getNumNextUserChallenge() {
		return userChallenges.size();
	}

	public static void addChallenge(Challenge challenge) {
		challenges.add(challenge);
		
	}
	public static void addUserChallenge(UserChallenge userChallenge) {
		userChallenges.add(userChallenge);
		
	}

	public static Challenge getChallenge(int challengeID) {
		return challenges.get(challengeID);
	}

	public static List<UserChallenge> getUserChallengesChallengesByStatus(int status) {
		return searchByStatus(status);
	}

	private static List<UserChallenge> searchByStatus(int status) {
		List<UserChallenge> userChallengesResult= new ArrayList<UserChallenge>();
		UserChallenge userChallenge;
		for (int i=0;i<userChallenges.size();i++){
			userChallenge=userChallenges.get(i);
			if (userChallenge.getStatus()==status) userChallengesResult.add(userChallenge);
		}
		return userChallengesResult;
		
	}
}
