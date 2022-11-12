package q1;

public class FilePrinter extends Printer {
	String fileName;

	public FilePrinter(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	void printOut(Printable printable) {

		System.out.println("Data printed to the " + fileName + ": ");
		System.out.println(printable.getContent());
		System.out.println("-------------------------");
	}

}
