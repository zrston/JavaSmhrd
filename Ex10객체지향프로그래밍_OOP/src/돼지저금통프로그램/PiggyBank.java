package �������������α׷�;

import java.util.Scanner;

public class PiggyBank {

		int money;

// �޼ҵ� - deposit, withdraw , showMoney
	
	public PiggyBank() {
		System.out.println("���������� ����!!");
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
