package q2;

import java.util.ArrayList;

public class mainClass {

	public static void main(String[] args) {
		Page page1 = new Page(1, "This is the 1st page");
		Page page2 = new Page(2, "This is the 2nd page");
		ArrayList<Page> firstList = new ArrayList<Page>();
		firstList.add(page1);
		firstList.add(page2);

		Page page3 = new Page(3, "This is the 3rd page");
		Page page4 = new Page(4, "This is the 4th page");
		ArrayList<Page> secondList = new ArrayList<Page>();
		secondList.add(page3);
		secondList.add(page4);

		Chapter chapter1 = new Chapter(1, "First Chapter", firstList);
		Chapter chapter2 = new Chapter(2, "Second Chapter", secondList);

		ArrayList<Chapter> firstBook = new ArrayList<Chapter>();
		firstBook.add(chapter1);

		ArrayList<Chapter> secondBook = new ArrayList<Chapter>();
		secondBook.add(chapter2);

		Book book1 = new Book("1st Book", "This is first book", firstBook);
		Book book2 = new Book("2nd Book", "This is second book", secondBook);

		ArrayList<Book> shelf = new ArrayList<Book>();
		shelf.add(book1);
		shelf.add(book2);
		BookShelf bookShelf = new BookShelf(shelf);

		System.out.print(bookShelf.getInfo());
		Book bookToPickUp = bookShelf.getBook(0);
		System.out.println("---------------------\nPick up book: \n" + bookToPickUp.getInfo());

	}

}
