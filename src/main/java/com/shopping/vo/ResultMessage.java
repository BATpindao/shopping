package com.shopping.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

/**
 * ClassName: ResultMessage
 * Package: com.shopping.vo
 * Description:
 *
 * @Author 练习商城-凌孝平
 * @Create 2023/2/28 20:55
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResultMessage {
    private Boolean result; // 请求结果
    private Integer msgCode; // 响应状态码
    private String reason; // 失败原因
    private Map map; // 返回数据

}
