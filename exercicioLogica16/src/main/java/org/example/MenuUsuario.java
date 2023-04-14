package org.example;

import java.util.Scanner;

public class MenuUsuario {
    private int escolhaMenu;
    private int escolhaLivro;

    private int escolhaLivroDevolver;
    private Livro livro = new Livro();

    private Pessoa pessoa = new Pessoa();
    private Emprestimo emprestimo = new Emprestimo();
    private Scanner scan = new Scanner(System.in);

    public void confereLivrosDisponiveis() {

        while (escolhaMenu != 3) {

            System.out.println("Digite um número para escolher entre pegar um livro emprestado ou devolver.");

            System.out.println("1 - pegar livro emprestado, 2 - devolver livro ou 3 - sair.");

            escolhaMenu = scan.nextInt();



            if (escolhaMenu == 2 && pessoa.getlivrosEmprestados().size() == 0){
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

                        for (String l : livro.getarrayLivrosNomes()) {
                            System.out.println(((index++)) + ": " + l);
                        }
                       escolhaLivro = scan.nextInt();

                        emprestimo.pegarLivroEmprestado(escolhaLivro);

                        System.out.println("Deseja pegar mais algum livro emprestado?");

                        System.out.println("1 - Sim, 2 - Não");

                        int x = scan.nextInt();

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

                        for (String l : pessoa.getlivrosEmprestados()) {
                            System.out.println(((index++)) + ": " + l);
                        }

                       escolhaLivroDevolver = scan.nextInt();

                        emprestimo.devolverLivro(escolhaLivroDevolver);

                        int x;

                        if (pessoa.getlivrosEmprestados().size() == 0){
                            System.out.println("Você não tem mais livros para devolver");
                            escolhaMenu = 82;
                        }else if ( pessoa.getlivrosEmprestados().size() > 0){

                            System.out.println("Deseja devolver mais algum livro?");

                            System.out.println("1 - Sim, 2 - Não");

                            x = scan.nextInt();

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
}
