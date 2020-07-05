package cn.com.wangdh.model.template.handler;

import cn.com.wangdh.model.template.abstracts.AbstractPayResultNotifyTemplate;
import cn.com.wangdh.model.template.config.HandlerPayResultNotifyType;
import cn.com.wangdh.model.template.constant.NotifyTypeConstant;
import cn.com.wangdh.model.template.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/4 22:50
 * @description：微信支付回调 的处理类
 */
@HandlerPayResultNotifyType(value = NotifyTypeConstant.WEICHART_PAY)
@Service
public class WechartPayResultNotifyHandler extends AbstractPayResultNotifyTemplate {

    @Autowired
    private OrderService orderService ;

    @Override
    protected Map<String,Object> asyncService(Map<String, Object> map) {
        //具体的修改逻辑实现
        System.out.println("=====================微信 - 支付【修改结果状态】了...=====================");
        Map<String,Object> ret = new HashMap<>();
        ret.put("code-wechart","0000");
        ret.put("msg-wechart","success");
        ret.put("status","success");
        return ret ;
    }

    @Override
    protected Map<String,Object> verifySignature(Map<String, Object> map) {
        System.out.println("=====================微信 - 支付【检查参数信息】了...=====================");
        Map<String,Object> ret = new HashMap<>();
        ret.put("code-wechart","0000");
        ret.put("msg-wechart","success");
        ret.put("status","success");
        return ret ;
    }

    @Override
    protected Map<String,Object> checkOrderInfo(Map<String, Object> map) {
        System.out.println("=====================微信 - 支付【检查订单信息】了...=====================");
        Map<String,Object> ret = new HashMap<>();
        ret.put("code-wechart","0000");
        ret.put("msg-wechart","success");
        ret.put("status","success");
        return ret ;
    }
}
