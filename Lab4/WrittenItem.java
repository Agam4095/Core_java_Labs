package Lab4;

public abstract class WrittenItem extends Item {

	private String author;

	public WrittenItem() {
		super();
	}

	public WrittenItem(int UID, String title, int no_copies) {
		super(UID, title, no_copies);
	}

	public WrittenItem(String author) {
		super();
		this.author = author;
	}

	public WrittenItem(int UID, String title, int no_copies, String author) {
		super(UID, title, no_copies);
		this.author = author;
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
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString() + " WrittenItem [author=" + author + "]";
	}

	public void print() {
		super.print();
		System.out.println("Author: " + author);
	}

}
