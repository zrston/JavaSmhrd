package 마우스;

public class Main {

	public static void main(String[] args) {
		
		Mouse m1 = new Mouse();
		// . : 참조
		m1.rightClick();
		m1.leftClickt();
		m1.drag();
		
		WheelMouse m2 = new WheelMouse();
		m2.scroll();
		m2.drag();
		m2.leftClickt();
		m2.rightClick();

		HealthMouse m3 = new HealthMouse();
		m3.leftClickt();
		m3.rightClick();
		m3.drag();
		m3.health();
	}

}
