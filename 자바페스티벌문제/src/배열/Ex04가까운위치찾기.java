package �迭;

public class Ex04�������ġã�� {

	public static void main(String[] args) {

		// �������ִ� ���ڰ� ��� point��� �迭 ���� �� �ʱ�ȭ
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		// ���� �Ÿ������(�ּڰ�) �ε��� ���� ã������Ѵ�.
		// 1. ���ذ� ����� point[0] - point[1]
		// Math.abs(point[0]-point[1])
		int min = Math.abs(point[0] - point[1]);

		// �迭�� �ε��� ��ġ�� �˼� �ִ� ���� : 2��
		int a = 0;
		int b = 0; // �ε��� �� 2�� ������ ���� : ����� �Ÿ��� ����

		// ���ؼ� ����� �Ÿ��� ã�ƶ�
		// ��, �ڱ� �ڽŰ� ���ϸ� ���� 0�̳��� : x

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {

				// i�� j�� ���� ���ڰ� �ƴҶ� �Ʒ� �ڵ尡 ����ǰ� ������
				if (i != j) {
					if (Math.abs(point[i] - point[j]) < min) {
						min = Math.abs(point[i] - point[j]);
						a = i;
						b = j;
					}
				}

			}
		}

		System.out.println("result = [" + a + "," + b + "]");

	}

}