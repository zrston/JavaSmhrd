package Ž��;

import java.util.Arrays;

public class Ex03����Ž�� {

	public static void main(String[] args) {

		// �迭 ���� �� �ʱ�ȭ
		int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43, 22, 84 };
		// �迭���� ���� 68�� �� ��° index�� ����Ǿ� �ִ��� ����Ͻÿ�.(�����˻� Ȱ��)

		// ����_��������
		// �ʿ��� ���� 2��
		// 1. ġȯ
		int temp;
		// 2. ���� ���� ���� ���� �ε����� ���� ����� ����
		int index;

		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i; j < arr.length; j++)
				if (arr[index] > arr[j]) {
					index = j;
				}

			// ġȯ
			// ���� ���� ���� 0�� �ε����� ������ �ι�°�� 1���ε���
			if (i != index) {
				// ���� ������ �ڸ��� ���� ���� ���ڰ� ����� �ڸ��� �ٸ����� ġȯ
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp; // 0�� �ε����� ���� �������� ���� ����
			}
		}
		// ��������
		// ����Ž�� : �迭�� �ִ� �����Ͱ� �� ������ �Ǿ��־�� �Ѵ�!
		int num = 68;

		int low = 0;
		int high = arr.length - 1;

		while (true) {
			int mid = (low + high) / 2;
			// 1. middle�� �ִ� �����Ͷ� num�̶� ������ �Ǵ�
			if (arr[mid] == num) {
				System.out.println(mid);
				break;
			} else {

				// mid�� �ִ� ������ ������? ū��?
				// low, high���� �缳��

				if (arr[mid] > num) {
					high = mid - 1;
				} else {
					// arr[mid] < num
					low = mid + 1;
				}
			}
		}
	}
}
