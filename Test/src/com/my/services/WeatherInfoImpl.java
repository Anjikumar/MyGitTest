package com.my.services;

import java.rmi.RemoteException;

import com.my.beans.WeatherCriteria;
import com.my.beans.WeatherStatus;

public class WeatherInfoImpl implements IWeatherInfo{

	

	public WeatherStatus getWeathrStatus(WeatherCriteria weatherCriteria)
		 {
		WeatherStatus w=new WeatherStatus();
		try
		{
		if(weatherCriteria!=null)
		{
			System.out.println("Weather critera:"+weatherCriteria.getCity()+"::"+weatherCriteria.getCountry()+"::"+weatherCriteria.getState());		
		}
		
		w.setTemperature(-3);
		w.setHumidity(11.00);
		w.setDescription("Its very cold");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return w;
	}

	
}
