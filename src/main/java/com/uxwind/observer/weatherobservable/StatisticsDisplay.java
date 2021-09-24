package com.uxwind.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  private final Observable observable;
  private float maxTemperature = 0.0f;
  private float minTemperature = 200;
  private float temperatureSum = 0.0f;
  private int numberReadings;

  public StatisticsDisplay(Observable observable) {
    this.observable = observable;
    this.observable.addObserver(this);
  }

  public void update(Observable observable, Object arg) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      float temperature = weatherData.getTemperature();
      temperatureSum += temperature;
      numberReadings++;
      if (temperature > maxTemperature) {
        maxTemperature = temperature;
      }
      if (temperature < minTemperature) {
        minTemperature = temperature;
      }
      display();
    }
  }

  public void display() {
    System.out.println(
        "Avg/Max/Min temperature = "
            + (temperatureSum / numberReadings)
            + "/"
            + maxTemperature
            + "/"
            + minTemperature
            + ".");
  }
}
