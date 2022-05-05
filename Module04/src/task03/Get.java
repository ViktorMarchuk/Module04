package task03;

public class Get {
	public void findStudent(Student1[] students) {
		System.out.println("The students with grades 9 and 10. ");
		for (Student1 student : students) {
			int count = 0;
			for (int grade : student.getGrades()) {
				if (grade >= 9) {
					count++;
				}
			}
			if (count == 5) {
				System.out.println("Student: " + student.getSurname() + " group: " + student.getGroupNumber());
			}
		}
	}
}
