package Lab4;

public class JournalPaper extends WrittenItem {
	private int year;

	JournalPaper() {
		super();
	}

	public JournalPaper(int year) {
		super();
		this.year = year;
	}

	JournalPaper(int UID, String title, int no_copies) {
		super(UID, title, no_copies);
	}

	JournalPaper(int UID, String title, int no_copies, String author) {
		super(UID, title, no_copies, author);

	}

	JournalPaper(int UID, String title, int no_copies, String author, int year) {
		super(UID, title, no_copies, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
		return super.toString() + "Year of publish :" + this.year;
	}

	public void print() {
		super.print();
		System.out.println("Year of publish :" + this.year);
	}

}