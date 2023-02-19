package com.geekster.Ecommerce.API.Repository;

import com.geekster.Ecommerce.API.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductModel, Integer> {
}
