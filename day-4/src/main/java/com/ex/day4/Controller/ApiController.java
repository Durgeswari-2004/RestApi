package com.ex.day4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.day4.Models.Student;
import com.ex.day4.Service.ApiService;

@RestController
public class ApiController {
@Autowired
ApiService apiservice;
@PostMapping("add")
public List<Student> add(@RequestBody List<Student> s) {
	return apiservice.saveinfo(s);
}

@GetMapping("so")
public List<Student> show(@RequestBody Student s){
	return apiservice.showinfo(s);
}

@PutMapping("update")
public Student modify(@RequestBody Student s) {
	return apiservice.changeinfo(s);
}

@DeleteMapping("delete")
public String del(@RequestBody Student s) {
	apiservice.deleteinfo(s);
	return "Deleted";
}

}