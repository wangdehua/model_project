package cn.com.wangdh.model.template.constant;

import org.springframework.stereotype.Component;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 16:56
 * @description：通知类型常量类
 */
@Component
public class NotifyTypeConstant {

    public static final int ALI_PAY = 1 ; // 支付宝支付结果通知
    public static final int WEICHART_PAY = 2 ; // 微信支付结果通知
    public static final int UNION_PAY = 3 ; //银联支付结果通知

    /**
     * 通知类型
     */
    private int type ;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
