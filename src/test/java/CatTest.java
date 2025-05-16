package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundShouldReturnMeow() {
        Feline felineMock = Mockito.mock(Feline.class);
        Cat cat = new Cat(felineMock);

        String sound = cat.getSound();
        Assert.assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodShouldReturnPredatorFood() throws Exception {
        // Arrange
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Мыши", "Птицы"));

        Cat cat = new Cat(felineMock);

        // Act
        List<String> food = cat.getFood();

        // Assert
        Assert.assertEquals(List.of("Мыши", "Птицы"), food);
    }
}