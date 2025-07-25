package com.example.matmall.business.product.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.matmall.business.product.VO.ProductQueryVO;
import com.example.matmall.business.product.bo.ProductAddBO;
import com.example.matmall.business.product.bo.ProductEditBO;
import com.example.matmall.business.product.bo.ProductQueryBO;
import com.example.matmall.business.product.entity.Product;
import com.example.matmall.business.product.mapper.ProductMapper;
import com.example.matmall.business.product.service.ProductService;
import com.example.matmall.common.entity.PageVO;
import org.springframework.util.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public PageVO<ProductQueryVO> page(ProductQueryBO queryBO) {
        Page<Product> pageRequest= new Page<>(queryBO.getCurrentPage(), queryBO.getPageSize());

        Page<Product> page=lambdaQuery()
                .eq(StringUtils.hasText(queryBO.getName()),
                        Product::getName,queryBO.getName())
                .like(StringUtils.hasText(queryBO.getDescription()),
                        Product::getDescription,queryBO.getDescription())
                .orderByAsc(Product::getCreateTime)
                .page(pageRequest);


        PageVO<ProductQueryVO> pageVO=new PageVO<>();
        pageVO.setCurrentPage(page.getCurrent());
        pageVO.setPageSize(page.getSize());
        pageVO.setTotalSize(page.getTotal());

        List<ProductQueryVO> productQueryVOList=new ArrayList<>();
        List<Product> productList=page.getRecords();
        for (Product product : productList){
            ProductQueryVO productQueryVO=new ProductQueryVO();
            BeanUtils.copyProperties(product,productQueryVO);
            productQueryVOList.add(productQueryVO);
        }
        pageVO.setDataList(productQueryVOList);
        return pageVO;
    }

    @Override
    public void delete(List<Long> idList) {
        removeBatchByIds(idList);
    }
}
