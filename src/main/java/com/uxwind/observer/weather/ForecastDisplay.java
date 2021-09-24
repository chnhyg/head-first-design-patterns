package com.uxwind.observer.weather;

public class ForecastDisplay implements Observer, DisplayElement {
  private final WeatherData weatherData;
  private float currentPressure = 29.92f;
  private float lastPressure;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    lastPressure = currentPressure;
    currentPressure = pressure;
    display();
  }

  public void display() {
    System.out.print("Forecast: ");
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the way.");
    } else if (currentPressure == lastPressure) {
      System.out.println("More of the same.");
    } else if (currentPressure < lastPressure) {
      System.out.println("Watch out for cooler, rainy weather.");
    }
  }
}
