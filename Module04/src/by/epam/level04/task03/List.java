package by.epam.level04.task03;

import task03.Student1;

public class List {
	public void getList(Student1[] students) {
		System.out.println("The list of students.");
		for (Student1 student : students) {
			System.out.println("Student: " + student.getSurname() + " group: " + student.getGroupNumber());

		}
	}
}
