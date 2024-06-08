package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	
	@Value("api.weather.realtime.get.uri")
	private String getRealtimeWeatherRequestURI;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public RealtimeWeather getRealtimeWeather() throws WeatherServiceException {
		try {
			return restTemplate.getForObject(getRealtimeWeatherRequestURI, RealtimeWeather.class);
		}
		catch(RestClientResponseException ex) {
			String message = "Error calling Get Realtime API: " + ex.getMessage();
			
			throw new WeatherServiceException(message);
		}
	}

}
