package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.WeatherMeasurement;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherMeasurement, Integer> {

}
