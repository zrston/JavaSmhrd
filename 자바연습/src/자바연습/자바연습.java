package �ڹٿ���;

public class �ڹٿ��� {

	public static void main(String[] args) {

		// (77*1)+(76*2)+(75*3)+ ...+(1*77)
		// �հ�����ϱ�
		int sum = 0;
		int j = 77;
		for (int i = 1; i < 78; i++) {

			sum += i * j--;

		}

		System.out.println(sum);
	}

}
