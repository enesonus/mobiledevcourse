package q1;

public class Letter implements Printable {

	String sender, textContent, receiver;

	public Letter(String sender, String textContent, String receiver) {
		super();
		this.sender = sender;
		this.textContent = textContent;
		this.receiver = receiver;
	}

	@Override
	public String getContent() {
		return "Letter [sender=" + sender + ", textContent=" + textContent + ", receiver=" + receiver + "]";
	}

}
