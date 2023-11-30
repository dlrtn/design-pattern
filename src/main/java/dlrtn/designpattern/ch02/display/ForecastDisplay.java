package dlrtn.designpattern.ch02.display;

import dlrtn.designpattern.ch02.Observer;
import dlrtn.designpattern.ch02.Subject;
import dlrtn.designpattern.ch02.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

    public float temperature;
    public float humidity;
    public float pressure;
    public WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();

        display();
    }

    public void display() {
        System.out.println("Forecast: " + temperature + "F degrees and " + humidity
                + "% humidity and " + pressure + " pressure");
    }
}
