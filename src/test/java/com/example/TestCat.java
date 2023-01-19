package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class TestCat {
    Feline feline = new Feline();
    Cat cat=new Cat(feline);
    @Test
//Проверка покрытия getSound в Cat
    public void getSound() throws Exception {
        Assert.assertEquals("Meow", cat.getSound());
    }
    @Test
    //Проверка покрытия getFood в Cat
    public void getFood() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}
