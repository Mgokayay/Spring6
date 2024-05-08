package com.example.spring6.controller;

import com.example.spring6.dto.FruitResponse;
import com.example.spring6.entity.Fruit;
import com.example.spring6.service.FruitService;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Validated
@RestController
@RequestMapping("/fruit")
public class FruitController {

    private final FruitService fruitService;
    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> findAll(){
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public Fruit get(@Positive @PathVariable Long id){
        return new FruitResponse("find by id success",fruitService.getById(id)).fruit();
    }

    @GetMapping("/desc")
    public List<Fruit> findAllDesc(){
        return fruitService.getByPriceDesc();
    }

    @PostMapping
    public Fruit save(@Validated @RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }

   @DeleteMapping("/{id}")
    public Fruit delete(@Positive @PathVariable Long id){
        return fruitService.delete(id);
   }


}
