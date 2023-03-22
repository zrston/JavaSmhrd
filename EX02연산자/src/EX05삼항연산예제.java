import java.util.Scanner;

public class EX05삼항연산예제 {

	public static void main(String[] args) {
		
//		//두 개의 정수를 입력 받아 큰 수에서 작은 수를 뺀 결과값을 출력하세요

		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번쨰 정수 입력 :");
//		int a =sc.nextInt();
//		System.out.print("두번쨰 정수 입력 :");
//		int b = sc.nextInt();
//		System.out.println((a>b)?"두 수의 차" + (a-b):"두 수의 차 " +(b-a));
		
				
		//시급계산기 기본시급 9000원 8시간 초과시 시급의 1.5배 책정
		System.out.print("노동시간을 입력하세요 : ");
		int work = sc.nextInt();
		
		double pay = (work>8) ? 8*9000+(work-8)*9000*1.5 : 9000*8;
		
		System.out.println("총 임금은" + pay + "입니다");
		
		
	}

}
