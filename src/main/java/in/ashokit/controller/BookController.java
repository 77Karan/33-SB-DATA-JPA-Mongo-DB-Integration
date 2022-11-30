package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import in.ashokit.repository.BookRepository;

@RestController
public class BookController
{
	@Autowired
	private BookRepository repo;
	
	@PostMapping("/addBook")
	public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		repo.save(book);
		return new ResponseEntity<String>("BookSaved",HttpStatus.OK);
	}
	
	@GetMapping("/allBooks")
	public List<Book> findAllBooks()
	{
		List<Book> books =repo.findAll();
		return books;
	}
	
	/*@GetMapping("/bookById/{bookId}")
	public Book findBookById(@PathVariable Integer bookId)
	{
		return repo.findbyBookId(bookId);
	}*/
	
	@DeleteMapping("/deleteById/{id}")
	public String findBookById(@PathVariable String id)
	{
		repo.deleteById(id);
		return "Deleted Sucessfully";
	}

}
