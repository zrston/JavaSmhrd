package PokeMon;

public class Pika implements PokeMon,DigiMon {
	
	// 인터페이스는 다중 상속이 가능하다

	@Override
	public void Atk() {
		
		System.out.println("몸통박치기");
		
	}

	@Override
	public void spcialAtk() {
		// TODO Auto-generated method stub
		
		System.out.println("10만볼트");
	}
	
	// 인터페이스를 상속 : implements(구현하다)

}
