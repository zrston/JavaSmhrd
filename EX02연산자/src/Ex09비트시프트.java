
public class Ex09비트시프트 {

	public static void main(String[] args) {
		
		//비트연산자, 시프트연산자 -> 연산을 빠르게 하고싶을 때 (은행)
		int a = 9; // 10진수 -> 2진수

		//비트연산 : &(and) | (or) ^(xor) ~ (not)
		int b = 9; //1001
		int c = 11; //1011
		System.out.println(b&c);
		System.out.println(b|c);
		System.out.println(b^c);
		System.out.println(~b);
	}

}
