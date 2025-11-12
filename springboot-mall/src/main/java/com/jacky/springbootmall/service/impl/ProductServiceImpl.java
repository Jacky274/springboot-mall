package com.jacky.springbootmall.service.impl;

import com.jacky.springbootmall.dao.ProductDao;
import com.jacky.springbootmall.model.Product;
import com.jacky.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return  productDao.getProductById(productId);
    }
}
