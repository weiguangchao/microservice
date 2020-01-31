package com.ririiy.cloud.controller;

import com.ririiy.cloud.entity.Dept;
import com.ririiy.cloud.service.DeptService;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {

    private DeptService deptService;

//    public DeptController(DeptService deptService) {
//        this.deptService = deptService;
//    }

    private DiscoveryClient discoveryClient;

    public DeptController(DeptService deptService, DiscoveryClient discoveryClient) {
        this.deptService = deptService;
        this.discoveryClient = discoveryClient;
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
    public Dept get(@PathVariable Long deptNo) {
        return deptService.get(deptNo);
    }

    @GetMapping("discovery")
    public Object discovery() {
        List<String> serviceList = discoveryClient.getServices();
        serviceList.forEach(System.out::println);
        return this.discoveryClient;
    }

}
