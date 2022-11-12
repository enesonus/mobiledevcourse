package q1;

public class ConsolePrinter extends Printer {

	@Override
	void printOut(Printable printable) {
		System.out.println("Data Printed to console: ");
		System.out.println(printable.getContent());
		System.out.println("----------------------");
	}

	public ConsolePrinter() {
		super();
	}

}
