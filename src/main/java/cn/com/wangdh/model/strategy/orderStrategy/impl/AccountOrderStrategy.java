package cn.com.wangdh.model.strategy.orderStrategy.impl;

import cn.com.wangdh.model.strategy.config.HandlerOrderType;
import cn.com.wangdh.model.strategy.constant.OrderTypeConstant;
import cn.com.wangdh.model.strategy.orderStrategy.OrderStrategy;
import cn.com.wangdh.model.strategy.vo.request.OrderApplyRequest;
import cn.com.wangdh.model.strategy.vo.response.OrderApplyResponse;
import org.springframework.stereotype.Component;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 16:31
 * @description：账户类支付方式下单
 */
@Component
@HandlerOrderType(value = OrderTypeConstant.ACCOUNT)
public class AccountOrderStrategy implements OrderStrategy {

    @Override
    public OrderApplyResponse handleOrder(OrderApplyRequest request) throws Exception {
        OrderApplyResponse response = new OrderApplyResponse();
        /**
         *  这里要封装一些下单用的参数 , 这个是 账户类订单的 处理类 , 所以下单 直接是支付成功的状态
         *
         *  createOrder....
         */
        //封装返回信息
        response.setOrderNo("D202007031640235678");
        response.setOrderDate("20200703");
        response.setRespDate("2020-07-03");
        response.setRespTime("16:40:24");
        response.setMsg("账户类支付下单!");
        return response ;
    }

}
