package by.epam.level04.task08;

import java.util.Arrays;

/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
   и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами 
   и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
   Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
   Найти и вывести: 
   a) список покупателей в алфавитном порядке; 
   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main {

	public static void main(String[] args) {
		int customerCount = 5;
		Customer_add[] customers = new Customer_add[customerCount];
		customers[0] = new Customer_add(423, "Marchuk V.V.", "Minsk, 3 Svobody str", 2345, 875634);
		customers[1] = new Customer_add(234, "Shved A.T.", "Minsk, 14 Svobody str", 1243, 985743);
		customers[2] = new Customer_add(254, "Berg I.N.", "Minsk, 9 Svobody str", 2346, 485456);
		customers[3] = new Customer_add(543, "Jarosh J.K.", "Minsk, 45 Scoriny str", 4512, 764934);
		customers[4] = new Customer_add(124, "Arnold  T.U.", "Brest,45 Turovskaya str", 3477, 127465);
		List list = new List();
		Comporate comporate = new Comporate();
		OutputViaScanner sc=new OutputViaScanner();
		System.out.println("List of customers");
		list.getCustom(customers);
		System.out.println();
		System.out.println("Sorting list of customers by alphabet");

		Arrays.sort(customers, comporate);
		for (Customer_add customer : customers) {
			System.out.println("ID Customer:" + customer.getId() + "//Customer data:" + customer.getCustomData()
					+ "//Customer addres:" + customer.getAddres() + "//Customer card number:" + customer.getCardNumber()
					+ "//Customer account number:" + customer.getAccountNumber());
		}
		System.out.println();
		sc.outputCustomer(customers);
		}

	}

