package com.example.spring6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@Entity
@Table(name = "fruit",schema = "fsweb")
public class Fruit extends Plant{

    @Column(name = "fruit_type")
    @Enumerated(EnumType.STRING)
     private FruitType fruitType;


}
