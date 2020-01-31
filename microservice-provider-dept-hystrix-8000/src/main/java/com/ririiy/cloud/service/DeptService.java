package com.ririiy.cloud.service;

import com.ririiy.cloud.entity.Dept;

import java.util.List;

public interface DeptService {

    boolean save(Dept dept);

    Dept get(Long deptNo);

    List<Dept> list();

}
