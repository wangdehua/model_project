package cn.com.wangdh.model.strategy.orderStrategy;

import cn.com.wangdh.model.strategy.vo.request.OrderApplyRequest;
import cn.com.wangdh.model.strategy.vo.response.OrderApplyResponse;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 15:34
 * @description：订单策略模式接口封装
 */
public interface OrderStrategy {

    OrderApplyResponse handleOrder(OrderApplyRequest request ) throws Exception ;
}
