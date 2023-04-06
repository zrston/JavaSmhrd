import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusciPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ml = new ArrayList<String>(10);
		
		while(true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3] 종료 >>");
			int order = sc.nextInt();
			if (order == 1) {
				System.out.println("======== 현재 재생 목록 ========");
				if (ml.size() == 0) {
					
					System.out.println("재생 목록이 없습니다");
				
				} else {
					for (int i = 0; i < ml.size(); i++) {
						System.out.println(ml.get(i));
				}	
					System.out.println("=============================");
						System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가>>");
						int order2 = sc.nextInt();
						if (order2 == 1) {
							System.out.print("추가 할 노래 입력 : "  );
							String music = sc.next();
							ml.add(music);
							System.out.println("추가가 완료되었습니다.");
						} else {
							System.out.print("추가 할 노래 입력 : "  );
							String music2 = sc.next();
							System.out.print("추가할 위치 입력 : ");
							int num1 = sc.nextInt(); 
							ml.add(num1-1, music2);
							System.out.println("추가가 완료되었습니다.");
						}	
			}
			
		
			
		}	
		}
}
}
