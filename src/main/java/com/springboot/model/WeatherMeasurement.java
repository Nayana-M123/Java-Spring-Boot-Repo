package com.springboot.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "weather-measurement")
public class WeatherMeasurement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int stationId;
	
	@Column
	private Timestamp timestamp;
	
	@Column
	private double temperature;
	
	@Column
	private double humidity;
	
	@Column
	private double windSpeed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	@Override
	public String toString() {
		return "WeatherMeasurement [id=" + id + ", stationId=" + stationId + ", timestamp=" + timestamp
				+ ", temperature=" + temperature + ", humidity=" + humidity + ", windSpeed=" + windSpeed + "]";
	}
	
}
