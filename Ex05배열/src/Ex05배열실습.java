import java.util.Scanner;

public class Ex05�迭�ǽ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. ũ�Ⱑ 5�� ������ �����͸� ������ �� �ִ� �迭����
		// -> �� �迭�� ������(�ּҰ�)�� ������ ���۷��� ���� ����
		int[] score= new int[5];
				
		for(int i = 0; i<score.length; i++) {
			System.out.print(i+1 + "���� �Է� >> ");
			score[i] = sc.nextInt();
		}
		
		System.out.println("�Էµ� ���� : ");
		for(int i=0 ; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
		//Ȯ�� for��(for~each��)
		// : �迭, List �������� ���� �� �ִ� �ݺ���
		//for(�迭�� 0���ε����� �ִ� ������ �ӽ÷� ������ ���� : �迭�� ���۷�������)
		for(int a:score) {
			System.out.print(a+" ");
		}
		
		int max = score[0]; //���� ���ݱ��� �� ���� �߿� �ְ�����
		int min = score[0]; //���� ���ݱ��� �� ���� �߿� ��������
		int sum = 0; //������
		for(int a: score) {
			//sum = sum+a;
			sum += a;
			if(max<a) { //�ְ�����
				max = a;
			}
			if(min>a) {
				min = a;
			}
		}
		System.out.println("\n�ְ����� : " + max);
		System.out.println("\n�������� : " + min);
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f" , sum/(double)score.length);
		}
}
