package com.example.matmall.business.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.matmall.business.product.entity.Product;
import com.example.matmall.business.product.mapper.ProductMapper;
import com.example.matmall.business.product.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
