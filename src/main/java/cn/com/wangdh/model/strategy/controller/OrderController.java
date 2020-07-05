package cn.com.wangdh.model.strategy.controller;

import cn.com.wangdh.model.strategy.handler.OrderHandler;
import cn.com.wangdh.model.strategy.vo.request.OrderApplyRequest;
import cn.com.wangdh.model.strategy.vo.response.OrderApplyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 15:45
 * @description：模拟下单
 */
@RestController
public class OrderController {

    @Autowired
    private OrderHandler orderHandler ;

    /**
     * 下单
     * @param request
     * @return
     */
    @PostMapping(value = "/orderApply")
    public OrderApplyResponse orderApply(@RequestBody OrderApplyRequest request){
        OrderApplyResponse ret = new OrderApplyResponse();
        try{
            ret = this.orderHandler.orderApply(request);
            ret.setCode("0000");
        }catch (Exception e){
            ret.setCode("9999");
            ret.setMsg(e.getMessage());
        }
        return ret ;
    }

}
