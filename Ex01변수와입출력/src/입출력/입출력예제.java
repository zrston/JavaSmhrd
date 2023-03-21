package 입출력;

import java.util.Scanner;

public class 입출력예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//	System.out.print("이름 :" );	
//	String name = sc.nextLine();
//	
//	System.out.print("나이 :");
//	String age = sc.nextLine();
//		
//	
//	System.out.println("이름은 " + name + "이고 " + "나이는 " + age + "입니다 ");
		
	System.out.print("이름 : ");
	String name = sc.next(); //문자열
	
	System.out.print("나이 : ");
	int age = sc.nextInt();
	
	System.out.println("이름은 " + name + "이고 " + "나이는 " + age + "입니다 ");
	System.out.println();
	}

}
