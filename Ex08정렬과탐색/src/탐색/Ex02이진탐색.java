package Ž��;

public class Ex02����Ž�� {

	public static void main(String[] args) {

		// ���� Ž��
		// : ���� 3���� ����ؼ� �����͸� Ž��
		// lowIndex, HighIndex, middleIndex
		// ���� : �ð����⵵�� 1/2�� ���� Ž�� �ӵ��� ������ ����!
		// ���� : �˻� �˰��� �� ���ĵ� ����Ʈ������ ��� ����!
		
		// ���ĵ� �迭 ���� �� �ʱ�ȭ
		int[] arr = {1,7,16,25,30,33,41,66,78,90};
		
		// lowindex : �ּ� Index��
		int lowIndex = 0;
		// highIndex : �迭�� ������ �ִ� Index��
		int highIndex = arr.length-1;
		
		// ���� ã����� ���ڸ� �ϳ� ��������
		int num = 66;
		
		while(true) {
			// middleIndex
			int middleIndex = (lowIndex + highIndex)/2;
			// ���� �����ִ� �迭 ������ ���� �ε������� �ʱ�ȭ
			
			if(arr[middleIndex] == num) {
				System.out.println(middleIndex);
				break;
			}else {
				// arr[m] != num
				// arr[m]���� ������, ū���� �Ǵ��� ����
				// lowIndex����, highIndex���� �ٽ� ����
				if(arr[middleIndex]>num) {
					highIndex = middleIndex - 1;
				}else {
					// arr[m]<num
					lowIndex = middleIndex + 1;
				}
			}
		}

	}

}
