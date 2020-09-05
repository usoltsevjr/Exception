package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {
    private int id;
    private String name;
    private int price;

    public boolean matches(String search) {
        if (search.equalsIgnoreCase(name)){
            return true;
        }
        return false;
    }
}



