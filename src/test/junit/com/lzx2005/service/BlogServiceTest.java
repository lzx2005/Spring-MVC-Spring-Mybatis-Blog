package com.lzx2005.service;

import com.lzx2005.dto.ServiceResult;
import com.lzx2005.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/6/20.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class BlogServiceTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void createBlog() throws Exception {
        ServiceResult<Blog> result = blogService.createBlog("Service test","lzx2005", "test", (short) 0);
        System.out.println(result);
    }

    @Test
    public void getAllBlog() throws Exception {
        ServiceResult<List<Blog>> result = blogService.getAllBlog(1, 20);
        System.out.println(result);
        for(Blog blog : result.getData()){
            System.out.println(blog);
        }
    }

    @Test
    public void getBlog() throws Exception {
        ServiceResult<Blog> result = blogService.getBlog(10003);
        System.out.println(result);
    }

}