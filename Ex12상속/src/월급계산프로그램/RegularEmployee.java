package 월급계산프로그램;

public class RegularEmployee extends Employee {
	 
//	String empno;
//	String name;
//	 int pay;
	 int bonus;

public RegularEmployee (String empno, String name, int pay, int bonus) {
	super(empno, name, pay);
	this.bonus = bonus;
	
	}
	// getMoneyPay (리턴타입 : int)
//	public int getMoneyPay() {
//		return((pay+bonus)/12);
//	}

@Override
public int getMoneyPay() {
	return((pay+bonus)/12);
}
	
	// print (리턴타입 : String)
	// 사번 : 이름 : 연봉
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//}



}



