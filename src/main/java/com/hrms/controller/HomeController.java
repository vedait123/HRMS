package com.hrms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/hrms")
@Slf4j
public class HomeController {
	
	private static final Logger log = 
		    org.apache.logging.log4j.LogManager.getLogger(HomeController.class);
	
	@GetMapping("/homepage")
	public String loadHomePage()  {
		log.info("Control entered into loadHomePage");
		try {
			
		}catch(Exception e) {
			log.error(e.getMessage());
			log.warn("Please take immediate action to avoid unnecessary problems");
		}
			
		log.info("Control exitted from the loadHomePage");   
		return "Welcome to HRMS!!";
	}

}
