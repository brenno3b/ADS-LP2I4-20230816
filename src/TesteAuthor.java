public class TesteAuthor {
    public static void main(String[] args) {
        // Testar construtor
        Author author = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        // Verificar método toString()
        System.out.println(author);
        // Testar o Setter
        author.setEmail("albertinho.com@yahoo.com");
        // Testar os Getters
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
    }
}