package by.epam.level04.task04;

import java.util.Scanner;

import task04.Train1;

public class Output {

	public static boolean outputTrain(Train[] trains) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumberOfTrain() == n) {
				System.out.println("The number of train: " + trains[i].getNumberOfTrain() + "// Destination: "
						+ trains[i].getNameOfDestination() + "// Arrivale time: " + trains[i].getTimeOfDeparture());
				return true;
			}
		}
		System.out.println("Not found the number of this train");
		return false;
	}
}
