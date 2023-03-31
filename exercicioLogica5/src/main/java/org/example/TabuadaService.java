package org.example;

import java.util.ArrayList;
import java.util.List;

public class TabuadaService {
    private int numero =  5;
    private int multiplicador;

    private List<Integer> tabuada = new ArrayList<>();
    public List<Integer> multiplica() {
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(numero * multiplicador);
            tabuada.add(multiplicador * numero);
        }
        return tabuada;
    }


}
