package com.retalia.models;

import java.util.ArrayList;

public class FriendsPage<T> {
	
	private ArrayList<T> items ;
	
	public FriendsPage(ArrayList<T> items) {
		this.items = items;
		
	}
	
	public ArrayList<T> getItems() {
		return items;
	}

	public void setItems(ArrayList<T> items) {
		this.items = items;
	}

}
