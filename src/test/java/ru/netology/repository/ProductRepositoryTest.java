package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.exception.NotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository repository = new ProductRepository();
    private Product first = new Product(1, "first", 100);
    private Product second = new Product(2, "second", 200);
    private Product third = new Product(3, "third", 300);

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
    }

    @Test
    public void shouldCheckException(){
        int id = 4;
        assertThrows(NotFoundException.class, () -> repository.removeById(id));
    }

    @Test
    public void shouldNotCheckException(){
        int id = 1;
        repository.removeById(id);
        Product[] expected = new Product[]{second,third};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

}