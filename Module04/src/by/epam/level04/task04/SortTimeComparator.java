package by.epam.level04.task04;

import java.util.Comparator;

import task04.Train1;

public class SortTimeComparator implements Comparator<Train> {
	@Override
	public int compare(Train tr1, Train tr2) {
		int res = tr1.getNameOfDestination().compareTo(tr2.getNameOfDestination());
		if (res == 0) {
			res = tr1.getTimeOfDeparture().compareTo(tr2.getNameOfDestination());
		}
		return res;
	}
}
