package 자바연습;

import java.util.Scanner;

public class _02시급 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//일한 시간 입력
				System.out.print("일한시간을 입력하세요:");
				int work_hour = sc.nextInt();
				int work_a = 5000*8;
				int usu_pay = 5000*work_hour;
				double over_pay = (work_hour-8)*(5000*1.5d);
				
				
				//조건문으로 8시간 이하이하 판별
				if(work_hour <= 8) {
					
					System.out.println("총 임금은 " + usu_pay + "원 입니다." );
					
				}else {
					
					// 초과임금 계산
					System.out.println("총 임금은 " + (int)(work_a +over_pay) +"원 입니다.");
					
					
				} 
				
				
			}

}