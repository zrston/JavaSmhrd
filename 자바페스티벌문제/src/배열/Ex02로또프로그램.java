package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex02로또프로그램 {

	public static void main(String[] args) {

		// 1. 랜덤 기능 가져오기
		Random rd = new Random();
		// 2. 랜덤한 숫자가 6개가 들어갈 배열 만들기
		int[] lotto = new int[6];
		// 3. 배열에 랜덤한 숫자를 넣는다 단, 중복x
		// --> 중복
		// 만약에 앞에 배열 인덱스에 들어간 데이터랑 중복이면
		// 다시 현재 인덱스값에 랜덤한 숫자가 들어가게 만들자

		// build up!
		// 1. 0번 인덱스에 랜덤한 수를 넣는다.
		// 2. 1번 인덱스에 랜덤한 수를 넣는다.
		// 0번 인덱스랑 같은 수인지 비교한다.
		// 같은 수라면 다시 1번인덱스에 값이 들어가도록 만든다.
		// i--

		// 3. 2번 인덱스에 랜덤한 수를 넣는다.
		// 0번 인덱스랑 같은 수인지
		// 1번 인덱스랑 같은 수인지
		// 같은 수라면 다시 2번인덱스에 값이 들어가도록 만든다.

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(41) + 1;
			// 1.
			// 2.
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}

			}

		}
	}
}
