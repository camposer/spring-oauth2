package org.civitana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/sec/hello")
	public @ResponseBody String hello() {
		return "hello";
	}
	
}
