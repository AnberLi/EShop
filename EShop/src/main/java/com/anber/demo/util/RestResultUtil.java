package com.anber.demo.util;

import com.alibaba.fastjson2.JSONObject;

/**
 * 接口工具类
 *
 * @author Anber
 * @version 2024-08-13 16:53:23
 * @create 2024-08-13 16:52:57
 */
public class RestResultUtil {

    //接口成功返回状态码
    public static final String SUCCESS_CODE = "200";

    //接口错误类型
    /**
     * 参数错误
     */
    public static final String ERROR_TYPE_P = "P";

    /**
     * 业务错误
     */
    public static final String ERROR_TYPE_B = "B";

    /**
     * 网络错误
     */
    public static final String ERROR_TYPE_N = "N";

    /**
     * 数据库错误
     */
    public static final String ERROR_TYPE_D = "D";

    /**
     * 文件IO错误
     */
    public static final String ERROR_TYPE_F = "F";

    /**
     * 其他错误
     */
    public static final String ERROR_TYPE_O = "O";

    public static String success(Object custom,  String text) {
        JSONObject result = new JSONObject();
        result.put("custom", custom);

        JSONObject status = new JSONObject();
        status.put("code", "200");
        status.put("text", text);
        result.put("status", status);
        return result.toString();
    }

    public static String error(Object custom, String errorType,String code, String text) {
        JSONObject result = new JSONObject();
        result.put("custom", custom);

        JSONObject status = new JSONObject();
        status.put("errortype", errorType);
        status.put("code", code);
        status.put("text", text);
        result.put("status", status);
        return result.toString();
    }
}
