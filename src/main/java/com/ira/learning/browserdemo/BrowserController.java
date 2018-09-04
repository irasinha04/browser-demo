package com.ira.learning.browserdemo;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BrowserController {

	@RequestMapping(value = "/welcome")
	public String showWelcomePage() {
		return "welcome";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String handleSearchRequest(@RequestParam String query, ModelMap model) throws IOException {

		if (query.equalsIgnoreCase("Mercury")) {
			return "Mercury";
		}

		else if (query.equalsIgnoreCase("Venus")) {
			return "Venus";
		}

		else if (query.equalsIgnoreCase("Earth")) {
			return "Earth";
		}

		else if (query.equalsIgnoreCase("Mars")) {
			return "Mars";
		}

		else if (query.equalsIgnoreCase("Jupiter")) {
			return "Jupiter";
		}

		else if (query.equalsIgnoreCase("Saturn")) {
			return "Saturn";
		}

		else if (query.equalsIgnoreCase("Uranus")) {
			return "Uranus";
		}

		else if (query.equalsIgnoreCase("Neptune")) {
			return "Neptune";
		}

		else if (query.equalsIgnoreCase("Pluto")) {
			return "Pluto";
		}

		model.put("errorMessage", "No such page found. Try again.");
		return "welcome";
	}

	// public void myController(HttpServletResponse response) throws IOException {
	// response.sendRedirect("/myURL");
	// }

}