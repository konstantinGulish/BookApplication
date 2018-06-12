public class Book {

    //instance variables
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //constructors

    public Book() {
    }

    public Book(String title, String author, String description,
                double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    //instance methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getDisplayText() {
        return "Author: " + getAuthor() + "\n" +
                "Title: " + getTitle() + "\n" +
                "Description: " + getDescription();

    }


}


