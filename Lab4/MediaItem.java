package Lab4;

public abstract class MediaItem extends Item {

	private int runtime;

	public MediaItem() {
		super();
	}

	public MediaItem(int runtime) {
		super();
		this.runtime = runtime;
	}

	public MediaItem(int UID, String title, int no_copies) {
		super(UID, title, no_copies);
	}

	public MediaItem(int UID, String title, int no_copies, int time) {
		super(UID, title, no_copies);
		this.runtime = time;
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

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return super.toString() + " MediaItem [Runtime=" + runtime + "]";
	}

	public void print() {
		super.print();
		System.out.println("Runtime: " + runtime);
	}

}
