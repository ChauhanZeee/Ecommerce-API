package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.Repository.IProductRepository;
import com.geekster.Ecommerce.API.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public List<ProductModel> allProductDetail(){
        return iProductRepository.findAll();
    }
    @Override
    public void createProductModel(ProductModel productModel){
        iProductRepository.save(productModel);
    }
    @Override
    public void deleteProductById(Integer id){
        iProductRepository.deleteById(id);
    }
}
