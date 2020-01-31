package com.ririiy.cloud.controller;

import com.ririiy.cloud.entity.Dept;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {

    private static final String REST_URL_PREFIX = "http://MICROSERVICE-DEPT";

    private RestTemplate restTemplate;

    public DeptController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept", List.class);
    }

    @PostMapping
    public boolean save(@RequestBody Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept", dept, Boolean.class);
    }

    @GetMapping("{deptNo}")
    public Dept get(@PathVariable Long deptNo) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/" + deptNo, Dept.class);
    }

    @GetMapping("discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }

}
