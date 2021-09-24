package com.uxwind.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private final WeatherData weatherData;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println(
        "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
  }
}
