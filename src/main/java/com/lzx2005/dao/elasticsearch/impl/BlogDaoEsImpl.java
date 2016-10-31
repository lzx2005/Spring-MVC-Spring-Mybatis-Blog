package com.lzx2005.dao.elasticsearch.impl;

import com.lzx2005.dao.BlogDao;
import com.lzx2005.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class BlogDaoEsImpl implements BlogDao{

    public int insertBlog(@Param("title") String title, @Param("author") String author, @Param("author") String desc, @Param("content") String content, @Param("blogType") short blogType) {
        return 0;
    }

    public int insertBlogWithMarkdown(@Param("title") String title, @Param("author") String author, @Param("author") String desc, @Param("content") String content, @Param("blogType") short blogType, @Param("markdown") short markdown) {
        return 0;
    }

    public Blog queryById(long blogId) {
        return null;
    }

    public ArrayList<Blog> findAll(@Param("offset") int offset, @Param("limit") int limit) {
        return null;
    }
}
