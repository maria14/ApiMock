package com.retalia.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.mocks.UserMock;
import com.retalia.models.User;


@Controller
@RequestMapping("/users")
public class UserController {
	
	@RequestMapping(value="/me",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public User getAllCustomers(){
		return UserMock.getMe();
	}
	
	@RequestMapping(value="/facebook/friends",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<User> getMyFriends(){
		return UserMock.getMyFriends();
	}
	
	//tengo que comprobar donde se usa porque lo mismo va con el facebookID y no con el ID como va este (getUsuario)
	@RequestMapping(value="/facebook/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public User getUser(@PathVariable(value="id")final int id){
		return UserMock.getUser(id);
		
	}

}
