package com.shopping.service;

import com.shopping.vo.ResultMessage;

/**
 * ClassName: DetailsService
 * Package: com.shopping.service
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/3/1 1:00
 * @Version 1.0
 */
public interface DetailsService {

     ResultMessage selectDetails(Integer id);
}
