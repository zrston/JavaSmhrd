package �����������α׷�;

import java.util.ArrayList;

// å�� �����ϴ� Ŭ����(���, å ���� Ȯ��, ���� ��...)
public class BookSystem {
	private ArrayList<Book> list = new ArrayList<>();
	
	// å ��� ���
	public void addBook(String titlte, int pricce, String writer) {
		Book book = new Book(title,price,writer);
		list.add(book);
	}
	// å ��ü ��ȸ
	public String getBookTitleList() {
		String msg = "";
		for (int i = 0; i < list.size(); i++) {
			Book temp = list.get(i); //å�� �ѱǾ� ������ �ڵ�
			msg += temp.getTitle();
			msg += "\n";
		}
	}
}

