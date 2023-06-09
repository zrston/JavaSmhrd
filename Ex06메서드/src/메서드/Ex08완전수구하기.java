package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor); // true
		// num2가 num1의 약수인지 아닌지?
		// num1이 num2의 배수인지 아닌지?
		// num2가 num1을 나누어 떨어지게 하는지!
		
		getDivisor(10);
		getDivisor(24);
		getDivisor(16);
		
		int num = 10;
		int result = getSumOfDivisors(num);
		
		System.out.println(num+"의 약수의 합 : "+result);
		
		getDivisor(10);
		
		// main 안쪽
		
		// 완전수인지 아닌지 판단해주는 isPerfectNumber()
		// 완전수란?
		// : 자기자신을 제외한 약수의 합이 자기자신과 같은 수
		// 6 : 1 2 3 --> 6 (완전수)
		// 10 : 1 2 4 --> 8 (완전수가 아님)
		// 28 : 1 2 4 7 14 --> 28 (완전수)
		// true, false
		int num3 = 6; // 1 2 3 == 6
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2); //true/false
		
		int startValue =2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
	}
	// main밖
	// 1. isDivisor() : 매개변수 int 2개,
	
	public static boolean isDivisor(int num1, int num2) {
		// num2가 num1을 나누어 떨어지게 하는지 판다
		if(num1 % num2==0) {
		 return true;
		}else {
		 return false;
		}
}

	
	// 2. getDivisor() : 출력하는 기능을 가지고 있다(void), 매개변수 int 1개
	public static void getDivisor(int num1) {
		
		// num1의 약수를 출력하는 기능
		// 4의 약수 : 1 2 4
		System.out.println(num1 + "의 약수 :");
		
		for(int i = 1; i <= num1; i++){
			// i가 num1의 약수인지 아닌지?
			if(isDivisor(num1,i)){		    	
				System.out.print(i + " ");
		    }
		}	
	}

	// 3.getSumOfDivisors () : 매개변수 int 1개, 리턴타입 int
	public static int getSumOfDivisors(int num1) {
	
		// num1의 약수들의 합
		int sum = 0; // 약수들의 합이 들어갈 공간
		// 1. 약수인지 아닌지 판단
		// 2. 누적(합계)
			
	for(int i = 1; i <= num1/2; i++) {
		if(isDivisor(num1, i)) {
			sum += i;
			} 
		}
		return sum + num1;
	}

	// 4. isPerfectNumber() : 매개변수 int 1개, 리턴타입 boolean
	public static boolean isPerfectNumber(int num3) {
		
		// num3가 완전수인지 아닌지?
		// 자기자신을 제외한 약수의 합 == 자기 자신
		if(getSumOfDivisors(num3) - num3 == num3) {
			return true;
		}else {
			return false;
		}
				
	}
	
	//5. getPerfectNumber() :
	public static void getPerfectNumber(int startValue, int endValue) {
		
		System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");
		for(int i = startValue; i<endValue; i++)
			if(isPerfectNumber(i) == true) {
				System.out.print(i+ " ");
			}else {
		}
	}
}



