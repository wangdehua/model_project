package cn.com.wangdh.model.factory.simple.service;

import cn.com.wangdh.model.factory.simple.vo.OpenCardRequest;
import cn.com.wangdh.model.factory.simple.vo.OpenCardResponse;
import org.springframework.stereotype.Service;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/6 11:54
 * @description：京东开卡service
 */
@Service
public class JDOpenCardServiceImpl implements OpenCardService {

    @Override
    public OpenCardResponse openCard(OpenCardRequest request) {
        System.out.println("=====================【调用京东开卡】=================");
        return new OpenCardResponse();
    }
}
