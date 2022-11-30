package in.ashokit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book,String>
{
/*	public Book findbyBookId(Integer bookId);
*/
}
