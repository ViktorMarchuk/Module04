package task04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
   Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
   номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
   Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
   назначения должны быть упорядочены по времени отправления
 */
public class Main {

	public static void main(String[] args) {
		int quantityOfTrain = 5;
		Train1[] trains = new Train1[quantityOfTrain];
		trains[0] = new Train1(234, "Brest", "12.38");
		trains[1] = new Train1(12, "Minsk", "16.51");
		trains[2] = new Train1(45, "Brest", "13.25");
		trains[3] = new Train1(56, "Grodno", "18.42");
		trains[4] = new Train1(23, "Pruzhany", "7.45");

		Schedule schedule = new Schedule();
		Output output = new Output();
		Sort sort = new Sort();
		SortDest sortdest = new SortDest();
		Comparator sortTime = new SortTimeComparator();

		schedule.getSchedule(trains);
		System.out.println();

		sort.sortTrain(trains);
		System.out.println();

		System.out.println("Enter the number");
		output.outputTrain(trains);
		System.out.println();

		sortdest.sortDestination(trains);
		System.out.println();

		System.out.println("Sorting trains by the time and destination");
		Arrays.sort(trains, sortTime);
		for (Train1 train : trains) {
			System.out.println("The number of train: " + train.getNumberOfTrain() + " // Destination: "
					+ train.getNameOfDestination() + " // Arrivale time:" + train.getTimeOfDeparture());
		}
	}
}

/*
Schedule of trains
The number of train: 234 // Destination: Brest //  Arrivale time: 12.38
The number of train: 12 // Destination: Minsk //  Arrivale time: 16.51
The number of train: 45 // Destination: Brest //  Arrivale time: 13.25
The number of train: 56 // Destination: Grodno //  Arrivale time: 18.42
The number of train: 23 // Destination: Pruzhany //  Arrivale time: 7.45

Sorted trains by number
The number of train: 12 // Destination: Minsk // Arrivale time: 16.51
The number of train: 23 // Destination: Pruzhany // Arrivale time: 7.45
The number of train: 45 // Destination: Brest // Arrivale time: 13.25
The number of train: 56 // Destination: Grodno // Arrivale time: 18.42
The number of train: 234 // Destination: Brest // Arrivale time: 12.38

Enter the number
12
The number of train: 12// Destination: Minsk// Arrivale time: 16.51

Sorting trains by destination
The number of train: 45 // Destination: Brest // Arrivale time: 13.25
The number of train: 234 // Destination: Brest // Arrivale time: 12.38
The number of train: 56 // Destination: Grodno // Arrivale time: 18.42
The number of train: 12 // Destination: Minsk // Arrivale time: 16.51
The number of train: 23 // Destination: Pruzhany // Arrivale time: 7.45

Sorting trains by the time and destination
The number of train: 234 // Destination: Brest // Arrivale time:12.38
The number of train: 45 // Destination: Brest // Arrivale time:13.25
The number of train: 56 // Destination: Grodno // Arrivale time:18.42
The number of train: 12 // Destination: Minsk // Arrivale time:16.51
The number of train: 23 // Destination: Pruzhany // Arrivale time:7.45
*/
