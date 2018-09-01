package com.ira.learning.browserdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BrowserController {

	@Autowired
	private BrowserService service;

	@RequestMapping(value = "/welcome")
	public String showWelcomePage() {
		return "welcome";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String handleSearchRequest(@RequestParam String query, ModelMap model) {
		//
		if (!service.validateQuery(query)) {
			model.put("errorMessage", "No such match found! Please change keywords.");
			return "welcome";
		}
		//
		// // if (query.equalsIgnoreCase("Mercury")) {
		// // return "Mercury";
		// // }
		// // return "welcome";
		return "Mercury";
	}

}