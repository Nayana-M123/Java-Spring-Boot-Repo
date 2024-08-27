package com.springboot.dto;

import com.springboot.model.WeatherMeasurement;

public class WeatherDto {
    private double minTemperature;
    private WeatherMeasurement minWeather;
    private double maxTemperature;
    private WeatherMeasurement maxWeather;
    private double avgTemperature;
    private WeatherMeasurement avgWeather;
    
    private double minHumidity;
    private double maxHumidity;
    private double avgHumidity;
    
    private double minWindSpeed;
    private double maxWindSpeed;
    private double avgWindSpeed;
	public double getMinTemperature() {
		return minTemperature;
	}
	public void setMinTemperature(double minTemperature) {
		this.minTemperature = minTemperature;
	}
	public WeatherMeasurement getMinWeather() {
		return minWeather;
	}
	public void setMinWeather(WeatherMeasurement minWeather) {
		this.minWeather = minWeather;
	}
	public double getMaxTemperature() {
		return maxTemperature;
	}
	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	public WeatherMeasurement getMaxWeather() {
		return maxWeather;
	}
	public void setMaxWeather(WeatherMeasurement maxWeather) {
		this.maxWeather = maxWeather;
	}
	public double getAvgTemperature() {
		return avgTemperature;
	}
	public void setAvgTemperature(double avgTemperature) {
		this.avgTemperature = avgTemperature;
	}
	public WeatherMeasurement getAvgWeather() {
		return avgWeather;
	}
	public void setAvgWeather(WeatherMeasurement avgWeather) {
		this.avgWeather = avgWeather;
	}
	public double getMinHumidity() {
		return minHumidity;
	}
	public void setMinHumidity(double minHumidity) {
		this.minHumidity = minHumidity;
	}
	public double getMaxHumidity() {
		return maxHumidity;
	}
	public void setMaxHumidity(double maxHumidity) {
		this.maxHumidity = maxHumidity;
	}
	public double getAvgHumidity() {
		return avgHumidity;
	}
	public void setAvgHumidity(double avgHumidity) {
		this.avgHumidity = avgHumidity;
	}
	public double getMinWindSpeed() {
		return minWindSpeed;
	}
	public void setMinWindSpeed(double minWindSpeed) {
		this.minWindSpeed = minWindSpeed;
	}
	public double getMaxWindSpeed() {
		return maxWindSpeed;
	}
	public void setMaxWindSpeed(double maxWindSpeed) {
		this.maxWindSpeed = maxWindSpeed;
	}
	public double getAvgWindSpeed() {
		return avgWindSpeed;
	}
	public void setAvgWindSpeed(double avgWindSpeed) {
		this.avgWindSpeed = avgWindSpeed;
	}
	
    
}
