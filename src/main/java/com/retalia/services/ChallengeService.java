package com.retalia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retalia.daos.ChallengeDao;
import com.retalia.daos.UserDao;
import com.retalia.models.Challenge;

@Service("challengeService")
public class ChallengeService {
	@Autowired
	private ChallengeDao challengeDao;

	public void createChallenge(Challenge challenge) {
		challengeDao.createChallenge(challenge);
		
	}

	public Challenge getChallengeByID(int i) {
		return challengeDao.getChallengeByID(i);
	}

	public List<Challenge> search(String query) {
		return challengeDao.search(query);
	}
}
