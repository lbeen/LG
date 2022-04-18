package com.mes.util;

public class Result {
    private final int code;
    private final String msg;
    private final Object data;

    public static Result success() {
        return new Result(0, "操作成功", null);
    }

    public static Result success(Object data) {
        return new Result(0, null, data);
    }

    public static Result error(String msg) {
        return new Result(-1, msg, null);
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
