package com.example.matmall.business.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.matmall.business.product.VO.ProductQueryVO;
import com.example.matmall.business.product.bo.ProductAddBO;
import com.example.matmall.business.product.bo.ProductEditBO;
import com.example.matmall.business.product.bo.ProductQueryBO;
import com.example.matmall.business.product.entity.Product;
import com.example.matmall.common.entity.PageVO;

import java.util.List;

public interface ProductService extends IService<Product> {
    void add(ProductAddBO addBO);
    void edit(ProductEditBO editBO);
    PageVO<ProductQueryVO> page(ProductQueryBO queryBO);
    void delete(List<Long> idList);

}
