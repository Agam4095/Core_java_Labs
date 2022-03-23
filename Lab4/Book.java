package Lab4;

public class Book extends WrittenItem {
	Book() {
		super();
	}

	Book(int UID, String title, int no_copies) {
		super(UID, title, no_copies);
	}

	Book(int UID, String title, int no_copies, String author) {
		super(UID, title, no_copies, author);

	}

	public int getUID() {
		return super.getUID();
	}

	public void setUID(int UID) {
		super.setUID(UID);
	}

	public String getTitle() {
		return super.getTitle();
	}

	public void setTitle(String title) {
		super.setTitle(title);
	}

	public int getNo_copies() {
		return super.getNo_copies();
	}

	public void setNo_copies(int no_copies) {
		super.setNo_copies(no_copies);
	}

	public String getAuthor() {
		return getAuthor();
	}

	public void setAuthor(String author) {
		this.setAuthor(author);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public void print() {
		super.print();
	}

}