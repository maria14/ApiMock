package com.retalia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.retalia.App;
import com.retalia.mocks.MultimediaMock;
import com.retalia.models.Challenge;
import com.retalia.models.Multimedia;
import com.retalia.models.User;
import com.retalia.models.UserChallenge;
import com.retalia.models.Vote;
import com.retalia.models.methods.LoginModel;
import com.retalia.services.UserChallengeService;
import com.retalia.services.UserService;
import com.retalia.services.VoteService;
import com.retalia.types.SearchType;
import com.retalia.types.StatusType;
import com.retalia.services.ChallengeService;
import com.retalia.services.MultimediaService;

@Controller
@RequestMapping("/userschallenges")
public class UserChallengeController {
	
	@Autowired
	private UserChallengeService userChallengeService;
	
	@Autowired
	private MultimediaService multimediaService;
	
	@Autowired
	private ChallengeService challengeService;
	
	@Autowired
	private VoteService voteService;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/filter",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserChallenge> getUserChallenges( @RequestParam(value="Status")final String status, @RequestParam(value="PageNumber")final int pageNumber ){
		return userChallengeService.getUserChallengeByStatus(StatusType.get(status).getCod());
	}
	
	@RequestMapping(value="/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeUserChallenge(@RequestParam(value="UserChallengeID")final int UserChallengeID){
		UserChallenge userChallenge= userChallengeService.getUserChallengeByID(UserChallengeID);
		Challenge challenge= challengeService.getChallengeByID(userChallenge.getChallenge().getID());
		User owner= userChallenge.getOwner();
		challenge.lessStatus(userChallenge.getStatus());
		challengeService.update(challenge);
		Vote vote= voteService.getVoteByUserChallengeID(UserChallengeID);
		if (vote!=null){
			if (vote.getVoterID()==0){
				owner.lessLikes();
			}else{
				owner.lessDislikes();
			}
			userService.update(owner);
			voteService.delete(vote);
			
		}
		
		userChallengeService.removeUserChallenge(userChallenge);
		
		
	}
	
	@RequestMapping(value="/uncompleted",method=RequestMethod.POST)
	@ResponseBody
	public void uncompletedUserChallenge(@RequestParam(value="UserChallengeID")final int UserChallengeID){
		changeSatus(UserChallengeID,3);
	}

	@RequestMapping(value="/completed",method=RequestMethod.POST)
	@ResponseBody
	public void completedUserChallenge(@RequestParam(value="UserChallengeID")final int UserChallengeID){
		changeSatus(UserChallengeID,2);	
	}
	
	@RequestMapping(value="/retry",method=RequestMethod.POST)
	@ResponseBody
	public void retryUserChallenge(@RequestParam(value="UserChallengeID")final int UserChallengeID){
		// poner multimedia a null
		changeSatus(UserChallengeID,0);
	}
	
	@RequestMapping(value="/users/{userID}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserChallenge> getUserChallengesBySearchTypeAndStatus( @PathVariable String userID,@RequestParam(value="SearchType")final String searchType, @RequestParam(value="Status")final String status,@RequestParam(value="PageNumber")final int pageNumber ){
		return userChallengeService.getUserChallengesChallengesByStatusAndSearchType(userID,StatusType.get(status).getCod(),SearchType.get(searchType).getCod());
	}
	
	//revisar
	@RequestMapping(value="/reply",method=RequestMethod.POST)
	@ResponseBody
	public void replyUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="Video") final MultipartFile video){
		UserChallenge userChallenge= userChallengeService.getUserChallengeByID(userChallengeID);
		Multimedia multimedia= MultimediaMock.getMultimedia(userChallenge.getOwner());
		
		multimediaService.createMultimedia(multimedia);
		
		userChallenge.setStatus(1);
		userChallenge.setMultimedia(multimedia);
		userChallengeService.updateUserChallenge(userChallenge);
	}
	
	@RequestMapping(value="/challenges/{challengeID}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserChallenge> getUserChallengesByChallengeIDAndStatus( @PathVariable int challengeID, @RequestParam(value="Status")final String status,@RequestParam(value="PageNumber")final int pageNumber ){
		return userChallengeService.getUserChallengesByChallengeIDAndStatus(challengeID,StatusType.get(status).getCod());
	}
	
	
	//other methods
	private void changeSatus(int userChallengeID, int status) {
		UserChallenge userChallenge= userChallengeService.getUserChallengeByID(userChallengeID);
		Challenge challenge= userChallenge.getChallenge();
		userChallenge.setStatus(status);
		userChallengeService.updateUserChallenge(userChallenge);
		challenge.lessStatus(userChallenge.getStatus());
		challenge.plusStatus(status);
		challengeService.update(challenge);
		
	}

}
