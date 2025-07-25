package com.example.matmall.business.product.bo;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.util.pattern.PathPattern;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProductEditBO {
    @NotNull(message = "id不能为空")
    @ApiModelProperty("id")
    private  Long id;
    @NotBlank(message = "商品名字不能为空！")
    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("商品描述")
    private String description;

    @ApiModelProperty("商品单价")
    private BigDecimal unitPrice;

    @ApiModelProperty("库存数量")
    private Integer stockQuantity;
}
