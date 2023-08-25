package com.ex.day5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.day5.Entity.Book;
import com.ex.day5.Repositories.BookRepo;
@Service

public class ApiService {

@Autowired
BookRepo bookrepo;

public Book saveinfo(Book book)
{
return bookrepo.save(book);

}

public List<Book> savedetails(List<Book> book)
{
return (List<Book>) bookrepo.saveAll(book);
}


public List<Book> showinfo()
{
return bookrepo.findAll();
}

public Book changeinfo(Book book)
{
return bookrepo.saveAndFlush(book);
}

public void deleteinfo(Book book)
{
	bookrepo.delete(book);
}
public void deleteId(int id)
{
	bookrepo.deleteById(id);
}
public void deletepId(int id)
{
	bookrepo.deleteById(id);
}
}