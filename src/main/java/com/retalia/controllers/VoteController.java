package com.retalia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.App;
import com.retalia.models.User;
import com.retalia.models.UserChallenge;
import com.retalia.models.Vote;
import com.retalia.services.UserChallengeService;
import com.retalia.services.UserService;
import com.retalia.services.VoteService;

@Controller
@RequestMapping("/vote")
public class VoteController {
	
	@Autowired
	private VoteService voteService;
	
	@Autowired
	private UserChallengeService userChallengeService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/like",method=RequestMethod.POST)
	@ResponseBody
	public void likeUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="VoterID")final int voterID){
		Vote vote= voteService.getVoteByUserChallengeID(userChallengeID);
		UserChallenge userChallenge=userChallengeService.getUserChallengeByID(userChallengeID);
		User owner= userChallenge.getOwner();
		if (vote==null){
			vote= new Vote(userChallengeID,0);
			voteService.createVote(vote);
			userChallenge.plusLikes();
			owner.plusLikes();	
		}else{
			vote.setVoterID(1);
			voteService.update(vote);
			userChallenge.lessDislikes();
			userChallenge.plusLikes();
			owner.lessDislikes();
			owner.plusLikes();

		}
		userChallenge.setUserVote("0");
		userChallengeService.updateUserChallenge(userChallenge);
		userService.update(owner);
	}
	
	@RequestMapping(value="/like/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeLikeUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="VoterID")final int voterID){
		Vote vote= voteService.getVoteByUserChallengeID(userChallengeID);
		UserChallenge userChallenge=userChallengeService.getUserChallengeByID(userChallengeID);
		User owner= userChallenge.getOwner();
		voteService.delete(vote);
		userChallenge.lessLikes();
		userChallenge.setUserVote(null);
		userChallengeService.updateUserChallenge(userChallenge);
		owner.lessLikes();
		userService.update(owner);
	}
	
	@RequestMapping(value="/dislike",method=RequestMethod.POST)
	@ResponseBody
	public void dislikeUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="VoterID")final int voterID){
		Vote vote= voteService.getVoteByUserChallengeID(userChallengeID);
		UserChallenge userChallenge=userChallengeService.getUserChallengeByID(userChallengeID);
		User owner= userChallenge.getOwner();
		if (vote==null){
			vote= new Vote(userChallengeID,1);
			voteService.createVote(vote);
			userChallenge.plusDislikes();

			owner.plusDislikes();
			userService.update(owner);
		}else{
			vote.setVoterID(0);
			voteService.update(vote);
			userChallenge.lessLikes();
			userChallenge.plusDislikes();
			owner.lessLikes();
			owner.plusDislikes();

		}
		userChallenge.setUserVote("1");
		userChallengeService.updateUserChallenge(userChallenge);
		userService.update(owner);
	}
	
	@RequestMapping(value="/dislike/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeDislikeUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="VoterID")final int voterID){
		Vote vote= voteService.getVoteByUserChallengeID(userChallengeID);
		UserChallenge userChallenge=userChallengeService.getUserChallengeByID(userChallengeID);
		User owner= userChallenge.getOwner();
		voteService.delete(vote);
		userChallenge.lessDislikes();
		userChallenge.setUserVote(null);
		userChallengeService.updateUserChallenge(userChallenge);
		owner.lessDislikes();
		userService.update(owner);
	}
	

}
