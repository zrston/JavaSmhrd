
public class Ex01�������迭���� {

	public static void main(String[] args) {

		int[][] arr = new int[3][5]; // �迭������ ũ�� ������ ����
		// �������迭 3�� -> 5ĭ(���� 5)
		// ���۷����迭 1�� -> ���� 3
		// -> 3�� 5�� ��� ����
		// int�� �迭 -> �ʱ�ȭ�� ���������� �⺻ 0

		arr[0][0] = 10;

		// arr[0] = 1; -> ���۷��� �迭 �ʱ�ȭ�� �Ұ���
		System.out.println(arr[0][0]);

		char[][] charArr = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };
		System.out.println(charArr.length); // ���۷����迭�� ����
											// �������迭�� �? 2
		System.out.println(charArr[0].length); // �������迭�� ����? 3

//		int[][] arr2 = new int[5][5];
//
//		int num = 1;
//
//		for (int j = 0; j < arr2.length; j++) {
//			for (int i = 0; i < arr2[j].length; i++) { // 1�����迭 �ϳ� �ʱ�ȭ
//				arr2[j][i] = num++;
//			}
//		}
//
//		for (int j = 0; j < arr2.length; j++) {
//			for (int i = 0; i < arr2[j].length; i++) { // 1�����迭 �ϳ� �ʱ�ȭ
//				System.out.print(arr2[j][i] + "\t ");
//			}
//			System.out.println();

		// 4�� 6�� ũ�� 2���� �迭, 21~ ���
//			int[][] arr4 = new int[4][6];
//
//			int num2 = 21;
//
//			for (int i = 0; i < arr4.length; i++) {
//				for (int j = 0; j < arr4[i].length; j++) {
//					arr4[i][j] = num2++;
//				}
//			}
//
//			for (int i = 0; i < arr4.length; i++) {
//				for (int j = 0; j < arr4[i].length; j++) {
//					System.out.print(arr4[i][j] + "\t");
//				}
//				System.out.println();

		int[][] arr5 = new int[5][5];

		int num3 = 1;

		for (int i = 0; i < arr5.length; i++) {
			for (int j = arr5[i].length - 1; j >= 0; j--) {
				arr5[i][j] = num3++;
			}
		}

		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
