package com.terwergreen.util;

/**
 * @author terwergreen
 * 接口返回数据模型DTO
 */
public class RestResponse {

    /**
     * 状态码（数字节点），包括通用状态码及业务状态
     */
    private Integer flag;

    /**
     * 消息
     */
    private String msg;

    /**
     * 数据节点（对象节点），包含接口中的业务数据
     */
    private Object data;

    public RestResponse() {
    }

    public RestResponse(Integer flag) {
        this.flag = flag;
    }

    public RestResponse(Integer flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public RestResponse(Integer flag, String msg, Object data) {
        this.flag = flag;
        this.msg = msg;
        this.data = data;
    }

    public RestResponse(RestResponse dto) {
        if (null == dto || null == dto.getFlag()) {
            this.flag = RestResponseStates.SUCCESS.getValue();
            this.msg = RestResponseStates.SUCCESS.getMsg();
        } else {
            this.flag = dto.getFlag();
            this.msg = dto.getMsg();
            this.data = dto.getData();
        }
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
