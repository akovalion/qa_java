package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class LionTest {

    @Test
    public void getFoodShouldReturnPredatorFood() throws Exception {
        // Arrange
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Зебры", "Антилопы"));

        Lion lion = new Lion("Самец", felineMock);

        // Act
        List<String> food = lion.getFood();

        // Assert
        Assert.assertEquals(List.of("Зебры", "Антилопы"), food);
    }

    @Test
    public void getKittensShouldReturnCorrectValueFromFeline() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.getKittens()).thenReturn(5);

        Lion lion = new Lion("Самец", felineMock);
        Assert.assertEquals(5, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void constructorShouldThrowExceptionForInvalidSex() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        new Lion("Оно", felineMock);
    }
}