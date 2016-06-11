package com.retalia.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retalia.App;
import com.retalia.mocks.UserMock;
import com.retalia.models.Device;
import com.retalia.models.User;
import com.retalia.models.UserChallenge;
import com.retalia.types.StatusType;

@Controller
@RequestMapping("/devices")
public class DeviceController {

	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public void addDevice(@RequestParam(value="DeviceId")final int deviceId,@RequestParam(value="GcmID")final String gcmID){
		//do nothing
	}
	
	@RequestMapping(value="{idDevice}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Device getDevice(@PathVariable String idDevice){
		return new Device(idDevice,UserMock.getMe(),"APA91bHXGQAcQZajIgg8L0HMaqq6ooLnc_nIQZqAoOpu_JuoT23QjbItP1heD0M3pcBc35VCYFmHp6Au_RIUIPH4V8YWIWzgj6KwA3ArPnjVXlM6jxrrTDWIyGGzs8GDvMF81Ir5gWaa");
	}
	

}
