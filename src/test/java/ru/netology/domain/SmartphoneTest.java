package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone smartphone = new Smartphone(1, "typeX", 1000,"Apple");

    @Test
    public void ShouldCompareNameForMatch(){
        String text = "typeX";
        assertTrue(smartphone.matches(text));
    }

    @Test
    public void ShouldCompareNameNotForMatch(){
        String text = "10";
        assertFalse(smartphone.matches(text));
    }

    @Test
    public void ShouldCompareManufacturerForMatch(){
        String text = "Apple";
        assertTrue(smartphone.matches(text));
    }

    @Test
    public void ShouldCompareManufacturerNotForMatch(){
        String text = "Samsung";
        assertFalse(smartphone.matches(text));
    }

}