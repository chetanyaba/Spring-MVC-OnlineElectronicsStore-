package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/myaccount")
	public String myaccount()
	{
		return "myaccount";
	}
	

}
