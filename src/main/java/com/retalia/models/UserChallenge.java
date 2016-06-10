package com.retalia.models;


public class UserChallenge {
    private int ID;
    private Challenge Challenge;
    private User Sender;
    private User Owner;
    private Multimedia Multimedia;
    private int  Status;
    private String SendDate;
    private int Likes;
    private int Dislikes;
    private String UserVote;
    

    
	public UserChallenge(int iD, Challenge challenge, User sender, User owner,
			Multimedia multimedia, int status, String sendDate,
			int likes, int dislikes, String UserVote) {
		ID = iD;
		Challenge = challenge;
		Sender = sender;
		Owner = owner;
		Multimedia = multimedia;
		Status = status;
		SendDate = sendDate;
		Likes = likes;
		Dislikes = dislikes;
		this.UserVote=UserVote;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public Challenge getChallenge() {
		return Challenge;
	}



	public void setChallenge(Challenge challenge) {
		Challenge = challenge;
	}



	public User getSender() {
		return Sender;
	}



	public void setSender(User sender) {
		Sender = sender;
	}



	public User getOwner() {
		return Owner;
	}



	public void setOwner(User owner) {
		Owner = owner;
	}



	public Multimedia getMultimedia() {
		return Multimedia;
	}



	public void setMultimedia(Multimedia multimedia) {
		Multimedia = multimedia;
	}



	public int getStatus() {
		return Status;
	}



	public void setStatus(int status) {
		Status = status;
	}



	public String getSendDate() {
		return SendDate;
	}



	public void setSendDate(String sendDate) {
		SendDate = sendDate;
	}



	public int getLikes() {
		return Likes;
	}



	public void setLikes(int likes) {
		Likes = likes;
	}



	public int getDislikes() {
		return Dislikes;
	}



	public void setDislikes(int dislikes) {
		Dislikes = dislikes;
	}



	public String getUserVote() {
		return UserVote;
	}



	public void setUserVote(String userVote) {
		UserVote = userVote;
	}
	
	

	

}
