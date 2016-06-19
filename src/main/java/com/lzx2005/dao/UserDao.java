package com.lzx2005.dao;

import com.lzx2005.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/6/19.
 */
public interface UserDao {
    public void insertUser(@Param("username") String username,@Param("password") String password,@Param("userType") String userType);

    public User queryById(long userId);

    public List<User> findAll(@Param("offset") int offset,@Param("limit") int limit);
}
