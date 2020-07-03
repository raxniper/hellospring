package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

	// 필드
	
	// 생성자 (현재 디폴트생성자 사용중)
	
	// 갯터 셋터
	
	// 메소드
	@RequestMapping( "/hello")
	public String hello(){
		System.out.println("/hellospring/hello");
		return "/WEB-INF/views/index.jsp";
	}

	
}
