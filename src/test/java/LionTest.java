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
        Mockito.when(felineMock.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самец", felineMock);

        // Act
        List<String> food = lion.getFood();

        // Assert
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getKittensShouldReturnCorrectValueFromFeline() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.getKittens()).thenReturn(1);

        Lion lion = new Lion("Самец", felineMock);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void constructorShouldThrowExceptionForInvalidSex() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        new Lion("Оно", felineMock);
    }
}