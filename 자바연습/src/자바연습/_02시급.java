package �ڹٿ���;

import java.util.Scanner;

public class _02�ñ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//���� �ð� �Է�
				System.out.print("���ѽð��� �Է��ϼ���:");
				int work_hour = sc.nextInt();
				int work_a = 5000*8;
				int usu_pay = 5000*work_hour;
				double over_pay = (work_hour-8)*(5000*1.5d);
				
				
				//���ǹ����� 8�ð� �������� �Ǻ�
				if(work_hour <= 8) {
					
					System.out.println("�� �ӱ��� " + usu_pay + "�� �Դϴ�." );
					
				}else {
					
					// �ʰ��ӱ� ���
					System.out.println("�� �ӱ��� " + (int)(work_a +over_pay) +"�� �Դϴ�.");
					
					
				} 
				
				
			}

}