package 입출력;

//외부(패키지)에 존재하는 클래스를 가져다가 쓸때에는 import 필수로 해줘야함!
import java.util.Scanner;

public class EX02입력 {

	public static void main(String[] args) {
		
		//new Scanner() : Scanner 도구 생성
		//System.in 입력도구를 활용해서 Scanner 도구 생성하겠다!
		//Scanner sc = > Scanner : 스캐너 형태의 도구의 주소를 저장할 수 있는 자료형
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); //스캐너로 입력된값을 받아들임
		//스캐너가 입력된 값을 돌려줌(반환) -String -> 변수에 저장
		
		System.out.println(s); // s변수가 가지고 있는 값을 콘솔에 출력!
		
		//Scanner : 입력한 값을 공백문자(' ', '\t', '\n')를 기준으로 분리
		sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(s2);
	}

}
