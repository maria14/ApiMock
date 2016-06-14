package com.retalia.daos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.retalia.models.Challenge;

@Repository("challengeDao")
public class ChallengeDao extends GenericDao{

	public void createChallenge(Challenge challenge) {
		this.save(challenge);
		
	}

	public Challenge getChallengeByID(int id) {
		return (Challenge)this.get(Challenge.class, id);
	}

	public List<Challenge> search(String query) {
		String sql= "FROM Challenge where Title like '%"+query+"%'";
		return (List<Challenge>) this.executeQuery(sql);
	}

}
