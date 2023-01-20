package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

public class TestFeline {
    Feline feline = new Feline();
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
    @Test
//Проверка покрытия EatMeat в Feline
    public void eatMeatTest() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }




}
