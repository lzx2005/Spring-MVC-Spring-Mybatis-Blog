package com.lzx2005.web.restfull;

import com.lzx2005.dto.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Created by Restfull on 2016/6/29.
 * 编写Restful接口
 */
@Controller
@RequestMapping("/admin_restful")
public class AdminRestfulController {
    @RequestMapping(value = "test/{testStr}/restful_test", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public HashMap<String,String> test(@PathVariable("testStr")String testStr, HttpServletRequest request, HttpServletResponse response) {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put(testStr,testStr);
        map.put(testStr+"1",testStr+"2");
        return map;
    }


    /**
     * 上传图片接口
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(
            value = "image/upload",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public AjaxResult<String> upload(HttpServletRequest request, HttpServletResponse response) {
        AjaxResult<String> result = new AjaxResult<String>(true,"1","1");
        return result;
    }

}
