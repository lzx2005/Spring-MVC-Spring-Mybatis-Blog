package com.lzx2005.service;

import com.lzx2005.dto.ServiceResult;
import com.lzx2005.entity.Blog;

import java.util.List;

/**
 * Created by Administrator on 2016/6/20.
 */
public interface BlogService {

    public ServiceResult<Blog> createBlog(String title, String content, short blogType);

    public ServiceResult<List<Blog>> getAllBlog(int page,int pageSize);

    public ServiceResult<Blog> getBlog(long blogId);
}
