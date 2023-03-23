import java.util.Scanner;

public class Ex10switch예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String lang = sc.next();
		
		switch(lang) {
		case "한국어":
			System.out.println("안녕하세요");
			break; //switch문을 멈추고 다음문장을 실행하도록 하는 명령어
		case "영어":
			System.out.println("헬로");			
			break;
		case "중국어":
			System.out.println("니하오");			
			break;
		case "일본어":
			System.out.println("곤니찌와");			
			break;
		default :
			System.out.println("다른 나라");

	}
		
	}

}
