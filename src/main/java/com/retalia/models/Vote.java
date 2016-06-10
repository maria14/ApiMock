package com.retalia.models;


public class Vote {
    private int ID;
    private int UserChallengeID;
    private int VoterID;
    
    
	public Vote(int iD, int userChallengeID, int voterID) {

		ID = iD;
		UserChallengeID = userChallengeID;
		VoterID = voterID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getUserChallengeID() {
		return UserChallengeID;
	}
	public void setUserChallengeID(int userChallengeID) {
		UserChallengeID = userChallengeID;
	}
	public int getVoterID() {
		return VoterID;
	}
	public void setVoterID(int voterID) {
		VoterID = voterID;
	}


}
