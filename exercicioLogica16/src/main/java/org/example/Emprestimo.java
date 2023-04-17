package org.example;

public class Emprestimo {

    private final Livro livro;

    private final Pessoa pessoa;

    public Emprestimo(Livro livro, Pessoa pessoa) {
        this.livro = livro;
        this.pessoa = pessoa;
    }

    public boolean pegarLivroEmprestado(int escolhaUsuario) {
        if (escolhaUsuario <= livro.getarrayLivrosNomes().size() - 1) {
            pessoa.getlivrosEmprestados().add(livro.getarrayLivrosNomes().get(escolhaUsuario));
            livro.getarrayLivrosNomes().remove(escolhaUsuario);
        } else if (escolhaUsuario == livro.getarrayLivrosNomes().size() -1) {
            pessoa.getlivrosEmprestados().add(livro.getarrayLivrosNomes().get(escolhaUsuario));
            livro.getarrayLivrosNomes().remove(escolhaUsuario);
        }

        boolean pegarLivroEmprestado = false;

        if (livro.getarrayLivrosNomes().size() < 5 && pessoa.getlivrosEmprestados().size() > 2){
            pegarLivroEmprestado = true;
        }

        return pegarLivroEmprestado;
    }

    public boolean devolverLivro(int escolhaUsuario) {

        if (escolhaUsuario <= pessoa.getlivrosEmprestados().size() - 1) {
            livro.getarrayLivrosNomes().add(pessoa.getlivrosEmprestados().get(escolhaUsuario));
            pessoa.getlivrosEmprestados().remove(escolhaUsuario);
        }else if (escolhaUsuario == pessoa.getlivrosEmprestados().size() -1){
            livro.getarrayLivrosNomes().add(pessoa.getlivrosEmprestados().get(escolhaUsuario));
            pessoa.getlivrosEmprestados().remove(escolhaUsuario);
        }

        boolean devolverLivro = false;

        if (livro.getarrayLivrosNomes().size() > 5 && pessoa.getlivrosEmprestados().size() < 2){
            devolverLivro = true;
        }

        return devolverLivro;

    }
}


