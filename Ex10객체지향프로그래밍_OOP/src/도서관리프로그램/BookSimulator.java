package �����������α׷�;

import java.util.Scanner;

//����ڿ� ��ȣ�����ϴ� �������̽� ����(������, �Է� ��)
public class BookSimulator {

	public static void main(String[] args) {
		System.out.println("===�������� �ý���===");
		Scanner sc = new Scanner(System.in);
		BookSystem bookManager = new BookSystem();
		
		while(true) {
			System.out.println("[1]��� [2]��ü��ȸ [3]����");
			int choice = sc.nextInt();

			if(choice == 1) {
				System.out.println("å �̸� :");
				String title = sc.next();
				System.out.println("å ���� : ");
				int price = sc.nextInt();
				System.out.println("å ���� : ");
				String writer = sc.next();
				bookManager.addBook(title, price, writer);
			}else if(choice == 2) {
							
			}else if(choice == 3) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else {
				System.out.println("�ùٸ� ���ڸ� �Է��ϼ���.");
			}
					
		}
		
	}

}
