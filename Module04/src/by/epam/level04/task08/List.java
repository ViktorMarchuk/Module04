package by.epam.level04.task08;

public class List {
	public void getCustom(Customer_add[] customers) {
		for (Customer_add customer : customers) {
			System.out.println("ID Customer:" + customer.getId() + "//Customer data:" + customer.getCustomData()
					+ "//Customer addres:" + customer.getAddres() + "//Customer card number:" + customer.getCardNumber()
					+ "//Customer account number:" + customer.getAccountNumber());
		}
	}

	public void sort(Customer_add[] customers) {
		boolean sort = false;
		while (!sort) {
			sort = true;
			for (int i = 0; i < customers.length-1; i++) {
				if (customers[i].getCustomData().compareToIgnoreCase(customers[i + 1].getCustomData()) > 0) {
					Customer_add temp = customers[i];
					customers[i] = customers[i + 1];
					customers[i + 1] = temp;
					sort = false;

				}
			}
		}
			for (Customer_add customer : customers) {
				System.out.println("ID Customer:" + customer.getId() + "//Customer data:" + customer.getCustomData()
						+ "//Customer addres:" + customer.getAddres() + "//Customer card number:"
						+ customer.getCardNumber() + "//Customer account number:" + customer.getAccountNumber());
			}
		}
	}

