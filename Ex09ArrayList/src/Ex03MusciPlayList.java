import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusciPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ml = new ArrayList<String>(10);
		
		while(true) {
			System.out.print("[1]�뷡 �߰� [2]�뷡 ���� [3] ���� >>");
			int order = sc.nextInt();
			if (order == 1) {
				System.out.println("======== ���� ��� ��� ========");
				if (ml.size() == 0) {
					
					System.out.println("��� ����� �����ϴ�");
				
				} else {
					for (int i = 0; i < ml.size(); i++) {
						System.out.println(ml.get(i));
				}	
					System.out.println("=============================");
						System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰�>>");
						int order2 = sc.nextInt();
						if (order2 == 1) {
							System.out.print("�߰� �� �뷡 �Է� : "  );
							String music = sc.next();
							ml.add(music);
							System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
						} else {
							System.out.print("�߰� �� �뷡 �Է� : "  );
							String music2 = sc.next();
							System.out.print("�߰��� ��ġ �Է� : ");
							int num1 = sc.nextInt(); 
							ml.add(num1-1, music2);
							System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
						}	
			}
			
		
			
		}	
		}
}
}
