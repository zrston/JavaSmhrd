import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력");
		int sec = sc.nextInt();
		System.out.println(sec/3600 + "시" + sec/60 + "분" + sec/1 + "초");
		
		
	}

}
