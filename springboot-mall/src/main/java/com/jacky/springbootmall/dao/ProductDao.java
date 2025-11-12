package com.jacky.springbootmall.dao;

import com.jacky.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer id);
}
