package 월급계산프로그램;

public class RegularEmployee {
	private String empno;
	private String name;
	private int pay;
	private int bonus;

public RegularEmployee (String empno, String name, int pay, int bonus) {
	this.empno = empno;
	this.name = name;
	this.pay = pay;
	this.bonus = bonus;
	
	}

public static int getMoneyPay() {
	System.out.println((pay*bonus)/12);
}

public static void print() {
	System.out.println("사번:이름:연봉");
}



}



