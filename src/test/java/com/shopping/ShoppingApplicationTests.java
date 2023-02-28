package com.shopping;

import com.shopping.entity.Details;
import com.shopping.mapper.DetailsMapper;
import com.shopping.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ShoppingApplicationTests {

    @Autowired
    private DetailsMapper mapper;
    @Test
    void contextLoads() {
        List<Details> details = mapper.selectDetails(1);
        System.out.println(details);


    }

}
