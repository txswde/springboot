package com.example.matmall.business.product.VO;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductQueryVO {

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
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;
}
