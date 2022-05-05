package by.epam.level04.task06;

import java.util.Scanner;

public class Output {

	public int inputHours(int h) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input  hours");
		h = sc.nextInt();
		if (h <= 24) {
			return h;
		} else {
			return 0;
		}
	}

	public int inputMinutes(int m) {
		System.out.println("Input minutes");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		if (m <= 60) {
			return m;
		} else {
			return 0;
		}
	}

	public int inputSec(int s) {
		System.out.println("Input seconds");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		if (s <= 60) {
			return s;
		} else {
			return 0;
		}
	}
}