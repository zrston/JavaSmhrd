import java.util.LinkedList;
import java.util.Queue;

public class Ex03ť {

	public static void main(String[] args) {
		
		//�޸� ������ ȿ�������� Ȱ���ϱ� ����
		//ť�� ��ũ�帮��Ʈ�� Ȱ���Ѵ�!
		Queue<Integer> q = new LinkedList<Integer>();
		
		//2. ť�� ��� ����
		q.add(1);
		q.add(2);
		q.add(3);
		
		//3. ���� ���� ���� �����͸� ��ȯ
		System.out.println(q.peek());
		
		//4. ��� ����
		System.out.println(q.remove());

	}

}
