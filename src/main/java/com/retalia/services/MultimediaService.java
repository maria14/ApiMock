package com.retalia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retalia.daos.ChallengeDao;
import com.retalia.daos.MultimediaDao;
import com.retalia.daos.UserDao;
import com.retalia.models.Challenge;
import com.retalia.models.Multimedia;

@Service("multimediaService")
public class MultimediaService {
	@Autowired
	private MultimediaDao multimediaDao;

	public void createMultimedia(Multimedia multimedia) {
		multimediaDao.createMultimedia(multimedia);
		
	}

	
}
