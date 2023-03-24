import java.util.Scanner;

public class Ex12조건문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("넣을 금액 :");
		int drink = sc.nextInt();
		
		switch(drink) {
		case 1:
			if (d)
			System.out.println("콜라");
			break; //switch문을 멈추고 다음문장을 실행하도록 하는 명령어
		case 2:
			System.out.println("파워에이드");			
			break;
		case 3:
			System.out.println("탄산수");			
			break;
		default :
			System.out.println("잔돈 :");
		
		if (drink==1)
			System.out.println(drink - 1800);{
		
			}
			
		System.out.println("1. 콜라(1800원)", "2.파워에이드(2000원)", "3. 탄산수(1200원)" + ">>");
		
		
		
		

	}

}
