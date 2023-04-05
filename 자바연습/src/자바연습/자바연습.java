package 자바연습;

public class 자바연습 {

	public static void main(String[] args) {

		// (77*1)+(76*2)+(75*3)+ ...+(1*77)
		// 합계출력하기
		int sum = 0;
		int j = 77;
		for (int i = 1; i < 78; i++) {

			sum += i * j--;

		}

		System.out.println(sum);
	}

}
