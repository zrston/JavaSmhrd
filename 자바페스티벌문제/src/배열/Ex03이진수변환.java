package �迭;

import java.util.Scanner;

public class Ex03��������ȯ {

	public static void main(String[] args) {

		// �Է��ϴ� ���� ��������
		Scanner sc = new Scanner(System.in);
		// 2������ ������ �� �ִ� �迭 : 10

		int[] arr = new int[10];
		System.out.println("���� �Է� >>");
		int num = sc.nextInt();

		// 2������ ���ؼ� �迭�� ����
		// ex) 8�� 2�� ������ �������� �迭�� ���� 0 + 1
		// ���� �������� ���� 2�� ������ �������� �迭�� ����1 + 1
		// ���� �������� ���� 2�� ������ �������� �迭�� ����2 + 1
		// ...
		// �������� �ݺ�? : ������ �� ���� 1�̸� ����

		int i = 0;
		while (num >= 2) {
			// index
			arr[i] = num % 2;
			// num�� 2�� ������
			num = num / 2;
			// num�� 2�� ������ ���� ���������� �迭�� ����

			i++;

		}
		arr[i] = num;

		// arr�̶�� �迭�� i��° �ε������� ���� �� �ִ� ����
		// ���
		// + index������ ���� ����Ǿ��ִ��� ����
		for (int j = i; j >= 0; j--) {
			System.out.println(arr[j] + " ");
		}

	}

}
