package com.epi.java.blog_dao.dao;

import com.epi.java.blog_dao.moudle.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @email jingyechenfu@aliyun.com
 * @author:SoftwareKang
 */
public interface UserDao extends JpaRepository<User, Integer> {

    // 通过年龄查询User
    User findByAge(Short age);

    // 通过年龄查询姓名WHERE
    @Query(value = "SELECT name FROM user WHERE age = ? ", nativeQuery = true)
    String getNameByAge(Short age);
}
