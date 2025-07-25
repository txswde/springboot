package com.example.matmall.business.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.matmall.common.entity.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_product")
public class Product extends CommonEntity {
    /**
     * 主键
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品单价
     */
    private BigDecimal unitPrice;

    /**
     * 库存数量
     */
    private Integer stockQuantity;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除标记 0：未删除；其他：已删除
     */
    private Long deleteFlag;

}