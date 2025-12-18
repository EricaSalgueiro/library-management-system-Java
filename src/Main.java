import model.Livro;
import service.Biblioteca;

void main() {
    Biblioteca biblioteca = new Biblioteca();

    biblioteca.adicionarLivro(new Livro( "J.K. Rowling", "Harry Potter"));
    biblioteca.adicionarLivro(new Livro( "Tolkien", "O Senhor dos Anéis"));

    biblioteca.emprestarLivro("Harry Potter");
    biblioteca.listarLivros();
}
