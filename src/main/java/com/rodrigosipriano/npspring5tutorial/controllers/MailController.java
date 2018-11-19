package com.rodrigosipriano.npspring5tutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigosipriano.npspring5tutorial.mail.MailSender;
import com.rodrigosipriano.npspring5tutorial.mail.MockMailSender;

@RestController
public class MailController {
	
	private MailSender mailSender = new MockMailSender();
	
	@RequestMapping("/mail")
	public String mauk() {
		
		mailSender.send("mail@exemple.com", "A test mail", "Boody of the test mail");
		
		return "Mail sent";
	}
}
