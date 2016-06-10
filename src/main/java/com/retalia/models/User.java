package com.retalia.models;

import java.sql.Date;


public class User {

    private String ID;
    private String FacebookID;
    private int Type;
    private String Name;
    private String Email;
    private String Photo;
    private long Likes;
    private long Dislikes;
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
