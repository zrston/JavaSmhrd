import java.util.Arrays;
import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {
		
		//랜덤 객체
		//레퍼런스 변수
		Random rd = new Random();
		
		//배열을 랜덤값 초기화
		int[] arr = new int[10];
		
		arr[0] = rd.nextInt(20)+1;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] =rd.nextInt(20)+1;
		} 
			System.out.println(Arrays.toString(arr));
			
		//최대값
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
		
		