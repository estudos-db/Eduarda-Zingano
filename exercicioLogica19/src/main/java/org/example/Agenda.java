package org.example;


public class Agenda {

    private Contato contato;
    private Endereco endereco;

    public Agenda(Contato contato, Endereco endereco) {
        this.contato = contato;
        this.endereco = endereco;
    }

    public void adicionarContato (String nome, int numero, String rua, String bairro, String cidade, String cep) {

        contato.getContatosNomes().add(nome);

        contato.getContatosNumeros().add(numero);

        endereco.getEndereco().add(rua + ", " + bairro + ", " + cidade + ", " + cep);


    }


    public void removerContato(int index) {

        contato.getContatosNomes().remove(index);
        contato.getContatosNumeros().remove(index);

        System.out.println("Contato " + index + " removido com sucesso");
    }

    public void mostrarAgenda() {
        System.out.println("Sua lista de contatos: ");
        for (int index = 0; index < contato.getContatosNomes().size(); index++ ) {
            System.out.println(((index) + ": " + contato.getContatosNomes().get(index) + ": " + contato.getContatosNumeros().get(index)) + " Endereço: " + endereco.getEndereco().get(index));

        }

    }
}
