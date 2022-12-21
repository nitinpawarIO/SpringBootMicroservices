package lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBooksinSortApproach2() {
		List<Book> books = new BookDao().getBooks();
		//Collections.sort(books,new MyComparator()); for separate MyComparator class approach
		Collections.sort(books, new Comparator<Book>() { // with inner class approach

			@Override
			public int compare(Book o1, Book o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		return books;
	}
	
	/*
	 * ( o1, o2) -> o2.getName().compareTo(o1.getName())
	 */

	public List<Book> getBooksinSort() {
		List<Book> books = new BookDao().getBooks();
		Collections.sort(books,( o1, o2) -> o2.getName().compareTo(o1.getName()));//with fully optimized functional/lambda code
		return books;
	}
	
	public static void main(String[] args) {

		System.out.println(new BookService().getBooksinSort());
	}

}

/*
 * class MyComparator implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) {
 * 
 * return o2.getName().compareTo(o1.getName()); }
 * 
 * }
 */
