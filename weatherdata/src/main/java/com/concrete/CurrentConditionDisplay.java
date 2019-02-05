package com.concrete;

import java.util.Observable;
import java.util.Observer;

import com.model.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	

	public void update(Observable obs, Object arg) {

		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
		

	}

	public void display() {
		System.out.println("Current Conditions : "+temperature+" F degrees and  "+humidity+" % humidity");		
	}

}
