package org.example;

import java.util.Arrays;

public class FibonacciService {



    public int[] calculaSequenciaFibo(int numero) {
        int[] sequenciaFibo = new int[numero + 1];
        int x;

        sequenciaFibo[0] = 0;
        sequenciaFibo[1] = 1;

        for(x = 2; x < numero + 1; x++){
            sequenciaFibo[x] = sequenciaFibo[x-2] + sequenciaFibo[x-1];


        }
        System.out.println(Arrays.toString(sequenciaFibo));
        return sequenciaFibo;
    }
}

