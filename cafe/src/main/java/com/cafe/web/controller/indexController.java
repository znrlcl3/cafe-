package com.cafe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

	@GetMapping("/index")
	public String index() {
		System.out.println("test");
		return "/WEB-INF/view/NewFile.jsp";
	}
}
