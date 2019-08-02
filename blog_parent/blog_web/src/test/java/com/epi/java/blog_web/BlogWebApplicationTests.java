package com.epi.java.blog_web;

import com.epi.java.blog_dao.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BlogWebApplication.class})
public class BlogWebApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {

    }

}
