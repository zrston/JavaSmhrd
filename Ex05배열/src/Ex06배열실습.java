import java.util.Scanner;

public class Ex06�迭�ǽ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//�� �迭�ȿ� ����ִ� ���� �ߺ����� �ʴ´�! (����)
		String[] name = { "�ѳ�", "�ν���", "����", "�ʱ���", "������", "��", "ĥ", "��" };

		System.out.println("�˻��� �̸� �Է� >>");
		String search = sc.next();

		for (int i = 0; i < name.length; i++) {
			// == : �⺻Ÿ�� �񱳽ÿ��� ���
			// int char long byte short float boolean double
			if (search.equals(name[i])) {
				System.out.println(search + "����" + i + "��° �ε����� ����Ǿ� �ֽ��ϴ�");
				break; //���� ����� �ݺ��� ������ Ű����!
			} 
			
		}

	}

}
