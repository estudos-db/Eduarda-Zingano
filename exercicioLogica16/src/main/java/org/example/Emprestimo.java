package org.example;

import java.util.Scanner;

public class Emprestimo {

    private int escolhaMenu;

    private int escolhaLivro;

    private int escolhaLivroDevolver;

    Scanner sc = new Scanner(System.in);
    Livro livro = new Livro();

    Pessoa pessoa = new Pessoa();

    public void confereLivrosDisponiveis() {

        while (escolhaMenu != 3) {

            System.out.println("Digite um número para escolher entre pegar um livro emprestado ou devolver.");

            System.out.println("1 - pegar livro emprestado, 2 - devolver livro ou 3 - sair.");

            escolhaMenu = sc.nextInt();



            if (escolhaMenu == 2 && pessoa.livrosEmprestados.size() == 0){
                System.out.println("Você não tem mais livros para devolver");
                escolhaMenu = 82;
            } else if(escolhaMenu == 0){
                System.out.println("Você não digitou uma opção valída.");
            }else if(escolhaMenu > 3){
                System.out.println("Você não digitou uma opção valída.");
            }


            switch (escolhaMenu) {
                case 1:

                    while (escolhaMenu == 1) {

                        System.out.println("Digite o número do livro que deseja pegar emprestado.");

                        int index = 0;

                        for (String l : livro.arrayLivrosNomes) {
                            System.out.println(((index++)) + ": " + l);
                        }
                        escolhaLivro = sc.nextInt();

                        pegarLivroEmprestado(escolhaLivro);

                        System.out.println("Deseja pegar mais algum livro emprestado?");

                        System.out.println("1 - Sim, 2 - Não");

                        int x = sc.nextInt();

                        if (x == 1) {
                            escolhaMenu = 1;
                        } else if (x == 2) {
                            escolhaMenu = 82;
                        }

                    }
                case 2:

                    while (escolhaMenu == 2) {

                        System.out.println("Digite o número do livro que deseja devolver.");

                        int index = 0;

                        for (String l : pessoa.livrosEmprestados) {
                            System.out.println(((index++)) + ": " + l);
                        }

                        escolhaLivroDevolver = sc.nextInt();

                        devolverLivro(escolhaLivroDevolver);

                        int x;

                        if (pessoa.livrosEmprestados.size() == 0){
                            System.out.println("Você não tem mais livros para devolver");
                            escolhaMenu = 82;
                        }else if ( pessoa.livrosEmprestados.size() > 0){

                            System.out.println("Deseja devolver mais algum livro?");

                            System.out.println("1 - Sim, 2 - Não");

                            x = sc.nextInt();

                            if (x == 1) {
                                escolhaMenu = 2;
                            } else if (x == 2) {
                                escolhaMenu = 82;
                            }
                        }

                    }
            }

            if (escolhaMenu == 3) {

                System.out.println("Até mais!");

                break;
            }
        }




    }

    public boolean pegarLivroEmprestado(int escolhaUsuario) {
        if (escolhaUsuario <= livro.arrayLivrosNomes.size() - 1) {
            pessoa.livrosEmprestados.add(livro.arrayLivrosNomes.get(escolhaUsuario));
            livro.arrayLivrosNomes.remove(escolhaUsuario);
        } else if (escolhaUsuario == livro.arrayLivrosNomes.size() -1) {
            pessoa.livrosEmprestados.add(livro.arrayLivrosNomes.get(escolhaUsuario));
            livro.arrayLivrosNomes.remove(escolhaUsuario);
        }

        boolean pegarLivroEmprestado = false;

        if (livro.arrayLivrosNomes.size() < 5 && pessoa.livrosEmprestados.size() > 2){
            pegarLivroEmprestado = true;
        }

        return pegarLivroEmprestado;
    }

    public boolean devolverLivro(int escolhaUsuario) {

        if (escolhaUsuario <= pessoa.livrosEmprestados.size() - 1) {
            livro.arrayLivrosNomes.add(pessoa.livrosEmprestados.get(escolhaUsuario));
            pessoa.livrosEmprestados.remove(escolhaUsuario);
        }else if (escolhaUsuario == pessoa.livrosEmprestados.size() -1){
            livro.arrayLivrosNomes.add(pessoa.livrosEmprestados.get(escolhaUsuario));
            pessoa.livrosEmprestados.remove(escolhaUsuario);
        }

        boolean devolverLivro = false;

        if (livro.arrayLivrosNomes.size() > 5 && pessoa.livrosEmprestados.size() < 2){
            devolverLivro = true;
        }

        return devolverLivro;

    }
}


