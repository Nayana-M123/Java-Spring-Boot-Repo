package com.springboot.exception;

public class WeatherException extends RuntimeException {
	String msg;

	public WeatherException(String msg) {
		super();
		this.msg = msg;
	}

}
