import java.util.Scanner;

public class Ex03While문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int input = 0;
//		while(input<10) {
//			input = sc.nextInt();
//			System.out.print("숫자입력 : ");
//			}
//		System.out.println("종료!");

		//키보드 누적결과 출력
		
//		int input1 = 0;
//		int sum = 0;
//		while(input1==0); {
//			input1 = sc.nextInt();
//			System.out.println("숫자 입력 :");
//			//sum에  input 을 더한다
//			sum = sum + input1;
//		}
//		//sum을 출력한다
//		System.out.println(sum);
		
		int input = 0;
		int sum = 0; //지금까지 입력한 모든 수의 합 저장(누적합)
		int odd = 0; //홀수 개수
		int even = 0; // 짝수 개수
		while(true) {
			input = sc.nextInt();
			if(input==-1) {
				break; //만나는순간 반복문 나감!
			}
			
			if(input%2==1) { //홀수
				++odd;
			}else {//나머지가 0일 때 ->짝수
				++even;
			}
			
			sum += input;
		}
			System.out.println("누적결과 : ");
			}
	}
