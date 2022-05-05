package by.epam.level04.task09;

import java.util.Scanner;

public class Output {

	public void outputConsol(Book_1[] books) {
		for (Book_1 book : books) {
			System.out.println("Author: " + book.getAuthor() + "| Publisher:" + book.getPublisher()
					+ "| Year of publication: " + book.getYearOfPublication() + "| Other information about book: "
					+ book.getInfoAboutBook());
		}
	}
		public Scanner getScan() {
			Scanner sc = new Scanner(System.in);
			return sc;
	}

	public void getBookAuthor(Book_1[] books) {
		System.out.println("Enter the author");
		String m = getScan().next();
		boolean flag = true;
		System.out.println("List of books published by a given author");
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().toLowerCase().contains(m)) {
				flag = false;
				System.out.println("Author: " + books[i].getAuthor() + "|Publisher:" + books[i].getPublisher()
						+ "|Year of publication:" + books[i].getYearOfPublication() + "| Other information about book: "
						+ books[i].getInfoAboutBook());
			}
		}
		if (flag) {
			System.out.println("Not found this author");
		}
	}

	public void getPublisher(Book_1[] books) {
		System.out.println("Enter the publisher");	
		String n = getScan().next();
		boolean flag = true;
		System.out.println("List of books published by a given publisher");
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublisher().toLowerCase().contains(n)) {
				flag = false;
				System.out.println("Author: " + books[i].getAuthor() + "|Publisher:" + books[i].getPublisher()
						+ "|Year of publication:" + books[i].getYearOfPublication() + "| Other information about book: "
						+ books[i].getInfoAboutBook());
			}
		}
		if (flag) {
			System.out.println("Not found this publisher");
		}
	}

	public void getYear(Book_1[] books) {
		System.out.println("Enter the year");
		boolean flag = true;
		int x = getScan().nextInt();
		for (int i = 0; i < books.length; i++) {
			if (books[i].getYearOfPublication() >= x) {
				flag = false;
				System.out.println("Author: " + books[i].getAuthor() + "|Publisher:" + books[i].getPublisher()
						+ "|Year of publication:" + books[i].getYearOfPublication() + "| Other information about book: "
						+ books[i].getInfoAboutBook());
			}
		}
		if (flag) {
			System.out.println("Not found");
		}
	}
}

