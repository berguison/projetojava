package br.com.treinaweb.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeControler {
	@RequestMapping("/index")
	public String index()
	{
		return "home";
	}
	
}
