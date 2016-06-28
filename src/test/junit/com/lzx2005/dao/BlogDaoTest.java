package com.lzx2005.dao;

import com.lzx2005.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/6/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BlogDaoTest {

    @Autowired
    BlogDao blogDao;

    @Test
    public void insertBlog() throws Exception {
        int result = blogDao.insertBlog("测试标题","lzx2005","测试内容",(short)0);
        System.out.println(result);
    }

    @Test
    public void queryById() throws Exception {
        Blog blog = blogDao.queryById(10000);
        System.out.println(blog);
    }

    @Test
    public void findAll() throws Exception {
        List<Blog> blogs = blogDao.findAll(0,1000);
        for (Blog blog : blogs){
            System.out.println(blog);
        }
    }

}