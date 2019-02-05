package com.concrete;

public class WeatherStation {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		 
		CurrentConditionDisplay currentConditionsDisplay = new CurrentConditionDisplay(weatherData);
		CurrentConditionDisplay currentConditionsDisplay2 = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(56.7f, 62, 28.1f);
		

		
	}

}
