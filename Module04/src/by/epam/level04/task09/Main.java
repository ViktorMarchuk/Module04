package by.epam.level04.task09;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
 метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и 
 методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 
 Найти и вывести: 
 a) список книг заданного автора; 
 b) список книг, выпущенных заданным издательством; 
 c) список книг, выпущенных после заданного года
 */
public class Main {

	public static void main(String[] args) {
		int numberOfBooks = 5;
		Book_1[] books = new Book_1[numberOfBooks];
		books[0] = new Book_1("Shekspir W.", "Promen", 2002, "ID 23, book title Otello, 350 pages, hardcover");
		books[1] = new Book_1("Ekkel B.", "Astar ", 2006, "ID 34, book title Java, 456 pages, hardcover ");
		books[2] = new Book_1("Gerbert K.", "Book Print", 2010, "ID 321, book title Rain, 235 pages, softcover");
		books[3] = new Book_1("Pushkin A.", "Indigo", 2009, "ID 276, book title Onegin, 211 pages, frenchcover");
		books[4] = new Book_1("Ekkel J.", "West", 2007, "ID 45, book title People, 432 pages, harcover");

		Output output = new Output();
		output.outputConsol(books);
		System.out.println();
		output.getBookAuthor(books);
	    output.getPublisher(books);
	    output.getYear(books);

	}

}
/*
Author: Shekspir W.| Publisher:Promen| Year of publication: 2002| Other information about book: ID 23, book title Otello, 350 pages, hardcover
Author: Ekkel B.| Publisher:Astar | Year of publication: 2006| Other information about book: ID 34, book title Java, 456 pages, hardcover 
Author: Gerbert K.| Publisher:Book Print| Year of publication: 2010| Other information about book: ID 321, book title Rain, 235 pages, softcover
Author: Pushkin A.| Publisher:Indigo| Year of publication: 2009| Other information about book: ID 276, book title Onegin, 211 pages, frenchcover
Author: Ekkel J.| Publisher:West| Year of publication: 2007| Other information about book: ID 45, book title People, 432 pages, harcover

Enter the author
she
List of books published by a given author
Author: Shekspir W.|Publisher:Promen|Year of publication:2002| Other information about book: ID 23, book title Otello, 350 pages, hardcover
Enter the publisher
wqa
List of books published by a given publisher
Not found this publisher
Enter the year
2009
Author: Gerbert K.|Publisher:Book Print|Year of publication:2010| Other information about book: ID 321, book title Rain, 235 pages, softcover
Author: Pushkin A.|Publisher:Indigo|Year of publication:2009| Other information about book: ID 276, book title Onegin, 211 pages, frenchcover
*/

