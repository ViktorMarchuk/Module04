package by.epam.level04.task10;

import java.util.Objects;

public class Airline_add {
	private String destination;
	private String daysOfWeek;
	private double departureTime;
	private String addInfoAircraft;

	public Airline_add() {

	}

	public Airline_add(String destination, String daysOfWeek, double departureTime, String addInfoAircraft) {
		this.destination = destination;
		this.daysOfWeek = daysOfWeek;
		this.departureTime = departureTime;
		this.addInfoAircraft = addInfoAircraft;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public String getAddInfoAircraft() {
		return addInfoAircraft;
	}

	public void setAddInfoAircraft(String addInfoAircraft) {
		this.addInfoAircraft = addInfoAircraft;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addInfoAircraft, daysOfWeek, departureTime, destination);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline_add other = (Airline_add) obj;
		return Objects.equals(addInfoAircraft, other.addInfoAircraft) && Objects.equals(daysOfWeek, other.daysOfWeek)
				&& Double.doubleToLongBits(departureTime) == Double.doubleToLongBits(other.departureTime)
				&& Objects.equals(destination, other.destination);
	}

	@Override
	public String toString() {
		return "Airline_add [destination=" + destination + ", daysOfWeek=" + daysOfWeek + ", departureTime="
				+ departureTime + ", addInfoAircraft=" + addInfoAircraft + "]";
	}

}
