import java.util.Arrays;
import java.util.Random;

public class Ex04�迭�ǽ� {

	public static void main(String[] args) {
		
		//���� ��ü
		//���۷��� ����
		Random rd = new Random();
		
		//�迭�� ������ �ʱ�ȭ
		int[] arr = new int[10];
		
		arr[0] = rd.nextInt(20)+1;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] =rd.nextInt(20)+1;
		} 
			System.out.println(Arrays.toString(arr));
			
		//�ִ밪
		int max = arr[0];
		int min = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	
	
	for(int i =0; i<arr.length; i++) {
		if(min>arr[i]) {
			min = arr[i];
		}
	}
	System.out.println(min);
}
}
		
		