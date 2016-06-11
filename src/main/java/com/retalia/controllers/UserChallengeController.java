package com.retalia.controllers;

import java.util.List;

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
import com.retalia.models.UserChallenge;
import com.retalia.models.methods.LoginModel;
import com.retalia.types.SearchType;
import com.retalia.types.StatusType;

@Controller
@RequestMapping("/userschallenges")
public class UserChallengeController {
	
	@RequestMapping(value="/filter",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserChallenge> getUserChallenges( @RequestParam(value="Status")final String status, @RequestParam(value="PageNumber")final int pageNumber ){
		return App.getUserChallengesChallengesByStatus(StatusType.get(status).getCod());
	}
	
	@RequestMapping(value="/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeUserChallenge(@RequestParam(value="UserChallengeID")final int UserChallengeID){
		App.removeUserChallenge(UserChallengeID);	
	}
	
	@RequestMapping(value="/uncompleted",method=RequestMethod.POST)
	@ResponseBody
	public void uncompletedUserChallenge(@RequestParam(value="UserChallengeID")final int UserChallengeID){
		App.changeStatus(UserChallengeID,3);	
	}
	
	@RequestMapping(value="/completed",method=RequestMethod.POST)
	@ResponseBody
	public void completedUserChallenge(@RequestParam(value="UserChallengeID")final int UserChallengeID){
		App.changeStatus(UserChallengeID,2);	
	}
	
	@RequestMapping(value="/retry",method=RequestMethod.POST)
	@ResponseBody
	public void retryUserChallenge(@RequestParam(value="UserChallengeID")final int UserChallengeID){
		App.changeStatus(UserChallengeID,1);	
	}
	
	@RequestMapping(value="/users/{userID}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserChallenge> getUserChallengesBySearchTypeAndStatus( @PathVariable String userID,@RequestParam(value="SearchType")final String searchType, @RequestParam(value="Status")final String status,@RequestParam(value="PageNumber")final int pageNumber ){
		return App.getUserChallengesChallengesByStatusAndSearchType(userID,StatusType.get(status).getCod(),SearchType.get(searchType).getCod());
	}
	
	//revisar
	@RequestMapping(value="/reply",method=RequestMethod.POST)
	@ResponseBody
	public void replyUserChallenge(@RequestParam(value="UserChallengeID")final int userChallengeID,@RequestParam(value="Video") final MultipartFile video){
		App.addVideo(userChallengeID);
		App.changeStatus(userChallengeID, 1);
	}
	
	@RequestMapping(value="/challenges/{challengeID}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserChallenge> getUserChallengesByChallengeIDAndStatus( @PathVariable int challengeID, @RequestParam(value="Status")final String status,@RequestParam(value="PageNumber")final int pageNumber ){
		return App.getUserChallengesByChallengeIDAndStatus(challengeID,StatusType.get(status).getCod());
	}

}
