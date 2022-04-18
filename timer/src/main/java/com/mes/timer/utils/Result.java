package com.mes.timer.utils;

/**
 * 与form交互对象
 */
public class Result {
    /**
     * 代码（0：成功，其他失败）
     */
    private final int code;
    /**
     * 返回信息
     */
    private final String msg;
    /**
     * 返回数据
     */
    private final Object data;

    public static Result success() {
        return success("操作成功");
    }

    public static Result success(String msg) {
        return success(msg, null);
    }

    public static Result success(Object data) {
        return success(null, data);
    }

    public static Result success(String msg, Object data) {
        return new Result(0, msg, data);
    }

    public static Result error() {
        return error(-1, null);
    }

    public static Result error(String msg) {
        return error(-1, msg);
    }

    public static Result error(int code, String msg) {
        return new Result(code, msg, null);
    }

    private Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
