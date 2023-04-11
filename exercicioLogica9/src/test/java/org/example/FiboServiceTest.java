package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;


class FiboServiceTest {
    FiboService fiboService = new FiboService();
    @Test
    public void verificaNumeroMaximoArray() {
        Assert.assertEquals(21, fiboService.sequenciaFibonacci(25));
        Assert.assertEquals(13, fiboService.sequenciaFibonacci(13));
    }

    @Test
    public void verificaSeMostraErroComNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> fiboService.sequenciaFibonacci(-2));
    }
}