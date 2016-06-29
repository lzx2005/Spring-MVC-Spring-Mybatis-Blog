package com.lzx2005.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/6/28.
 */
@Controller
public class IndexController {

    /**
     * 首页
     * @param model
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("访问首页");
        return "index";
    }

    @RequestMapping(
            value = "/login_sub",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public String login_sub(Model model){
        return "redired";
    }
}
