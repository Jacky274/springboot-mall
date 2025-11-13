package com.jacky.springbootmall.service;

import com.jacky.springbootmall.dto.ProductQueryParams;
import com.jacky.springbootmall.dto.ProductRequest;
import com.jacky.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer id);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
