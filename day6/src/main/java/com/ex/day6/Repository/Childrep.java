package com.ex.day6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.day6.Model.Child;

public interface Childrep extends JpaRepository<Child, Integer>{

}