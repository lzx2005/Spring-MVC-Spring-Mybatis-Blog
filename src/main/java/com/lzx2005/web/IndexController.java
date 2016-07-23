package com.lzx2005.web;

import com.lzx2005.dto.AjaxResult;
import com.lzx2005.dto.ServiceResult;
import com.lzx2005.entity.User;
import com.lzx2005.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by Administrator on 2016/6/28.
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    /**
     * 首页
     * @param model
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("访问首页");
        return "common/index";
    }

    @RequestMapping(
            value = "/login_sub",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public AjaxResult<User> login_sub(HttpServletRequest res){
        String username = res.getParameter("username");
        String password = res.getParameter("password");
        AjaxResult<User> ajaxResult = null;
        ServiceResult<User> serviceResult = userService.login(username, password);
        if(serviceResult.isSuccess()){
            //登陆成功
            ajaxResult = new AjaxResult<User>(true, "登陆成功", serviceResult.getData());
        }else{
            //登陆失败
            ajaxResult = new AjaxResult<User>(false,"登陆失败，用户名或者密码错误",null);
        }

        return ajaxResult;
    }
}
