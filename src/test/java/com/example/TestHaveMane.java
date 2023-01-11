package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class TestHaveMane {

    Feline feline;
    Boolean result;
    String sex;
    public TestHaveMane (Boolean result, String sex) {
        this.result = result;
        this.sex = sex;
    }
    @Parameterized.Parameters
    public static Object[][] newOrderData(){
        return new Object[][] {
                {true,"Самец"},
                {false,"Самка"}
        };
    }
    @Test
    public void DoesHaveManeTest() throws Exception {

        Lion lion = new Lion(feline, sex);
        Assert.assertEquals(result, lion.doesHaveMane());
    }

}

