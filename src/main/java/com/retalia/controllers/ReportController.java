package com.retalia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.App;

@Controller
@RequestMapping("/report")
public class ReportController {
	
	@RequestMapping(value="/video",method=RequestMethod.POST)
	@ResponseBody
	public void reportVideo(@RequestParam(value="UserChallengeID")final int UserChallengeID,@RequestParam(value="ReportReason")final String ReportReason){
		//do nothing
	}

}
