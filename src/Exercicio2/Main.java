package Exercicio2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro("Dom Quixote", 98452613, "Miguel de Cervantes", "Romance");
        Cadastro cadastro1 = new Cadastro("Cem Anos de Solidão", 94724131, "Gabriel García Márquez", "Romance");
        Cadastro cadastro2 = new Cadastro("Orgulho e Preconceito", 47592849, "Jane Austen", "Romance");
        Cadastro cadastro3 = new Cadastro("Homem Invisível", 73862404, "Ralph Ellison","Ficção");

        System.out.println("=====LIVROS DE EXEMPLOS=====");
        System.out.println("\nNome do livro: Ao Farol \n ISBN:98342723 \n Nome do Autor: Virginia Woolf \n Gênero: Romance");
        System.out.println("__________________________________________________");
        System.out.println("\nNome do livro: O Rei Lear \n ISBN:1286536 \n Nome do Autor: William Shakespeare \n Gênero: Romance");
        System.out.println("__________________________________________________");

       cadastro.registroLivro(84723688, "Dom quixote", "Romance");
    }
}
