package com.ririiy.cloud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ririiy.cloud.entity.Dept;
import com.ririiy.cloud.service.DeptService;

@RestController
@RequestMapping("dept")
public class DeptController {

    private DeptService deptService;
    
    public DeptController(DeptService deptService) {
		this.deptService = deptService;
	}

	@GetMapping
    public List<Dept> list() {
        return deptService.list();
    }

    @PostMapping
    public boolean save(@RequestBody Dept dept) {
        return deptService.save(dept);
    }

    @GetMapping("{deptNo}")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Dept get(@PathVariable Long deptNo) {
    	Dept dept = deptService.get(deptNo);
    	if (dept == null) {
    		throw new RuntimeException();
    	}
        return dept;
    }
    
    private Dept processHystrixGet(@PathVariable Long deptNo) {
    	Dept dept = new Dept();
    	dept.setDeptNo(deptNo);
    	dept.setDeptName("not exists!");
    	dept.setDbSource("not exists!");
    	return dept;
    }

}
