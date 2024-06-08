package com.example.demo;

public class WeatherServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public WeatherServiceException(String message) {
		super(message);
	}
}
