package cn.com.wangdh.model.template.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/4 22:38
 * @description：订单业务实现类
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Map<String, Object> getOrderInfo(Map<String, Object> map) {
        return new HashMap<>();
    }
}
