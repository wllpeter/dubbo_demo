package com.example.service.impl;


import com.example.demo.service.TestService;

public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		 return "Hello " + name + "!";
	}

}
