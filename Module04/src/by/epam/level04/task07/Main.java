package by.epam.level04.task07;

/*
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
   площади, периметра и точки пересечения медиан.
 */
public class Main {

	public static void main(String[] args) {
		double x1 = 2.0;
		double y1 = 1.0;
		double x2 = 4.0;
		double y2 = 7.0;
		double x3 = 8.0;
		double y3 = 2.0;

		Triangle t = new Triangle();
		Logic logic = new Logic();

		System.out.println("The square is: " + logic.getSquare(x1, y1, x2, y2, x3, y3));
		System.out.println("The perimetr is: " + logic.getPerimetr(x1, y1, x2, y2, x3, y3));
		System.out.println("The median is: " + logic.getMedian(x1, y1, x2, y2, x3, y3));
		logic.getCoordinateOfMedian(x1, y1, x2, y2, x3, y3);
	}

}

/*
The square is: 17.0
The perimetr is: 9.405221044033913
The median is: 7.053367989832942
The coordinates of median is X = 4.666666666666667 and Y =3.3333333333333335
*/
