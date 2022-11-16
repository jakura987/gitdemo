package com.example.gitdemo;

import com.example.dao.StudentDao;
import com.example.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitdemoApplicationTests {
    @Autowired
    private StudentDao studentDao;

    @Test
    void contextLoads() {
        Student student = studentDao.selectById(11140002);
        System.out.println(student);
    }

}
