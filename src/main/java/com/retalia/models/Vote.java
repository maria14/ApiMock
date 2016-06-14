package com.retalia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vote")
public class Vote {
	@Id
	@GenericGenerator(name = "ID", strategy = "increment")
	@GeneratedValue(generator = "ID")
	@Column(name="ID", nullable=false, length=11)
    private int ID;
	
	@Column(name="id_user_challenge", nullable=false, length=11)
    private int UserChallengeID;
	
	@Column(name="id_voter", nullable=false, length=11)
    private int VoterID;
    
    
	public Vote(int userChallengeID, int voterID) {

		UserChallengeID = userChallengeID;
		VoterID = voterID;
	}
	
	public Vote(){
		super();
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
