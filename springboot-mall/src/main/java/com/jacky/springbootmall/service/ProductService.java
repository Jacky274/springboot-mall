package com.jacky.springbootmall.service;

import com.jacky.springbootmall.constant.ProductCategory;
import com.jacky.springbootmall.dto.ProductRequest;
import com.jacky.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer id);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
