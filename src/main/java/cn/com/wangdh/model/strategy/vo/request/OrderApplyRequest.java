package cn.com.wangdh.model.strategy.vo.request;

import java.util.Objects;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/3 16:04
 * @description：下单请求的request
 */
public class OrderApplyRequest {

    /**
     *  下单选择策略模式的原因 :
     *      有些App根据支付方式的不同, 后台生成 订单的方式 也是不同的 , 如果不用设计模式可能会存在大量的if..else..
     *      要做到符合 java 的开闭原则(对外开放,对内闭合,最简单的理解,对外部添加部分功能,内部不改动代码)
     *      所以选择策略模式,
     *      我这里是根据订单类型  主要区分字段是 orderType
     *
     *      0:正常下单 NORMAL . 支付宝,微信,银联类 下单时支付状态为初始 , 然后吊起支付, 支付,修改支付结果
     *      1:账户&&钱包类型下单 . 账户和钱包下单直接先扣除余额,扣除成功后生成订单,下单时的状态为支付成功
     *      2:打折类型 . 一般信用卡支付会有打折的情况 , 所以在下单过程中有金额的计算
     */

    private String reqDate ;

    private String reqTime ;

    private Integer orderType ; //订单类型 , 根据这个确定策略

    private Integer payType ; //支付方式

    private Integer price ;

    private String goodsId ;

    private String userId ;

    private String accountNo ;

    private String phoneNo ;

    //...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderApplyRequest that = (OrderApplyRequest) o;
        return Objects.equals(reqDate, that.reqDate) &&
                Objects.equals(reqTime, that.reqTime) &&
                Objects.equals(orderType, that.orderType) &&
                Objects.equals(price, that.price) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(accountNo, that.accountNo) &&
                Objects.equals(phoneNo, that.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reqDate, reqTime, orderType, price, goodsId, userId, accountNo, phoneNo);
    }

    @Override
    public String toString() {
        return "OrderApplyRequest{" +
                "reqDate='" + reqDate + '\'' +
                ", reqTime='" + reqTime + '\'' +
                ", orderType=" + orderType +
                ", price=" + price +
                ", goodsId='" + goodsId + '\'' +
                ", userId='" + userId + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

    public OrderApplyRequest() {
    }

    public OrderApplyRequest(String reqDate, String reqTime, Integer orderType, Integer price, String goodsId, String userId, String accountNo, String phoneNo) {
        this.reqDate = reqDate;
        this.reqTime = reqTime;
        this.orderType = orderType;
        this.price = price;
        this.goodsId = goodsId;
        this.userId = userId;
        this.accountNo = accountNo;
        this.phoneNo = phoneNo;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }
}
