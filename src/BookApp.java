public class BookApp {

    public static void main(String[] args) {
	// create a book instance
        Book b =
                new Book ("Martian Chronicles", "Ray Bradbury",
                "excellent collection of science fiction short stories",
                       6.16, true );
        System.out.println(b.getDisplayText());
        if (b.getBookPricing(10) > 0) {
            System.out.printf("$%.2f", b.getBookPricing(10));
        }
        else {
            System.out.println("The book is out of stock");
        }
    }
}
