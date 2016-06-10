package com.retalia.models;

public class Device {
	
	private String Id;
	private User Owner;
	private String GoogleCloudMessagingId;
	
	public Device(String id, User owner, String googleCloudMessagingId) {
		super();
		Id = id;
		Owner = owner;
		GoogleCloudMessagingId = googleCloudMessagingId;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public User getOwner() {
		return Owner;
	}

	public void setOwner(User owner) {
		Owner = owner;
	}

	public String getGoogleCloudMessagingId() {
		return GoogleCloudMessagingId;
	}

	public void setGoogleCloudMessagingId(String googleCloudMessagingId) {
		GoogleCloudMessagingId = googleCloudMessagingId;
	}

}
