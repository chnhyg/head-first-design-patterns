package com.uxwind.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
  private final WeatherData weatherData;
  private float maxTemperature = 0.0f;
  private float minTemperature = 200;
  private float temperatureSum = 0.0f;
  private int numberReadings;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
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
