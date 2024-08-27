package com.springboot.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.WeatherDto;
import com.springboot.model.WeatherMeasurement;
import com.springboot.service.WeatherService;

@RestController
public class WeatherConroller {

	@Autowired
	private WeatherService weatherService;
	
	@PostMapping("/addweather")
	private String recordWeatherMeasurement(@RequestBody WeatherMeasurement weatherDetails) {
		String message = weatherService.addWeatherMeasurement(weatherDetails);
		return message;
		
	}
	
	@GetMapping("/getweather/{startDate}/{endDate}")
	private List<WeatherMeasurement> getWeather(@PathVariable Date startDate, @PathVariable Date endDate) {
		List<WeatherMeasurement> weatherData = weatherService.getWeatherDetails(startDate, endDate);
		return weatherData;
		
	}
	
	@GetMapping("/retrieveStatics/{type}/{field}")
	private WeatherMeasurement retrieveStatics(@PathVariable String type, @PathVariable String field) {
		WeatherMeasurement weatherData = weatherService.retrieveStatics(type,field);
		return weatherData;
		
	}
}
