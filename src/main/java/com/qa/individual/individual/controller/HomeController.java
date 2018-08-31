package com.qa.individual.individual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HomeController {
	

	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
}
