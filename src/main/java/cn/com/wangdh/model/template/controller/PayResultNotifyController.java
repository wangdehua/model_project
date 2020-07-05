package cn.com.wangdh.model.template.controller;

import cn.com.wangdh.model.template.abstracts.AbstractPayResultNotifyTemplate;
import cn.com.wangdh.model.template.context.PayResultNotifyApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 18:56
 * @description：支付回调通知
 */
@RestController
public class PayResultNotifyController {

    @Autowired
    private PayResultNotifyApplicationContext payResultNotifyApplicationContext ;

    /**
     *  模拟支付回调
     * @return
     */
    @PostMapping(value = "/payResultNotify/{templateId}")
    public Map<String,Object> payResultNotify(@PathVariable String templateId ,
                                              @RequestBody Map<String,Object> map) throws Exception {
        AbstractPayResultNotifyTemplate payResultNotifyTemplate = this.payResultNotifyApplicationContext.getPayResultNotifyTemplate(templateId);
        return payResultNotifyTemplate.payResultNotifyDeal(map);
    }
}
