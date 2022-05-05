package by.epam.level04.task04;

public class Schedule {
	public void getSchedule(Train[] trains) {
		System.out.println("Schedule of trains");
		for (Train train : trains) {
			System.out.println("The number of train: " + train.getNumberOfTrain() + " // Destination: "
					+ train.getNameOfDestination() + " //  Arrivale time: " + train.getTimeOfDeparture());
		}
	}
}
