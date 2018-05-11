package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.TestService;
@Service(version = "1.0.1")
public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		 return "Hello " + name + "!";
	}

}
