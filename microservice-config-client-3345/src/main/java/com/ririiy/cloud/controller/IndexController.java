package com.ririiy.cloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class IndexController {

	@GetMapping
	public Map<String, Object> sayHello() {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("success", true);
		resultMap.put("msg", "hello world");
		return resultMap;
	}
	
}
