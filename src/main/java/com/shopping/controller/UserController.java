package com.shopping.controller;

import com.shopping.service.UserService;
import com.shopping.vo.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * ClassName: UserController
 * Package: com.shopping.controller
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/2/28 20:50
 * @Version 1.0
 */

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/money/{id}") //查询用户钱包余额
   public ResultMessage selectMoney(@PathVariable("id") Integer id){
      return service.selectMoney(id);
    }

    @PostMapping("/updatemoney") //用户消费100元的接口
    public ResultMessage updateMoney(Integer id,BigDecimal money){
        System.out.println(id+","+money);
        return service.updateMoney(id,money);
    }

    @PostMapping("/refundMoney") //用户退款20元接口
   public ResultMessage refundMoney(Integer id,BigDecimal money){
     return service.refundMoney(id, money);
   }

}
