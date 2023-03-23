import java.util.Scanner;

public class Ex08다중ifelse문예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("잔액 : ");
//		int money = sc.nextInt();
//		
//		System.out.print("성인/청소년/어린이 :");
//		String pass = sc.next();
//				
//		if (money < 1000 || money < 1500 || money < 1800 ) {
//			System.out.println("잔액이 부족합니다");
//		}else if (pass.equals("성인")) {
//			System.out.println("감사합니다");
//		}else if (pass.equals("청소년")) {
//			System.out.println("반갑습니다");
//		}else if (pass.equals("어린이")) {
//			System.out.println("안녕하세요");
//		}
	System.out.print("잔액 :");
	int money = sc.nextInt();
	System.out.println("성인/청소년/어린이 :");
	String type = sc.next();
	
	if(type.equals("성인")&&money >= 1800) {
		System.out.println("감사합니다");
	
	}else if(type.equals("청소년")&&money>=1500) {
		System.out.println("반갑습니다");
	
	}else if(type.equals("어린이")&&money>=1500) {
		System.out.println("안녕하세요");
		
	}else
	}
	
	}
	
	
}
