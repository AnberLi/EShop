package com.anber.demo.rest;

import com.alibaba.fastjson2.JSONObject;
import com.anber.demo.util.RestResultUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/login")
public class TestRest {
    /**
     * 日志
     */
    Logger logger = LogManager.getLogger(TestRest.class);


    //登录校验接口
    @PostMapping("/check")
    public String check(@RequestBody String params) {
        logger.info("开始调用接口： rest/login/check 参数：" + params);
        JSONObject jsonObject = JSONObject.parseObject(params);
        JSONObject custom = new JSONObject();
        custom.put("msg", "success");
        logger.info("结束调用接口： rest/login/check 结束");
        return RestResultUtil.success(custom, "调用成功！");
    }

    @GetMapping("/getList")
    public String getList() {
        List list = new ArrayList<>();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("date", "2016-05-02");
        jsonObject.put("name", "王小虎");
        jsonObject.put("address", "上海市普陀区金沙江路 1518 弄");
        list.add(jsonObject);
        jsonObject = new JSONObject();
        jsonObject.put("date", "2016-05-03");
        jsonObject.put("name", "王小虎1");
        jsonObject.put("address", "上海市普陀区金沙江路 1519 弄");
        list.add(jsonObject);
        jsonObject = new JSONObject();
        jsonObject.put("date", "2016-05-04");
        jsonObject.put("name", "王小虎3");
        jsonObject.put("address", "上海市普陀区金沙江路 1520 弄");
        list.add(jsonObject);
        return list.toString();
    }
}
