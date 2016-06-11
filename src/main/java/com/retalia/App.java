package com.retalia;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import com.retalia.mocks.MultimediaMock;
import com.retalia.models.Challenge;
import com.retalia.models.User;
import com.retalia.models.UserChallenge;


@EnableAutoConfiguration
@Configuration
@ComponentScan("com.retalia")
public class App {
	private static List<Challenge> challenges;
	private static List<UserChallenge> userChallenges;
	private static int numMultimedia;
	private static List<Integer> likes;
	private static List<Integer> dislikes;

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("2000KB");
        factory.setMaxRequestSize("2000KB");
        return factory.createMultipartConfig();
    }
	public static void main(String[] args){
		challenges= new ArrayList<Challenge>();
		userChallenges= new ArrayList<UserChallenge>();
		numMultimedia=0;
		likes= new ArrayList<Integer>();
		dislikes=new ArrayList<Integer>();
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
		if (status==4){
			List<UserChallenge> userChallenges= new ArrayList<UserChallenge>();
			userChallenges.addAll(searchByStatus(0));
			userChallenges.addAll(searchByStatus(1));
			return userChallenges;
		}
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

	public static void removeUserChallenge(int userChallengeID) {
		userChallenges.remove(userChallengeID);
		for (int i=userChallengeID;i<userChallenges.size();i++){
			userChallenges.get(i).setID(i);
			
		}
		removeLike(userChallengeID);
		removeDislike(userChallengeID);

		
		
	}

	public static void changeStatus(int userChallengeID, int status) {
		userChallenges.get(userChallengeID).setStatus(status);
		
	}

	public static List<UserChallenge> getUserChallengesChallengesByStatusAndSearchType(String userID, int status, int searchType) {
		List<UserChallenge> userChallengesResult= new ArrayList<UserChallenge>();
		UserChallenge userChallenge;
		User user;
		for (int i=0;i<userChallenges.size();i++){
			userChallenge=userChallenges.get(i);
			if (searchType==0){
				user= userChallenge.getSender();
			}else{
				user=userChallenge.getOwner();
			}
			if (userChallenge.getStatus()==status&&user.getID().equals(userID)){
				userChallengesResult.add(userChallenge);
			}  
		}
		return userChallengesResult;
	}

	public static void addVideo(int userChallengeID) {
		UserChallenge userChallenge=userChallenges.get(userChallengeID);
		userChallenge.setMultimedia(MultimediaMock.getMultimedia(userChallenge.getOwner()));
		numMultimedia++;
		
	}
	public static int getNumMultimedia(){
		return numMultimedia;
	}

	public static List<UserChallenge> getUserChallengesByChallengeIDAndStatus(int challengeID, int status) {
		List<UserChallenge> userChallengesResult= new ArrayList<UserChallenge>();
		UserChallenge userChallenge;
		for (int i=0;i<userChallenges.size();i++){
			userChallenge=userChallenges.get(i);
			if(userChallenge.getChallenge().getID()==challengeID && userChallenge.getStatus()==status){
				userChallengesResult.add(userChallenge);
			} 
		}
		return userChallengesResult;
	}

	public static List<Challenge> searchChallenge(String query) {
		
		List<Challenge> challengesResult= new ArrayList<Challenge>();
		Challenge challenge;
		for (int i=0;i<challenges.size();i++){
			challenge= challenges.get(i);
			if (challenge.getTitle().contains(query)) challengesResult.add(challenge);
			
		}
		return challengesResult;
	}
	
	public static void addLike(int userChallengeID){
		likes.add(userChallengeID);
	}
	
	public static void removeLike(int userChallengeID){
		for (int i=0;i<likes.size();i++){
			if(likes.get(i)==userChallengeID) likes.remove(i);
			
		}
	}
	public static void addDislike(int userChallengeID){
		dislikes.add(userChallengeID);
	}
	
	public static void removeDislike(int userChallengeID){
		for (int i=0;i<dislikes.size();i++){
			if(dislikes.get(i)==userChallengeID) dislikes.remove(i);
			
		}
	}
}
