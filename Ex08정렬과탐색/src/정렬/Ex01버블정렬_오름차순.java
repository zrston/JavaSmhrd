package ����;

import java.util.Arrays;

public class Ex01��������_�������� {

	public static void main(String[] args) {

		int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43 };

		System.out.println("���� �� : " + Arrays.toString(arr));

		int temp; // ġȯ�� ���� �ӽð���
		
		boolean sw = false; //nȸ�� ������ �ѹ��̶� �Ͼ�� true
		//�߰��� ������ �Ϸ�� ��� ���̻� ������ �������� �ʴ� �ڵ� �ۼ��ϱ�!		
		for (int j = 0; j < arr.length - 1; j++) { // 7ȸ��
			sw = false;
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sw = true;
				}
			}
			
			if(!sw) { //sw�� false �϶��� ����(nȸ�� �ѹ��� �ٲ��� �ʾ��� ��!)
				break;
			}
			System.out.println(j+1 + "ȸ�� :" + Arrays.toString(arr));
		}
	}

}