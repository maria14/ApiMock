package com.retalia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	@Column(name="ID", nullable=false, length=45)
    private String ID;
	
	@Column(name="FacebookID", nullable=false, length=45)
    private String FacebookID;
	
	@Column(name="Type", nullable=false, length=11)
    private int Type;
	
	@Column(name="Name", nullable=false, length=45)
    private String Name;
	
	@Column(name="Email", nullable=false, length=45)
    private String Email;
	
	@Column(name="Photo", nullable=true, length=310)
    private String Photo;
	
	@Column(name="Likes", nullable=true, length=20)
    private long Likes;
	
	@Column(name="Dislikes", nullable=true, length=20)
    private long Dislikes;
	
	@Column(name="RegistredDate", nullable=true,length=50)
    private String RegistredDate;

    
    public User(String ID,String FacebookID, int Type,String Name,String Email,String Photo,long Likes, long Dislikes,String RegistredDate){
    	this.ID=ID;
    	this.FacebookID=FacebookID;
    	this.Type=Type;
    	this.Name=Name;
    	this.Email=Email;
    	this.Photo=Photo;
    	this.Likes=Likes;
    	this.Dislikes=Dislikes;
    	this.RegistredDate=RegistredDate;
    }
    
    public User(){
    	this.ID="";
    	this.FacebookID="";
    	this.Type=0;
    	this.Name="";
    	this.Email="";
    	this.Photo="";
    	this.Likes=0;
    	this.Dislikes=0;
    	this.RegistredDate="";
    }
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFacebookID() {
		return FacebookID;
	}
	public void setFacebookID(String facebookID) {
		FacebookID = facebookID;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public long getLikes() {
		return Likes;
	}
	public void setLikes(long likes) {
		Likes = likes;
	}
	public long getDislikes() {
		return Dislikes;
	}
	public void setDislikes(long dislikes) {
		Dislikes = dislikes;
	}
	public String getRegistredDate() {
		return RegistredDate;
	}
	public void setRegistredDate(String registredDate) {
		RegistredDate = registredDate;
	}

}
