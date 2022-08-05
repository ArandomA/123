package com.neimeng.zgl.boot02.controller;

import com.neimeng.zgl.boot02.domain.CategroySession;
import com.neimeng.zgl.boot02.domain.CategroySessionVO;
import com.neimeng.zgl.boot02.service.CategorySessionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CategorySessionController {

    @Resource
    private CategorySessionService categorySessionService;

    @RequestMapping("/top10_session")
    public String queryCateGorySessiontop10(HttpServletRequest request, Model model){
        List<CategroySessionVO> list = categorySessionService.findCategorySession();
        model.addAttribute("list",list);
        return "top10_session";
    }
}
