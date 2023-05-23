package Exercicio2;
import java.util.ArrayList;
public class Cadastro {
    private String nomeLivro;
    private int isbn;
    private String nomeAutor;
    private String genero;
    public Cadastro(String nomeLivro, int isbn, String nomeAutor, String genero) {
        this.nomeLivro = nomeLivro;
        this.isbn = isbn;
        this.nomeAutor = nomeAutor;
        this.genero = genero;
    }
    public String getNomeLivro() {
        return nomeLivro;
    }
    public String getIsbn() {
        return nomeLivro;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public String getGenero() {
        return genero;
    }
    public void registroLivro(int isbn) {
        System.out.println("O livro foi registrado com o ISBN.");
    }
    public void registroLivro(int isbn, String nomeLivro) {
        System.out.println("O livro foi registrado com o ISBN e o nome.");
    }
    public void registroLivro(int isbn, String nomeLivro, String genero) {
        System.out.println("O livro foi registrado com o ISBN, nome e o gênero.");
    }
    public void registroLivro(int isbn, String nomeLivro, String genero, String nomeAutor) {
        System.out.println("O livro foi registrado com todos os atributos.");
    }
}
