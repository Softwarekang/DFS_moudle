package com.epi.java.blog_dao;

import com.epi.java.blog_dao.dao.UserDao;
import com.epi.java.blog_dao.moudle.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BlogDaoApplication.class})
public class BlogDaoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testSelectByName() {
        Assert.assertEquals("ankang", userDao.getNameByAge((short)20));
    }

}
