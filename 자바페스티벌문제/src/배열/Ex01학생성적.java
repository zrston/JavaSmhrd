package �迭;

public class Ex01�л����� {

	public static void main(String[] args) {

		// ������ ���� ���ڿ� s �ϳ� ������ֱ�
		// "A,A,B,C,D,A,C,D,D,D,F"
		String s = "A,A,B,C,D,A,C,D,D,D,F";
		// ���ڿ��� �ɰ��� �޼��� : split()
		String[] arr = s.split(",");

		// �ɰ��� ���ڿ��� ��� �迭�� �ϳ� ������ֱ� : ũ�⸦ �����൵ �ǰ�
		// split�� ���ڿ��� �ٷ� �迭�� �ʱ�ȭ��Ű�� �͵� ����
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		// �� ������ �л� ���� ����� ������ ����� �ֱ�(����)

		// 0���ε��� : A,B,C,D,F? �Ǵ� ������ �л��� ������ +1�� ����!
		// ...
		// 10�� �ε��� : A,B,C,D,F? �Ǵ� ������ �л��� ������ +1�� ����!

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("A")) {
				a++;
			} else if (arr[i].equals("B")) {
				b++;
			} else if (arr[i].equals("C")) {
				c++;
			} else if (arr[i].equals("D")) {
				d++;
			} else if (arr[i].equals("F")) {
				f++;
				// ����� ����ϱ�

			}

		}

	}
}
