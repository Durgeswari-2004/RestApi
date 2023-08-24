package com.ex.day4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.day4.Models.Student;
import com.ex.day4.Repository.StudentRepo;

@Service
public class ApiService {
@Autowired
 StudentRepo sturepo;
public List<Student> saveinfo(List<Student> stu)
{
	return (List<Student>)sturepo.saveAll(stu);
}
public List<Student> showinfo(Student stu){
	return sturepo.findAll();
}
public Student changeinfo(Student stu){
	return sturepo.saveAndFlush(stu);
}
public void deleteinfo(Student stu){
	sturepo.delete(stu);
}


}
