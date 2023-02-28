package com.shopping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * ClassName: Details
 * Package: com.shopping.entity
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/3/1 0:55
 * @Version 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Details {
    private Integer detailsId;
    private Integer Id;
    private BigDecimal detailsMoney;
    private String Message;
}
