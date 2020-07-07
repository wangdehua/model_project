package cn.com.wangdh.model.factory.simple.factory;

import cn.com.wangdh.model.factory.simple.service.AppOpenCardServiceImpl;
import cn.com.wangdh.model.factory.simple.service.JDOpenCardServiceImpl;
import cn.com.wangdh.model.factory.simple.service.OpenCardService;
import cn.com.wangdh.model.factory.simple.service.WalletOpenCardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/6 11:44
 * @description：开卡类型工厂
 */
@Service
public class OpenCardFactory {

    @Autowired
    private ApplicationContext applicationContext ;

    /**
     *  简单工厂的实现
     * @param type
     * @return
     */
    public OpenCardService openCardFactory(Integer type) throws Exception {
        OpenCardService openCardService = null ;
        switch (type){
            case 1 :
                openCardService = new AppOpenCardServiceImpl();
                break;
            case 2 :
                openCardService = new WalletOpenCardServiceImpl();
                break;
            case 3 :
                openCardService = new JDOpenCardServiceImpl() ;
        }
        Optional.ofNullable(openCardService).orElseThrow(() -> new Exception("该种类型不支持..."));
        return this.applicationContext.getBean(openCardService.getClass());
    }

}
