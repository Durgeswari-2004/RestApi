package com.ex.day1_ex2;

//import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
@RequestMapping("/get")
@ResponseBody
public String getName()
{
	String s="Durgeswari";
	return  "Welcome "+s+"!";
}
}