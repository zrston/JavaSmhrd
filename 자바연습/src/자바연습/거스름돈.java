package �ڹٿ���;

import java.util.Scanner;

public class �Ž����� {

	public static void main(String[] args) {
		
			//�Ž������� �Է� �޾� ������� �ϴ� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
			//��, �ִ������ 10000�� �ּҴ����� 100���Դϴ�.
			
			//�ѱݾ� �Է�
			Scanner sc = new Scanner(System.in);
			System.out.print("�� �ݾ� �Է�: ");
			int total_money = sc.nextInt();
			
			//�ܵ� ���
			System.out.println("�ܵ� : " + total_money);
			
			//���󰳼� ����ϱ�
			System.out.println("10000�� ���� :"+total_money/10000);
			System.out.println("5000�� ���� :"+total_money%10000/5000);
			System.out.println("1000�� ���� :"+(total_money%10000%5000)/1000);
			System.out.println("500�� ���� :"+((total_money%10000%5000)%1000)/500);
			System.out.println("100�� ���� :"+(((total_money%10000%5000)%1000)%500)/100);
			
			
			System.out.print("�� �ݾ� �Է� : ");
			int total = sc.nextInt();

			System.out.println(total/10000);
			System.out.println(total%10000/5000);
			System.out.println((total%10000%5000)/1000);
			System.out.println(((total%10000%5000)%1000)/500);
			System.out.println((((total%10000%5000)%1000)%500)/100);
			
		}

	}

