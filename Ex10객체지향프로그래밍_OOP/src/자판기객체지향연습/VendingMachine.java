package ���Ǳⰴü���⿬��;

import java.util.Scanner;

public class VendingMachine {
	Scanner sc = new Scanner(System.in);
	int choice, money;
	
	public void inputMoney() {
		System.out.println("====���Ǳ� ���α׷�====");
		System.out.print("���� �Է��ϼ��� >>");
		int money = sc.nextInt();
	}
	public void menuChoice() { 
		System.out.println("1.�ݶ�(500) 2.��(800) 3.��Ÿ�ο���(1500)");
	    System.out.print("�޴��� �����ϼ��� >>");
	    choice = sc.nextInt(); 
	}
	public void changeMoney() { 
		if(choice == 1) money-=500;
	      else if(choice == 2) money-=800;
	      else if(choice == 3) money-=1500;
	      
	      if(money<0) { // ���� ����
	         System.out.println("�ܵ��� �����մϴ� �Ф�");
	      }else { // �ܵ� ���
	         int won1000 = money/1000; // õ��
	         int won500 = money%1000/500; // �����
	         int won100 = money%1000%500/100; // ���
	         System.out.println("õ�� : "+won1000+"��, ����� : "+won500+"��, ��� : "+won100+"��");
	      }
}
}