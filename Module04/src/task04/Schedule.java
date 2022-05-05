package task04;

public class Schedule {
	public void getSchedule(Train1[] trains) {
		System.out.println("Schedule of trains");
		for (Train1 train : trains) {
			System.out.println("The number of train: " + train.getNumberOfTrain() + " // Destination: "
					+ train.getNameOfDestination() + " //  Arrivale time: " + train.getTimeOfDeparture());
		}
	}
}
