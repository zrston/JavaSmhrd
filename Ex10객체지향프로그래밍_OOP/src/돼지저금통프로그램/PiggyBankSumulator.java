package 돼지저금통프로그램;

import TV클래스설꼐.TV;

public class PiggyBankSumulator {

	public static void main(String[] args) {
		
		// 돼지 저금통 객체 생성
			PiggyBank pb = new PiggyBank();
		// 입금기능 메소드 호출
			pb.deposit(5000);
		// 출금기능 메소드 호출
			pb.withdraw(500);
		// 잔액확인 메소드 호출
			int m = pb.showMoney();
			System.out.println(m+"원 남았습니다.");

		//SOLID
		// 단일책임원칙
	}
}
