import java.util.Scanner;

public class Ex08배열로그인프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] id = new String[3]; // 아이디
		String[] pw = new String[3]; // 패스워드
		
		for(int i = 0; i<id.length; i++) {
			System.out.print("id 입력 :");
			id[i] = sc.next();
		
		for(int j = 0; j<id.length; j++) {
			System.out.print("pw 입력 :");
			pw[j] = sc.next();
		break;
		} System.out.println("가입 성공");
	}	
}
}