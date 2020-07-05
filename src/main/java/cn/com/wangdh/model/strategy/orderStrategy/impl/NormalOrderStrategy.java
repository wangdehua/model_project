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
 * @description：正常的下单 , 支付方式类似于支付宝,微信,银联
 */
@Component
@HandlerOrderType(value = OrderTypeConstant.NORMAL)
public class NormalOrderStrategy implements OrderStrategy {


    @Override
    public OrderApplyResponse handleOrder(OrderApplyRequest request) throws Exception {
        OrderApplyResponse response = new OrderApplyResponse();
        /**
         *  这里要封装一些下单用的参数
         *  createOrder....
         */
        //封装返回信息
        response.setOrderNo("D202007031640231234");
        response.setOrderDate("20200703");
        response.setRespDate("2020-07-03");
        response.setRespTime("16:40:24");
        response.setMsg("正常逻辑下单下单!");
        return response ;
    }

}
