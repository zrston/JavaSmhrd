package �迭;

import java.util.Scanner;

public class Ex05���ڸ������ϱ� {

	public static void main(String[] args) {

		// �Է��ϴ� ���� ��������
		Scanner sc = new Scanner(System.in);
		
		//ctrl + a : ��ü����
		//ctrl + shift + f : �ڵ� ����
		
		// ��¹� : �Է� (1)
		System.out.println("ù ��° ���� �Է� >>");
		int num1 = sc.nextInt();
		// ��¹� : �Է� (2)
		System.out.println("�� ��° ���� �Է� >>");
		int num2 = sc.nextInt();

		// (1) * (2)
		// ��¹�1
		// (1) * (2)�� ���� �ڸ� ����
		int out1 = num1 * (num2%100%10);
		// ��¹�2
		// (1) * (2)�� ���� �ڸ� ����
		int out2 = num1 * (num2%100/10);
		// ��¹�3
		// (1) * (2)�� ���� �ڸ� ����
		int out3 = num1 * (num2%100);
		System.out.println(out3);
		// ������ �����
		// (1) * (2)
		System.out.println(num1 * num2);

	}

}
