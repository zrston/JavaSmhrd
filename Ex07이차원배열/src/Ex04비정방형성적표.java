import java.util.Scanner;

public class Ex04������������ǥ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] score = new int[4][]; // ��ü ����
		score[0] = new int[3]; // 1��
		score[1] = new int[5]; // 2��
		score[2] = new int[4]; // 3��
		score[3] = new int[6]; // 4��

		// �����Է�
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "�� ���� �Է�");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(i + 1 + "��" + (j + 1) + "��° �л� ���� >>");
				score[i][j] = sc.nextInt();
			}
		}
		int sum; //�� ����
		// �������
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "�� >>");
			sum = 0; //0���� �ʱ�ȭ
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
				sum += score[i][j]; //���� ������ ����
			}
			System.out.println();
			System.out.println("���� : " + sum+ "��� : " + (sum/score[i].length));
		}
	}

}
