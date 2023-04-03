import java.util.Scanner;

public class Ex03비정방형배열생성 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 비정방형배열생성
		// 1. 이차원배열 레퍼런스 배열과 변수 생성 및 선언
		int[][] arr = new int[5][];
		// 각 일차원배열의 길이가 다르기 떄문에 레퍼런스 배열 생성시
		// 길이를 지정할 수 없음 ! -> 비워둠

		arr[0] = new int[1]; // 일차원배열 생성후 레퍼런스 값을 레퍼런스 배열에 저장
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		arr[4] = new int[1];

//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
		
				
		int[][] arr2 = new int[4][];
		
		arr[0] = new int[3]; 
		arr[1] = new int[5];
		arr[2] = new int[4];
		arr[3] = new int[6];
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[j].length; j++) {
				System.out.println((i+1) + "반 점수 입력");
				System.out.print((i+1) + "반" + (j+1) + "번쨰 학생 점수 >>");
				arr2[i][j] = sc.nextInt();
			}
		}
	}
}
