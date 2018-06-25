package com.haidong.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haidong.entity.SecurityEntity;

@RestController
@RequestMapping("/api")
public class TestController {
	private static Logger logger = LoggerFactory.getLogger("test");
	
	@PostMapping("/login")
	public SecurityEntity login(@RequestBody SecurityEntity entity){
//		logger.info("entity!!");
		entity.setLoginTime(new Date());
		return entity;
	}
	
	@GetMapping
	public String hello(String name){
		return "hello"+name;
	}
}
