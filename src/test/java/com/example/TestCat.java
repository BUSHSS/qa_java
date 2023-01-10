package com.example;
import org.junit.Assert;
import org.junit.Test;

public class TestCat {

    Feline feline;

    @Test
//Проверка покрытия getSound в Cat
    public void getSound() throws Exception {
        Cat cat=new Cat(feline);
        Assert.assertEquals("Meow", cat.getSound());
    }

}
