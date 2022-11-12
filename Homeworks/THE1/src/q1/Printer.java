package q1;

import java.util.ArrayList;

public abstract class Printer {

	ArrayList<Printable> docs = new ArrayList<Printable>();

	abstract void printOut(Printable printable);

	public Printer() {
		super();
	}

	public void printAllDocuments() {
		for (Printable printable : docs) {
			printOut(printable);
		}
	};

	public void addDocument(Printable printable) {
		docs.add(printable);
	};

}