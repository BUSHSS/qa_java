package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class TestWithMock {
    @Mock
    Feline feline;

    @Test
    public void eatMeatTestFeline() throws Exception {
        feline.eatMeat();
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба")); //теперь всегда будет возвращать Животные", "Птицы", "Рыба"
        System.out.println(feline.eatMeat());
    }
    @Test
    public void getFamilyTestFeline() {
        feline.getFamily();
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");//теперь всегда будет возвращаться кошачьи
        Assert.assertEquals("Кошачьи", feline.getFamily());


    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Assert.assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        System.out.println(lion.getKittens()); //мок возвращает 0
        Mockito.when(lion.getKittens()).thenReturn(1); //вызываем, чтобы всегда возвращал 1
        Assert.assertEquals(1, lion.getKittens());
        System.out.println(lion.getKittens()); //теперь выводит 1
    }



}

