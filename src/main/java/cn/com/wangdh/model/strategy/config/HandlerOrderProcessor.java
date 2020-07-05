package cn.com.wangdh.model.strategy.config;

import cn.com.wangdh.model.strategy.context.OrderApplicationContext;
import cn.com.wangdh.model.strategy.orderStrategy.OrderStrategy;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * create by: wangdh
 * description:  获取所有策略注解的类型  并将对应的class初始化到HandlerOrderContext中
 * create time: 2020/7/3 17:00
 */
@Component
public class HandlerOrderProcessor implements ApplicationContextAware {

    /**
     * 获取所有的策略Beanclass 加入HandlerOrderContext属性中
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //获取所有策略注解的Bean
        Map<String, Object> orderStrategyMap = applicationContext.getBeansWithAnnotation(HandlerOrderType.class);
        orderStrategyMap.forEach((k, v) -> {
            Class<OrderStrategy> orderStrategyClass = (Class<OrderStrategy>) v.getClass();
            int type = orderStrategyClass.getAnnotation(HandlerOrderType.class).value();
            //将class加入map中,type作为key 0 : 正常下单处理类 , 1 : 账户钱包类型的处理类...
            OrderApplicationContext.orderStrategyBeanMap.put(type, orderStrategyClass);
        });
    }
}