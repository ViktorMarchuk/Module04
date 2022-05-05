package task04;

public class Sort {
	public void sortTrain(Train1[] trains) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < trains.length - 1; i++) {
				if (trains[i].getNumberOfTrain() > trains[i + 1].getNumberOfTrain()) {
					Train1 temp = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = temp;
					sorted = false;
				}
			}
		}
		System.out.println("Sorted trains by number");
		for (int j = 0; j < trains.length; j++) {
			System.out.println("The number of train: " + trains[j].getNumberOfTrain() + " // Destination: "
					+ trains[j].getNameOfDestination() + " // Arrivale time: " + trains[j].getTimeOfDeparture());
		}
	}
}
