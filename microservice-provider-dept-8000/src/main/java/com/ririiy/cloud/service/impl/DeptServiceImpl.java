package com.ririiy.cloud.service.impl;

import com.ririiy.cloud.dao.DeptDao;
import com.ririiy.cloud.entity.Dept;
import com.ririiy.cloud.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    private DeptDao deptDao;

    public DeptServiceImpl(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public boolean save(Dept dept) {
        return deptDao.insert(dept) > 0;
    }

    @Override
    public Dept get(Long deptNo) {
        return deptDao.selectById(deptNo);
    }

    @Override
    public List<Dept> list() {
        return deptDao.selectList(null);
    }
}
