import java.util.Stack;

public class Ex01���� {

	public static void main(String[] args) {
		
		//1. ���� ����
		Stack<String> st = new Stack<String>();
		
		//2. ��� ���� (push)
		st.push("������");
		st.push("��ī�ݶ�");
		String a = st.push("����⸸ ����� ���ܴ�");
		
		//3. ���� �������⿡ �� ��� Ȯ�� (top���� ���� ����� ���)
		System.out.println(st.peek());
		
		//4. Ư�� ����� ��ġ Ȯ��
		System.out.println(st.search("����⸸ ����� ���ܴ�")); //3
		System.out.println(st.search("��ī�ݶ�")); //2
		System.out.println(st.search("������")); //1
		
		//5. ��� ���� pop
		String e = st.pop();
		System.out.println(e);
		
		//6. Stack�� ����ִ��� Ȯ��
		//��������� -> true, ��Ұ� �ϳ��� ������ -> false
		System.out.println(st.empty());		
	}

}
