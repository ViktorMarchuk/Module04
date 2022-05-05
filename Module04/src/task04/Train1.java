package task04;

import java.util.Objects;

public class Train1 implements Comparable<Train1> {
	private String nameOfDestination;
	private int numberOfTrain;
	private String timeOfDeparture;

	public Train1() {

	}

	public Train1(int numberOfTrain, String nameOfDestination, String timeOfDeparture) {
		this.nameOfDestination = nameOfDestination;
		this.numberOfTrain = numberOfTrain;
		this.timeOfDeparture = timeOfDeparture;

	}

	public String getNameOfDestination() {
		return nameOfDestination;
	}

	public void setNameOfDestination(String nameOfDestination) {
		this.nameOfDestination = nameOfDestination;
	}

	public int getNumberOfTrain() {
		return numberOfTrain;
	}

	public void setNumberOfTrain(int numberOfTrain) {
		this.numberOfTrain = numberOfTrain;

	}

	public String getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(String timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameOfDestination, numberOfTrain, timeOfDeparture);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train1 other = (Train1) obj;
		return Objects.equals(nameOfDestination, other.nameOfDestination) && numberOfTrain == other.numberOfTrain
				&& Objects.equals(timeOfDeparture, other.timeOfDeparture);
	}

	@Override
	public int compareTo(Train1 o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Train [nameOfDestination=" + nameOfDestination + ", numberOfTrain=" + numberOfTrain
				+ ", timeOfDeparture=" + timeOfDeparture + "]";
	}

}