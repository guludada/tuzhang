package com.guludada.tuzhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guludada.tuzhang.service.showUser;
import com.guludada.tuzhang.serviceImpl.showUserImpl;


@Controller
@RequestMapping(value="/test")
public class helloworldController {
	
	@Autowired
	private showUser showuser;
//	public helloworldController(showUser showuser) {
//		this.showuser = showuser;
//	}
	
	@RequestMapping(value="/helloWorld",method = RequestMethod.GET)
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!"+showuser.showuser()+"!");
		return "helloWorld";
	}

	public showUser getShowuser() {
		return showuser;
	}

	public void setShowuser(showUser showuser) {
		this.showuser = showuser;
	}
	
	
}
