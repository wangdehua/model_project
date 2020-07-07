package cn.com.wangdh.model.factory.simple.vo;

/**
 * @author ：wangdh
 * @date ：Created in 2020/7/6 13:43
 * @description：开卡响应
 */
public class OpenCardResponse {

    //开卡的一些响应
    private String code ;

    private String msg ;

    private String respDate ;

    private String respTime ;

    private Object data ;

    //其他
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
