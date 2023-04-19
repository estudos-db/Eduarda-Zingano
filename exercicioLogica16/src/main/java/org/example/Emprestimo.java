package org.example;


public class Emprestimo {
    private Livro livro;

    private Pessoa pessoa;

    public Emprestimo(Livro livro, Pessoa pessoa) {
        this.livro = livro;
        this.pessoa = pessoa;
    }


    public void pegarLivroEmprestado(String titulo, String autor, String nome, int documentoBiblioteca){
        pessoa.getPessoa().add(nome);
        pessoa.getDocBiblioteca().add(documentoBiblioteca);

        livro.getListaLivros().add(titulo + " " + autor);

    }

    public void devolverLivro(int index) {
        pessoa.getPessoa().remove(index);
        pessoa.getDocBiblioteca().remove(index);

        livro.getListaLivros().remove(index);

        System.out.println("Livro " + index + " devolvido com sucesso");
    }

    public void mostrarEmprestimo() {
        System.out.println("Sua lista de contatos: ");
        for (int index = 0; index < pessoa.getPessoa().size(); index++ ) {
            System.out.println(((index) + ": Membro biblioteca: " +pessoa.getPessoa().get(index) + ", documento da biblioteca: " + pessoa.getDocBiblioteca().get(index)) + " Livro escolhido: " + livro.getListaLivros().get(index));

        }

    }

}


