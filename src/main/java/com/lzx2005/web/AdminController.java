package com.lzx2005.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/6/29.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/index")
    public String index(Model model){
        return "admin/index";
    }
}
