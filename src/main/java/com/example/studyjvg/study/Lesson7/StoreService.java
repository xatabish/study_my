package com.example.studyjvg.study.Lesson7;


import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class StoreService {

    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void add(int id) {
        basket.products.add(id);
    }

    public String get () {
        return basket.products.stream().
                map(Object::toString).
                collect(Collectors.joining(","));

    }

    public void clear() {
        basket.products.clear();

    }
}
