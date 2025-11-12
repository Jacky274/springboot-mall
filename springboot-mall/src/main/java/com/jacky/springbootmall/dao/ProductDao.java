package com.jacky.springbootmall.dao;

import com.jacky.springbootmall.dto.ProductRequest;
import com.jacky.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer id);
    Integer createProduct(ProductRequest productRequest);
}
