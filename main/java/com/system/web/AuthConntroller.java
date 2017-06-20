package com.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.system.entity.UserSession;

@Controller
@SessionAttributes("user_session")
public class AuthConntroller {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@ModelAttribute("user_session")
	public UserSession createSession() {
		UserSession tmp = new UserSession();
		tmp.setUserName("tino");
		tmp.setLastName("chagua");
		return tmp;
	}

}
