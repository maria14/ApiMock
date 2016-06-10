package com.retalia.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.App;
import com.retalia.models.UserChallenge;
import com.retalia.types.StatusType;

@Controller
@RequestMapping("/userschallenges")
public class UserChallengeController {
	
	@RequestMapping(value="/filter",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserChallenge> getUserChallenges( @RequestParam(value="Status")final String status, @RequestParam(value="PageNumber")final int pageNumber ){
		return App.getUserChallengesChallengesByStatus(StatusType.get(status).getCod());
	}

}
