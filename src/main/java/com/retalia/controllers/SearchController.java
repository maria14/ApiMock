package com.retalia.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.App;
import com.retalia.models.Challenge;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	@RequestMapping(value="/challenges",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Challenge> getUserChallenges( @RequestParam(value="query")final String query, @RequestParam(value="PageNumber")final int pageNumber ){
		return App.searchChallenge(query);
	}
	

}
