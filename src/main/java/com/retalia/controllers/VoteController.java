package com.retalia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.App;

@Controller
@RequestMapping("/vote")
public class VoteController {
	
	@RequestMapping(value="/like",method=RequestMethod.POST)
	@ResponseBody
	public void likeUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="VoterID")final int voterID){
		App.addLike(userChallengeID);
	}
	
	@RequestMapping(value="/like/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeLikeUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="VoterID")final int voterID){
		App.removeLike(userChallengeID);
	}
	
	@RequestMapping(value="/dislike",method=RequestMethod.POST)
	@ResponseBody
	public void dislikeUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="VoterID")final int voterID){
		App.addDislike(userChallengeID);
	}
	
	@RequestMapping(value="/dislike/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeDislikeUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="VoterID")final int voterID){
		App.removeDislike(userChallengeID);
	}
	

}
