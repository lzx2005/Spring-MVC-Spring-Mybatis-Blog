package com.lzx2005.service;

import com.lzx2005.dto.BlogServiceResult;
import com.lzx2005.entity.Blog;

import java.util.List;

/**
 * Created by Administrator on 2016/6/20.
 */
public interface BlogService {

    public BlogServiceResult<Blog> createBlog(String title, String content, short blogType);

    public List<Blog> getAllBlog(int page,int pageSize);

    public Blog getBlog(int blogId);
}
