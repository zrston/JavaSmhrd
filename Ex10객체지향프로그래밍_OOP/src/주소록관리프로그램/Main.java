package �ּҷϰ������α׷�;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ���赵�� ����ϴ� ����
		
		Scanner sc = new Scanner(System.in);
		// Product �ڷ����� �����ϴ� ArrayList�����
		ArrayList<Address> ad = new ArrayList<Address>();
		
		
		while (true) {
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >> ");
			int select = sc.nextInt();
			
			if (select == 1) {
				// ���� �߰�
				System.out.println("�̸� : ");
				String name = sc.nextLine();
				System.out.println("���� : ");
				int age = sc.nextInt();
				System.out.println("��ȭ��ȣ : ");
				int phoneNumber = sc.nextInt();
				
				Address ad2 = new Address(name, age, phoneNumber);
				// 2. ps.add();
				ad.add(ad2);
			} else if (select == 2) {
			} else if (select == 3) {	
			} else if (select == 4) {
			} else if (select == 5) {
				// ���α׷� ����
				System.out.println("���α׷� ����");
			}
		}

	}
	}

