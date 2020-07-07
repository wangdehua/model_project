package cn.com.wangdh.model.factory.simple.controller;

import cn.com.wangdh.model.factory.simple.handler.OpenCardHandler;
import cn.com.wangdh.model.factory.simple.vo.OpenCardRequest;
import cn.com.wangdh.model.factory.simple.vo.OpenCardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/6 12:00
 * @description：开卡controller,模拟开卡
 */
@RestController
public class OpenCardController {

    @Autowired
    private OpenCardHandler handler ;

    /**
     *  模拟开卡
     * @param type
     * @param request
     * @return
     */
    @PostMapping(value = "/openCard/{type}")
    public OpenCardResponse openCard(@PathVariable Integer type , OpenCardRequest request ){
        return this.handler.openCardHandler(type,request);
    }
}
