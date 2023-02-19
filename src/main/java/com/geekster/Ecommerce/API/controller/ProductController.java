package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.ProductModel;
import com.geekster.Ecommerce.API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product_model")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get-all/product-detail")
    public List<ProductModel> model(){
        return productService.allProductDetail();
    }
    @PostMapping("/create-product/detail")
    public void createProductModel(@RequestBody ProductModel productModel){
        productService.createProductModel(productModel);
    }
    @DeleteMapping("/delete/product-by/id/{id}")
    public void deleteProductModel(@PathVariable Integer id){
        productService.deleteProductById(id);
    }
}
