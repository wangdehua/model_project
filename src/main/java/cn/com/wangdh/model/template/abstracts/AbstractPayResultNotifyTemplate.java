package cn.com.wangdh.model.template.abstracts;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 18:24
 * @description：支付回调的模板类
 */
@Component
public abstract class AbstractPayResultNotifyTemplate {

    /**
     *  回调通知 :
     *      1 . 把第三方的请求信息写入日志
     *      2 . 参数校验
     *      3 . 订单信息校验
     *      4 . 更新支付状态
     */

    /**
     * 定义支付回调都要执行的方法
     * @return
     */
    public Map<String,Object> payResultNotifyDeal(Map<String,Object> map){
        //日志记录,异步
        payResultNotifyLog(map);

        //相关信息校验
        map = verifySignature(map) ;
        if(!map.get("status").equals("success")){
            map.remove("status");
            return  map ;
        }

        //验证订单信息
        map = checkOrderInfo(map);
        if(!map.get("status").equals("success")){
            map.remove("status");
            return  map ;
        }

        //更新状态，返回支付结果 , 项目中微信和银联和支付宝 返回结果不一样 , 需要重写 asyncService 这个方法,返回不同的结果
        map = asyncService(map) ;
        if(!map.get("status").equals("success")){
            map.remove("status");
            return  map ;
        }
        map.remove("status");
        return map ;
    }

    /**
     * 异步写入日志
     * @param map
     */
    @Async(value = "payResultNotify")
    public void payResultNotifyLog(Map<String, Object> map) {
        System.out.println("===================== 日志信息记录中 .....=====================");
    }


    /**
     * 验证参数（每个子类需要实现）
     *
     * @return
     */
    protected abstract Map<String,Object> verifySignature(Map<String,Object> map);

    /**
     * 检查订单（子类需要实现）
     *
     * @return
     */
    protected abstract Map<String,Object> checkOrderInfo(Map<String,Object> map) ;


    /**
     *  执行回调异步-> 更新状态，返回支付结果 （每个子类需要实现）
     *
     * @return
     */
    protected abstract Map<String, Object> asyncService(Map<String, Object> map );

}
