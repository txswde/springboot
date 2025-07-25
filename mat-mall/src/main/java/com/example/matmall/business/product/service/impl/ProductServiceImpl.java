package com.example.matmall.business.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.matmall.business.product.bo.ProductAddBO;
import com.example.matmall.business.product.bo.ProductEditBO;
import com.example.matmall.business.product.entity.Product;
import com.example.matmall.business.product.mapper.ProductMapper;
import com.example.matmall.business.product.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public void add(ProductAddBO addBO) {
        Product product=new Product();
        BeanUtils.copyProperties(addBO,product);
        save(product);
    }

    @Override
    public void edit(ProductEditBO editBO) {
        Product product=new Product();
        BeanUtils.copyProperties(editBO,product);
        updateById(product);
    }
}
