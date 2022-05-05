package by.epam.level04.task01;
/*
 * Простейшие классы и объекты.
   1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих 
   переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит 
   наибольшее значение из этих двух переменных
 */

public class Main {

	public static void main(String[] args) {
		Math math = new Math();
		Test01 test = new Test01(2, 6);
		View view = new View();

		math.getSum(test.getA(), test.getB());
		math.getHighestValue(test.getA(), test.getB());

		view.printX(test.getA());
		view.printY(test.getB());
		view.printSum(math.getSum(test.getA(), test.getB()));
		view.printHighestNum(math.getHighestValue(test.getA(), test.getB()));

	}
}
/*
 x = 2
 y = 6
 Sum = 8
 Highest number is 6

*/
