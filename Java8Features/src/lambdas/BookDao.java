package lambdas;

import java.util.List;
import java.util.ArrayList;

public class BookDao {
	
	public List<Book> getBooks(){
		
		List<Book> books = new ArrayList();
		books.add(new Book(101,"Core Java",200));
		books.add(new Book(101,"AWS Handbook",100));
		books.add(new Book(101,"Cloud Computing",150));
		books.add(new Book(101,"Microservices",180));
		
		return books;
	}

}
