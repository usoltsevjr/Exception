package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product = new Product(1,"new",200);

    @Test
    public void ShouldCompareNameForMatch(){
        String text = "new";
        assertTrue(product.matches(text));
    }

    @Test
    public void ShouldCompareNameNotForMatch(){
        String text = "old";
        assertFalse(product.matches(text));
    }

}