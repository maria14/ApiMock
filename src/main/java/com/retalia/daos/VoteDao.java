package com.retalia.daos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.retalia.models.Challenge;
import com.retalia.models.Vote;

@Repository("voteDao")
public class VoteDao extends GenericDao{

	public Vote getVoteByUserChallengeID(int userChallengeID) {
		String sql= "FROM Vote where id_user_challenge="+userChallengeID;
		List<Vote> votes= (List<Vote>) this.executeQuery(sql);
		if (votes.size()==0){
			return null;
		}else{
			return votes.get(0);
		}
	}

	public void createVote(Vote vote) {
		this.save(vote);
		
	}

	public void delete(Vote vote) {
		this.remove(vote);
		
	}




}
