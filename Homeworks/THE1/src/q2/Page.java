package q2;

public class Page {
	private int no;
	private String content;

	public Page() {
	}

	public Page(int no, String content) {
		super();
		this.content = content;
		this.no = no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getInfo() {
		return "Page: " + "no:" + no + ", content: " + content;
	}

	@Override
	public String toString() {
		return getInfo();
	}

}
