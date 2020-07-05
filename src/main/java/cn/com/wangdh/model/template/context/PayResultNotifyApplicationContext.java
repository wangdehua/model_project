package cn.com.wangdh.model.template.context;

import cn.com.wangdh.model.template.abstracts.AbstractPayResultNotifyTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 15:51
 * @description：根据类型确定特定的类
 */
@Component
public class PayResultNotifyApplicationContext {

    /**
     * spring 上下文
     */
    @Autowired
    private ApplicationContext applicationContext ;

    /**
     * 存放所有策略类Bean的map,使用静态的
     */
    public static Map<Integer, Class<AbstractPayResultNotifyTemplate>> templateMap = new HashMap<>();

    public AbstractPayResultNotifyTemplate getPayResultNotifyTemplate(String templateId) throws Exception {
        Class<AbstractPayResultNotifyTemplate> templateClass = templateMap.get(Integer.valueOf(templateId));
        Optional.ofNullable(templateClass).orElseThrow(() -> new Exception("没有对应的模板...")) ;
        //从容器中获取对应的策略Bean
        return this.applicationContext.getBean(templateClass);
    }

}
