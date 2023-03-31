
public class Ex01배열생성과선언 {

	public static void main(String[] args) {
		
		//1. 배열생성 + 배열의 크기 ( 메모리에 몇개의 연속된 공간을 할당해줄것인지!)
		int[] arr = new int[5];
		int arr2[] = new int[3];
		
		//2. 배열에 값 저장
		arr[0] = 10; //arr이 가리키고 있는 배열의 0번 인덱스에 값을 할당
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
		
		//5. 배열제 저장되어야 하는 값을 이미 알고 있을때
		int[] arr3 = {4,2,5,7,10};
		// 정수형 데이터가 저장될수 있는 5칸짜리 배열 생성하고 초기화!
		System.out.println(arr3[0]);
		
		int[] intArray = new int[5];
		int[] myArray = intArray;
		
		intArray[1] = 2;
		System.out.println(intArray[1]);
		
		myArray[1] = 6;
		System.out.println(intArray[1]);
	}

}
