package cn.com.wangdh.model.template.config;

import java.lang.annotation.*;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 16:59
 * @description：orderType注解方式实现
 */
@Target(ElementType.TYPE)  //作用在类上,接口，枚举上
@Retention(RetentionPolicy.RUNTIME) //// 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented  //说明该注解将被包含在javadoc中
@Inherited  //子类可以继承此注解
public @interface HandlerPayResultNotifyType {

    /**
     * 策略类型
     * @return
     */
    int value();

}
