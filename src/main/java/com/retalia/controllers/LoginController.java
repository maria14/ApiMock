package com.retalia.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.mocks.UserMock;
import com.retalia.models.methods.LoginModel;
import com.retalia.models.User;

@Controller
@RequestMapping("/facebook")
public class LoginController {
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public User registerUSer(@RequestBody final String token){
		return UserMock.getMe();
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public LoginModel loginUser(@RequestBody final String token){

		return new LoginModel("Logado");
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.POST)
	@ResponseBody
	public LoginModel logoutUser(){

		return new LoginModel("Deslogado");
	}
	

}
