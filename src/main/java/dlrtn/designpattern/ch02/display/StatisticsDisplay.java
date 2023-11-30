package dlrtn.designpattern.ch02.display;

import dlrtn.designpattern.ch02.Observer;
import dlrtn.designpattern.ch02.Subject;
import dlrtn.designpattern.ch02.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {

        display();
    }

    public void display() {
        System.out.println("Statistics: " + temperature + "F degrees and " + humidity
                + "% humidity and " + pressure + " pressure");
    }

}
