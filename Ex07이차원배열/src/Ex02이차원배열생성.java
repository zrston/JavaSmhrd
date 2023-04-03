
public class Ex02이차원배열생성 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i % 2 == 0) {
					arr[i][j] = num++;
				} else {
					arr[i][4 - j] = num++;
				}
			}

		}
	}
}
