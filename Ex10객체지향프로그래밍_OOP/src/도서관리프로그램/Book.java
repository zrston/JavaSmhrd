package 도서관리프로그램;

//책을 표현하는 프로그램
public class Book {
	
	private String title;
	private int price;
	private String writer;
	
	//생성자
	public Book(String title, int price, String writer) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}
	
	// getter
	
}
	
