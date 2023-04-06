package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBank {

	Scanner sc = new Scanner(System.in);
	int money;

	public void deposit(int money2) {
		money += money2;
		System.out.println(money);
	}

	public void withdraw(int money2) {
		money -= money2;
		System.out.println(money);
	}

	public void showMoney() {
		System.out.println(money);
	}
}
