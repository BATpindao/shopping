package com.shopping.controller;

import com.shopping.service.DetailsService;
import com.shopping.vo.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: DetailsController
 * Package: com.shopping.controller
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/3/1 0:58
 * @Version 1.0
 */
@RestController
@RequestMapping("/details")
@RequiredArgsConstructor
public class DetailsController {

    private final DetailsService service;


    @PostMapping("/selectdetails")//查询用户钱包金额变动明细的接口
    public ResultMessage selectDetails(Integer id){
        return service.selectDetails(id);
    }
}
