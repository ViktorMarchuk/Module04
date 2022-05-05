package by.epam.level04.task08;

import java.util.Scanner;

public class OutputViaScanner {
	public void outputCustomer(Customer_add[] customers) {
		System.out.println("List of customers whose credit card number is in the specified interval");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a six-digit number");
			int n = sc.nextInt();
			System.out.println("Enter a six-digit number");
			int m = sc.nextInt();
			if (n < 100000 || m < 100000) {
				System.out.println("Enter correct interval");
			} else {

				for (int i = 0; i < customers.length; i++) {
					if (customers[i].getAccountNumber() >= n && customers[i].getAccountNumber() <= m) {
						System.out.println("ID Customer:" + customers[i].getId() + "//Customer data:"
								+ customers[i].getCustomData() + "//Customer addres:" + customers[i].getAddres()
								+ "//Customer card number:" + customers[i].getCardNumber()
								+ "//Customer account number:" + customers[i].getAccountNumber());
					}
				}
				break;
			}
		}
	}
}

/*
List of customers
ID Customer:423//Customer data:Marchuk V.V.//Customer addres:Minsk, 3 Svobody str//Customer card number:2345//Customer account number:875634
ID Customer:234//Customer data:Shved A.T.//Customer addres:Minsk, 14 Svobody str//Customer card number:1243//Customer account number:985743
ID Customer:254//Customer data:Berg I.N.//Customer addres:Minsk, 9 Svobody str//Customer card number:2346//Customer account number:485456
ID Customer:543//Customer data:Jarosh J.K.//Customer addres:Minsk, 45 Scoriny str//Customer card number:4512//Customer account number:764934
ID Customer:124//Customer data:Arnold  T.U.//Customer addres:Brest,45 Turovskaya str//Customer card number:3477//Customer account number:127465

Sorting list of customers by alphabet
ID Customer:124//Customer data:Arnold  T.U.//Customer addres:Brest,45 Turovskaya str//Customer card number:3477//Customer account number:127465
ID Customer:254//Customer data:Berg I.N.//Customer addres:Minsk, 9 Svobody str//Customer card number:2346//Customer account number:485456
ID Customer:543//Customer data:Jarosh J.K.//Customer addres:Minsk, 45 Scoriny str//Customer card number:4512//Customer account number:764934
ID Customer:423//Customer data:Marchuk V.V.//Customer addres:Minsk, 3 Svobody str//Customer card number:2345//Customer account number:875634
ID Customer:234//Customer data:Shved A.T.//Customer addres:Minsk, 14 Svobody str//Customer card number:1243//Customer account number:985743

List of customers whose credit card number is in the specified interval
Enter a six-digit number
34
Enter a six-digit number
657
Enter correct interval
Enter a six-digit number
700000
Enter a six-digit number
900000
ID Customer:543//Customer data:Jarosh J.K.//Customer addres:Minsk, 45 Scoriny str//Customer card number:4512//Customer account number:764934
ID Customer:423//Customer data:Marchuk V.V.//Customer addres:Minsk, 3 Svobody str//Customer card number:2345//Customer account number:875634
*/