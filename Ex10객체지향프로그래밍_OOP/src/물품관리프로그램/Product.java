package ��ǰ�������α׷�;

public class Product {
	
	// �ʵ�
	// �����̸�
	private String name;
	// �ܰ�
	private int unitPrice;
	// ����
	private int amount;
	
	// �޼���
	// ������
	// 1) �����ڵ� �޼����
	// 2) ������ �̸��� Ŭ������� ����(��/�빮��)
	// 3) �����ڴ� ����Ÿ���� ���� (void X)
	// 4) �⺻�����ڴ� �����Ǿ� �ִ�!
	// ---> ���ο� �����ڸ� ����� �Ǹ� �⺻�����ڴ� ����� �Ҵ´�
	// ---> �⺻�����ڵ� ����ϰ� ������ �ڵ�� �ۼ�������Ѵ�(����x)
	public Product(String name, int unitPirce, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	// getter : private ������ �ʵ带 ��� Ȯ���� �� �ֵ��� ���ִ� �޼���
	
	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getAmount() {
		return amount;
	}
	
}
