package Trabalhoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("George R.R. Martin");

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal");
        Livro livro2 = new Livro("A Guerra dos Tronos");

        autor1.adicionarLivro(livro1);
        autor2.adicionarLivro(livro2);

        Usuario usuario = new Usuario("Alice", "001");

        Emprestimo emprestimo = new Emprestimo(livro1, usuario, LocalDate.now(), LocalDate.now().plusDays(14));

        System.out.println(autor1);
        System.out.println(livro1);
        System.out.println(usuario);
        System.out.println(emprestimo);
    }
}