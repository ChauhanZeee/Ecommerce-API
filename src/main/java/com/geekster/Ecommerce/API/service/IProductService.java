package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.ProductModel;

import java.util.List;

public interface IProductService {
    public List<ProductModel> allProductDetail();
    public void createProductModel(ProductModel productModel);
    public void deleteProductById(Integer id);
}
