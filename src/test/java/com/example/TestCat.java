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

    @Mock
    Feline feline;

    @Test
    //Проверка покрытия getSound в Cat
    public void getSound() throws Exception {
        Cat cat=new Cat(feline);
        Assert.assertEquals("Meow", cat.getSound());
    }

    @Test
    public void getFood3t() throws Exception {
        Cat cat=new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());

    }



}
