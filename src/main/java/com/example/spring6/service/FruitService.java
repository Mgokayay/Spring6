package com.example.spring6.service;

import com.example.spring6.entity.Fruit;

import java.util.List;

public interface FruitService {

    Fruit getById(Long id);

    List<Fruit> getByPriceAsc();
    List<Fruit> getByPriceDesc();

    Fruit save(Fruit fruit);

    Fruit delete(Long id);


}
