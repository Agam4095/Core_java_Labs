package Lab4;


public class CD extends MediaItem {
	private String artist;
	private String genre;

	public CD() {
		super();
	}

	public CD(int UID, String title, int no_copies) {
		super(UID, title, no_copies);
	}

	public CD(int UID, String title, int no_copies, int time) {
		super(UID, title, no_copies, time);
	}

	public CD(int UID, String title, int no_copies, int time, String artist, String genre) {
		super(UID, title, no_copies, time);
		this.artist = artist;
		this.genre = genre;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRuntime() {
		return super.getRuntime();
	}

	public void setRuntime(int runtime) {
		super.setRuntime(runtime);
	}

	@Override
	public String toString() {
		return super.toString() + "CD [artist=" + artist + ", genre=" + genre + "]";
	}

	public void print() {
		super.print();
		System.out.println("CD [artist=" + artist + ", genre=" + genre + "]");
	}

}
