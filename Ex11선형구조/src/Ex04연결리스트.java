import java.util.LinkedList;

public class Ex04���Ḯ��Ʈ {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addFirst(1); // ���� �տ� ������ �߰� 0
		list.addLast(2); // ���� �ڿ� ������ �߰� 2
		list.add(1, 5); // 1
		
		// 1 5 2
		for(Integer i:list) {
			System.out.println(i);
		}
		
		System.out.println(list.get(1));
		
		list.removeFirst(); //���� �տ� ������ ����
		list.removeLast(); // ���� �ڿ� ������ ����
		list.remove(0);  // index 0 �� ������ ����
		list.remove(); // index 0 �� ������ ����
		
		list.clear(); //��� �� ����
		
		System.out.println(list.size()); //��� ����
		
		
	}

}
