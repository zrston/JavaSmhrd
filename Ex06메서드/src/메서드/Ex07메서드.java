package �޼���;

public class Ex07�޼��� {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("ū �� Ȯ�� :" + result);
		
	}
	
	//largerNumber �޼���
	//�޼��� �� : largerNumber
	//�������� num1, num2 : int ---> �Ű����� int 2��
	// ����Ÿ���� int
	// int result = ����ϴ� ��� x
	public static int largerNumber(int num1 , int num2) {
		
		// num1�� �� ũ��, num1�� ��������� ��������
		// num2�� �� ũ��, num2�� ��������� ��������
		// num1 == num2 ������, 0�� ��������� ��������
		// + ��� ��쿡 ���ؼ� return ���� �־�� �Ѵ�!!!
		if (num1>num2) {
			return num1;
		}else if(num2>num1) {
			return num2;
		}else {
			return 0;
			 }

}
}