package Exercise1;

public class TestClass {

	public static void main(String[] args) {
		
		Author author = new Author("Some dude", "some.dude@gmail.com", 'M');
		Book book = new Book("Some dude's book", author, 99.99, 11);
		
		System.out.println(book.toString());

	}

}
