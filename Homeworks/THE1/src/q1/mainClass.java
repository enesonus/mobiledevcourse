package q1;

import java.time.LocalDateTime;

public class mainClass {

	public static void main(String[] args) {
		Letter letter = new Letter("Mehmet Enes Onus",
				"This is my THE for CS310. Person who grades my work, have a good day!", "Whoever grades my THE");
		SpreadSheet spreadSheet = new SpreadSheet("CS310 THE", 12, 120);
		Report report = new Report("Enes's report", "This is Enes's report class for CS310 Take Home Exam",
				LocalDateTime.now());
		FilePrinter filePrinter = new FilePrinter("outputEnes.txt");
		ConsolePrinter consolePrinter = new ConsolePrinter();

		filePrinter.addDocument(letter);
		filePrinter.addDocument(report);
		filePrinter.addDocument(spreadSheet);

		consolePrinter.addDocument(letter);
		consolePrinter.addDocument(report);
		consolePrinter.addDocument(spreadSheet);

		filePrinter.printAllDocuments();
		consolePrinter.printAllDocuments();
	}

}
