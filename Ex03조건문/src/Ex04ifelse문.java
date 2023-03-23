import java.util.Scanner;

public class Ex04ifelse문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 :");
		int pay = sc.nextInt();
		System.out.print("사람 명 수 :");
		int people = sc.nextInt();
		int dutch = pay/people;
	
		if (dutch > 10000) {
			System.out.println("10000원 이상 지불");
		}else{System.out.println("10000원 미만 지불");
		}
		
		System.out.print("1과목");
		int a = sc.nextInt();
		System.out.print("2과목");
		int b = sc.nextInt();
		System.out.print("3과목");
		int c = sc.nextInt();
		System.out.print("4과목");
		int d = sc.nextInt();
		System.out.print("5과목");
		int e = sc.nextInt();
		
		//합격 조건
		//1. 각 과목의 개수가 모두 8이상
		//2. 과목의 총 합이 60 이상 -> 두 조건 모두 해당
		
		int total = a + b +c +d +e;
		
		if (a>=8&&b>=8&&c>=8&&d>=8&&e>=8&&total>=60) {
		 System.out.println("합격입니다");
		}else{System.out.println("불합격입니다");
		}
	}	
}