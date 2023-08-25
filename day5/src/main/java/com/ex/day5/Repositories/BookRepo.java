package com.ex.day5.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.day5.Entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}