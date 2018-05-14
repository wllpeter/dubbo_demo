package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;
import com.example.demo.service.PersonService;




public class PersonServiceImpl implements PersonService{
	@Autowired
	private PersonMapper personMapper;

	@Override
	public List<Person> findAllUser() {
		
		return personMapper.findAllUser();
	}

}
