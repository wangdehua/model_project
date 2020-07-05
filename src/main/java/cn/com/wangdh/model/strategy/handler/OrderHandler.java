package cn.com.wangdh.model.strategy.handler;

import cn.com.wangdh.model.strategy.context.OrderApplicationContext;
import cn.com.wangdh.model.strategy.orderStrategy.OrderStrategy;
import cn.com.wangdh.model.strategy.vo.request.OrderApplyRequest;
import cn.com.wangdh.model.strategy.vo.response.OrderApplyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 15:46
 * @description：订单处理接口
 */
@Service
public class OrderHandler {

    @Autowired
    private OrderApplicationContext orderApplicationContext ;

    /**
     *  模拟策略模式下单
     * @param request
     * @return
     */
    public OrderApplyResponse orderApply(OrderApplyRequest request) throws Exception {
        //调用相对应的策略
        OrderStrategy orderStrategy = this.orderApplicationContext.getOrderStrategy(request);
        //处理对应订单
        return orderStrategy.handleOrder(request);
    }

}
