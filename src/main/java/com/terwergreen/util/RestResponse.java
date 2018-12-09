package com.terwergreen.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author terwergreen
 * 接口返回数据模型DTO
 */
public class RestResponse {

    /**
     * 状态码（数字节点），包括通用状态码及业务状态
     */
    private String flag;

    /**
     * 消息
     */
    private String msg;

    /**
     * 数据节点（对象节点），包含接口中的业务数据
     */
    private Object data;

    public RestResponse() {
        super();
    }

    public RestResponse(String flag) {
        super();
        this.flag = flag;
    }

    public RestResponse(String flag, String msg) {
        super();
        this.flag = flag;
        this.msg = msg;
    }

    public RestResponse(String flag, String msg, Object data) {
        super();
        this.flag = flag;
        this.msg = msg;
        this.data = data;
    }

    public RestResponse(RestResponse dto) {
        super();
        if(null==dto|| StringUtils.isEmpty(dto.getFlag())){
            this.flag = RestResponseStates.SUCCESS.getValue();
            this.msg = RestResponseStates.SUCCESS.getMsg();
        }else{
            this.flag = dto.getFlag();
            this.msg = dto.getFlag();
            this.data = dto.getData();
        }
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
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
