public class TesteBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');
        // Testar construtor
        Book book = new Book("Java for Dummy", authors, 19.99);
        // Verificar método toString()
        System.out.println(book);
        // Testar o Setter
        book.setPrice(59.90);
        book.setQty(5);
        // Testar os Getters
        System.out.println(book.getName());
        for (int i = 0; i < book.getAuthors().length; i++) {
            System.out.println(book.getAuthors()[i]);
        }
        System.out.println("Price: " + book.getPrice());
        System.out.println("Qty: " + book.getQty());
        System.out.println("Author names: " + book.getAuthorNames());
    }
}