package com.system.rest;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.dao.UserImpl;

@RestController
public class UserRest {
	
	
	@Autowired
	private UserImpl user;

	@RequestMapping(value = "/hello")
	public Object listUser() {		
		return user.findAll();
	}

}
