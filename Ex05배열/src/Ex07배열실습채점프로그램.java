import java.util.Scanner;

public class Ex07�迭�ǽ�ä�����α׷� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] answer = {1, 4, 3, 2, 1}; // ������
		int[] input = new int[5]; // ����ڰ� �Է��� �� ����

		// �� �Է�
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int score = 0; // ���� ����
		String check = "";
		// �Է��� ��� �������� ������ O���, �ٸ��� X���
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == input[i]) {
				System.out.print("O ");
				score += 20;
			} else {// �ٸ� ���
				System.out.println(" X ");
			}
		}
	}

}
