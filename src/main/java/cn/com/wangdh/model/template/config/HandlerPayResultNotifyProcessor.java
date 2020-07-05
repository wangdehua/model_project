package cn.com.wangdh.model.template.config;

import cn.com.wangdh.model.template.abstracts.AbstractPayResultNotifyTemplate;
import cn.com.wangdh.model.template.context.PayResultNotifyApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * create by: wangdh
 * description:  获取所有策略注解的类型  并将对应的class初始化到HandlerPayResultNotifyContext中
 * create time: 2020/7/3 17:00
 */
@Component
public class HandlerPayResultNotifyProcessor implements ApplicationContextAware {

    /**
     * 获取所有的策略Beanclass 加入HandlerOrderContext属性中
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //获取所有策略注解的Bean
        Map<String, Object> payResultNotifyType = applicationContext.getBeansWithAnnotation(HandlerPayResultNotifyType.class);
        payResultNotifyType.forEach((k, v) -> {
            Class<AbstractPayResultNotifyTemplate> payResultNotifyTemplateClass = (Class<AbstractPayResultNotifyTemplate>) v.getClass();
            int type = payResultNotifyTemplateClass.getAnnotation(HandlerPayResultNotifyType.class).value();
            //将class加入map中,type作为key 1 : 支付宝支付结果通知 , 2 : 微信支付结果通知的处理类...
            PayResultNotifyApplicationContext.templateMap.put(type, payResultNotifyTemplateClass);
        });
    }
}