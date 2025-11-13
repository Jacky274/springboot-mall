package com.jacky.springbootmall.service;

import com.jacky.springbootmall.dto.ProductRequest;
import com.jacky.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer id);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
