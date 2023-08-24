package com.ex.day4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.day4.Models.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
