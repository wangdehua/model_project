package cn.com.wangdh.model.strategy.constant;

import org.springframework.stereotype.Component;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 16:56
 * @description：订单类型常量类
 */
@Component
public class OrderTypeConstant {

    public static final int NORMAL = 0 ; // 正常下单 , 支付宝 微信 银联 等等 , 下单后吊起支付
    public static final int ACCOUNT = 1 ; // 账户 && 钱包类 下单 , 直接是支付成功的状态 , 然后生成的订单信息
    public static final int DISCOUT = 2 ; //打折订单 , 一般 信用卡 支付 有打折信息

    /**
     * 订单类型
     */
    private int type ;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
