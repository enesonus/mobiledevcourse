package q2;

import java.util.ArrayList;

public class Book {
	private String title;
	private String foreWord;
	private ArrayList<Chapter> chapters = new ArrayList<Chapter>();

	public String getInfo() {
		return "Book: title: " + title + ", foreWord: " + foreWord + ", \nTotal number of pages:"
				+ this.getNumberOfPages() + ", \n" + printChapters();
	}

	public String printChapters() {

		String result = "";
		for (Chapter i : chapters) {
			result += i.getInfo() + "\n";
		}
		return result;

	}

	@Override
	public String toString() {
		return getInfo();
	}

	private int getNumberOfPages() {
		int sum = 0;
		for (Chapter iterator : chapters) {
			sum += iterator.getPages().size();
		}
		return sum;
	}

	public Book(String title, String foreWord, ArrayList<Chapter> chapters) {
		super();
		this.title = title;
		this.foreWord = foreWord;
		this.chapters = chapters;
	}

	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getForeWord() {
		return foreWord;
	}

	public void setForeWord(String foreWord) {
		this.foreWord = foreWord;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

}
