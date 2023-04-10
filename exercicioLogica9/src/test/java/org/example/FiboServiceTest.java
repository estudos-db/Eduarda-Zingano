package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class FiboServiceTest {
    FiboService fiboService = new FiboService();
    @Test
    public void verificaNumeroMaximoArray() {
        Assert.assertEquals(21, fiboService.sequenciaFibonacci(25));
        Assert.assertEquals(13, fiboService.sequenciaFibonacci(13));
    }

}