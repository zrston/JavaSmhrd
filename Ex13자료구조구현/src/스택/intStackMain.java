package ����;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class intStackMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(5);
		
		int menu;
		while(true) {
			System.out.print("[1]Ǫ�� [2]�� [3]��ũ [4]���� [5]���� [6]��ġ ã�� [7]������ ���� [8]����");
			menu = sc.nextInt();
			if(menu==1) { //push
				if(!s.isFull()) { //���������� ������!
				System.out.print("Ǫ���� �� �Է� : ");
				int num = sc.nextInt();
				s.push(num);
				}else { //������������
					System.out.println("������ �������ֽ��ϴ�");
				}				
			}else if(menu==2) { //pop
				if(!s.isEmpty()) { //������� ������!
					System.out.println("���ŵ� �� : " + s.pop());
					s.pop();
				}else { //������� ��
					System.out.println("������ ����ֽ��ϴ�!");
				}
			}else if(menu==3) { //peek
				if(!s.isEmpty()) { //������� ������!
					System.out.println("��ũ �� : " + s.peek());
					s.pop();
				}else { //������� ��
					System.out.println("������ ����ֽ��ϴ�!");
				}
			}else if(menu==4) { //dump
				s.dump();
			}else if(menu==5) { //clear
				if(!s.isEmpty()) { //������� ������!
					s.clear();
				}else { //������� ��
					System.out.println("������ ����ֽ��ϴ�!");
				}
			}else if(menu==6) { //indexOf
				System.out.println("ã����� �� �Է�: ");
				int num = sc.nextInt();
				System.out.println("��ġ : " + s.indexOf(num));
				
			}else if(menu==7) {
				System.out.println("������ ���� : " +s.size());
			}else if(menu==8) {
				break;
	}

}
	}
}
