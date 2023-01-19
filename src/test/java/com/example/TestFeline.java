package com.example;
import org.junit.Assert;
import org.junit.Test;

public class TestFeline {
    Feline feline=new Feline();
    @Test
//Проверка покрытия getKittens в Feline
    public void getKittensTest() {

        Assert.assertEquals(1, feline.getKittens());
        Assert.assertEquals(5, feline.getKittens(5));

    }
    @Test
//Проверка покрытия getFamily в Feline
    public void getFamilyTest() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }


}
