package com.ririiy.cloud.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ririiy.cloud.entity.Dept;
import com.ririiy.cloud.service.DeptClientService;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallback implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {
			
			@Override
			public boolean save(Dept dept) {
				return false;
			}
			
			@Override
			public List<Dept> list() {
				return new ArrayList<>();
			}
			
			@Override
			public Dept get(Long deptNo) {
				Dept dept = new Dept();
		    	dept.setDeptNo(deptNo);
		    	dept.setDeptName("not exists!");
		    	dept.setDbSource("not exists!");
		    	return dept;
			}
		};
	}

}
