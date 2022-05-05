package by.epam.level04.task09;

import java.util.Objects;

public class Book_1 {
	private String author;
	private String publisher;
	private int yearOfPublication;
	private String infoAboutBook;

	public Book_1() {

	}

	public Book_1(String author, String publisher, int yearOfPublication, String infoAboutBook) {
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublication = yearOfPublication;
		this.infoAboutBook = infoAboutBook;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getInfoAboutBook() {
		return infoAboutBook;
	}

	public void setInfoAboutBook(String infoAboutBook) {
		this.infoAboutBook = infoAboutBook;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, infoAboutBook, publisher, yearOfPublication);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book_1 other = (Book_1) obj;
		return Objects.equals(author, other.author) && Objects.equals(infoAboutBook, other.infoAboutBook)
				&& Objects.equals(publisher, other.publisher) && yearOfPublication == other.yearOfPublication;
	}

	@Override
	public String toString() {
		return "Book_1 [author=" + author + ", publisher=" + publisher + ", yearOfPublication=" + yearOfPublication
				+ ", infoAboutBook=" + infoAboutBook + "]";
	}

}
