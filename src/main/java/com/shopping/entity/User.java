package com.shopping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * ClassName: User
 * Package: com.shopping.entity
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/2/28 20:50
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private Integer Id;
    private String userName;
    private BigDecimal userMoney;
}
