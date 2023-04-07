package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBank {

		int money;

// 메소드 - deposit, withdraw , showMoney
	
	public PiggyBank() {
		System.out.println("돼지저금통 생성!!");
	}
	
	public void deposit(int inputMoney) {
		money += inputMoney;
		System.out.println(money);
	}

	public void withdraw(int outputMoney) {
		if (money >= outputMoney) {
			money -= outputMoney;
		}
	}

	public int showMoney() {
		return money;
	}
}
