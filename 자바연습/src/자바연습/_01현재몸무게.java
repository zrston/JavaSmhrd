package 자바연습;

import java.util.Scanner;

public class _01현재몸무게 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 현재의 몸무게 입력받기
		System.out.print("현재 몸무게:");
		int now_we = sc.nextInt();

		// 목표 몸무게 입력받기
		System.out.print("목표 몸무게:");
		int goal_we = sc.nextInt();

		// 현재 몸무게가 더 많다면 for문 반복
		for (int i = 1; now_we > goal_we; i++) {
			System.out.print(i + "주차 감량 몸무게 :");
			int min_we = sc.nextInt();

			now_we -= min_we;

		}
		// 목표몸무게 출력하기
		System.out.println();
		System.out.println(now_we + "kg 달성 !! 축하합니다.");

	}
}