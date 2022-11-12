package q1;

import java.time.LocalDateTime;

public class Report implements Printable {

	String title, text;
	LocalDateTime reportDate;

	public Report(String title, String text, LocalDateTime reportDate) {
		super();
		this.title = title;
		this.text = text;
		this.reportDate = reportDate;
	}

	@Override
	public String getContent() {
		return "Report [title=" + title + ", text=" + text + ", reportDate=" + reportDate + "]";
	}

}
