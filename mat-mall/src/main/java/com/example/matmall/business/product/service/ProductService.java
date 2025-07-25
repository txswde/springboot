package com.example.matmall.business.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.matmall.business.product.bo.ProductAddBO;
import com.example.matmall.business.product.entity.Product;

public interface ProductService extends IService<Product> {
    void add(ProductAddBO addBO);
}
