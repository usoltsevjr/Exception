package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1,"The Godfather",1000,"Mario Puzo");

    @Test
    public void ShouldCompareTitleForMatch(){
        String text = "The Godfather";
        assertTrue(book.matches(text));
    }

    @Test
    public void ShouldCompareTitleNotForMatch(){
        String text = "Crime and Punishment";
        assertFalse(book.matches(text));
    }

    @Test
    public void ShouldCompareAuthorForMatch(){
        String text = "Mario Puzo";
        assertTrue(book.matches(text));
    }

    @Test
    public void ShouldCompareAuthorNotForMatch(){
        String text = "Fedor Dostoevsky";
        assertFalse(book.matches(text));
    }

}