
public class Ex03�迭�ǽ� {

	public static void main(String[] args) {
		
		//1. ũ�Ⱑ 10�� �迭 ���� ���ϴ� ������ �ʱ�ȭ
		//{} 
		
	      //ũ�Ⱑ 10�� �迭�� ���� �ϰ� �������� ������ ����
	      
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	      //0~9�� �ε����� �� �ʱ�ȭ	
		
		
		//2. �迭�� �� �� Ȧ���� ���, Ȧ���� ����� ���
		System.out.print("�迭 Ȧ�� :");
		int cnt = 0;
		for (int i = 0; i<array.length ; i++) {
			if(array[i]%2 != 0) {
				System.out.print(array[i] + " ");
				cnt++; //cnt += 1;
		}
	}
		System.out.println("\n�� ����" + cnt);
}
}