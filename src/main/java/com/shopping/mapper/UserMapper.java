package com.shopping.mapper;

import com.shopping.vo.ResultMessage;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * ClassName: UserMapper
 * Package: com.shopping.mapper
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/2/28 18:53
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

   BigDecimal selectMoney(Integer id);

   Boolean updateMoney(Integer id,BigDecimal money);

   Boolean refundMoney(Integer id,BigDecimal money);

   ResultMessage selectDetails(Integer id);
}
