import java.util.Scanner;

public class Ex07배열실습채점프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] answer = {1, 4, 3, 2, 1}; // 실제답
		int[] input = new int[5]; // 사용자가 입력한 답 저장

		// 답 입력
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int score = 0; // 총점 저장
		String check = "";
		// 입력한 답과 실제답이 같으면 O출력, 다르면 X출력
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == input[i]) {
				System.out.print("O ");
				score += 20;
			} else {// 다를 경우
				System.out.println(" X ");
			}
		}
	}

}
