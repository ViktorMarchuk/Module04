package by.epam.level04.task02;

/*
 * Простейшие классы и объекты.
 * 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
   конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра 
   класса.

 */
public class Main {

	public static void main(String[] args) {
		Test02 test = new Test02(4, 6);
		View view = new View();

		view.printX(test.getA());
		view.printY(test.getB());

	}

}

/*
 * x = 4 
 * y = 6
 */