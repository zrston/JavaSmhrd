package 자바연습;

import java.util.Scanner;

public class 별문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.print("행 개수 : ");
//		int num = sc.nextInt();
//		
//		for(int i=1;i<num;i++){
//			for(int j=0;j<i;j++){
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		System.out.println("행 개수 : ");
		int num2 = sc.nextInt();

		for (int i = 1; i < num2; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("역행 개수 :");
		int num3 = sc.nextInt();
				
		for (int i = num3; i > 1; i-- ) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
