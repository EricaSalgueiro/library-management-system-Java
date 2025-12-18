package service;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        return;
        }
        for (Livro livro : livros){
            System.out.println(livro);
        }
    }

    public void emprestarLivro(String titulo) {
        String tituloBusca = titulo.trim().toLowerCase();

        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().equals(tituloBusca) && !livro.isEmprestado()) {
                livro.emprestar();
                System.out.println("Livro emprestado com sucesso.");
                return;
            }
        }
        System.out.println("Livro não disponível.");
    }

    public void devolverLivro(String titulo){
        for (Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isEmprestado()){
                livro.devolver();
                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado ou já disponível.");    }
}
