package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatShouldReturnPredatorFood() throws Exception {
        List<String> food = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyShouldReturnCorrectFamily() {
        String family = feline.getFamily();
        Assert.assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittensWithoutArgsShouldReturnOne() {
        int kittens = feline.getKittens();
        Assert.assertEquals(1, kittens);
    }

    @Test
    public void getKittensWithArgsShouldReturnProvidedNumber() {
        int kittens = feline.getKittens(3);
        Assert.assertEquals(3, kittens);
    }

    @Test
    public void getFoodFromAnimalShouldReturnExpectedList() throws Exception {
        List<String> food = feline.getFood("Травоядное");
        Assert.assertEquals(List.of("Трава", "Различные растения"), food);
    }
}