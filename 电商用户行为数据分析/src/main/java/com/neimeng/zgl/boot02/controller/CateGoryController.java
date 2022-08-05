package com.neimeng.zgl.boot02.controller;

import com.neimeng.zgl.boot02.domain.Category;
import com.neimeng.zgl.boot02.domain.CategoryVO;
import com.neimeng.zgl.boot02.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @author Liyufei
 * @version 1.0
 * @Date 2022/8/3 19:15
 */
@Controller
public class CateGoryController {

    @Resource
    private CategoryService categoryService;

    @RequestMapping("/query_category")
    public String queryCateGory(HttpServletRequest request, Model model){
        List<CategoryVO> list = categoryService.queryAllCategory();
        model.addAttribute("list",list);
        return "categroy_list";
    }


    @RequestMapping("/top_10")
    public String queryCateGorytop10(HttpServletRequest request, Model model){
        List<CategoryVO> list = categoryService.queryAllCategory01();
        model.addAttribute("list",list);
        return "top_10";
    }

    /**
     * Restful Api
     * @param request
     * @return  json
     */
    @RequestMapping("/api/query_category")
    @ResponseBody
    public Map<String,Object> queryCateGoryJson(HttpServletRequest request){
        Map<String,Object> map = new ConcurrentHashMap<>();
        List<CategoryVO> list = categoryService.queryAllCategory01();
        map.put("code","10000");
        map.put("data",list);
        map.put("error","no error,request success full ");
        map.put("token","sf23423423423sdfsdf234234");
        return map;
    }
}
