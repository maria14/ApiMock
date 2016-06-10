package com.retalia.models;

import java.util.Date;

public class Challenge {
	private int ID;
	private String Title;
	private String Description;
     private String CreatedDate;
     private User Owner ;
     private String PendingUserChallenges;
     private String RepliedUserChallenges;
     private String CompletedUserChallenges;
     private String UncompletedUserChallenges;

     public Challenge(int ID, String Title,String Description, String CreatedDate,User Owner,String PendingUserChallenges,String RepliedUserChallenges,String CompletedUserChallenges,String UncompletedUserChallenges){
    	 this.ID=ID;
    	 this.Title=Title;
    	 this.Description=Description;
    	 this.CreatedDate=CreatedDate;
    	 this.Owner=Owner;
    	 this.PendingUserChallenges=PendingUserChallenges;
    	 this.RepliedUserChallenges=RepliedUserChallenges;
    	 this.CompletedUserChallenges=CompletedUserChallenges;
    	 this.UncompletedUserChallenges=UncompletedUserChallenges;
    	 
     }

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}
	public User getOwner() {
		return Owner;
	}
	public void setOwner(User owner) {
		Owner = owner;
	}
	
	public String getPendingUserChallenges() {
		return PendingUserChallenges;
	}
	public String getRepliedUserChallenges() {
		return RepliedUserChallenges;
	}
	public String getCompletedUserChallenges() {
		return CompletedUserChallenges;
	}
	public String getUncompletedUserChallenges() {
		return UncompletedUserChallenges;
	}

}
