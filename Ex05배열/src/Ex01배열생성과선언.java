
public class Ex01�迭���������� {

	public static void main(String[] args) {
		
		//1. �迭���� + �迭�� ũ�� ( �޸𸮿� ��� ���ӵ� ������ �Ҵ����ٰ�����!)
		int[] arr = new int[5];
		int arr2[] = new int[3];
		
		//2. �迭�� �� ����
		arr[0] = 10; //arr�� ����Ű�� �ִ� �迭�� 0�� �ε����� ���� �Ҵ�
		arr[1] = 12;
		arr[2] = 14;
		arr[3] = 16;
		arr[4] = 18;
		
		//4
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//5. �迭�� ����Ǿ�� �ϴ� ���� �̹� �˰� ������
		int[] arr3 = {4,2,5,7,10};
		// ������ �����Ͱ� ����ɼ� �ִ� 5ĭ¥�� �迭 �����ϰ� �ʱ�ȭ!
		System.out.println(arr3[0]);
		
		int[] intArray = new int[5];
		int[] myArray = intArray;
		
		intArray[1] = 2;
		System.out.println(intArray[1]);
		
		myArray[1] = 6;
		System.out.println(intArray[1]);
	}

}
