package �ּҷϰ������α׷�;

public class Address {
	
	// ���赵 : ���� ����
	
	// �ʵ�
		// 
		private String name;
		// �ܰ�
		private int age;
		// ����
		private String phoneNumber;
		
		// �޼���
		// ������
		// 1) �����ڵ� �޼����
		// 2) ������ �̸��� Ŭ������� ����(��/�빮��)
		// 3) �����ڴ� ����Ÿ���� ���� (void X)
		// 4) �⺻�����ڴ� �����Ǿ� �ִ�!
		// ---> ���ο� �����ڸ� ����� �Ǹ� �⺻�����ڴ� ����� �Ҵ´�
		// ---> �⺻�����ڵ� ����ϰ� ������ �ڵ�� �ۼ�������Ѵ�(����x)
		public Address(String name, int age, String phoneNumber) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
		}
		// gettet/setter
		// getter : private ������ �ʵ带 ��� Ȯ���� �� �ֵ��� ���ִ� �޼���
		// setter : �ʵ带 �����ҋ� ����ϴ� �޼���
		
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
		// private : Ŭ���� �ܺο��� �Ժη� ������ �� ������ ������ִ� ������
		//			Ŭ���� ���ο� �ִ� �޼��带 ���ؼ��� ������ �����ϵ��� �ϴ� ������
		
	}

