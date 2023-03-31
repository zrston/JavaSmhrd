import java.util.Arrays;

public class Ex02배열 {

	public static void main(String[] args) {
		 int[] array;
	      
	      //크기가 10인 배열을 생성 하고 참조값을 변수에 저장
	      array = new int[10];
	      
	      //0~9번 인덱스에 값 초기화
	      array[0] = 10;
	      array[1] = 20;
	      array[2] = 30;
	      array[3] = 40;
	      array[4] = 50;
	      array[5] = 60;
	      array[6] = 70;
	      array[7] = 80;
	      array[8] = 90;
	      array[9] = 100;

	      
	      for(int i=0;i<array.length;i++) {
	         System.out.println(array[i]);
	      }
	      
	      //도구 -> 객체(인스턴스)
	      //toString(객체가 가지고 있는 공통 기능)
	      // : 객체가 가지고 있는 값을 문자열로 바꿔주는 기능
	      System.out.println(Arrays.toString(array));
	      
	      //5. 1번 인덱스에 저장된 값과 4번 인덱스에 저장된 값의 합을 출력
	      System.out.println(array[1]+array[4]);
	      
	      //6. 각 인덱스에 저장된 모든 값을 더하여 출력
	      //System.out.println();
	      //누적합
	      int sum = 0; //누적합을 저장하고 있을 변수
	      for(int i =0; i<array.length; i++) {
	    	  //sum = sum + array[i];
	    	  sum += array[i];
	      }
	      System.out.println(sum);
	      
	      //7. 배열안에 있는 수의 평균 구하여 출력
	      System.out.println(sum/array.length);
	}

}
