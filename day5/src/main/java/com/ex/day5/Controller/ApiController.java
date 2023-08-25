package com.ex.day5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ex.day5.Entity.Book;
import com.ex.day5.Service.ApiService;
@RestController
public class ApiController {
@Autowired
ApiService book;


@PostMapping("addingbook")

public Book add(@RequestBody Book bb)
{
return book.saveinfo(bb);

}

@PostMapping("addnbooks")

public List<Book> addndetails(@RequestBody List<Book> books)
{
return book.savedetails(books);
}

@GetMapping("showbooks")

public List<Book> show()
{
return book.showinfo();
}

@PutMapping("updatebooks")
public Book modify(@RequestBody Book books)
{
return book.changeinfo(books);
}

@DeleteMapping("deletebooks")
public String del(@RequestBody Book books)
{
	book.deleteinfo(books);
return "Deleted successfully";
}

@DeleteMapping("deleteid/{id}")
public void deletemyid(@PathVariable int id)
{
	book.deleteId(id);

}
@DeleteMapping("delparamid")

public void deletemyparamid(@RequestParam int id)
{
	book.deletepId(id);

}
}