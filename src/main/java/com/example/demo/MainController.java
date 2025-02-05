package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("")
	public String viewHomeahgge(Model model) {
		try {
			RealtimeWeather realtimeWeather = weatherService.getRealtimeWeather();
			
			model.addAttribute("weather", realtimeWeather);
		
			return "index";
		} catch (WeatherServiceException ex) {
			model.addAttribute("message", ex.getMessage());
			
			return "error";
		}
	}

}
