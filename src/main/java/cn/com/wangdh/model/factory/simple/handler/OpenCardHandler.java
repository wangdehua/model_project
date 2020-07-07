package cn.com.wangdh.model.factory.simple.handler;

import cn.com.wangdh.model.factory.simple.factory.OpenCardFactory;
import cn.com.wangdh.model.factory.simple.service.OpenCardService;
import cn.com.wangdh.model.factory.simple.vo.OpenCardRequest;
import cn.com.wangdh.model.factory.simple.vo.OpenCardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/6 16:27
 * @description：测试handler
 */
@Service
public class OpenCardHandler {

    @Autowired
    private OpenCardFactory openCardFactory ;

    public OpenCardResponse openCardHandler( Integer type , OpenCardRequest request ){
        OpenCardResponse response = new OpenCardResponse();
        try{
            OpenCardService openCardService = this.openCardFactory.openCardFactory(type);
            Optional.ofNullable(openCardService).orElseThrow(() -> new Exception("该类型暂不支持!"));
            response = openCardService.openCard(request);
            response.setMsg("success!");
            response.setCode("0000");
        }catch (Exception e){
            response.setCode("9999");
            response.setMsg(e.getMessage());
        }
        return response ;
    }
}
