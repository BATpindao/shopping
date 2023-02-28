package com.shopping.mapper;

import com.shopping.entity.Details;
import com.shopping.vo.ResultMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: DetailsMapper
 * Package: com.shopping.mapper
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/3/1 0:59
 * @Version 1.0
 */

@Mapper
public interface DetailsMapper {

    List<Details> selectDetails(Integer id);

     Boolean insertDetails(Details details);
}
