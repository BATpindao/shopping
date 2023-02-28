package com.shopping.service.impl;

import com.shopping.entity.Details;
import com.shopping.mapper.DetailsMapper;
import com.shopping.service.DetailsService;
import com.shopping.vo.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * ClassName: DetailsServiceImpl
 * Package: com.shopping.service.impl
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/3/1 1:01
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class DetailsServiceImpl implements DetailsService {

    private final DetailsMapper mapper;
    @Override
    public ResultMessage selectDetails(Integer id) {
        List<Details> details = mapper.selectDetails(id);
        ResultMessage messag;
        if (details!=null){
            HashMap<String,Object> map=new HashMap<>();
            map.put("details",details);
            messag=new ResultMessage(true,200,"查询金额变动明细成功",map);
            return messag;
        }else {
            messag=new ResultMessage(false,500,"查询金额变动明细失败",null);
            return messag;
        }
    }
}
