package com.geekster.Ecommerce.API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_model")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;
    @NotEmpty(message = "not be null")
    @Column(name = "product_name")
    private String name;
    @NotEmpty(message = "not be null")
    @Column(name = "price")
    private Integer price;
    @NotEmpty(message = "not be null")
    @Column(name = "description")
    private String description;
    @NotEmpty(message = "not be null")
    @Column(name = "category")
    private String category;
    @NotEmpty(message = "not be null")
    @Column(name = "brand")
    private String brand;


}
