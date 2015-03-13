package webapp.model.weather;

import java.util.Date;

public class Current {
	String temperature;
	String skycode;
	String skytext;
	Date   date;
	String observationtime;
	String observationpoint;
	String feelslike;
	String humidity;
	String winddisplay;
	String day;
	String shortday;
	String windspeed;
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temprature) {
		this.temperature = temprature;
	}
	public String getSkycode() {
		return skycode;
	}
	public void setSkycode(String skycode) {
		this.skycode = skycode;
	}
	public String getSkytext() {
		return skytext;
	}
	public void setSkytext(String skytext) {
		this.skytext = skytext;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getObservationtime() {
		return observationtime;
	}
	public void setObservationtime(String observationtime) {
		this.observationtime = observationtime;
	}
	public String getObservationpoint() {
		return observationpoint;
	}
	public void setObservationpoint(String observationpoint) {
		this.observationpoint = observationpoint;
	}
	public String getFeelslike() {
		return feelslike;
	}
	public void setFeelslike(String feelslike) {
		this.feelslike = feelslike;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWinddisplay() {
		return winddisplay;
	}
	public void setWinddisplay(String winddisplay) {
		this.winddisplay = winddisplay;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getShortday() {
		return shortday;
	}
	public void setShortday(String shortday) {
		this.shortday = shortday;
	}
	public String getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(String windspeed) {
		this.windspeed = windspeed;
	}
	
}
