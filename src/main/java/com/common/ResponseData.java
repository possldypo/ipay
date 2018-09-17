package com.common;

public class ResponseData {

    public static String SUCCESS = "000";

    public static String FAILED = "999";

    public static String SUCCESS_MSG = "成功";

    public static String FAILED_MSG = "失败";

    private Object data;

    private String code;

    private String msg;

    public ResponseData() {
    }

    ;

    public ResponseData(Object data, String code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public ResponseData setResponseData(String code, String msg, Object data) {
        this.data = data;
        this.code = code;
        this.msg = msg;
        return this;
    }

    public ResponseData success() {
        return this.setResponseData(SUCCESS, SUCCESS_MSG, null);
    }

    public ResponseData success(Object data) {
        return this.setResponseData(SUCCESS, SUCCESS_MSG, data);
    }

    public ResponseData failed(String msg) {
        return this.setResponseData(FAILED, msg, null);
    }

    public ResponseData failed() {
        return this.setResponseData(FAILED, FAILED_MSG, null);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
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
