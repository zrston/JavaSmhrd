package �ּҷϰ������α׷�;

public class Address {
	
	// ���赵 : ���� ����
	
	// �ʵ�
		// �����̸�
		private String name;
		// �ܰ�
		private int age;
		// ����
		private int phoneNumber;
		
		// �޼���
		// ������
		// 1) �����ڵ� �޼����
		// 2) ������ �̸��� Ŭ������� ����(��/�빮��)
		// 3) �����ڴ� ����Ÿ���� ���� (void X)
		// 4) �⺻�����ڴ� �����Ǿ� �ִ�!
		// ---> ���ο� �����ڸ� ����� �Ǹ� �⺻�����ڴ� ����� �Ҵ´�
		// ---> �⺻�����ڵ� ����ϰ� ������ �ڵ�� �ۼ�������Ѵ�(����x)
		public Address(String name, int age, int phoneNumber) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
		}
		// getter : private ������ �ʵ带 ��� Ȯ���� �� �ֵ��� ���ִ� �޼���
		
		public String getName() {
			return name;
		}

		public int getage() {
			return age;
		}

		public int phoneNumber() {
			return phoneNumber;
		}
		
	}

