package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 설계도를 사용하는 공간
		
		Scanner sc = new Scanner(System.in);
		// Product 자료형을 관리하는 ArrayList만들기
		ArrayList<Address> ad = new ArrayList<Address>();
		
		
		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int select = sc.nextInt();
			
			if (select == 1) {
				// 물건 추가
				System.out.println("이름 : ");
				String name = sc.nextLine();
				System.out.println("나이 : ");
				int age = sc.nextInt();
				System.out.println("전화번호 : ");
				int phoneNumber = sc.nextInt();
				
				Address ad2 = new Address(name, age, phoneNumber);
				// 2. ps.add();
				ad.add(ad2);
			} else if (select == 2) {
			} else if (select == 3) {	
			} else if (select == 4) {
			} else if (select == 5) {
				// 프로그램 종료
				System.out.println("프로그램 종료");
			}
		}

	}
	}

