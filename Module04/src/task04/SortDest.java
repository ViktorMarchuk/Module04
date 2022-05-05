package task04;

import java.util.Arrays;

public class SortDest {
	public void sortDestination(Train1[] trains) {
		System.out.println("Sorting trains by destination");

		for (int j = 0; j < trains.length; j++) {
			for (int i = j + 1; i < trains.length; i++) {
				if (trains[i].getNameOfDestination().trim()
						.compareToIgnoreCase(trains[j].getNameOfDestination().trim()) < 0) {
					Train1 temp = trains[j];
					trains[j] = trains[i];
					trains[i] = temp;
				}
			}
			System.out.println("The number of train: " + trains[j].getNumberOfTrain() + " // Destination: "
					+ trains[j].getNameOfDestination() + " // Arrivale time: " + trains[j].getTimeOfDeparture());
		}
	}
}
