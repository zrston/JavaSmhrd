package �ڹٿ���;

import java.util.Scanner;

public class _01��������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ������ ������ �Է¹ޱ�
		System.out.print("���� ������:");
		int now_we = sc.nextInt();

		// ��ǥ ������ �Է¹ޱ�
		System.out.print("��ǥ ������:");
		int goal_we = sc.nextInt();

		// ���� �����԰� �� ���ٸ� for�� �ݺ�
		for (int i = 1; now_we > goal_we; i++) {
			System.out.print(i + "���� ���� ������ :");
			int min_we = sc.nextInt();

			now_we -= min_we;

		}
		// ��ǥ������ ����ϱ�
		System.out.println();
		System.out.println(now_we + "kg �޼� !! �����մϴ�.");

	}
}