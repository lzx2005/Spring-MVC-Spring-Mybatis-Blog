package com.lzx2005.service.impl;

import com.lzx2005.dao.BlogDao;
import com.lzx2005.dto.ServiceResult;
import com.lzx2005.entity.Blog;
import com.lzx2005.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/6/20.
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    public ServiceResult<Blog> createBlog(String title, String author, String content, short blogType) {
        return createBlog(title, author, content, blogType,(short)0);
    }

    public ServiceResult<Blog> createBlog(String title, String author, String content, short blogType, short markdown) {
        int result = blogDao.insertBlogWithMarkdown(title, author, content, blogType,markdown);
        ServiceResult<Blog> sr = null;
        Blog blog = null;
        if (result == 1) {
            sr = new ServiceResult<Blog>(true, blog);
        } else {
            sr = new ServiceResult<Blog>(false, "can't save,unknow reason");
        }
        return sr;
    }

    public ServiceResult<List<Blog>> getAllBlog(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        int limit = pageSize;
        List<Blog> blogs = blogDao.findAll(offset, limit);
        ServiceResult<List<Blog>> sr = new ServiceResult<List<Blog>>(true, blogs);
        return sr;
    }

    public ServiceResult<Blog> getBlog(long blogId) {
        Blog blog = blogDao.queryById(blogId);
        ServiceResult<Blog> sr = null;
        if (blog == null) {
            //没有找到该博客
            sr = new ServiceResult<Blog>(false, "can't find this blog");
        } else {
            sr = new ServiceResult<Blog>(true, blog);
        }
        return sr;
    }
}
