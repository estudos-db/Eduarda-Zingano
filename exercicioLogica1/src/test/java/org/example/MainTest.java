package org.example;

import org.junit.Assert;
import org.junit.Test;



public class MainTest {
    int idade = 18;
    @Test
   public void verificaIdade() {
        boolean expect = idade >= 18;
        boolean actual = true;
        Assert.assertEquals(expect,actual);
    }
}


