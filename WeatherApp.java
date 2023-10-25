import java.util.List;


class WeatherData {
    private String location;
    private double temperature;
    private String condition;

    public WeatherData(String location, double temperature, String condition) {
        this.location = location;
        this.temperature = temperature;
        this.condition = condition;
    }


}


interface WeatherDataAdapter {
    List<WeatherData> fetchWeatherData();
}


class WeatherDataAdapterA implements WeatherDataAdapter {
    @Override
    public List<WeatherData> fetchWeatherData() {
        return null;
    }

}

class WeatherDataAdapterB implements WeatherDataAdapter {
    @Override
    public List<WeatherData> fetchWeatherData() {
        return null;
    }

}

class WeatherDataAdapterC implements WeatherDataAdapter {
    @Override
    public List<WeatherData> fetchWeatherData() {
        return null;
    }

}


public class WeatherApp {
    public static void main(String[] args) {
        WeatherDataAdapter adapterA = new WeatherDataAdapterA();
        WeatherDataAdapter adapterB = new WeatherDataAdapterB();
        WeatherDataAdapter adapterC = new WeatherDataAdapterC();

        List<WeatherData> daataFromAPIA = adapterA.fetchWeatherData();
        List<WeatherData> daataFromAPIB = adapterB.fetchWeatherData();
        List<WeatherData> daataFromAPIC = adapterC.fetchWeatherData();


    }
}
