package com.springboot.service;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.exception.WeatherException;
import com.springboot.model.WeatherMeasurement;
import com.springboot.repository.WeatherRepository;

@Service
public class WeatherService {
	
	private WeatherRepository weatherRepo;

	public String addWeatherMeasurement(WeatherMeasurement weatherDetails) {
		String msg ="";
		try{
			weatherRepo.save(weatherDetails);
			msg = "Weather details added successfully.";
		}catch (Exception e) {
			msg = "Error while adding weather details.";
			System.out.println("Error :: "+ e.getMessage());
			throw new WeatherException("Can't able to add weather details");
		}
		return msg;
	}

	public List<WeatherMeasurement> getWeatherDetails(Date startDate, Date endDate) {
		
		List<WeatherMeasurement> weatherData = weatherRepo.findAll().stream().filter(w -> (startDate.before(w.getTimestamp()) || startDate.equals(w.getTimestamp())) && (endDate.after(w.getTimestamp()) || endDate.equals(w.getTimestamp())))
		.collect(Collectors.toList());
		if(weatherData.size() ==0) {
			throw new WeatherException("No weather details with in this time range");
		}
		return weatherData;
	}

	public WeatherMeasurement retrieveStatics(String type, String field) {
		List<WeatherMeasurement> weatherData = weatherRepo.findAll();
		if(type.equals("max")) {
			if(field.equals("temperature")) {
				return weatherData.stream().max(Comparator.comparing(WeatherMeasurement :: getTemperature)).orElseThrow(() -> new WeatherException("can't able to find max temperature"));
			}else if(field.equals("humidity")) {
				return weatherData.stream().max(Comparator.comparing(WeatherMeasurement :: getHumidity)).orElseThrow(() -> new WeatherException("can't able to find max humidity"));
			}
		}
		if(type.equals("min")) {
			if(field.equals("temperature")) {
				return weatherData.stream().min(Comparator.comparing(WeatherMeasurement :: getTemperature)).orElseThrow(() -> new WeatherException("can't able to find min temperature"));
			}else if(field.equals("humidity")) {
				return weatherData.stream().min(Comparator.comparing(WeatherMeasurement :: getHumidity)).orElseThrow(() -> new WeatherException("can't able to find min humidity"));
			}
		}
	
		return null;
	}
	

}
