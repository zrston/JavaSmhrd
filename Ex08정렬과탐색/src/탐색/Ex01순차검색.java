package Ž��;

public class Ex01�����˻� {

	public static void main(String[] args) {

		int[] arr = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };

		int num = 78; // ã�� ���� ����
		
		//�����˻� : 0 ~ �迭 �� �ϳ��ϳ� ���ؼ� ã�� ���
		//		: ���ĵǾ� ���� �ʿ䰡 ����!
		//78�� 6�� �ε����� �ֽ��ϴ�! ���

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num){ //ã�� ���
				System.out.println(num + " �� " + i + "�� �ε����� �ֽ��ϴ�!");
				break; //���� �ߺ����� �ʴ� ��쿡��! ������ ���� �ʵ���!
			}
		}
	}
}
