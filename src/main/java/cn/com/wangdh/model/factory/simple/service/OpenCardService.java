package cn.com.wangdh.model.factory.simple.service;

import cn.com.wangdh.model.factory.simple.vo.OpenCardRequest;
import cn.com.wangdh.model.factory.simple.vo.OpenCardResponse;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/6 11:50
 * @description：开卡业务service
 */
public interface OpenCardService {

    /**
     *  开卡的统一处理方法
     * @param request
     * @return
     */
    OpenCardResponse openCard(OpenCardRequest request );

}
