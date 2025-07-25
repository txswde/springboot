package com.example.matmall.business.product.bo;

import com.example.matmall.common.entity.PageBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductQueryBO extends PageBO {

    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("商品描述")
    private String description;


}
