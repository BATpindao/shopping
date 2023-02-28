package com.shopping.service.impl;

import com.shopping.entity.Details;
import com.shopping.mapper.DetailsMapper;
import com.shopping.mapper.UserMapper;
import com.shopping.service.UserService;
import com.shopping.vo.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: UserServiceImpl
 * Package: com.shopping.service.impl
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/2/28 20:49
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;
    private final DetailsMapper mapper2;

    @Override
    public ResultMessage selectMoney(Integer id) {
        BigDecimal bigDecimal = mapper.selectMoney(id);
        ResultMessage message;
        Map<String,Object> money = new HashMap();
        if (bigDecimal!=null){
            money.put("money", bigDecimal);
            message=new ResultMessage(true,200,"请求成功", money);
            return message;
        }else{
            money.put("money", null);
            message=new ResultMessage(false,500,"请求失败", money);
            return message;
        }

    }

    @Override
    public ResultMessage updateMoney(Integer id,BigDecimal money) {
        BigDecimal bigDecimal = mapper.selectMoney(id);
        ResultMessage message;
        Map<String,Object> map = new HashMap();
        if (bigDecimal.compareTo(money) != -1){
            Boolean aBoolean = mapper.updateMoney(id, money);
            if (aBoolean){
                Details details=new Details();
                SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date(System.currentTimeMillis());
                details.setId(id);
                details.setDetailsMoney(money);
                details.setMessage("消费成功"+formatter.format(date));
                 mapper2.insertDetails(details);

                message=new ResultMessage(true,200,"消费成功",map);
                return message;
            }else {
                message=new ResultMessage(false,500,"消费失败",map);
              return message;
            }
        }else {
            map.put("money",bigDecimal);
            message=new ResultMessage(false,500,"消费的金额大于了钱包的金额",map);
            return message;
        }
    }

    @Override
    public ResultMessage refundMoney(Integer id, BigDecimal money) {
        ResultMessage message;
        Map<String,Object> map = new HashMap();
            Boolean aBoolean = mapper.refundMoney(id, money);
            if (aBoolean){
                Details details=new Details();
                SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date(System.currentTimeMillis());
                details.setId(id);
                details.setDetailsMoney(money);
                details.setMessage("退款成功"+formatter.format(date));
                mapper2.insertDetails(details);

                message=new ResultMessage(true,200,"退款成功",map);
                return message;
            }else {
                message=new ResultMessage(false,500,"退款失败",map);
                return message;
            }

    }


}
