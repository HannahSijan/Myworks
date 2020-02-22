package com.merin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {
	
	
	
	
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	
	@PostMapping("/getInfo")
	public String information(@RequestParam ("uname")String uname,@RequestParam("pwd")String pwd,ModelMap modelmap)
	{
		modelmap.put("uname", uname);
		modelmap.put("pwd", pwd);
		return "details";
		
	}

}
