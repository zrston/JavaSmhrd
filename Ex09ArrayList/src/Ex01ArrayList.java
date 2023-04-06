import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {

		// 1. ArrayList ���� -> heap
		// -> ArrayList ������ ������ ���� -> ��������(���۷��� ����) ����
		ArrayList<String> al = new ArrayList<String>();
		// ArrayList<E>(�ʱ� ũ�� -> ��������(�⺻���� 10));

		// 2. ��� ����
		al.add("������"); // ArrayList�� 0��
		al.add("�����е� �� ���� ���� �;�����"); // 1��
		al.add("�ο͵�İ"); // 2��

		// 3. ��� ����
		System.out.println(al.size()); // 3

		// 4. ��� �߰� ����
		al.add(1, "�ʹ� ���� �;������");
		System.out.println(al.size());

		// 5. Ư�� �ε����� �ִ� ��� �˾Ƴ���
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		// Ȯ�� for�� (for~each��)
		for (String s : al) {
			System.out.println(s);
		}
		//6. Ư�� ��� ����
		String a = al.remove(2);
		System.out.println(al.size());
		
		//al.remove(3);
		
		//7. ��� ��� ����
		al.clear();
		System.out.println(al.size();
	}
}
