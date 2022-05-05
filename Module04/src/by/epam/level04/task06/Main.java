package by.epam.level04.task06;

/*
 * Простейшие классы и объекты.
 * 6. Составьте описание класса для представления времени. Предусмотрите возможности установки времени и 
   изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае 
   недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на 
   заданное количество часов, минут и секунд.
 */
public class Main {

	public static void main(String[] args) {
		Output output = new Output();
		Time time = new Time();
		Change change = new Change();
		System.out.println("The time: " + output.inputHours(time.getHour()) + ":"
		+ output.inputMinutes(time.getMinute()) + ":" + output.inputSec(time.getSecunde()));
		System.out.println();
		System.out.println("Changed time: ");
		change.changeHours(output.inputHours(time.getHour()), 4);
		change.changeMin(output.inputMinutes(time.getMinute()), 23);
		change.changeSec(output.inputSec(time.getSecunde()), 15);
	}

}
/*
Input  hours
12
Input minutes
34
Input seconds
45
The time: 12:34:45

Changed time: 
Input  hours
2
Result: 6
Input minutes
34
Result: 57
Input seconds
23
Result:38
*/
