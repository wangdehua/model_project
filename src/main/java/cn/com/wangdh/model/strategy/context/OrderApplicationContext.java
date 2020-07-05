package cn.com.wangdh.model.strategy.context;

import cn.com.wangdh.model.strategy.orderStrategy.OrderStrategy;
import cn.com.wangdh.model.strategy.vo.request.OrderApplyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 15:51
 * @description：根据类型确定策略
 */
@Component
public class OrderApplicationContext {

    /**
     * spring 上下文
     */
    @Autowired
    private ApplicationContext applicationContext ;

    /**
     * 存放所有策略类Bean的map,使用静态的
     */
    public static Map<Integer, Class<OrderStrategy>> orderStrategyBeanMap = new HashMap<>();

    public OrderStrategy getOrderStrategy(OrderApplyRequest request) throws Exception {
        Class<OrderStrategy> strategyClass = orderStrategyBeanMap.get(request.getOrderType());
        Optional.ofNullable(strategyClass).orElseThrow(() -> new Exception("没有对应的订单类型...")) ;
        //从容器中获取对应的策略Bean
        return this.applicationContext.getBean(strategyClass);
    }

}
