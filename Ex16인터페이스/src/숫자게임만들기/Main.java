package 숫자게임만들기;

import java.util.ArrayList;
import java.util.Scanner;

import 주소록관리프로그램.Address;

public class Main {

	public static void main(String[] args) {
		
		// 개발자2
		// : 사용자가 보여질 부분이 들어갈 곳
		// 뷰
		// game = new GameDummy();
		
		Scanner sc = new Scanner(System.in);
		
		MemberSystem mem = new MemberSystem();
		
				
		int choice;
		
		while(true) {
			System.out.println("[1]회원가입 [2]로그인");
			choice = sc.nextInt();
			
			if(choice==1) {
				String nickName = sc.nextLine();
				System.out.println("닉네임 : ");
				String pw = sc.nextLine();
				System.out.println("비밀번호");
				
			}else if(choice==2) {
								
			}else { //menu == 5
				break;
			}
		
	}

}
}
