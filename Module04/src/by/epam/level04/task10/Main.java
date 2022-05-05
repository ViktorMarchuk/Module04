package by.epam.level04.task10;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
 и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и 
 методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. 
 Найти и вывести: 
 a) список рейсов для заданного пункта назначения; 
 b) список рейсов для заданного дня недели; 
 c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {

	public static void main(String[] args) {
		int numberOfAircraft = 5;
		Airline_add[] airline = new Airline_add[numberOfAircraft];
		airline[0] = new Airline_add(" Tbilisi", " Monday ", 8.34, " Flight number 234, Boing 737");
		airline[1] = new Airline_add(" Warshawa ", " Saturday ", 2.35, " Flight number 875, Airbus 1000");
		airline[2] = new Airline_add(" Barcelona ", " Friday ", 23.45, " Flight number 543, Boing 770");
		airline[3] = new Airline_add(" Milan ", " Monday ", 10.55, " Flight number 432, Boing 737");
		airline[4] = new Airline_add(" Barcelona ", " Satyrday ", 12.45, " Flight number 876, Boing 737");

		List list = new List();
		list.getList(airline);
		System.out.println();
		list.getDest(airline);
		System.out.println();
		list.getDay(airline);
		System.out.println();
		list.getFlightByTime(airline);
	}

}

/*
Destination: Tbilisi // Day of Week: Monday  // Depature time:8.34 //  Flight number 234, Boing 737
Destination: Warshawa  // Day of Week: Saturday  // Depature time:2.35 //  Flight number 875, Airbus 1000
Destination: Barcelona  // Day of Week: Friday  // Depature time:23.45 //  Flight number 543, Boing 770
Destination: Milan  // Day of Week: Monday  // Depature time:10.55 //  Flight number 432, Boing 737
Destination: Barcelona  // Day of Week: Satyrday  // Depature time:12.45 //  Flight number 876, Boing 737

List of flights for a given destination
Enter destination
bar
Destination: Barcelona  // Day of Week: Friday  // Depature time:23.45 //  Flight number 543, Boing 770
Destination: Barcelona  // Day of Week: Satyrday  // Depature time:12.45 //  Flight number 876, Boing 737

List of flights for a given day of the week
Enter day
mon
Destination: Tbilisi // Day of Week: Monday  // Depature time:8.34 //  Flight number 234, Boing 737
Destination: Milan  // Day of Week: Monday  // Depature time:10.55 //  Flight number 432, Boing 737

List of flights for a given day of the week, the departure time for which is longer than the specified one
Enter day
mon
Enter time
10
Destination: Milan  // Day of Week: Monday  // Depature time:10.55 //  Flight number 432, Boing 737
 */