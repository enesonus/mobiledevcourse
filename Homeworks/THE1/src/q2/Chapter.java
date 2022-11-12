package q2;

import java.util.ArrayList;

public class Chapter {

	private int no;
	private String title;
	private ArrayList<Page> pages = new ArrayList<Page>();

	public String getInfo() {
		return "Chapter: no:" + no + ", title:" + title + "\n" + printPages();
	}

	@Override
	public String toString() {
		return getInfo();
	}

	public Chapter(int no, String title, ArrayList<Page> pages) {
		super();
		this.no = no;
		this.title = title;
		this.pages = pages;
	}

	public Chapter() {
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String printPages() {
		String result = "";
		for (Page i : pages) {
			result += i.getInfo() + "\n";
		}
		return result;
	}

	public ArrayList<Page> getPages() {
		return pages;
	}

	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}

}
