package com.retalia.daos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.retalia.models.UserChallenge;

@Repository("userchallengeDao")
public class UserChallengeDao extends GenericDao{

	public void createUserChallenge(UserChallenge userChallenge) {
		this.save(userChallenge);
	}

	public List<UserChallenge> getUserChallengeByStatus(int cod) {
		return (List<UserChallenge>) this.executeQuery("FROM UserChallenge where status="+cod);
		
	}

	public UserChallenge getUserChallengeByID(int userChallengeID) {
		return (UserChallenge) this.get(UserChallenge.class,userChallengeID );
	}

	public void removeUserChallenge(UserChallenge userChallenge) {
		this.remove(userChallenge);
		
	}

	public void updateUserChallenge(UserChallenge userChallenge) {
		this.update(userChallenge);
		
	}

	public List<UserChallenge> getUserChallengesChallengesByStatusAndSearchType(String userID, int status, int type) {
		String sql= "FROM UserChallenge where status="+status;
		if (type==0){
			sql=sql+" and id_sender like '"+userID+"'";
		}else{
			sql=sql+" and id_Owner like '"+userID+"'";
		}
		return (List<UserChallenge>) this.executeQuery(sql);
	}

}
