package task04;

import java.util.Comparator;

public class SortTimeComparator implements Comparator<Train1> {
	@Override
	public int compare(Train1 tr1, Train1 tr2) {
		int res=tr1.getNameOfDestination().compareTo(tr2.getNameOfDestination());
		if(res==0) {
			res=tr1.getTimeOfDeparture().compareTo(tr2.getNameOfDestination());
		}
		return res;
	}
}