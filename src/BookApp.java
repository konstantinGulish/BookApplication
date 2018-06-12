public class BookApp {

    public static void main(String[] args) {
	// create a book instance
        Book b =
                new Book ("Martian Chronicles", "Ray Bradbury",
                "excellent collection of science fiction short stories",
                       6.16, true );
        System.out.println(b.getDisplayText());
    }
}
