package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FoodTest {
    @Mock
    Cat cat;

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));//теперь всегда будет возвращать Животные", "Птицы", "Рыба"
        Feline feline = new Feline();
        Assert.assertEquals(cat.getFood(), feline.getFood("Хищник"));
    }

}







