
public class Ex02����Լ� {

	public static void main(String[] args) {

		// 1 1 2 3 5 8 13 21 ...

		for(int i = 1; i<=10; i++) {
			System.out.println(fibonacci(i));
		}
	}
	
	//�Ǻ���ġ Ư�� �� ���� ���ϴ� �޼���
	public static int fibonacci(int num) {
								//num : ���Ϸ����ϴ� ������ ����(��)
		int result = 0;
		if(num==1 || num==2) {
			result = 1;
		}else if(num >=3) {
			//ù��° �� => 1 => fibonacci(1)
			//�ι��� �� => 1 => fibonacci(2)
			result = fibonacci(num-2) + fibonacci(num-1);
		}
		
		return result;
	}

}