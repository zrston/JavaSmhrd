package 입출력;

public class EX01출력 {

	public static void main(String[] args) {
		
		
		//System : 표준 입출력 클래스
		//System.out : 출력 기능 사용
		
		int a = 10;
		//a -> 변수, 상수 (값은 저장)
		
		//print() -> 메서드(기능)
		System.out.print(123);
		System.out.print("Hello World!\n");
		
		System.out.println("출력구문1");
		//syso + ctrl + space
		System.out.println("출력구문2");
		//ctrl + alt + 위/아래 방향키 : 해당구문 복사 후 붙여넣기
		System.out.println("출력구문3");
		
		//printf() : 특정 형식으로 출력
		//1. pi = 3.14
		int a1 = 1;
		String b = "pi";
		double c = 3.14;
		
		//%d : 정수자리 %s : 문자열자리
		System.out.printf("%d. %s = %f\n",a1, b, c);
		System.out.printf("%d. %s = %f\n",2, "pi", 3.14);
		
		String s1 = "제이름은";
		String s2 = "돌멩쓰입니다";
		
		System.out.print(s1);
		System.out.println(s2);
		
		System.out.println(s1+s2+1);
		

	}

}
