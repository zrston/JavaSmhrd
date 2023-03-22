
public class Ex10치환 {

	public static void main(String[] args) {
		String left = "red";
		String right = "blue";
		
		String temp; //임시저장공간
		temp = right; //left : red / temp : blue / right : blue
		right = left; //left : red / temp : blue / right : red
		left = temp; //left : blue / temp : blue / right : red
				
		System.out.println(left); //blue
		System.out.println(right); //red
	}

}
