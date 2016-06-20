package com.lzx2005.dto;

/**
 * Created by Administrator on 2016/6/20.
 */
public class BlogServiceResult<T> {
    private boolean success;
    private String errorMsg;
    private T data;

    public BlogServiceResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public BlogServiceResult(boolean success, String errorMsg) {
        this.success = success;
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BlogServiceResult{" +
                "success=" + success +
                ", errorMsg='" + errorMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
