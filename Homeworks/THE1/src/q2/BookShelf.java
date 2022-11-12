package q2;

import java.util.ArrayList;

public class BookShelf {

//	Book
//	class must
//	also include
//	the total
//	number of pages,
//	and BookShelf
//
//	class must
//	also include
//	the total
//	number of
//	books in
//	the String
//	returned by
//
//	their getInfo() method.
	private ArrayList<Book> books = new ArrayList<Book>();
	private int numOfBooks = books.size();

	public BookShelf(ArrayList<Book> books) {
		super();
		this.books = books;
	}

	public BookShelf() {
	}

	public String getInfo() {
		return "BookShelf: \nTotal number of books:" + this.getTotalNumberOfBooks() + ", \n\n" + printBooks();
	}

	public String printBooks() {
		String result = "";
		for (Book i : books) {
			result += i.getInfo();
		}
		return result;
	}

	@Override
	public String toString() {
		return getInfo();
	}

	public int getTotalNumberOfBooks() {
		numOfBooks = books.size();
		return numOfBooks;
	}

	public Book getBook(int index) {
		return books.get(index);
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

}
