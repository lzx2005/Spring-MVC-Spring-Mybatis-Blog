package com.lzx2005.web;

import com.lzx2005.dao.BlogDao;
import com.lzx2005.dto.ServiceResult;
import com.lzx2005.entity.Blog;
import com.lzx2005.entity.User;
import com.lzx2005.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/6/29.
 */
@Controller
//@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/admin")
    public String index(Model model){
        System.out.println("controller");
        return "admin/common/index";
    }

    @RequestMapping("/admin/select")
    public String select(Model model){
        System.out.println("select");
        return "admin/common/index";
    }

    @RequestMapping("/admin/blog_add")
    public String add(Model model){
        return "admin/common/add";
    }


    @RequestMapping("/admin/blog_add_markdown")
    public String add_markdown(Model model){
        return "admin/common/add_with_markdown_source";
    }
}
