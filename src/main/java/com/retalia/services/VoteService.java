package com.retalia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retalia.daos.ChallengeDao;
import com.retalia.daos.UserDao;
import com.retalia.daos.VoteDao;
import com.retalia.models.Challenge;
import com.retalia.models.Vote;

@Service("voteService")
public class VoteService {
	@Autowired
	private VoteDao voteDao;

	public Vote getVoteByUserChallengeID(int userChallengeID) {
		return voteDao.getVoteByUserChallengeID(userChallengeID);
	}

	public void createVote(Vote vote) {
		voteDao.createVote(vote);
		
	}

	public void update(Vote vote) {
		voteDao.update(vote);
		
	}

	public void delete(Vote vote) {
		voteDao.delete(vote);
		
	}



}
