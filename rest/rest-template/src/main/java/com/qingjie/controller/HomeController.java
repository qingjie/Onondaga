package com.qingjie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qingjie.domain.Weather;

@RestController
public class HomeController {
	@RequestMapping("/")
	public Weather home() {
		RestTemplate restTemplate = new RestTemplate();
		Weather weather = restTemplate.getForObject("http://localhost:8080/data/weather.json", Weather.class);
		return weather;
	}
}
