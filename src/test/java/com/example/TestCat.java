package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    Feline feline1;
    @Test
    //Проверка покрытия getSound в Cat
    public void getSound() throws Exception {
        Cat cat=new Cat(feline1);
        Assert.assertEquals("Meow", cat.getSound());
    }
    @Mock
    Feline feline;
    @Test
    public void getFood3t() throws Exception {
        Cat cat=new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());

    }



}
