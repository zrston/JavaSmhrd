import java.util.Scanner;

public class Ex01if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		//입력한 나이가 20이상이니?
		//참(true) -> "성인입니다"
		//거짓(false) -> 아무행동도 취하지 않을것!
		
		//if(조건식 : 결과값이 true or false (boolean))
		// ->비교 연산자 , 논리연산자
		if(age >= 20) {
			//조건식의 결과가 참(true)일때
			System.out.println("성인입니다");
		}
		
		System.out.println("맨아랫줄!");
		
		//dead code : 절대 실행 안되는 코드! (의미가 없는 코드)
//		if(false) {
//			System.out.println();
//		}
		
		System.out.print("숫자 입력:");
		int num = sc.nextInt();
		if (num%3==0 || num%5==0) {
			System.out.println("3 또는 5의 배수입니다.");
		}		
		
		System.out.println("자바 점수 :");
		int java = sc.nextInt();
		System.out.println("파이썬 점수 :");
		int python = sc.nextInt();
		System.out.println("안드로이드 점수 :");
		int and = sc.nextInt();
		
		int avg = (java + python + and)/3;
		if (avg > 80); {
			System.out.println("합격");
		}else { //위 경우에 해당하는 경우가 아닐 경우
			System.out.println("불구덩이");
		}
	}

}
