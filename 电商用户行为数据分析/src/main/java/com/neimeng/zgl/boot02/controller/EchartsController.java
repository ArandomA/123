package com.neimeng.zgl.boot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EchartsController {

    @RequestMapping("/sample_charts")
    public String sample_charts(HttpServletRequest request){
        return "echarts/sample";
    }

    @RequestMapping("/wend_week")
    public String wend_week(HttpServletRequest request){
        return "echarts/wend_week";
    }

    @RequestMapping("/top10_charts")
    public String show_top10(HttpServletRequest request){
        return "top_10";
    }
}
