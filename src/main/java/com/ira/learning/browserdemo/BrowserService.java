package com.ira.learning.browserdemo;

import org.springframework.stereotype.Service;

@Service
public class BrowserService {

	public boolean validateQuery(String query) {

		return query.equalsIgnoreCase("Mercury") || query.equalsIgnoreCase("Venus") || query.equalsIgnoreCase("Earth")
				|| query.equalsIgnoreCase("Mars") || query.equalsIgnoreCase("Jupiter")
				|| query.equalsIgnoreCase("Saturn") || query.equalsIgnoreCase("Uranus")
				|| query.equalsIgnoreCase("Neptune") || query.equalsIgnoreCase("Pluto");
	}

}
