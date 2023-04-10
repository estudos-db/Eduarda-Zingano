package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiboService {

    public int sequenciaFibonacci( int numero) {

        int x = 2;


        List<Integer> sequenciaFibo = new ArrayList<>();

        sequenciaFibo.add(0);
        sequenciaFibo.add(1);

        while(Collections.max(sequenciaFibo) < numero){

            sequenciaFibo.add(sequenciaFibo.get(x - 2) + sequenciaFibo.get(x - 1));

            x++;
        }

        if (Collections.max(sequenciaFibo) > numero){
            sequenciaFibo.remove(Collections.max(sequenciaFibo));
        }

        System.out.println(Collections.max(sequenciaFibo));

        System.out.println(sequenciaFibo);

        return Collections.max(sequenciaFibo);
    }
}
