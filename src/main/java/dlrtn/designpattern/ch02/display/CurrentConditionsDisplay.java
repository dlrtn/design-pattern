package dlrtn.designpattern.ch02.display;


import dlrtn.designpattern.ch02.Observer;
import dlrtn.designpattern.ch02.Subject;
import dlrtn.designpattern.ch02.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
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
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity
                + "% humidity and " + pressure + " pressure");
    }

}
