package ru.netology.repository;

import ru.netology.domain.Product;
import ru.netology.exception.NotFoundException;

public class ProductRepository {
    private Product[] items = new Product[0];

    public void save(Product item) {
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int index = tmp.length - 1;
        tmp[index] = item;
        items = tmp;
    }

    public Product[] findAll(){
        return items;
    }

    public Product findById(int id) {
        for (Product product : items){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public void removeById(int id){
        if (findById(id) == null) {
            throw new NotFoundException("Element with id " + id + " not found");
        }
        int lenght = items.length - 1;
        Product[] tmp = new Product[lenght];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id){
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

}
