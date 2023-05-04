package org.example;


import java.util.ArrayList;

public class Emprestimo {

    private Pessoa pessoa;

    private ArrayList<Livro> listaLivros;

    public Emprestimo(ArrayList<Livro> listaLivros, Pessoa pessoa) {
        this.pessoa = pessoa;
        this.listaLivros = new ArrayList<>();
    }

    public void adicionaLivroNaLista(Livro livro) {
        listaLivros.add(livro);
    }

    public void devolverLivro(int index) {
        System.out.println("Livro " + listaLivros.get(index).getTitulo() + " removido com sucesso");
        listaLivros.remove(index);

    }

    public void mostrarEmprestimos() {
        if(listaLivros.isEmpty()) {
            System.out.println("Sem empréstimos para mostrar");
        }else {
            System.out.println("Livros emprestados: ");
            for (int index = 0; index < listaLivros.size(); index++) {
                System.out.println(((index) + ": Livro " + listaLivros.get(index).getTitulo() + ", do autor " + listaLivros.get(index).getAutor() + " emprestado para: " + pessoa.getNome() + " com documento de biblioteca: " + pessoa.getDocBiblioteca()));

            }
        }
    }

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }
}


