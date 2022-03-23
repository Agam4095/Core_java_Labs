package Lab4;

public abstract class Item {
	private int UID;
	private String title;
	private int no_copies;

	public Item() {
		super();
	}

	public Item(int uID, String title, int no_copies) {
		super();
		UID = uID;
		this.title = title;
		this.no_copies = no_copies;
	}

	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNo_copies() {
		return no_copies;
	}

	public void setNo_copies(int no_copies) {
		this.no_copies = no_copies;
	}

	@Override
	public String toString() {
		return "Item [UID=" + UID + ", title=" + title + ", no_copies=" + no_copies + "]";
	}

	public void print() {
		System.out.println("Title: " + title);
		System.out.println("ID: " + UID);
		System.out.println("Number of copies: " + no_copies);
	}

}
