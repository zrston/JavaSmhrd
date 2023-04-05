package 자바연습;

import java.util.Scanner;

public class 거스름돈 {

	public static void main(String[] args) {
		
			//거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오
			//단, 최대단위는 10000원 최소단위는 100원입니다.
			
			//총금액 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("총 금액 입력: ");
			int total_money = sc.nextInt();
			
			//잔돈 출력
			System.out.println("잔돈 : " + total_money);
			
			//지폐개수 출력하기
			System.out.println("10000원 개수 :"+total_money/10000);
			System.out.println("5000원 개수 :"+total_money%10000/5000);
			System.out.println("1000원 개수 :"+(total_money%10000%5000)/1000);
			System.out.println("500원 개수 :"+((total_money%10000%5000)%1000)/500);
			System.out.println("100원 개수 :"+(((total_money%10000%5000)%1000)%500)/100);
			
			
			System.out.print("총 금액 입력 : ");
			int total = sc.nextInt();

			System.out.println(total/10000);
			System.out.println(total%10000/5000);
			System.out.println((total%10000%5000)/1000);
			System.out.println(((total%10000%5000)%1000)/500);
			System.out.println((((total%10000%5000)%1000)%500)/100);
			
		}

	}

