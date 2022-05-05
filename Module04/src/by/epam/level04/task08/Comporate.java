package by.epam.level04.task08;

import java.util.Comparator;

public class Comporate implements Comparator<Customer_add> {

	@Override
	public int compare(Customer_add c1, Customer_add c2) {
		return c1.getCustomData().compareTo(c2.getCustomData());
	}

}
