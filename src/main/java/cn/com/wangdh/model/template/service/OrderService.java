package cn.com.wangdh.model.template.service;

import java.util.Map;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/4 22:38
 * @description：订单的实现业务
 */
public interface OrderService {

    Map<String,Object> getOrderInfo(Map<String,Object> map);
}
