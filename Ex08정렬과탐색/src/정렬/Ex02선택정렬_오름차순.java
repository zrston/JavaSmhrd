package ����;

import java.util.Arrays;

public class Ex02��������_�������� {

	public static void main(String[] args) {

		int[] arr = { 98, 7, 70, 13, 24 };

		System.out.println("���� ��  + " + Arrays.toString(arr));

		/*
		 * 1ȸ�� int index = 0; for (int i = index + 1; i < 5; i++) { if (arr[index] >
		 * arr[i]) { index = i; // index<- �迭�ȿ��� ���� ���� ���� �����ϴ� �ε��� ��ȣ } } temp = arr[0];
		 * arr[0] = arr[index]; // ���� ���� ���� -> 0 arr[index] = temp; // ���� 0���� �ִ� ����
		 * index�� �ű��!
		 * 
		 * System.out.println(1 + "ȸ�� :" + Arrays.toString(arr));
		 */

		int temp; // ġȯ �� ���
		int index; // ���� ���ݱ��� �� �����߿� ���� ���� ���� �ε��� ��ȣ ���

		for (int j = 0; j < arr.length - 1; j++) { // �迭�ȿ� ���� ���� -1ȸ�� (5 -> 4ȸ��)
			index = j; // 1ȸ�� - -, 2ȸ��-1, 3ȸ�� -2, 4ȸ�� - 3
			for (int i = index + 1; i < arr.length; i++) {
				if (arr[index] > arr[i]) {
					index = i; // �ι�°�� ���� ���ڰ� �����ϴ� �ε��� ��ȣ
				}
			}
			temp = arr[j];
			arr[j] = arr[index];
			arr[index] = temp;
			System.out.println(j + 1 + "ȸ�� :" + Arrays.toString(arr));
		}
	}
}
