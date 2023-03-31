import java.util.Scanner;

public class Ex06배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//이 배열안에 들어있는 값이 중복되지 않는다! (가정)
		String[] name = { "한놈", "두식이", "석삼", "너구리", "오이지", "육", "칠", "팔" };

		System.out.println("검색할 이름 입력 >>");
		String search = sc.next();

		for (int i = 0; i < name.length; i++) {
			// == : 기본타입 비교시에만 사용
			// int char long byte short float boolean double
			if (search.equals(name[i])) {
				System.out.println(search + "님은" + i + "번째 인덱스에 저장되어 있습니다");
				break; //가장 가까운 반복문 나가는 키워드!
			} 
			
		}

	}

}
