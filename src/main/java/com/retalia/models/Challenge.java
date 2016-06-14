package com.retalia.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Challenge")
public class Challenge {
	
	@Id
	@GenericGenerator(name = "ID", strategy = "increment")
	@GeneratedValue(generator = "ID")
	@Column(name="ID", nullable=false, length=11)
	private int ID;
	
	@Column(name="Title" ,nullable=false, length=45)
	private String Title;
	
	@Column(name="Description",nullable=true, length=45)
	private String Description;
	
	@ManyToOne
	@JoinColumn(name = "Owner_id", nullable = true)
     private User Owner ;
	
	@Column(name="PendingUserChallenges",nullable=true, length=11)
     private String PendingUserChallenges;
	
	@Column(name="RepliedUserChallenges",nullable=true, length=11)
     private String RepliedUserChallenges;
	
	@Column(name="CompletedUserChallenges",nullable=true, length=11)
     private String CompletedUserChallenges;
	
	@Column(name="UncompletedUserChallenges",nullable=true, length=11)
     private String UncompletedUserChallenges;
	
	@Column(name="CreatedDate",nullable=true, length=45)
    private String CreatedDate;

     public Challenge(String Title,String Description, String CreatedDate,User Owner,String PendingUserChallenges,String RepliedUserChallenges,String CompletedUserChallenges,String UncompletedUserChallenges){
    	 this.Title=Title;
    	 this.Description=Description;
    	 this.CreatedDate=CreatedDate;
    	 this.Owner=Owner;
    	 this.PendingUserChallenges=PendingUserChallenges;
    	 this.RepliedUserChallenges=RepliedUserChallenges;
    	 this.CompletedUserChallenges=CompletedUserChallenges;
    	 this.UncompletedUserChallenges=UncompletedUserChallenges;
    	 
     }
     
     public Challenge(){
    	 super();
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

	
	public void setPendingUserChallenges(String pendingUserChallenges) {
		PendingUserChallenges = pendingUserChallenges;
	}

	public void setRepliedUserChallenges(String repliedUserChallenges) {
		RepliedUserChallenges = repliedUserChallenges;
	}

	public void setCompletedUserChallenges(String completedUserChallenges) {
		CompletedUserChallenges = completedUserChallenges;
	}

	public void setUncompletedUserChallenges(String uncompletedUserChallenges) {
		UncompletedUserChallenges = uncompletedUserChallenges;
	}

	public void plusPending() {
		int i=Integer.parseInt(PendingUserChallenges);
		i++;
		this.setPendingUserChallenges(String.valueOf(i));	
	}
	
	public void lessPending() {
		int i=Integer.parseInt(PendingUserChallenges);
		i--;
		this.setPendingUserChallenges(String.valueOf(i));	
	}
	
	public void plusReplied() {
		int i=Integer.parseInt(RepliedUserChallenges);
		i++;
		this.setRepliedUserChallenges(String.valueOf(i));	
	}
	
	public void lessReplied() {
		int i=Integer.parseInt(RepliedUserChallenges);
		i--;
		this.setRepliedUserChallenges(String.valueOf(i));	
	}
	
	public void plusUncompleted() {
		int i=Integer.parseInt(UncompletedUserChallenges);
		i++;
		this.setUncompletedUserChallenges(String.valueOf(i));	
	}
	
	public void lessUncompleted() {
		int i=Integer.parseInt(UncompletedUserChallenges);
		i--;
		this.setUncompletedUserChallenges(String.valueOf(i));	
	}
	
	public void pluscompleted() {
		int i=Integer.parseInt(CompletedUserChallenges);
		i++;
		this.setCompletedUserChallenges(String.valueOf(i));	
	}

	public void lessStatus(int status) {
		switch(status){
		case 0: 
			this.lessPending();
			break;
		case 1:
			this.lessReplied();
			break;
		case 3:
			this.lessUncompleted();
			break;
		}
		
	}

	public void plusStatus(int status) {
		switch(status){
		case 0: 
			this.plusPending();
			break;
		case 1:
			this.plusReplied();
			break;
		case 2:
			this.pluscompleted();
			break;
		case 3:
			this.plusUncompleted();
			break;
		}
		
	}
	
	

}
