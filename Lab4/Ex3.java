package Lab4;

public class Ex3 {
	
	public static void main(String[] args) {
		
		System.out.println("Book");  //1001,"Think and Grow Rich", 5,"Napolean Hill"
		Book b = new Book(1001,"Think and Grow Rich", 5,"Napolean Hill");
		b.print();
		System.out.println();
		
		System.out.println("Journal Paper");
		JournalPaper j = new JournalPaper(12987, "Diagnosis of Brain Tumor using AI", 5, "Ashray Gupta", 2021);
		j.print();
		System.out.println();
		
		System.out.println("Video");
		Video v = new Video(10009, "Avengers", 5, 3,"Anthony Russo", "Sci-Fi", 2020);
		v.print();
		System.out.println();
		
		System.out.println("CD");
		CD c=new CD(5001, "Coke Studio", 10, 2, "Various", "Love");
		c.print();
	
	}

}
