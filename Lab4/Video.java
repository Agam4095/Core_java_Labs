package Lab4;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year_rel;

	public Video() {
		super();
	}

	public Video(int UID, String title, int no_copies) {
		super(UID, title, no_copies);
	}

	public Video(int UID, String title, int no_copies, int time) {
		super(UID, title, no_copies, time);
	}

	public Video(int UID, String title, int no_copies, int time, String director, String genre, int year_rel) {
		super(UID, title, no_copies, time);
		this.director = director;
		this.genre = genre;
		this.year_rel = year_rel;
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear_rel() {
		return year_rel;
	}

	public void setYear_rel(int year_rel) {
		this.year_rel = year_rel;
	}

	public int getRuntime() {
		return super.getRuntime();
	}

	public void setRuntime(int runtime) {
		super.setRuntime(runtime);
	}

	@Override
	public String toString() {
		return super.toString() + "Video [director=" + director + ", genre=" + genre + ", year_rel=" + year_rel
				+ "]";
	}

	public void print() {
		super.print();
		System.out.println("Video [director=" + director + ", genre=" + genre + ", year_rel=" + year_rel + "]");
	}

}
