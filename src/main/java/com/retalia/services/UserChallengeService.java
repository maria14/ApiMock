package com.retalia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retalia.daos.ChallengeDao;
import com.retalia.daos.UserChallengeDao;
import com.retalia.models.Challenge;
import com.retalia.models.UserChallenge;


@Service("userchallengeService")
public class UserChallengeService {
	
	
	@Autowired
	private UserChallengeDao userChallengeDao;

	public void createUserChallenge(UserChallenge userChallenge) {
		userChallengeDao.createUserChallenge(userChallenge);
		
	}

	public List<UserChallenge> getUserChallengeByStatus(int cod) {
		return userChallengeDao.getUserChallengeByStatus(cod);
	}

	public UserChallenge getUserChallengeByID(int userChallengeID) {
		return userChallengeDao.getUserChallengeByID(userChallengeID);
	}

	public void removeUserChallenge(UserChallenge userChallenge) {
		userChallengeDao.removeUserChallenge(userChallenge);
		
	}

	public void updateUserChallenge(UserChallenge userChallenge) {
		userChallengeDao.updateUserChallenge(userChallenge);
		
	}

	public List<UserChallenge> getUserChallengesChallengesByStatusAndSearchType(String userID, int status, int type) {
		
		return userChallengeDao.getUserChallengesChallengesByStatusAndSearchType(userID, status, type);
	}

	public List<UserChallenge> getUserChallengesByChallengeIDAndStatus(int challengeID, int status) {
		return userChallengeDao.getUserChallengesByChallengeIDAndStatus(challengeID,status);
	}


	
	

}
