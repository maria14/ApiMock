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
@Table(name="user_challenge")
public class UserChallenge {
	
	@Id
	@GenericGenerator(name = "ID", strategy = "increment")
	@GeneratedValue(generator = "ID")
	@Column(name="ID", nullable=false, length=11)
    private int ID;
	
	@ManyToOne
	@JoinColumn(name = "id_challenge", nullable = false)
    private Challenge Challenge;
	
	@ManyToOne
	@JoinColumn(name = "id_sender", nullable = false)	
    private User Sender;
	
	@ManyToOne
	@JoinColumn(name = "id_owner", nullable = false)
    private User Owner;
	
	@ManyToOne
	@JoinColumn(name = "id_multimedia", nullable = true)
    private Multimedia Multimedia;
	
	@Column(name="status", nullable=true, length=11)
    private int  Status;
	
	@Column(name="SendDate", nullable=false, length=11)	
    private String SendDate;
	
	@Column(name="Likes", nullable=false, length=11)
    private int Likes;
	
	@Column(name="Dislikes", nullable=false, length=11)
    private int Dislikes;
	
	@Column(name="UserVote", nullable=false, length=11)
    private String UserVote;
    

    
	public UserChallenge(Challenge challenge, User sender, User owner,
			Multimedia multimedia, int status, String sendDate,
			int likes, int dislikes, String UserVote) {
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
	
	public UserChallenge(){
		super();
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

	public void lessDislikes() {
		Dislikes--;
		
	}

	public void plusLikes() {
		Likes++;
		
	}

	public void lessLikes() {
		Likes--;
		
	}

	public void plusDislikes() {
		Dislikes++;
		
	}
	
	

	

}
