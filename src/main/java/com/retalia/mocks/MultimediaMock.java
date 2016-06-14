package com.retalia.mocks;

import com.retalia.App;
import com.retalia.models.Multimedia;
import com.retalia.models.User;

public class MultimediaMock {
	
	public static Multimedia getMultimedia(User owner){
		return new Multimedia("https://www.youtube.com/watch?v=OJ2WCy1C494", "14",".mp4",0,owner);
	}

}
