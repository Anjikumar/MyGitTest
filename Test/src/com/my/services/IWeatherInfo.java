package com.my.services;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.my.beans.WeatherCriteria;
import com.my.beans.WeatherStatus;

public interface IWeatherInfo extends Remote{
	
	public WeatherStatus getWeathrStatus(WeatherCriteria weatherCriteria) throws RemoteException;

}
