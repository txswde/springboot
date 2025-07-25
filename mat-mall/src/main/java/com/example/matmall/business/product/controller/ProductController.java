package com.example.matmall.business.product.controller;

import com.example.matmall.business.product.VO.ProductQueryVO;
import com.example.matmall.business.product.bo.ProductAddBO;
import com.example.matmall.business.product.bo.ProductEditBO;
import com.example.matmall.business.product.bo.ProductQueryBO;
import com.example.matmall.business.product.service.ProductService;
import com.example.matmall.common.entity.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "商品管理")
@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @ApiOperation("添加")
    @PostMapping("add")
    public void add(@Valid @RequestBody ProductAddBO addBO){
        productService.add(addBO);

    }

    @ApiOperation("修改")
    @PostMapping("edit")
    public void edit(@Valid @RequestBody ProductEditBO editBO){
        productService.edit(editBO);

    }
    @ApiOperation("分页查询")
    @GetMapping("page")
    public PageVO<ProductQueryVO> page(ProductQueryBO queryBO){
        return productService.page(queryBO);

    }

}
