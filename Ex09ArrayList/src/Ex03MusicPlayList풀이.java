import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicPlayListǮ�� {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);

	      // ������
	      ArrayList<String> musicList = new ArrayList<String>();

	      int menu; // ����ڰ� ������ �޴��� ����(1,2,3)

	      while (true) {
	         System.out.print("[1]�뷡 �߰� [2]�뷡 ���� [3]���� >> ");
	         menu = sc.nextInt();

	         if (menu == 1) {

	            printList(musicList);

	            System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >> ");
	            menu = sc.nextInt();
	            if (menu == 1) {
	               System.out.print("�߰��� �뷡 �Է� : ");
	               sc.nextLine(); // ����Ű(���鹮��) ó��
	               musicList.add(sc.nextLine());
	            } else { // menu==2
	               System.out.print("�߰��� �뷡 �Է� : ");
	               sc.nextLine();
	               String music = sc.nextLine();
	               System.out.print("�߰��� ��ġ �Է� : ");
	               int index = sc.nextInt();
	               musicList.add(index - 1, music);
	            }
	            System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
	         } else if (menu == 2) {

	            printList(musicList);

	            System.out.print("[1]���� ���� [2]��ü ���� >> ");
	            menu = sc.nextInt();
	            if (menu == 1) {
	               System.out.print("������ �뷡 ���� >> ");
	               musicList.remove(sc.nextInt() - 1);
	               System.out.println("�뷡�� �����Ǿ����ϴ�");
	            } else { // menu==2
	               musicList.clear();
	               System.out.println("��ü List�� �����Ǿ����ϴ�");
	            }
	         } else { // menu==3
	            System.out.println("���α׷� ����");
	            break;
	         }
	      }

	   } // main ��

	   public static void printList(ArrayList<String> musicList) {
	      System.out.println("===���� ��� ���===");
	      if (musicList.size() == 0) {
	         System.out.println("��� ����� �����ϴ�.");
	      } else {
	         for (int i = 0; i < musicList.size(); i++) {
	            System.out.println(i + 1 + ". " + musicList.get(i));
	         }
	      }
	      System.out.println("=================");
	   }

	}