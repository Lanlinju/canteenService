package com.ct.api;

/**
 * @param <T>
 * @author: debug
 * @date: 2020/11/11
 */
public class BaseResponse<T> {
    //状态码
    private Integer code;
    //描述信息
    private String msg;
    //响应数据-采用泛型表示可以接受通用的数据类型
    private T data;

    //重载的构造方法一
    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //重载的构造方法二
    public BaseResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    //重载的构造方法三
    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse() {
    }

    public void setStatusCode(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public static <T> BaseResponse success() {
        BaseResponse<T> retMsg = new BaseResponse(StatusCode.Success);
        return retMsg;
    }

    public static <T> BaseResponse success(T data) {
        BaseResponse<T> retMsg = new BaseResponse(StatusCode.Success);
        retMsg.setData(data);
        return retMsg;
    }

    public static BaseResponse fail() {
        BaseResponse retMsg = new BaseResponse(StatusCode.Fail);
        retMsg.setData(null);
        return retMsg;
    }

    public static BaseResponse fail(String message) {
        BaseResponse retMsg = new BaseResponse(StatusCode.Fail);
        retMsg.setMsg(message);
        retMsg.setData(null);
        return retMsg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
