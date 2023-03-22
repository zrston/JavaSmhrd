import java.util.Scanner;

public class EX05삼항연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//홀수(2의 배수가 아닐때), 짝수(2의 배수일떄 -> 2로 나눴을 떄 나머지가 0)
		System.out.println((num%2==0)?num + "은(는) 짝수입니다.":num + "은(는) 홀수입니다.");

		
		
	}

}
