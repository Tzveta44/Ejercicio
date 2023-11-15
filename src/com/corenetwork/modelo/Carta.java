package com.corenetwork.modelo;

public class Carta  {
    private Palo palo;
    private Numeros numeros;

    public Carta(Palo palo, Numeros numeros) {
        this.palo = palo;
        this.numeros = numeros;
    }

    public Carta() {

    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo=" + palo +
                ", numeros=" + numeros +
                '}';
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numeros getNumeros() {
        return numeros;
    }

    public void setNumeros(Numeros numeros) {
        this.numeros = numeros;
    }
}
