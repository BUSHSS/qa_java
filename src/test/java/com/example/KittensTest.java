package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class KittensTest {
    @Mock
    Feline feline;


    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(5); //вызываем, чтобы всегда возвращал 5 котиков
        Assert.assertEquals(feline.getKittens(), lion.getKittens());

    }
}





