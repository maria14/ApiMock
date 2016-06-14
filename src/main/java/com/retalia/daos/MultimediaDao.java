package com.retalia.daos;

import org.springframework.stereotype.Repository;

import com.retalia.models.Challenge;
import com.retalia.models.Multimedia;

@Repository("multimediaDao")
public class MultimediaDao extends GenericDao{

	public void createMultimedia(Multimedia multimedia) {
		this.save(multimedia);
		
	}



}
