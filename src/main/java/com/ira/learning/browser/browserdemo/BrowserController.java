package com.ira.learning.browser.browserdemo;

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

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcomePage() {
		return "welcome";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String handleLoginRequest(@RequestParam String query, ModelMap model) {

		if (!service.validateQuery(query)) {
			model.put("errorMessage", "No such match found! Please change keywords.");
			return "welcome";
		}
		// model.put("", );
		return "";
	}
}

/*
 * import org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication;
 * 
 * @SpringBootApplication public class BrowserDemoApplication {
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(BrowserDemoApplication.class, args); } }
 */