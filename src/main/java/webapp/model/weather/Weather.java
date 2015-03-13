package webapp.model.weather;

import java.util.List;

public class Weather {

	Current current;
	List<Forecast> forecasts;
	public Current getCurrent() {
		return current;
	}
	public void setCurrent(Current current) {
		this.current = current;
	}
	public List<Forecast> getForecast() {
		return forecasts;
	}
	public void setForecast(List<Forecast> forecast) {
		this.forecasts = forecast;
	}
	
}
