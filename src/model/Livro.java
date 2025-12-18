package model;

public class Livro {

    private String Titulo;
    private String Autor;
    private boolean emprestado;

    public Livro(String autor, String titulo) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return Titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    @Override
    public String toString() {
        return "Livro: " + Titulo +
                " | Autor: " + Autor +
                " | Status: " + (emprestado ? "Emprestado" : "Disponível");
    }
}
