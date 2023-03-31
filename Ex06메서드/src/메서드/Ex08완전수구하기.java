package �޼���;

public class Ex08���������ϱ� {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor); // true
		// num2�� num1�� ������� �ƴ���?
		// num1�� num2�� ������� �ƴ���?
		// num2�� num1�� ������ �������� �ϴ���!
		
		getDivisor(10);
		getDivisor(24);
		getDivisor(16);
		
		int num = 10;
		int result = getSumOfDivisors(num);
		
		System.out.println(num+"�� ����� �� : "+result);
		
		getDivisor(10);
		
		// main ����
		
		// ���������� �ƴ��� �Ǵ����ִ� isPerfectNumber()
		// ��������?
		// : �ڱ��ڽ��� ������ ����� ���� �ڱ��ڽŰ� ���� ��
		// 6 : 1 2 3 --> 6 (������)
		// 10 : 1 2 4 --> 8 (�������� �ƴ�)
		// 28 : 1 2 4 7 14 --> 28 (������)
		// true, false
		int num3 = 6; // 1 2 3 == 6
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2); //true/false
		
		int startValue =2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
	}
	// main��
	// 1. isDivisor() : �Ű����� int 2��,
	
	public static boolean isDivisor(int num1, int num2) {
		// num2�� num1�� ������ �������� �ϴ��� �Ǵ�
		if(num1 % num2==0) {
		 return true;
		}else {
		 return false;
		}
}

	
	// 2. getDivisor() : ����ϴ� ����� ������ �ִ�(void), �Ű����� int 1��
	public static void getDivisor(int num1) {
		
		// num1�� ����� ����ϴ� ���
		// 4�� ��� : 1 2 4
		System.out.println(num1 + "�� ��� :");
		
		for(int i = 1; i <= num1; i++){
			// i�� num1�� ������� �ƴ���?
			if(isDivisor(num1,i)){		    	
				System.out.print(i + " ");
		    }
		}	
	}

	// 3.getSumOfDivisors () : �Ű����� int 1��, ����Ÿ�� int
	public static int getSumOfDivisors(int num1) {
	
		// num1�� ������� ��
		int sum = 0; // ������� ���� �� ����
		// 1. ������� �ƴ��� �Ǵ�
		// 2. ����(�հ�)
			
	for(int i = 1; i <= num1/2; i++) {
		if(isDivisor(num1, i)) {
			sum += i;
			} 
		}
		return sum + num1;
	}

	// 4. isPerfectNumber() : �Ű����� int 1��, ����Ÿ�� boolean
	public static boolean isPerfectNumber(int num3) {
		
		// num3�� ���������� �ƴ���?
		// �ڱ��ڽ��� ������ ����� �� == �ڱ� �ڽ�
		if(getSumOfDivisors(num3) - num3 == num3) {
			return true;
		}else {
			return false;
		}
				
	}
	
	//5. getPerfectNumber() :
	public static void getPerfectNumber(int startValue, int endValue) {
		
		System.out.print(startValue + "~" + endValue + "������ ������ : ");
		for(int i = startValue; i<endValue; i++)
			if(isPerfectNumber(i) == true) {
				System.out.print(i+ " ");
			}else {
		}
	}
}



