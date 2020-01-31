package com.ririiy.cloud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ririiy.cloud.entity.Dept;
import com.ririiy.cloud.service.DeptClientService;

@RestController
@RequestMapping("dept")
public class DeptController {

	private DeptClientService deptClientService;
	
    public DeptController(DeptClientService deptClientService) {
		this.deptClientService = deptClientService;
	}

    @GetMapping
    public List<Dept> list() {
        return deptClientService.list();
    }

    @PostMapping
    public boolean save(@RequestBody Dept dept) {
        return deptClientService.save(dept);
    }

    @GetMapping("{deptNo}")
    public Dept get(@PathVariable Long deptNo) {
        return deptClientService.get(deptNo);
    }

}
