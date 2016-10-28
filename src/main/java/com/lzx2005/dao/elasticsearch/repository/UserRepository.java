package com.lzx2005.dao.elasticsearch.repository;

import com.lzx2005.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public interface UserRepository extends CrudRepository<User,Long>{
    Long countByUsername(String username);

    User findByUsername(String username);
}
