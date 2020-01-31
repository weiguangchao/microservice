package com.ririiy.cloud.dao;

import com.ririiy.cloud.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DeptDaoTest {

    @Autowired
    private DeptDao deptDao;

    @Test
    public void testSelect() {
        List<Dept> deptList = deptDao.selectList(null);
        deptList.forEach(System.out::println);
    }

}
