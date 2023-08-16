public class Book {
    private final String name;
    private final Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();

        for (Author author : this.authors) {
            names.append(author.getName()).append(", ");
        }

        return names.toString();
    }

    @Override
    public String toString() {
        StringBuilder authors = new StringBuilder();

        for (Author author : this.authors) {
            authors.append(author).append(", ");
        }

        return "Book[" +
                "name=" + name + ", "+
                "authors=" + authors + ", "+
                "price=" + price + ", "+
                "qty=" + qty +
                "]";
    }
}