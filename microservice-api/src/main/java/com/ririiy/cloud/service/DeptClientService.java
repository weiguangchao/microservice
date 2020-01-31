package com.ririiy.cloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ririiy.cloud.entity.Dept;
import com.ririiy.cloud.fallback.DeptClientServiceFallback;

//@FeignClient("MICROSERVICE-DEPT")
@FeignClient(value = "MICROSERVICE-DEPT", fallbackFactory = DeptClientServiceFallback.class)
public interface DeptClientService {

	@GetMapping("dept")
    public List<Dept> list();

    @PostMapping("dept")
    public boolean save(@RequestBody Dept dept);

    @GetMapping("dept/{deptNo}")
    public Dept get(@PathVariable Long deptNo);
	
}
