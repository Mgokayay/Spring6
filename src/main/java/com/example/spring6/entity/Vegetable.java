package com.example.spring6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@AllArgsConstructor
@Data
@Entity
@Table(name = "vegetable")
public class Vegetable extends Plant{

    @Column(name = "is_grown_on_tree")
    private Boolean isGrownOnTree;
}
