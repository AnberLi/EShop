package com.anber.demo.rest;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestRest {

    @GetMapping("/getList")
    public String getList() {
        System.out.println("调用了！111");
        List list=new ArrayList<>();
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
