package org.example;

public class Automovel {

    private String marca;

    private String modelo;

    private String tipo;

    private int velocidadeMaxima;

    private int rodas;


    private boolean ligarAutomovel = false;

    private boolean frear = false;

    private boolean acelerar = false;


    public Automovel(String marca, String modelo,int velocidadeMaxima, String tipo) {
        if(this.marca == null && this.modelo == null && this.tipo == null && this.velocidadeMaxima >= 0) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidadeMaxima = velocidadeMaxima;
            this.tipo = tipo;
        }


    }


    public String getTipo() {


        return tipo;
    }
    public String getMarca() {
        this.marca = marca;
        return marca;
    }

    public String getModelo() {
        this.modelo = modelo;
        return modelo;
    }

    public void setRodas(int rodas){
        this.rodas = rodas;
    }

    public int getRodas() {
        return rodas;
    }

    public boolean setLigarAutomovel (boolean ligarAutomovel) {
        this.ligarAutomovel = ligarAutomovel;
        return ligarAutomovel;
    }

    public int getVelocidadeMaxima() {
        this.velocidadeMaxima = velocidadeMaxima;
        return velocidadeMaxima;
    }

    public boolean setFrear(boolean frear) {
        this.frear = frear;

        return frear;
    }

    public boolean setAcelerar(boolean acelerar) {
        this.acelerar = acelerar;

        return acelerar;
    }
}
