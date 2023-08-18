package com.ex.day1_ex3;

//import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
@RequestMapping("/")
@ResponseBody
public String getMyFav()
{
	String yourFavColor="Green";
	return  "My favorite color is "+yourFavColor;
}
}