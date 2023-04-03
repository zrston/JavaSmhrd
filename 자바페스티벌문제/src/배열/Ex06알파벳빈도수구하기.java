package 배열;

import java.util.Scanner;

public class Ex06알파벳빈도수구하기 {

	public static void main(String[] args) {
		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// a~z : 26개
		// 알파벳 빈도수가 저장될 int[26] 배열을 하나 만들어주자

		int[] alphabet = new int[26];

		// nextLine() : Enter을 칠떄까지 문자열을 리턴
		// next() : space를 칠떄까지 문자열을 리턴

		System.out.println("====알파벳빈도수구하기====");
		System.out.print("입력 >> ");
		String s = sc.nextLine();
		// Hello world
		// 띄어쓰기, 대문자 ---> 소문자
		s = s.replace(" ", "").toLowerCase();
		// 출력문 : 입력 (s)
		// helloworld
		System.out.println(s);
		// charAt을 사용해서 빈도수 구하기
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			alphabet[c - 97]++; // c (99) : 2
		}
		// 출력하기 ~ 빈도수가 저장되어있는 배열 출력
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((char) (i + 97) + ":" + alphabet[i]);
		}
		// 문자열(s) ---> 문자(char):쪼개
		// charAt(index)---> 아스키코드(int)
		// a: 97 ~ z: 122
		// a : 0인덱스에 값이 +1
		// b : 1인덱스에 값이 +1
		// s.length() 반복 횟수!

		// hint.abc
		// char c = s.charAt(0)
		// c --> a (97)
		// 판단
		// [0]++;
		// s.charAt(1)
		// char c = s.charAt(1)
		// c ---> b (98)
		// [1]++;
		// s.charAt(2)
		// s.charAt(3)
		// ...
		// s.charAt(s.length()-1)

		// 출력하기 ~ 빈도수가 저장되어있는 배열 출력
	}

}
