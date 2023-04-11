package �ּҷϰ������α׷�;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      // ���赵�� ����ϴ� ����
      Scanner sc = new Scanner(System.in);
      // Address�ڷ���(Ŭ����)�� �����ϴ� ArrayList�� ����
      ArrayList<Address> addr = new ArrayList<Address>();
      
      while(true) {
         System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >> ");
         int select = sc.nextInt();
         
         if(select == 1) {
            // �߰�
            // �̸�, ����, ��ȭ��ȣ --> Address() --> addr
            System.out.print("�̸� : ");
            String name = sc.next();
            System.out.print("���� : ");
            int age = sc.nextInt();
            System.out.print("��ȭ��ȣ : ");
            String phoneNumber = sc.next();
            Address a = new Address(name, age, phoneNumber);
            addr.add(a);            
         }else if(select == 2) {
            // ��ü��ȸ
            
            if(addr.size() == 0) {
               System.out.println("��ϵ� ����ó�� �����ϴ�.");
            }
            
            for(int i = 0; i < addr.size(); i++) {
               System.out.print(i+1+". "); // 1.
               // addr ---> i ---> getName()
               System.out.print(addr.get(i).getName()+"("+addr.get(i).getAge()+"��) : ");
               System.out.print(addr.get(i).getPhoneNumber());
               System.out.println();
            }
            
         }else if(select == 3) {
            // ����
            
            if(addr.size() == 0) {
               System.out.println("��ϵ� ����ó�� �����ϴ�.");
            }else {
               System.out.print("������ ��ȣ �Է� : ");
               int num = sc.nextInt();
               // ���� ������ �������� ��ġ(�ε�����) == ����ڰ��Է°� - 1
               addr.remove(num-1);
            }
   
         }else if(select == 4) {
            // �˻�
            System.out.print("�˻��� �̸� �Է� : ");
            String name = sc.next();
            
            // �˻��ϰ��� �ϴ� �������� ��ġ�� �����ϴ� ����
            int index = -1;
            
            // addr�� ����ڰ� �Է��� name�� �ִ��� ������ �Ǵ�
            for(int i = 0; i < addr.size(); i++) {
               if(name.equals(addr.get(i).getName())) {
                  index = i;
               }
            }
            
            // index��� ������ ����� ����ִ��� �Ǵ�
            if(index == -1) {
               System.out.println("�˻��� �̸��� ������ �����ϴ�.");
            }else {
               System.out.print(index+1+". "); // 1.
               // addr ---> i ---> getName()
               System.out.print(addr.get(index).getName()+"("+addr.get(index).getAge()+"��) : ");
               System.out.print(addr.get(index).getPhoneNumber());
               System.out.println();
            }
            
            
            
         }else {
            System.out.println("���α׷� ����");
            break;
         }
         
         
      }
      
      
      
      
      
   }

}