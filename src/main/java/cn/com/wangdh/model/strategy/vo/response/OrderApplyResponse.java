package cn.com.wangdh.model.strategy.vo.response;

import java.util.Objects;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 16:25
 * @description：下单请求的响应
 */
public class OrderApplyResponse {

    private String respDate ;

    private String respTime ;

    private String orderNo ;

    private String orderDate ;

    private String code ;

    private String msg ;

    //...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderApplyResponse that = (OrderApplyResponse) o;
        return Objects.equals(respDate, that.respDate) &&
                Objects.equals(respTime, that.respTime) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(orderDate, that.orderDate) &&
                Objects.equals(code, that.code) &&
                Objects.equals(msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(respDate, respTime, orderNo, orderDate, code, msg);
    }

    public OrderApplyResponse() {
    }

    public OrderApplyResponse(String respDate, String respTime, String orderNo, String orderDate, String code, String msg) {
        this.respDate = respDate;
        this.respTime = respTime;
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.code = code;
        this.msg = msg;
    }

    public String getRespDate() {
        return respDate;
    }

    public void setRespDate(String respDate) {
        this.respDate = respDate;
    }

    public String getRespTime() {
        return respTime;
    }

    public void setRespTime(String respTime) {
        this.respTime = respTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
