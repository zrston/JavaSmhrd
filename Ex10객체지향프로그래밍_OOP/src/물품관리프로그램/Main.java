package ��ǰ�������α׷�;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ���赵�� ����Ϸ��� main()�ȿ��� �ۼ��ؾ��Ѵ�!
		// Product : ����� ���� �ڷ���
		// Product�� String, int, int�� ����Ǵ� �ϳ��� �ڷ���
		// ���� ���� �ڷ��� (��ü �ڷ���)
		Scanner sc = new Scanner(System.in);
		// Product �ڷ����� �����ϴ� ArrayList�����
		ArrayList<Product> ps = new ArrayList<Product>();

		while (true) {
			System.out.println("[1]���� �߰� [2]���� �Ǹŷ� ��ȸ [3]���� >> ");
			int select = sc.nextInt();

			if (select == 1) {
				// ���� �߰�
				System.out.println("���� �̸� : ");
				String name = sc.nextLine();
				System.out.println("�ܰ� : ");
				int price = sc.nextInt();
				System.out.println("���� : ");
				int amount = sc.nextInt();
				// Product (���赵, �ڷ���)
				// 1. ��������� �Է¹��� name, price, amount��
				// Product �ڷ������� ��������
				Product p = new Product(name, price, amount);
				// 2. ps.add();
				ps.add(p);
			} else if (select == 2) {
				// ���� �Ǹŷ� ��ȸ
				// ps�ȿ� �ִ� �����͵��� �� Ȯ��(���)
				System.out.println("��ǰ��    �ܰ�   ����");
				for (int i = 0; i < ps.size(); i++) {
					System.out.println(
							ps.get(i).getName() + " " + ps.get(i).getUnitPrice() + " " + ps.get(i).getAmount());
				}

				// �Ǹ� �� ��ü ����
				// p ���� * p ���� + p ���� * p ����
				int sum = 0;
				for (int i = 0; i < ps.size(); i++) {
					sum += (ps.get(i).getUnitPrice() * ps.get(i).getAmount());
				}
				System.out.println("�Ǹ� �� ���� : " + sum);
			} else if (select == 3) {
				// ���α׷� ����
				System.out.println("���α׷� ����");
			}
		}

	}
}
