package �ڹٿ���;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.print("�� ���� : ");
//		int num = sc.nextInt();
//		
//		for(int i=1;i<num;i++){
//			for(int j=0;j<i;j++){
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		System.out.println("�� ���� : ");
		int num2 = sc.nextInt();

		for (int i = 1; i < num2; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("���� ���� :");
		int num3 = sc.nextInt();
				
		for (int i = num3; i > 1; i-- ) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
