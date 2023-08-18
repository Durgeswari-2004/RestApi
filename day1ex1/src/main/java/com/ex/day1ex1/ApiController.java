package com.ex.day1ex1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	@RequestMapping("/welcome")
	@ResponseBody
public String welcome()
{
	return "Welcome String Boot!";
}
}