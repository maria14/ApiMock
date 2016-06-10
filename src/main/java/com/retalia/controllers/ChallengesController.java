package com.retalia.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.App;
import com.retalia.mocks.UserMock;
import com.retalia.models.Challenge;
import com.retalia.models.Multimedia;
import com.retalia.models.User;
import com.retalia.models.UserChallenge;

@Controller
@RequestMapping("/challenges")
public class ChallengesController {
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	@ResponseBody
	public Challenge createChallenge(@RequestParam(value="Title") String title,@RequestParam(value="Description") String description,@RequestParam(value="FacebookUserIDs") String facebookUserIDs){
		Challenge challenge=new Challenge(App.getNumNextChallenge(),title,description,"16/02/2016 12:03:02",UserMock.getMe(),"1","0","0","0");
		App.addChallenge(challenge);
		UserChallenge userChallenge= new UserChallenge(App.getNumNextUserChallenge(),challenge, UserMock.getMe(), UserMock.getRandomUser(),
				null, 0, "16/02/2016 12:03:02",
				0, 0, "0");
		App.addUserChallenge(userChallenge);
		return challenge;
	}
	
	@RequestMapping(value="/send",method=RequestMethod.POST)
	@ResponseBody
	public UserChallenge sendChallenge(@RequestParam(value="ChallengeID") int ChallengeID,@RequestParam(value="FacebookUserIDs") String facebookUserIDs){
		UserChallenge userChallenge= new UserChallenge(App.getNumNextUserChallenge(),App.getChallenge(ChallengeID), UserMock.getMe(), UserMock.getRandomUser(),
				null, 0, "16/02/2016 12:03:02",
				0, 0, "0");
		App.addUserChallenge(userChallenge);
		return userChallenge;
	}

}
