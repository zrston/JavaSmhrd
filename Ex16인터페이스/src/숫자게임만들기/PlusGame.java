package 숫자게임만들기;

import java.util.Random;

public class PlusGame implements OperatorGame{
	
	int ans;

	@Override
	public int random(int difficul) {
		int diffi = difficul * 40;
		Random rd = new Random();
		return rd.nextInt(diffi) + 1;
	}

	@Override
	public String getQuiz(int difficulty) {
		String temp = "";
		int num1 = random(difficulty);
		int num2 = random(difficulty);
		ans = num1 + num2;
		temp += num1 + " + " + num2 + " = ";
		return temp;
	}

	@Override
	public boolean checkAnswer(int ans) {
		if(ans == this.ans) {
			return true;
		}
		return false;
	}
	
	// 개발자1
	// 자연쌤이 주신 인터페이스를 사용해서 구현하기
	// 기능을 완성하기
	
}
