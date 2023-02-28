package com.shopping.service;

import com.shopping.vo.ResultMessage;

import java.math.BigDecimal;

/**
 * ClassName: UserService
 * Package: com.shopping.service
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/2/28 20:49
 * @Version 1.0
 */
public interface UserService {

    ResultMessage selectMoney(Integer id);

    ResultMessage updateMoney(Integer id,BigDecimal money);

    ResultMessage refundMoney(Integer id,BigDecimal money);

}
