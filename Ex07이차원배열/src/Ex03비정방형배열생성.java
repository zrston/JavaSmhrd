import java.util.Scanner;

public class Ex03���������迭���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ���������迭����
		// 1. �������迭 ���۷��� �迭�� ���� ���� �� ����
		int[][] arr = new int[5][];
		// �� �������迭�� ���̰� �ٸ��� ������ ���۷��� �迭 ������
		// ���̸� ������ �� ���� ! -> �����

		arr[0] = new int[1]; // �������迭 ������ ���۷��� ���� ���۷��� �迭�� ����
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		arr[4] = new int[1];

//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
		
				
		int[][] arr2 = new int[4][];
		
		arr[0] = new int[3]; 
		arr[1] = new int[5];
		arr[2] = new int[4];
		arr[3] = new int[6];
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[j].length; j++) {
				System.out.println((i+1) + "�� ���� �Է�");
				System.out.print((i+1) + "��" + (j+1) + "���� �л� ���� >>");
				arr2[i][j] = sc.nextInt();
			}
		}
	}
}
