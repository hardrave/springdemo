package com.michal.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/userform", method = RequestMethod.GET)
	public String userform() {
		return "<form action=\"/usergreeting\" method=\"POST\">\n"
				+ "  <label for=\"fname\">First name:</label><br>\n"
				+ "  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\n"
				+ "  <label for=\"lname\">Last name:</label><br>\n"
				+ "  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n"
				+ "  <input type=\"submit\" value=\"Submit\">\n"
				+ "</form> \n"
				+ "\n"
				+ "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/usergreeting\".</p>";
	}
	@RequestMapping(value = "/usergreeting", method = RequestMethod.POST)
	public String printUserGreeting(@RequestParam String fname, @RequestParam String lname) {
		return "Hello there " + fname + " " + lname;		
	}
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public String printUserID(@PathVariable String id) {
		return "Order id: " + id;		
	}
//	
//	@RequestMapping(value = "/error")
//	public String printError() {
//		return "Cycu Error ";		
//	}
}
