package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    private ProductRepository repository = new ProductRepository();
    private ProductManager productManager = new ProductManager(repository);
    private Book first = new Book(1,"book1",100,"author1");
    private Book second = new Book(2,"book2",150,"author2");
    private Smartphone third = new Smartphone(3,"smartphone1",200,"manufacturer1");
    private Smartphone fourth = new Smartphone(4,"smartphone2",400,"manufacturer2");

    @BeforeEach
    public void SetUp(){
        productManager.add(first);
        productManager.add(second);
        productManager.add(third);
        productManager.add(fourth);
    }

    @Test
    public void shouldSearchBookName(){
        String text = "book1";

        Product[] expected = new Product[]{first};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBookName1(){
        String text = "book2";

        Product[] expected = new Product[]{second};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBookAuthor(){
        String text = "author1";

        Product[] expected = new Product[]{first};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBookAuthor1(){
        String text = "author2";

        Product[] expected = new Product[]{second};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneName(){
        String text = "smartphone1";

        Product[] expected = new Product[]{third};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneName1(){
        String text = "smartphone2";

        Product[] expected = new Product[]{fourth};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneManufacturer(){
        String text = "manufacturer1";

        Product[] expected = new Product[]{third};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneManufacturer1(){
        String text = "manufacturer2";

        Product[] expected = new Product[]{fourth};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

}