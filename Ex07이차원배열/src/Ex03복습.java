
public class Ex03���� {

	public static void main(String[] args) {

		// �迭 ����, ���۷��� ���� ����
		int[][] arr = new int[4][6];

		int num = 21;
		// 21~ ���ڷ� �迭 �ʱ�ȭ
		for (int i = 0; i < arr.length; i++) {// �� 4���� 1���� �迭�� �ٷ� �� �ֵ��� ��
			for (int j = 0; j < arr[i].length; j++) { // 1���� 1���� �迭�� �ٷ� �� ����(6ĭ)
				arr[i][j] = num++;
								
			}
		}
		// ���
		for (int i = 0; i < arr.length; i++) {// �� 4���� 1���� �迭�� �ٷ� �� �ֵ��� ��
			for (int j = 0; j < arr[i].length; j++) { // 1���� 1���� �迭�� �ٷ� �� ����(6ĭ)
				System.out.print(arr[i][j]+"\t");								
			}
			System.out.println();
		}
	}

}
