package dlrtn.designpattern.ch02;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observer[] observers;
    private int numObservers;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {
        observers = new Observer[10];
        numObservers = 0;
    }

    public void registerObserver(Observer o) {
        observers[numObservers] = o;
        numObservers++;
    }

    public void removeObserver(Observer o) {
        int i = 0;
        while (i < numObservers) {
            if (observers[i] == o) {
                break;
            }
            i++;
        }
        if (i < numObservers) {
            for (int j = i; j < numObservers - 1; j++) {
                observers[j] = observers[j + 1];
            }
            numObservers--;
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < numObservers; i++) {
            observers[i].update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
