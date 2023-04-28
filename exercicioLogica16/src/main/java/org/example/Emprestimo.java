package org.example;


import java.util.ArrayList;

public class Emprestimo {
    private Livro livro;

    private Pessoa pessoa;

    private ArrayList<Livro> listaLivros;

    public Emprestimo(Livro livro, Pessoa pessoa) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.listaLivros = new ArrayList<>();
    }

    public void adicionaLivroNaLista() {
        listaLivros.add(livro);
    }

    public void devolverLivro(int index) {
        System.out.println("Livro " + livro.getTitulo() + " removido com sucesso");
        listaLivros.remove(index);

    }

    public void mostrarEmprestimos() {
        if(listaLivros.isEmpty()) {
            System.out.println("lista vazia");
        }else {
            System.out.println("Lista de livros emprestados: ");
            for (int index = 0; index < listaLivros.size(); index++) {
                System.out.println(((index) + ": Livro " + listaLivros.get(index).getTitulo() + ", do autor " + listaLivros.get(index).getAutor() + " emprestado para: " + pessoa.getNome() + " com documento de biblioteca: " + pessoa.getDocBiblioteca()));

            }
        }
    }

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }
}


